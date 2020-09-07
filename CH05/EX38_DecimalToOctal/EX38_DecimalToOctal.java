/**
 * (Decimal to octal) Write a program that prompts the user to enter a decimal
 * integer and displays its corresponding octal value. Don’t use Java’s Integer
 * .toOctalString(int) in this program.
 * 
 * Commentary: I will need to use a while loop to divide and store the remainder
 * of the the user input until the value is zero. I will store the remainders into
 * a string and then use a for loop to print the string backwards. I will print the
 * output as stated in the problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/7/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.38
 */

import java.util.Scanner;

public class EX38_DecimalToOctal {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to decimal variable
        System.out.print("\nEnter integer value: ");
        int decimal = input.nextInt();
        
        // declare remainder and str variables
        int remainder;
        String str = "";
        
        // while loop to convert decimal to octal (8) 
        // source for calc: https://byjus.com/maths/convert-decimal-to-octal/
        while (decimal != 0) {
            remainder = decimal % 8;
            decimal = decimal / 8;
            str = str + remainder; // store remainders
        }
        
        // print remainder string in reverse
        System.out.print("The binary number is: ");
        for (int i = str.length() - 1; i >= 0; i--)
            System.out.print(str.charAt(i));
        
        System.out.println();
        
    }
    
}
