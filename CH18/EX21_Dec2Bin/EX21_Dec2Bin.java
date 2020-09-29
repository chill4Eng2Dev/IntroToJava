/**
 * (Decimal to binary) Write a recursive method that converts a decimal number
 * into a binary number as a string. The method header is:
 * 
 *      public static String dec2Bin(int value)
 * 
 * Write a test program that prompts the user to enter a decimal number and displays
 * its binary equivalent.
 * 
 * Commentary: I will have a base case of a decimal value equal to 0 and return binary
 * string. Otherwise, I will store the remainder into a binary string and recursively
 * call the method prior to printing the binary string. I will print out the result
 * as described in the problem statement.
 *      
 * Author: chill4Eng2Dev 
 * Date: 9/15/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 18.21
 */

import java.util.Scanner;

public class EX21_Dec2Bin {

    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign decimal input to variable
        System.out.print("Enter a decimal integer: ");
        int value = input.nextInt();
        
        // print output and recursively call dec2bin method
        System.out.println("The binary equivalent is: " + dec2Bin(value));
        
    }
    
    // method to convert decimal to binary
    public static String dec2Bin(int value) {
        String binary = "";
        if (value == 0) // base case
            return binary;
        else {
            binary = (value % 2) + "";      // store remainder as string
            return dec2Bin(value / 2) + binary; // recursively call method with next value
        }
    }
}
