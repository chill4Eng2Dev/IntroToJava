
/**
 * (Check substring) Write a program that prompts the user to enter two strings and
 * reports whether the second string is a substring of the first string.
 * 
 * --------------------------------
 * Enter string s1: ABCD [ENTER]
 * Enter string s2: BC [ENTER]
 * BC is a substring of ABCD
 * --------------------------------
 * --------------------------------
 * Enter string s1: ABCD [ENTER]
 * Enter string s2: BDC [ENTER]
 * BDC is not a substring of ABCD
 * --------------------------------
 *  
 * Commentary: I will need to use ".contains()" method to check if one string is a sub-
 * string of another. I will print the output as shown in the sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/27/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.22
 */

import java.util.Scanner;

public class EX22_CheckSubstring {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to s1
        System.out.print("Enter string s1: ");
        String s1 = input.nextLine();
        
        // assign user input to s2
        System.out.print("Enter string s2: ");
        String s2 = input.nextLine();
        
        // check is s2 is a substring of s1
        if (s1.contains(s2)) 
            System.out.println(s2 + " is a substring of " + s1);
        else
            System.out.println(s2 + " is not a substring of " + s1);
            
        }

}
