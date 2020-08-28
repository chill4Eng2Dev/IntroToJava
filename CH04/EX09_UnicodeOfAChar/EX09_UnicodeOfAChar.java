/**
 * (Find the Unicode of a character) Write a program that receives a character and
 * displays its Unicode. Here is a sample run:
 * 
 * -------------------------------------
 * Enter a character: E [ENTER]
 * The Unicode for the character E is 69
 * -------------------------------------
 * 
 * Commentary: I will need to take the user input as a string then pull then extract
 * the entry as a char using charAt(0). I will then need to cast the char into an int
 * to get the Unicode. I will print the output as shown in the sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/25/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.9
 */

import java.util.Scanner;

public class EX09_UnicodeOfAChar {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize str with user input
        System.out.print("Enter a character: ");
        String str = input.next();
        
        // make sure entry is only one character in length
        if (!(str.length() == 1)) {
            System.out.println("Invalid input. Enter only one character.");
            System.exit(1);
        }
        
        // convert entry to char by extracting first char of string
        char ch = str.charAt(0);

        // print output as shown in sample run
        System.out.println("The Unicode for the character " + ch + " is " + (int)ch);
    }
}
