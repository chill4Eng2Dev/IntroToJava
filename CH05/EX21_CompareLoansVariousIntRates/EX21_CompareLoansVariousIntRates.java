
/**
 * (Financial application: compare loans with various interest rates) Write a program
 * that lets the user enter the loan amount and loan period in number of years
 * and displays the monthly and total payments for each interest rate starting from
 * 5% to 8%, with an increment of 1/8. Here is a sample run:
 * 
 * -------------------------------------------------------------
 * Loan Amount: 10000 [ENTER]
 * Number of Years: 5 [ENTER]
 * Interest Rate        Monthly Payment     Total Payment
 * 5.000%               188.71              11322.74
 * 5.125%               189.29              11357.13
 * 5.250%               189.86              11391.59
 * ...
 * 7.875%               202.17              12129.97
 * 8.000%               202.76              12165.84
 * -------------------------------------------------------------   
 * For the formula to compute monthly payment, see Listing 2.9, ComputeLoan.java.
 * 
 * For reference, the formula from Listing 2.9 is: 
 *     monthlyPayment =               loanAmount * monthlyInterestRate 
 *                      ----------------------------------------------------------
 *                      (1 - 1 / (1 + monthlyInterestRate) ^ (numberOfYears * 12))
 *     
 * Commentary: I will need to use a for loop and printf for each 1/8% increase iteration.
 * I have referenced the formula from Listing 2.9. I print output to match sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/2/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.21
 */

import java.util.Scanner;

public class EX21_CompareLoansVariousIntRates {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to variables
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        
        System.out.print("Number of Years: " );
        int numOfYears = input.nextInt();
        
        // declare varaibles used to calculate loan
        double intRate, monthlyPayment, totPayment, monthlyIntRate;
        
        // print header to output table
        System.out.printf("%-20s%-20s%-20s\n", "Interest Rate", "Monthly Payment", "Total Payment");
        
        // calculate monthly payment and total payment for each interest rate and output with printf
        for (intRate = 5.000; intRate <= 8.000; intRate += 0.125) {
            monthlyIntRate = intRate / 1200;
            monthlyPayment = (loanAmount * monthlyIntRate) / (1 - 1 / Math.pow(1 + monthlyIntRate, numOfYears * 12));
            totPayment = monthlyPayment * numOfYears * 12;
            System.out.printf("%-1.3f%-15s%-20.2f%-20.2f\n", intRate, "%", monthlyPayment, totPayment);
        }
        
    }

    
}
