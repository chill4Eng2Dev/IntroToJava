/**
 * (Business: check ISBN-10) Rewrite the Programming Exercise 3.9 by entering the
 * ISBN number as a string.
 * 
 * Commentary: I have two approaches here, I could take user input as String then immediately
 * parse the value to int (or long), then use the same code in Exercise 3.9 to extract the values
 * for the calculation. Or, I can use parseInt for each char at position #. I will need to convert
 * char into string prior to submitting to parseInt(). I will use a incrementer count to handle 
 * numerical count of each char of string. I assume the point of the exercise is to practice 
 * parseInt with a string, so I will do the second method. I will print the output as shown in the 
 * Exercise 3.9 sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/28/2020 (Revision 1: 9/3/2020)
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.19
 */

import java.util.Scanner;

public class EX19_CheckISBN_10 {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        int count = -1;
        
        // assign user input to variable
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String userEntry = input.nextLine();
        
        if(!(userEntry.length() == 9)) {
            System.out.println("Invalid entry. Must be 9 digits entered. Try again.");
            System.exit(1);
        }
        
        // use .parseInt method on each character of the string to convert to int
        int d1 = Integer.parseInt(userEntry.charAt(++count) + "");
        int d2 = Integer.parseInt(userEntry.charAt(++count) + "");
        int d3 = Integer.parseInt(userEntry.charAt(++count) + "");
        int d4 = Integer.parseInt(userEntry.charAt(++count) + "");
        int d5 = Integer.parseInt(userEntry.charAt(++count) + "");
        int d6 = Integer.parseInt(userEntry.charAt(++count) + "");
        int d7 = Integer.parseInt(userEntry.charAt(++count) + "");
        int d8 = Integer.parseInt(userEntry.charAt(++count) + "");
        int d9 = Integer.parseInt(userEntry.charAt(++count) + "");
                
        // calculate d10 using the provided formula from the Exercise 3.9 problem statement
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + 
                        d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        
        // print output of the ISBN-10 number with truncate if statement for X or d10
        System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 +
                d7 + d8 + d9 + ((d10 == 10) ? "X" : d10));
                
    }
}
