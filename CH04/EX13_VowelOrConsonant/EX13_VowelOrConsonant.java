/**
 * (Vowel or consonant?) Write a program that prompts the user to enter a letter and
 * check whether the letter is a vowel or consonant. Here is a sample run:
 * 
 * -------------------------
 * Enter a letter: B [ENTER]
 * B is a consonant
 * -------------------------
 * -------------------------
 * Enter a letter: a [ENTER]
 * a is a vowel
 * -------------------------
 * -------------------------
 * Enter a letter: # [ENTER]
 * # is an invalid input
 * -------------------------
 * 
 * Commentary: I will need to check if entry is a letter. I will need to make the entry 
 * upper or lower case to limit the possible entries checked. I will use a switch statement 
 * to cycle through the possible vowel options, default is consonant - else invalid input. 
 * I will print the output as shown in the sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/27/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.13
 */

import java.util.Scanner;

public class EX13_VowelOrConsonant {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize char with user input
        System.out.print("Enter a letter: ");
        char ch = input.nextLine().charAt(0);
        
        // print output of char before converting to lower case
        System.out.print(ch + " is ");
        
        // convert char to lower case
        ch = Character.toLowerCase(ch);
        
        // check if within lower case alphabet range
        if (Character.isLetter(ch)) {
            switch (ch) {       // print if vowel or consonant
                case 'a': System.out.println("a vowel"); break;
                case 'e': System.out.println("a vowel"); break;
                case 'i': System.out.println("a vowel"); break;
                case 'o': System.out.println("a vowel"); break;
                case 'u': System.out.println("a vowel");
                default:  System.out.println("a consonant"); 
            }
        } else      // else print if invalid entry
            System.out.println("an invalid input");
        
    }
}
