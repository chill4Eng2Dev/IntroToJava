/**
 * (Financial application: compute tax) Rewrite Listing 3.5, ComputeTax.java,
 * using arrays. For each filing status, there are six tax rates. Each rate is applied
 * to a certain amount of taxable income. For example, from the taxable income of
 * $400,000 for a single filer, $8,350 is taxed at 10%, (33,950 - 8,350) at 15%,
 * (82,250 - 33,950) at 25%, (171,550 - 82,550) at 28%, (372,550 - 82,250) at
 * 33%, and (400,000 - 372,950) at 36%. The six rates are the same for all filing
 * statuses, which can be represented in the following array:
 * 
 * double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
 * 
 * The brackets for each rate for all the filing statuses can be represented in a twodimensional
 * array as follows:
 * 
 * int[][] brackets = {{8350, 33950, 82250, 171550, 372950}, // Single filer
 *                     {16700, 67900, 137050, 20885, 372950}, // Married jointly
 *                                                            // -or qualifying widow(er)
 *                     {8350, 33950, 68525, 104425, 186475}, // Married separately
 *                     {11950, 45500, 117450, 190200, 372950}}; // Head of household
 * 
 * Suppose the taxable income is $400,000 for single filers. The tax can be computed
 * as follows:
 * 
 * tax = brackets[0][0] * rates[0] + (brackets[0][1] – brackets[0][0]) * rates[1] +
 *      (brackets[0][2] – brackets[0][1]) * rates[2] + (brackets[0][3] – brackets[0][2]) * rates[3] +
 *      (brackets[0][4] – brackets[0][3]) * rates[4] + (400000 – brackets[0][4]) * rates[5]
 *
 * Commentary: I will need to use a for loop and check the entered income compared to the
 * brackets. There will need to be some if statements to handle early termination of the loop
 * when the income is greater than the most recent bracket tier. I will print the output to
 * show the income and tax amount.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/15/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.12
 */

import java.util.Scanner;

public class EX12_ComputeTax {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // tell user which each integer means for status and assign user input to variable
        System.out.println("-------------------------------------------------");
        System.out.println("0 - Single Filer\n1 - Married Jointly OR Qualifying Widow(er)\n2 - Married Separately\n3 - Head of Household");
        System.out.println("-------------------------------------------------");
        System.out.print("Enter the filing status: ");
        int status = input.nextInt();
        
        // assign income variable with user input
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();
        
        // print output of tax amount and entered income
        System.out.println("The tax on an income of " + income + " is " + getTax(status, income));
        
    }
    
    // method to calculate the taxes based on income and status
    public static double getTax(int status, double income) {
        double taxAmount = 0;
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {{8350, 33950, 82250, 171550, 372950}, // Single filer
                            {16700, 67900, 137050, 20885, 372950}, // Married jointly or qualifying widow(er)
                            {8350, 33950, 68525, 104425, 186475}, // Married separately
                            {11950, 45500, 117450, 190200, 372950}}; // Head of household
       
        if (income <= brackets[status][0]) {    // income less than first bracket
            return taxAmount = income * rates[0];
        } else {
            taxAmount += brackets[status][0] * rates[0];   
            for (int i = 1; i < brackets[0].length; i++) { 
                if (income > brackets[status][i])   // income is higher than each sequential bracket
                    taxAmount += (brackets[status][i] - brackets[status][i - 1]) * rates[i];
                else    // income is not higher than bracket tier, return value after last computation
                    return taxAmount += (income - brackets[status][i - 1]) * rates[i];
            }
        }
        
        // special case: if income is greater than last bracket
        return taxAmount + (income - brackets[status][4]) * rates[5];
    }
       
       
        
    

}
