/**
 * (Financial application: compute the future investment value) Write a method that
 * computes future investment value at a given interest rate for a specified number
 * of years. The future investment is determined using the formula in Programming
 * Exercise 2.21.
 * Use the following method header:
 *  
 *      public static double futureInvestmentValue(double investmentAmount, 
 *                  double monthlyInterestRate, int years)
 * 
 * For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.
 * 
 * Write a test program that prompts the user to enter the investment amount (e.g.,
 * 1000) and the interest rate (e.g., 9%) and prints a table that displays future value
 * for the years from 1 to 30, as shown below:
 * 
 * ----------------------------------------
 *      The amount invested: 1000 [ENTER]
 *      Annual interest rate: 9 [ENTER]
 *      Years     Future Value
 *      1              1093.80
 *      2              1196.41
 *      ...
 *      29            13467.25
 *      30            14730.57
 * ----------------------------------------
 * 
 * For reference, from Exercise 2.21:
 *  futureInvestmentValue = investmentAmount X (1 + monthlyInterestRate) ^ numberOfYears * 12
 * 
 * Commentary: I will use the formula provided in Exercise 2.21 in the method. I will use a
 * for loop to call the method and to print the table as shown in the sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/7/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.7
 */

import java.util.Scanner;

public class EX07_ComputeFutureInvestValue {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // initialize variables with user inputs
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        
        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();

        // print output of futureInvestmentValue method as shown in the sample run
        System.out.printf("%-10s%15s\n", "Years", "Future Value");
        for (int i = 1; i <= 30; i++)
            System.out.printf("%-10d%15.2f\n", i, futureInvestmentValue(investmentAmount, 
        annualInterestRate / 1200, i));

    }
    
    // method to calculate future investment value as provided in problem statement
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        // calculate monthlyInterestRate using the user input annualInterestRate
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
