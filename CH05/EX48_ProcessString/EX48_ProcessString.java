/**
 * (Process string) Write a program that prompts the user to enter a string and displays
 * the characters at odd positions. Here is a sample run:

 * ----------------------------------------
 * Enter a string: Beijing Chicago [ENTER]
 * BiigCiao
 * ----------------------------------------
 * 
 * Commentary: I will have a for loop that prints out every other char of the user inputted
 * string. My output will match that of the sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/2/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.48
 */

import java.util.Scanner;

public class EX48_ProcessString {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to string
        System.out.print("\nEnter a string: ");
        String str = input.nextLine();
        
        // use for loop to go through ever other char in string and print output
        for (int i = 0; i < str.length(); i += 2)
            System.out.print(str.charAt(i));
            
    }

}
