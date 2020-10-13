/**
 * (Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using
 * the following header:
 * 
 *      public static void printMatrix(int n)
 * 
 * Each element is 0 or 1, which is generated randomly. Write a test program that
 * prompts the user to enter n and displays an n-by-n matrix. Here is a sample run:
 * 
 * ----------------------------------
 *      Enter n: 3 [ENTER]
 *      0 1 0
 *      0 0 0
 *      1 1 1
 * ----------------------------------
 * 
 * Commentary: I will need a nested for loop inside of the printMatrix method and
 * use random values for each element. I will print output as shown in sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/9/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.17
 */

import java.util.Scanner;

public class EX17_Matrix0And1 {
    
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to matrix row and column size
        System.out.print("\nEnter n: ");
        int n = input.nextInt();
        
        // print matrix
        printMatrix(n);
    }
    
    // method to print Matrix of nxn value
    public static void printMatrix(int n) {
        // nested for loop
        for (int i = 0; i < n; i++) {
            for (int j = 0, count = 1; j < n; j++, count++) {
                // generate random 0 or 1 and print accordingly
                int element = (int)(Math.random() * 2);
                if (count % n == 0)
                    System.out.println(element);
                else
                    System.out.print(element + " ");
            }
        }
    }
        
}
