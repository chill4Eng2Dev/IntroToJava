/**
 * (Display pyramid) Write a program that prompts the user to enter an integer from
 * 1 to 15 and displays a pyramid, as shown in the following sample run:
 * 
 * ----------------------------------------------------------
 * Enter the number of lines: 7 [ENTER]
 *                                          1
 *                                        2 1 2
 *                                      3 2 1 2 3
 *                                    4 3 2 1 2 3 4
 *                                  5 4 3 2 1 2 3 4 5
 *                                6 5 4 3 2 1 2 3 4 5 6
 *                              7 6 5 4 3 2 1 2 3 4 5 6 7
 * ----------------------------------------------------------
 *                              
 * Commentary: I will write a for loop that will start at 1 and and increments to user entry, 
 * this will be for the rows. I will then have a nested for loop to print white space and 
 * decrement the amount of white space printed per row. I will then print values for columns
 * based on row count up to the 1 column. I will print the remaining columns after the 1 column
 * using row value as my limiter. I will print the output as shown in the sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/5/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.17
 */

import java.util.Scanner;

public class EX17_DisplayPyramid {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign maximum rows with user entry
        System.out.print("Enter the number of lines: ");
        int entry = input.nextInt();
        
        // for loop to cycle through rows
        for (int i = 1; i <= entry; i++) {
            
            // print white space before number print outs
            for (int j = entry - i; j > 0; j--)
                System.out.printf("%-3s"," ");
                
            // for loop to print out numbered columns up to 1
            for (int k = i; k > 0; k--)
                System.out.printf("%-2d ",k);
            
            // for loop to print out numbers on same row after 1 column
            for (int j = 2; j <= i; j++)
                System.out.printf("%-2d ",j);

            System.out.println();
        }

                
    }
    
}


