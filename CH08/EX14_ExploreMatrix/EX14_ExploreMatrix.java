/**
 * (Explore matrix) Write a program that prompts the user to enter the length of a
 * square matrix, randomly fills in 0s and 1s into the matrix, prints the matrix, and
 * finds the rows, columns, and diagonals with all 0s or 1s. Here is a sample run of
 * the program:
 * 
 * ---------------------------------------------------------------
 * Enter the size for the matrix: 4
 * 0111
 * 0000
 * 0100
 * 1111
 * All 0s on row 1
 * All 1s on row 3
 * No same numbers on a column
 * No same numbers on the major diagonal
 * No same numbers on the sub-diagonal
 * ---------------------------------------------------------------
 *
 * Commentary: I will need to break this exercise into multiple methods to count and
 * print out the verdict of each specified request (rows, columns, diagonals). The methods
 * will encompass nested for-loops, as necessary, to cycle through the matrix. I will
 * print output to match the sample runs.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/22/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.14
 */

import java.util.Scanner;

public class EX14_ExploreMatrix {
    
    public static void main(String[] args) {
        
        System.out.print("\nEnter the size for the matrix: ");
        int[][] matrix = getBinMatrix();
        
        // call method to print matrix
        printMatrix(matrix);
        
        // call method to print all occurances of 1s or 0s in a row
        printRowCount(matrix);
        
        // call method to print all occurances of 1s or 0s in a column
        printColumnCount(matrix);
        
        // call method to print occurance of 1s or 0s in a major diagonal
        printMajorDiagonal(matrix);
        
        // call method to print occurance of 1s or 0s in a sub-diagonal
        printSubDiagonal(matrix);       
    }
    
    // method to assign random 0's and 1's to a user defined n-by-n matrix
    public static int[][] getBinMatrix() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] m = new int[n][n];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int)(Math.random() * 2);
            }
        }
        
        return m;
    }
    
    // method to count the occurences of 0's or 1's in a row and print which rows have all 1's or 0's
    public static void printRowCount(int[][] m) {
        int count = 0;
    
        for (int i = 0; i < m.length; i++) {
            int sum = 0;
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];   
            }
        
            if (sum == 0)
                System.out.println("All 0s on row " + i);
            else if (sum == m[i].length)
                System.out.println("All 1s on row " + i);
            else
                count++;
        }
        
        // if count equals column length of matrix, no rows were found to have all 0s or 1s
        if (count == m[0].length)
            System.out.println("No same numbers on a row");
    }
    
    // method to count the occurences of 0's or 1's in a column and print which columns have all 1's or 0's
    public static void printColumnCount(int[][] m) {
        int count = 0;
    
        for (int i = 0; i < m[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < m.length; j++) {
                sum += m[j][i];   
            }
        
            if (sum == 0)
                System.out.println("All 0s on column " + i);
            else if (sum == m[i].length)
                System.out.println("All 1s on column " + i);
            else
                count++;
        }
        
        // if count equals row length of matrix, no columns were found to have all 0s or 1s
        if (count == m.length)
            System.out.println("No same numbers on a column");
    }
    
    // method to print the top-left to bottom-right diagonal (major diagonal) and determine all 0s or 1s
    public static void printMajorDiagonal(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
       
        if (sum == 0)
            System.out.println("All 0s on the major diagonal");
        else if (sum == m.length)
            System.out.println("All 1s on the major diagonal");
        else
            System.out.println("No same numbers on the major diagonal");
    }

    // method to print the second most top-left to bottom-right diagonal (sub diagonal) and determine all 0s or 1s
    public static void printSubDiagonal(int[][] m) {
        int sum = 0;
        for (int i = 1, j = 0; i < m.length && j < m[i].length; i++, j++) {
            sum += m[i][j];
        }
       
        if (sum == 0)
            System.out.println("All 0s on the sub-diagonal");
        else if (sum == m.length - 1)
            System.out.println("All 1s on the sub-diagonal");
        else
            System.out.println("No same numbers on the sub-diagonal");
    }

    
    // method to print matrix with a space in between elements
    public static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }

}
