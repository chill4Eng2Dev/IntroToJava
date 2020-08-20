
/**
 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.java,
 * to fix the possible loss of accuracy when converting a double value to an
 * int value. Enter the input as an integer whose last two digits represent the cents.
 * For example, the input 1156 represents 11 dollars and 56 cents.
 *  
 * Commentary: I do not have a sample run to mimic so I will prompt user to enter in
 * an integer. I will then use divide and modulus to separate the cents from the entry.
 * I will then display the revised input as shown in the problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/19/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.22
 */

import java.util.Scanner;

public class EX22_MonetaryUnits {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare variables
        int originalValue, value, pennies, dimes;
        
        // initialize variable with user input
        System.out.print("Enter integer value of dollars and cents, no decimal: ");
        value = input.nextInt();
        
        originalValue = value;  // store initial value for output later
        pennies = value % 10;   // gather the "pennies" of the entry
        value /= 10;            // reduce the value by dividing by 10
        dimes = value % 10;     // gather the "dimes" of the entry
        value /= 10;            // reduce the value to give the remaining dollars
        
        // print output of dollars and cents from the original input
        System.out.println("The input of " + originalValue + " represents " + value + " dollars and " + dimes + pennies + " cents");
        
    }
        
}
