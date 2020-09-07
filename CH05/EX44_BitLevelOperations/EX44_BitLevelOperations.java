/**
 * (Computer architecture: bit-level operations) A short value is stored in 16 bits.
 * Write a program that prompts the user to enter a short integer and displays the 16
 * bits for the integer. Here are sample runs:
 * 
 * -------------------------------------------
 *  Enter an integer: 5 [ENTER]
 *  The bits are 0000000000000101
 * -------------------------------------------
 * -------------------------------------------
 *  Enter an integer: -5 [ENTER]
 *  The bits are 1111111111111011
 * -------------------------------------------
 * 
 * (Hint: You need to use the bitwise right shift operator (>>) and the bitwise AND
 * operator (&), which are covered in Appendix G, Bitwise Operations.)
 * 
 * Commentary: I will need to use a for loop and cycle through 16 times. I will shift
 * the bit using the provided hint by one and compare the bit with & 1, if true, the
 * value will evaluate to 1 and be stored in bit's string, otherwise 0. I will print
 * output as shown in sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/7/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.44
 */


import java.util.Scanner;

public class EX44_BitLevelOperations {
    
    public static void main(String[] args) {
        
        // create scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to short variable
        System.out.print("Enter an integer: ");
        short number = input.nextShort();
        
        // string to store bits
        String bits = "";
        
        // store number operation to 1 in a bits string
        for (int i = 0; i < 16; i++) {
            bits = (number & 1) + bits;
            number >>= 1; // shift bit by one
        }
        
        // print output as shown in sample run
        System.out.println("The bits are " + bits);
        
    }

}
