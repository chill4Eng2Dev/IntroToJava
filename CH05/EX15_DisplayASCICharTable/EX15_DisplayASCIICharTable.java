/**
 * (Display the ASCII character table) Write a program that prints the characters in
 * the ASCII character table from ! to ~. Display ten characters per line. The ASCII
 * table is shown in Appendix B. Characters are separated by exactly one space.
 * 
 * Commentary: I will use a for loop using the integer numerical range that corresponds 
 * to the characters that need to be printed as stated in the problem statement. 
 *
 * Author: chill4Eng2Dev 
 * Date: 9/3/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.15
 */

public class EX15_DisplayASCIICharTable {

    public static void main(String[] args) {
        
        // initialize variables
        final int CHARS_PER_LINE = 10;
        int count = 0;
        
        // for loop to start counting at 33 (!) and terminate at >126 (~)
        for (int i = 33; i <= 126; i++) {
            // if statement for printing output            
            if (count % CHARS_PER_LINE == 0) 
                System.out.print("\n" + (char)i + " ");
            else
                System.out.print((char)i + " ");
            // counter for chars printed per row
            count++;
        }
        
    }
                
}
