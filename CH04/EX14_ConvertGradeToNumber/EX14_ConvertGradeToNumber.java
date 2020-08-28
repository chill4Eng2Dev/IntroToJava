/**
 * (Convert Letter grade to Number) Write a program that prompts the user to enter a
 * letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2,
 * 1, or 0. Here is a sample run:
 * 
 * ----------------------------------
 * Enter a letter grade: B [ENTER]
 * The numeric value for grade B is 3
 * ----------------------------------
 * ----------------------------------
 * Enter a letter grade: T [ENTER]
 * T is an invalid grade
 * ----------------------------------
 * 
 * Commentary: I will need to compare entry to a range of character values, a through f.
 * I will need to make the entry upper or lower case to limit the possible ranges checked.
 * I will use a switch statement to cycle through the possible numeric options - else 
 * invalid input. I will print the output as shown in the sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/27/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.14
 */

import java.util.Scanner;

public class EX14_ConvertGradeToNumber {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize user entry
        System.out.print("Enter a letter grade: ");
        char ch = input.nextLine().charAt(0);
        
        // declare and initalize lower case char, keeping the original entry for output
        char lowerCh = Character.toLowerCase(ch);
        
        // check if lowercase char is within range of a-f
        if (lowerCh >= 'a' && lowerCh <= 'f') {
            System.out.print("The numeric value for grade " + ch + " is ");
            switch (lowerCh) {      // cycle through numeric values depending on letter
                case 'a': System.out.println("4"); break;
                case 'b': System.out.println("3"); break;
                case 'c': System.out.println("2"); break;
                case 'd': System.out.println("1"); break;
                case 'f': System.out.println("0");
            }
        } 
        else        // print output if invalid entry
            System.out.println(ch + " is an invalid grade");
            
    }
        
}
