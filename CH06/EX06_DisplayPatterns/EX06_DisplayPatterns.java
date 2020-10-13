/**
 * (Display patterns) Write a method to display a pattern as follows:
 *                        1
 *                      2 1
 *                    3 2 1
 *                      ...
 *          n n-1 ... 3 2 1
 * 
 * The method header is
 * 
 *      public static void displayPattern(int n)
 * 
 * Commentary: I will use lessons learned in programing Exercise 5.18 to create
 * a method with the header described above. 
 *
 * Author: chill4Eng2Dev 
 * Date: 9/7/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.6
 */

import java.util.Scanner;

public class EX06_DisplayPatterns {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEnter the number of rows the pattern will have: ");
        int rows = input.nextInt();
        
        System.out.println();
        displayPattern(rows);
        
    }

    public static void displayPattern(int n) {
        // for loop to cycle through rows
        for (int i = 1; i <= n; i++) {
            
            // print white space before number print outs
            for (int j = n - i; j > 0; j--)
                System.out.printf("%-3s ", " ");
                
            // for loop to print out numbered columns
            for (int k = i; k > 0; k--)
                System.out.printf("%-3d ", k);
            
            System.out.println();
        }
    }
}
