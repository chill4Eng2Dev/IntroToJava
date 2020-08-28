/**
 * (Find the character of an ASCII code) Write a program that receives an ASCII code
 * (an integer between 0 and 127) and displays its character. Here is a sample run:
 * 
 * ------------------------------------
 * Enter an ASCII code: 69 [ENTER]
 * The character for ASCII code 69 is E
 * ------------------------------------
 * 
 * Commentary: I will need to take the user input as an int and cast it to a char. 
 * I will then print output as char. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/25/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.8
 */

import java.util.Scanner;

public class EX08_CharOfASCIICode {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize int value with user input
        System.out.print("Enter an ASCII code: ");
        int value = input.nextInt();
        
        if (value < 0 || value > 127) {
            System.out.println("Invalid entry. Value must be between 0 and 127.");
            System.exit(1);
        }    
           
        // cast value to char and store in char variable
        char ch = (char)value;
        
        // print output as shown in sample run
        System.out.println("The character for ASCII code " + value + " is " + ch);
        
    }

}
