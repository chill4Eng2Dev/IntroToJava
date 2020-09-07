/**
 * (Business: check ISBN-13) ISBN-13 is a new standard for indentifying books. It
 * uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum,
 * which is calculated from the other digits using the following formula:
 * 
 *      10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)%10
 * 
 * If the checksum is 10, replace it with 0. Your program should read the input as a
 * string. Here are sample runs:
 * 
 * -------------------------------------------------------------------------
 * Enter the first 12 digits of an ISBN-13 as a string: 978013213080 [ENTER]
 * The ISBN-13 number is 9780132130806
 * -------------------------------------------------------------------------
 * -------------------------------------------------------------------------
 * Enter the first 12 digits of an ISBN-13 as a string: 978013213079 [ENTER]
 * The ISBN-13 number is 9780132130790
 * -------------------------------------------------------------------------
 * -------------------------------------------------------------------------
 * Enter the first 12 digits of an ISBN-13 as a string: 97801320 [ENTER]
 * 97801320 is an invalid input
 * -------------------------------------------------------------------------
 * 
 * Commentary: I will use a for loop to parse the individual characters into
 * integers. I will need to use "" within the parseInt() since chars cannot be
 * converted to integers, and parseInt() is for strings. The first sample run
 * output is incorrect, d13 should equal 4, not 6. I will match the output
 * to the sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/3/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.47
 */

import java.util.Scanner; 

public class EX47_CheckISBN13 {
    
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // initialize checksum
        int d13 = 10;
        
        // assign user input to string
        System.out.print("Enter the first 12 digits of an ISBN as integer: ");
        String userEntry = input.nextLine();
        
        // check if the input is valid length
        if(!(userEntry.length() == 12)) {
            System.out.println(userEntry + " is an invalid input.");
            System.exit(1);
        }
        
        // for loop to cycle through 
        for (int i = 1; i <= userEntry.length(); i++) {
            if (i % 2 == 0) 
                d13 = d13 - 3 * Integer.parseInt(userEntry.charAt(i - 1) + "");
            else            
                d13 = d13 - Integer.parseInt(userEntry.charAt(i - 1) + "");
        }
        
        // absolute value of the modulus - otherwise I get a negative number from provided formula
        d13 = Math.abs(d13) % 10;
        
        // print output of the ISBN-13 number with truncate if statement for 0 or d13
        System.out.println("The ISBN-13 number is " + userEntry + 
                            ((d13 == 10) ? 0 : d13));
                
    }

}
