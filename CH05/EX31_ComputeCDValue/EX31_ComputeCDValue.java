/**
 * (Financial application: compute CD value) Suppose you put $10,000 into a CD
 * with an annual percentage yield of 5.75%. After one month, the CD is worth
 * 
 *          10000 + 10000 * 5.75 / 1200 = 10047.92
 *          
 * After two months, the CD is worth
 * 
 *          10047.91 + 10047.91 * 5.75 / 1200 = 10096.06
 *          
 * After three months, the CD is worth
 * 
 *          10096.06 + 10096.06 * 5.75 / 1200 = 10144.44
 *          
 * and so on.
 * 
 * Write a program that prompts the user to enter an amount (e.g., 10000), the
 * annual percentage yield (e.g., 5.75), and the number of months (e.g., 18) and
 * displays a table as shown in the sample run.
 * 
 * ----------------------------------------------------------
 *      Enter the initial deposit amount: 10000 [ENTER]
 *      Enter annual percentage yield: 5.75 [ENTER]
 *      Enter maturity period (number of months): 18 [ENTER]
 *      Month   CD Value
 *      1       10047.92
 *      2       10096.06
 *      ...
 *      17      10846.57
 *      18      10898.54
 * ----------------------------------------------------------
 * 
 * Commentary: I will use the formula provided to calculate the CD value. I will use
 * a for loop and printf to create a table of outputs. I will print the output to
 * match what is shown in the sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/3/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.31
 */

import java.util.Scanner;

public class EX31_ComputeCDValue {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user inputs to variables
        System.out.print("Enter the initial deposit amount: ");
        double amount = input.nextDouble();
        
        System.out.print("Enter annual percentage yield: ");
        double percentYield = input.nextDouble();
        
        System.out.print("Enter maturity period (number of months): ");
        int months = input.nextInt();
        
        // calculate monthly interest and initialize total to entered amount for first run
        double monthlyInterest = percentYield / 1200;
        double total = amount;
        
        // print headers
        System.out.printf("%-10s%-15s\n", "Month", "CD Value");
        
        // use for loop with printf to create output of CD value calculations
        for (int i = 1; i <= months; i++) {
            total = total + total * monthlyInterest;
            System.out.printf("%-10d%-15.2f\n", i, total);
        }
        
    }

}
