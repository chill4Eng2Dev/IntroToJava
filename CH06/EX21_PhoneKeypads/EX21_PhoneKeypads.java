/**
 * (Phone keypads) The international standard letter/number mapping for telephones
 * is shown in Programming Exercise 4.15. Write a method that returns a number,
 * given an uppercase letter, as follows:
 * 
 *      int getNumber(char uppercaseLetter)
 * 
 * Write a test program that prompts the user to enter a phone number as a string.
 * The input number may contain letters. The program translates a letter (uppercase
 * or lowercase) to a digit and leaves all other characters intact. Here is a sample run
 * of the program:
 * 
 * -------------------------------------------
 * Enter a string: 1-800-Flowers [ENTER]
 * 1-800-3569377
 * -------------------------------------------
 * -------------------------------------------
 * Enter a string: 1800flowers [ENTER]
 * 18003569377
 * -------------------------------------------
 * 
 * Commentary: I will use the if-else statement from Exercise 4.15 to convert the letter
 * to a digit. I will check if the character from the string is a letter prior to calling
 * the getNumber method. I will use a for loop to go through the string and determine what
 * must happen for each character. I will print output to match sample runs.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/10/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.21
 */

import java.util.Scanner;

public class EX21_PhoneKeypads {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String phoneNum = input.nextLine();
        
        for (int i = 0; i < phoneNum.length(); i++) {
            if (Character.isLetter(phoneNum.charAt(i)))
                System.out.print(getNumber(phoneNum.charAt(i)));
            else
                System.out.print(phoneNum.charAt(i));
        }
            
    }
    
    public static int getNumber(char ch) {
        ch = Character.toUpperCase(ch); // convert to upper case
            
        // cycle through alphabet and corresponding numeric
        if (ch >= 'W')
            return 9;
        else if (ch >= 'T')
            return 8;
        else if (ch >= 'P')
            return 7;
        else if (ch >= 'M')
            return 6;
        else if (ch >= 'J')
            return 5;
        else if (ch >= 'G')
            return 4;
        else if (ch >= 'D')
            return 3;
        else
            return 2;
    }
}
