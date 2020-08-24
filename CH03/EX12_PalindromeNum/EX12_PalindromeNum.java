
/**
 * (Palindrome number) Write a program that prompts the user to enter a three-digit
 * integer and determines whether it is a palindrome number. A number is palindrome
 * if it reads the same from right to left and from left to right. Here is a sample
 * run of this program:
 * 
 * -----------------------------------------------------------------
 * Enter a three-digit integer: 121 [ENTER]
 * 121 is a palindrome
 * -----------------------------------------------------------------
 * -----------------------------------------------------------------
 * Enter a three-digit integer: 123 [ENTER]
 * 123 is not a palindrome
 * ----------------------------------------------------------------- 
 * 
 * Commentary: I will need to use division and modulus to extract the user entry for
 * the ones place and the hundreds place. I will then compare the values in an if
 * statement and print out "is" or "is not" for verdict determination. I will print 
 * the output as shown in the sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/22/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.12
 */

import java.util.Scanner;

public class EX12_PalindromeNum {

    public static void main(String[] args) {
        
        // create scanner
        Scanner input = new Scanner(System.in);

        // declare and initialize variable with user input
        System.out.print("Enter a three-digit integer: ");
        int value = input.nextInt();
        
        // separate user input of the left value and the right value
        int num1 = (int)(value / 100); // cast down to int to remove decimal
        num1 = num1 % 100; // left value
        int num2 = value % 10; // right value
        
        // print output and verdict as shown in sample run
        System.out.println(value + ((num1 == num2) ? " is " : " is not ") + "a palindrome");
        
    }
}
