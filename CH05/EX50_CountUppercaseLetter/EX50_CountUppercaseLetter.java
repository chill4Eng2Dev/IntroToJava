/**
 * (Count uppercase letters) Write a program that prompts the user to enter a string
 * and displays the number of the uppercase letters in the string.
 * 
 * ------------------------------------------
 * Enter a string: Welcome to Java [ENTER]
 * The number of uppercase letters is 2
 * ------------------------------------------
 * 
 * Commentary: Use a for loop to go through each character of the string and use a counter
 * to count each time isUpperCase is true. I will print the output to match the sample run. 
 *
 * Author: chill4Eng2Dev 
 * Date: 9/1/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.50
 */

import java.util.Scanner;

public class EX50_CountUppercaseLetter {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to string variable
        System.out.print("Enter a string: " );
        String str = input.nextLine();
        
        int count = 0; // initialize a counter
        for(int i = 0; i < str.length(); i++) {         
            if (Character.isUpperCase(str.charAt(i)))   // if uppercase, count + 1
                count++;
        }
        
        // print output as shown in sample run
        System.out.println("The number of uppercase letters is " + count);
    }
}
