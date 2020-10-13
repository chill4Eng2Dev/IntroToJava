/**
 * (Sum the digits in an integer) Write a method that computes the sum of the digits
 * in an integer. Use the following method header:
 * 
 *      public static int sumDigits(long n)
 * 
 * For example, sumDigits(234) returns 9 (2 + 3 + 4). (Hint: Use the % operator
 * to extract digits, and the / operator to remove the extracted digit. For instance,
 * to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10
 * (= 23). Use a loop to repeatedly extract and remove the digit until all the digits
 * are extracted. Write a test program that prompts the user to enter an integer and
 * displays the sum of all its digits.
 * 
 * Commentary: I will use a while loop for the sumDigits method to sum entry until the
 * remaining value is 0. I will print output to show the summed entry as described in
 * problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/7/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.2
 */

import java.util.Scanner;

public class EX02_SumDigitsInInteger {
    
    public static void main(String[] args) {
        
        // create scanner
        Scanner input = new Scanner(System.in);
        
        // assign user entry to entry for summation
        System.out.print("\nEnter an integer to be summed: ");
        long entry = input.nextLong();
        
        // print output of entry and sumDigit
        System.out.println("The value " + entry + " with individual digits summed is " + sumDigits(entry));
        
    }
    
    // method for sumDigits as described in problem statement
    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + (int)n % 10;
            n = n / 10;
        }
        
        return sum;
    }

}
