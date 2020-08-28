/**
 * (Decimal to hex) Write a program that prompts the user to enter an integer between
 * 0 and 15 and displays its corresponding hex number. Here are some sample runs:
 * 
 * -------------------------------------------
 * Enter a decimal value (0 to 15): 11 [ENTER]
 * The hex value is B
 * -------------------------------------------
 * -------------------------------------------
 * Enter a decimal value (0 to 15): 5 [ENTER]
 * The hex value is 5
 * -------------------------------------------
 * -------------------------------------------
 * Enter a decimal value (0 to 15): 31 [ENTER]
 * 31 is an invalid input
 * -------------------------------------------
 * 
 * Commentary: I will need to print entered value out as enter if between 0-9 and use
 * a switch statement for anything else. I will print the output as shown in the sample 
 * run.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/25/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.11
 */

import java.util.Scanner;

public class EX11_DecimalToHex {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize variable with user input
        System.out.print("Enter a decimal value (0 to 15): ");
        int value = input.nextInt();
                
        if (value >= 0 && value <= 9)   // print value because the hex and decimal are the same
            System.out.println("The hex value is " + value);
        else {  // otherwise print A - F or the default message if value out of bounds
            switch(value) {
                case 10: System.out.println("The hex value is A"); break;
                case 11: System.out.println("The hex value is B"); break;
                case 12: System.out.println("The hex value is C"); break;
                case 13: System.out.println("The hex value is D"); break;
                case 14: System.out.println("The hex value is E"); break;
                case 15: System.out.println("The hex value is F"); 
                default: System.out.println(value + " is an invalid input"); 
            }
        }
                
    }
}
