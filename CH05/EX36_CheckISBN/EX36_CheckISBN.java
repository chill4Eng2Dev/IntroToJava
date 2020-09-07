/**
 * (Business application: checking ISBN ) Use loops to simplify Programming
 * Exercise 3.9.
 * 
 * Commentary: I will use a for loop to parse the individual characters into
 * integers. I will need to use "" within the parseInt() since chars cannot be
 * converted to integers, and parseInt() is for strings. I will match the output
 * to the sample run of 3.9.
 *
 * Author: chill4Eng2Dev 
 * Date: #/##/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.36
 */

import java.util.Scanner;

public class EX36_CheckISBN {

    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // initialize checksum
        int d10 = 0;
        
        // assign user input to string
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String userEntry = input.nextLine();
        
        // check if the input is valid length
        if(!(userEntry.length() == 9)) {
            System.out.println(userEntry + " is an invalid input.");
            System.exit(1);
        }
        
        // for loop to cycle through 
        for (int i = 1; i <= userEntry.length(); i++) {
                d10 = d10 + i * Integer.parseInt(userEntry.charAt(i - 1) + "");
        }
        
        // get modulus of checksum
        d10 = d10 % 11;
        
        // print output of the ISBN-10 number with truncate if statement for X or d10
        System.out.println("The ISBN-10 number is " + userEntry + ((d10 == 10) ? "X" : d10));
                   
    }
}
