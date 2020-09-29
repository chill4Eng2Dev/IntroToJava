
/**
 * (Decimal to hex) Write a recursive method that converts a decimal number into
 * a hex number as a string. The method header is:
 * 
 *      public static String dec2Hex(int value)
 * 
 * Write a test program that prompts the user to enter a decimal number and displays
 * its hex equivalent.
 * 
 * Commentary: I will need to use a switch statement within the recursive call to assign
 * the correct value to hex number remainder. I will print output as stated in problem
 * statement.
 *      
 * Author: chill4Eng2Dev 
 * Date: 9/15/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 18.22
 */

import java.util.Scanner;

public class EX22_Dec2Hex {
    
    public static void main(String[] args) {
        // create a scanner        
        Scanner input = new Scanner(System.in);
        
        // assign user input to decimal variable
        System.out.print("Enter a decimal integer: ");
        int value = input.nextInt();
        
        // print output and call recursive dec2hex method
        System.out.println("The hexadecimal equivalent is: " + dec2Hex(value));
        
    }
    
    // decimal to hex method
    public static String dec2Hex(int value) {
        String hex = "";
        if (value == 0) // base case
            return hex;
        else {
            if (value % 16 > 9) {   // switch method if remainder is 10 or greater
                switch (value % 16) {
                    case 10: hex = "A"; break;
                    case 11: hex = "B"; break;
                    case 12: hex = "C"; break;
                    case 13: hex = "D"; break;
                    case 14: hex = "E"; break;
                    case 15: hex = "F";
                }
            } else
                hex = value % 16 + "";  // else store remainder in hex string
                
            return dec2Hex(value / 16) + hex;   // recursive call
        }
                    
    }
    


}
