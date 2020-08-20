
/**
 * (Financial application: calculate future investment value) Write a program that 
 * reads in investment amount, annual interest rate, and number of years, and displays
 * the future investment value using the following formula:
 * 
 * futureInvestmentValue = investmentAmount X (1 + monthlyInterestRate) ^ numberOfYears * 12
 * 
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number of
 * years 1, the future investment value is 1032.98.
 * 
 * Here is a sample run:
 * ------------------------------------------------------
 * Enter investment amount: 1000.56 [ENTER]
 * Enter annual interest rate in percentage: 4.25 [ENTER]
 * Enter number of years: 1 [ENTER]
 * Accumulated value is $1043.92
 *  -----------------------------------------------------
 *  
 * Commentary: I will need to create a few variables of type double. I will need to use
 * Math class and calculate futureInvestmentValue with the provided formula. I will show 
 * my output as shown in the sample run. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/19/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.21
 */

import java.util.Scanner;

public class EX21_CalcFutureInvestValue {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare variables
        double futureInvestmentValue, investmentAmount, monthlyInterestRate, 
        annualInterestRate, numberOfYears;
        
        // initialize variables with user inputs
        System.out.print("Enter investment amount: ");
        investmentAmount = input.nextDouble();
        
        System.out.print("Enter annual interest rate in percentage: ");
        annualInterestRate = input.nextDouble();
        
        System.out.print("Enter number of years: ");
        numberOfYears = input.nextDouble();
        
        // calculate monthlyInterestRate using the user input annualInterestRate
        monthlyInterestRate = annualInterestRate / 1200;
        
        // calculate futureInvestmentValue using the provided formula from the problem statement
        futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        
        // print output of futureInvestmentValue as shown in the sample run
        System.out.println("Accumulated value is $" + futureInvestmentValue);
        
    }
        
}
