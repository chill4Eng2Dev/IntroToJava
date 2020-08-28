
/**
 * (Process a string) Write a program that prompts the user to enter a string and
 * displays its length and its first character.
 * 
 * Commentary: I will need to use the .length() and .charAt() methods of the String
 * class. I will print output as stated in the problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/27/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.20
 */

import java.util.Scanner;

public class EX20_ProcessString {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to s1
        System.out.print("Please enter a string: ");
        String s1 = input.nextLine();
        
        // get length and first char of string using .length() and .charAt() methods
        System.out.println("The string length, including spaces is " + s1.length() +
        "\nand the first character of the string is " + s1.charAt(0));
        
    }

}
