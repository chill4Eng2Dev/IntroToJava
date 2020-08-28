/**
 * (Phone key pads) The international standard letter/number mapping found on the
 * telephone is shown below (see picture figure in folder):
 * 
 * Write a program that prompts the user to enter a letter and displays its corresponding
 * number.
 * 
 * ----------------------------------
 * Enter a letter: A [ENTER]
 * The corresponding number is 2
 * ----------------------------------
 * ----------------------------------
 * Enter a letter: a [ENTER]
 * The corresponding number is 2
 * ----------------------------------
 * ----------------------------------
 * Enter a letter: + [ENTER]
 * + is an invalid input
 * ----------------------------------
 * 
 * Commentary: I will need to validate the entry is a letter. I will need to make the 
 * entry upper or lower case to limit the possible ranges checked. I will use a multi 
 * if-else statement to cycle through the possible numeric options - else invalid input. 
 * I will print the output as shown in the sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/27/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.15
 */

import java.util.Scanner;

public class EX15_PhoneKeyPads {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize user entry
        System.out.print("Enter a letter: ");
        char ch = input.nextLine().charAt(0);
        
        
        if (Character.isLetter(ch)) {  // check if letter
            System.out.print("The corresponding number is ");
            ch = Character.toUpperCase(ch); // convert to upper case
            
            // cycle through alphabet and corresponding numeric
            if (ch >= 'W')
                System.out.println("9");
            else if (ch >= 'T')
                System.out.println("8");
            else if (ch >= 'P')
                System.out.println("7");
            else if (ch >= 'M')
                System.out.println("6");
            else if (ch >= 'J')
                System.out.println("5");
            else if (ch >= 'G')
                System.out.println("4");
            else if (ch >= 'D')
                System.out.println("3");
            else
                System.out.println("2");
            
        }
        else    // if not letter, print invalid input statement
            System.out.println(ch + " is an invalid input");
    }
}
