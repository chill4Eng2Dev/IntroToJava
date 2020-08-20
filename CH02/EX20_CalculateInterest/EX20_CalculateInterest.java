/**
 * (Financial application: calculate interest) If you know the balance and the annual
 * percentage interest rate, you can compute the interest on the next monthly payment
 * using the following formula:
 *  
 *          interest = balance X (annualInterestRate/1200)
 *          
 * Write a program that reads the balance and the annual percentage interest rate and
 * displays the interest for the next month. Here is a sample run:
 * 
 * ------------------------------------------------------------------
 * Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5 [ENTER]
 * The interest is 2.91667
 * ------------------------------------------------------------------
 * 
 * Commentary: I will need to create a few variables of type double. I will calculate
 * the interest using the provided formula. I will show my output as shown in the 
 * sample run. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/19/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.20
 */

import java.util.Scanner;

public class EX20_CalculateInterest {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare variables
        double balance, annualInterestRate, interest;
        
        // initialize variables with user inputs
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        balance = input.nextDouble();
        annualInterestRate = input.nextDouble();
        
        // calculate interest using formula provided by problem statement
        interest = balance * (annualInterestRate / 1200);
        
        // print output of interest as shown in sample run
        System.out.println("The interest is " + interest);
        
    }
}
