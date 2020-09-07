/**
 * (Financial application: compound value) Suppose you save $100 each month
 * into a savings account with the annual interest rate 5%. So, the monthly interest
 * rate is 0.05 / 12 = 0.00417. After the first month, the value in the account
 * becomes
 * 
 *                      100 * (1 + 0.00417) = 100.417
 *                      
 * After the second month, the value in the account becomes
 * 
 *                  (100 + 100.417) * (1 + 0.00417) = 201.252
 *                  
 * After the third month, the value in the account becomes
 * 
 *                  (100 + 201.252) * (1 + 0.00417) = 302.507
 *                  
 * and so on.
 *
 * Write a program that prompts the user to enter an amount (e.g., 100), the annual
 * interest rate (e.g., 5), and the number of months (e.g., 6) and displays the amount
 * in the savings account after the given month.
 *                   
 * Commentary: I will right a for loop that will calculate the compound interest. I will
 * print output as described in problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/3/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.30
 */

import java.util.Scanner;

public class EX30_CompoundValue {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user inputs to variables
        System.out.print("\nEnter monthly deposit amount (e.g., 100): ");
        double amount = input.nextDouble();
        
        System.out.print("Enter the annual interest rate: ");
        double annualIntRate = input.nextDouble();
        
        System.out.print("Enter the number of months of growth: ");
        int months = input.nextInt();
        
        // initialize variables to be used in the compound growth calculation
        double total = 0;
        double monthlyInterestRate = annualIntRate / 1200;
        
        // use for loop to calculate compound growth
        for (int i = 0; i < months; i++)
            total = (total + amount) * (1 + monthlyInterestRate);
        
        // print a summary of the total amount after growth period
        System.out.printf("The total amount after %-2d months of growth is: $%-3.2f\n", months, total);
        
    }

}
