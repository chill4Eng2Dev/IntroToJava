/**
 * (Reverse a string) Write a program that prompts the user to enter a string and
 * displays the string in reverse order.
 * 
 * ---------------------------------------------
 *  Enter a string: ABCD [ENTER]
 *  The reversed string is DCBA
 * ---------------------------------------------
 * 
 * Commentary: I will use a for loop to print the last char of a string and decrement
 * the index by one until the the end of the string. I will print output to match the
 * sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/2/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.46
 */

import java.util.Scanner;

public class EX46_ReverseString {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to string
        System.out.print("\nEnter a string: ");
        String str = input.nextLine();
        
        // print start of output as shown in sample run
        System.out.print("The reversed string is ");
        
        // start at the last index of the string and decrement until the entire string has been printed
        for(int i = str.length() - 1; i >= 0; i--)
            System.out.print(str.charAt(i));
            
    }
        
        
}
