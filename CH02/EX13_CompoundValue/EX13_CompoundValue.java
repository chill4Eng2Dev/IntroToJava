
/**
 * (Financial application: compound value) Suppose you save $100 each month
 * into a savings account with the annual interest rate 5%. Thus, the monthly
 * interest rate is 0.05/12 = 0.00417. 
 * 
 * After the first month, the value in the account becomes
 * 100 * (1 + 0.00417) = 100.417
 * 
 * After the second month, the value in the account becomes
 * (100 + 100.417) * (1 + 0.00417) = 201.252
 * 
 * After the third month, the value in the account becomes
 * (100 + 201.252) * (1 + 0.00417) = 302.507
 * and so on.
 * 
 * Write a program that prompts the user to enter a monthly saving amount and 
 * displays the account value after the sixth month. (In Exercise 5.30, you will
 * use a loop to simplify the code and display the account value for any month.)
 * 
 * ---------------------------------------------------
 * Enter the monthly saving amount: 100 [ENTER]
 * After the sixth month, the account value is $608.81
 * ---------------------------------------------------
 * 
 * Commentary: I will need to create type double variables and calculate the accumulated
 * interest as shown in the problem statement. I will only show the final calculation at
 * the six month mark as shown in the sample run. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/19/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.13
 */

import java.util.Scanner;

public class EX13_CompoundValue {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and/or initialize variables
        final double MONTHLY_RATE = 1 + 0.05 / 12;
        double monthlySavings, balance;
        
        // gather user input and initialize variable
        System.out.print("Enter the monthly saving amount: ");
        monthlySavings = input.nextDouble();
                
        // balance after month 1
        balance = monthlySavings * MONTHLY_RATE;
        // balance after month 2
        balance = (monthlySavings + balance) * MONTHLY_RATE;
        // balance after month 3
        balance = (monthlySavings + balance) * MONTHLY_RATE;
        // balance after month 4
        balance = (monthlySavings + balance) * MONTHLY_RATE;
        // balance after month 5
        balance = (monthlySavings + balance) * MONTHLY_RATE;
        // balance after month 6
        balance = (monthlySavings + balance) * MONTHLY_RATE;
        
        // print output of balance as shown in sample run
        System.out.println("After the sixth month, the account value is $" + balance);
        
    }
        
        
}
