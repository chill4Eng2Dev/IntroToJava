/**
 * (Binary to decimal) Write a recursive method that parses a binary number as a
 * string into a decimal integer. The method header is:
 * 
 *      public static int bin2Dec(String binaryString)
 * 
 * Write a test program that prompts the user to enter a binary string and displays
 * its decimal equivalent.
 * 
 * Commentary: I will need to use a helper method to recursively call this conversion
 * method. I will print output as stated in problem statement.
 *      
 * Author: chill4Eng2Dev 
 * Date: 9/15/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 18.23
 */

import java.util.Scanner;

public class EX23_Bin2Dec {
    
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to binary variable
        System.out.print("Enter a binary number to be converted: ");
        String binaryStr = input.nextLine();
        
        // print output and call bin2Dec method
        System.out.println("The decimal equivalent is: " + bin2Dec(binaryStr));
        
    }
    
    // binary 2 decimal method
    public static int bin2Dec(String binaryString) {
        int high = binaryString.length() - 1;
        int expIndex = 0;
        int decimal = 0;
        return bin2Dec(binaryString, high, expIndex, decimal);
    }
    
    // helper method for binary to 2 decimal
    public static int bin2Dec(String binaryString, int high, int expIndex, int decimal) {
        if (high < 0)       // base case if index of string is out of bounds
            return decimal;
        else {
            decimal = Integer.parseInt(binaryString.charAt(high) + "") * (int)Math.pow(2, expIndex) + decimal;  
            return bin2Dec(binaryString, high - 1, expIndex + 1, decimal);  // recursive call
        }
        
    }

}
