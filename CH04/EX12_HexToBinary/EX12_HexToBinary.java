/**
 * (Hex to binary) Write a program that prompts the user to enter a hex digit and
 * displays its corresponding binary number. Here is a sample run:
 * 
 * -------------------------------------------
 * Enter a hex digit: B [ENTER]
 * The binary value is 1011
 * -------------------------------------------
 * -------------------------------------------
 * Enter a hex digit: G [ENTER]
 * G is an invalid input
 * -------------------------------------------
 * 
 * Commentary: I will need to compare entry to a range of character values, 0 - 9 and
 * A - F to see if the value is within said range. Otherwise, I will need to check between A - F. If
 * those checks are exceeded, then I will print an invalid statement. I will print the 
 * output as shown in the sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/26/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.12
 */

import java.util.Scanner;

public class EX12_HexToBinary {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize char from user input
        System.out.print("Enter a hex digit: ");
        char ch = input.nextLine().charAt(0);
        
        // check if char falls within parameters of hexadecimal values
        if (ch >= '0' && ch <= '9' || ch >= 'A' && ch <= 'F') { 
            System.out.print("The binary value is ");
            switch (ch) {
                case 0: System.out.println("0000"); break;
                case 1: System.out.println("0001"); break;
                case 2: System.out.println("0010"); break;
                case 3: System.out.println("0011"); break;
                case 4: System.out.println("0100"); break;
                case 5: System.out.println("0101"); break;
                case 6: System.out.println("0110"); break;
                case 7: System.out.println("0111"); break;
                case 8: System.out.println("1000"); break;
                case 9: System.out.println("1001"); break;
                case 'A': System.out.println("1010"); break;
                case 'B': System.out.println("1011"); break;
                case 'C': System.out.println("1100"); break;
                case 'D': System.out.println("1101"); break;
                case 'E': System.out.println("1110"); break;
                case 'F': System.out.println("1111");
            }
        } else  // char exceeds parameters, print an invalid statement
            System.out.println(ch + " is an invalid input");
    }
                
}
