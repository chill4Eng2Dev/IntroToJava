/**
 * (Longest common prefix) Write a program that prompts the user to enter two
 * strings and displays the largest common prefix of the two strings. Here are some
 * sample runs:
 * 
 * -------------------------------------------------------
 * Enter the first string: Welcome to C++ [ENTER]
 * Enter the second string: Welcome to programming [ENTER]
 * The common prefix is Welcome to
 * -------------------------------------------------------
 * -------------------------------------------------------
 * Enter the first string: Atlanta [ENTER]
 * Enter the second string: Macon [ENTER]
 * Atlanta and Macon have no common prefix
 * -------------------------------------------------------
 * 
 * Commentary: I will store two strings and compare each character of one string
 * to the same place holder of the other. If the characters match, I will print the
 * string out as shown in the sample run. 
 *
 * Author: chill4Eng2Dev 
 * Date: 9/2/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.50
 */

import java.util.Scanner;

public class EX51_LongestCommonPrefix {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to string 1
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        
        // assign user input to string 2
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();
        
        // check if first char matchs, if not, print sample run message, otherwise check each char
        if(str1.charAt(0) != str2.charAt(0))
            System.out.println(str1 + " and " + str2 + " have no common prefix");
        else {
            System.out.print(str1.charAt(0));   // already checked so print char at 0
            for (int i = 1; i < str1.length(); i++) {   // start at char 1
                if (str1.charAt(i) == str2.charAt(i))
                    System.out.print(str1.charAt(i));
                else
                    break;
            }
        }
        
    }

}
