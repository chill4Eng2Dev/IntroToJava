
/**
 * (Business: check ISBN-10) An ISBN-10 (International Standard Book Number) 
 * consists of 10 digits: d1*d2*d3*d4*d5*d6*d7*d8*d9*d10. The last digit, d10,
 * is a checksum, which is calculated from the other nine digits using the
 * following formula:
 * 
 *          (d1 X 1 + d2 X 2 + d3 X 3 + d4 X 4 + d5 X 5 + 
 *                  d6 X 6 + d7 X 7 + d8 X 8 + d9 X 9) % 11
 *      
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10
 * convention. Write a program that prompts the user to enter the first 9 digits and
 * displays the 10-digit ISBN (including leading zeros). Your program should read
 * the input as an integer. Here are sample runs:
 * 
 * -----------------------------------------------------------------
 * Enter the first 9 digits of an ISBN as integer: 013601267 [ENTER]
 * The ISBN-10 number is 0136012671
 * -----------------------------------------------------------------
 * -----------------------------------------------------------------
 * Enter the first 9 digits of an ISBN as integer: 013031997 [ENTER]
 * The ISBN-10 number is 013031997X
 * ----------------------------------------------------------------- 
 * Commentary: I will need to use division and modulus to extract the user entry into
 * d1-9 variables. I will calculate d10 with the formula and use an if statement to
 * print d10 or X. I will print the output as shown in the sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/21/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.9
 */

import java.util.Scanner;

public class EX09_CheckISBN_10 {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // initialize user input to variable
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int userEntry = input.nextInt();
        
        // use division and modulus to assign values to the declared d(1-9) variables
        int d9 = userEntry % 10;
        userEntry /= 10;
        int d8 = userEntry % 10;
        userEntry /= 10;
        int d7 = userEntry % 10;
        userEntry /= 10;
        int d6 = userEntry % 10;
        userEntry /= 10;
        int d5 = userEntry % 10;
        userEntry /= 10;
        int d4 = userEntry % 10;
        userEntry /= 10;
        int d3 = userEntry % 10;
        userEntry /= 10;
        int d2 = userEntry % 10;
        userEntry /= 10;
        int d1 = userEntry % 10;
        userEntry /= 10;
        
        // calculate d10 using the provided formula from the problem statement
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + 
                        d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        
        // print output of the ISBN-10 number with truncate if statement for X or d10
        System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 +
                d7 + d8 + d9 + ((d10 == 10) ? "X" : d10));
        
    }
        
}
