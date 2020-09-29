/**
 * (Hex to decimal) Write a recursive method that parses a hex number as a string
 * into a decimal integer. The method header is:
 * 
 * public static int hex2Dec(String hexString)
 * 
 * Write a test program that prompts the user to enter a hex string and displays its
 * decimal equivalent.
 * 
 * Commentary: 
 *      
 * Author: chill4Eng2Dev 
 * Date: 9/15/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 18.24
 */

import java.util.Scanner;

public class EX24_Hex2Dec {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a hexadecimal to be converted: ");
        String hexStr = input.nextLine();
        
        System.out.println("The decimal equivalent is: " + hex2Dec(hexStr));
    }
    
    public static int hex2Dec(String hexString) {
        int index = hexString.length() - 1;
        int expIndex = 0;
        int decimal = 0;
        return hex2Dec(hexString, index, expIndex, decimal);
    }
    
    public static int hex2Dec(String hexString, int index, int expIndex, int decimal) {
        if (index < 0)
            return decimal;
        else {
            int value = 0;
            switch (hexString.charAt(index)) {
                case 'A': value = 10; break;
                case 'B': value = 11; break;
                case 'C': value = 12; break;
                case 'D': value = 13; break;
                case 'E': value = 14; break;
                case 'F': value = 15;
                default : value = Integer.parseInt(hexString.charAt(index) + "");
            }
            
            decimal = value * (int)Math.pow(16, expIndex) + decimal;
            return hex2Dec(hexString, index - 1, expIndex + 1, decimal);
        }
    }
            

}
