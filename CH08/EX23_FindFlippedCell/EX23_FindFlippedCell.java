/**
 * (Game: find the flipped cell) Suppose you are given a 6-by-6 matrix filled with
 * 0s and 1s. All rows and all columns have an even number of 1s. Let the user flip
 * one cell (i.e., flip from 1 to 0 or from 0 to 1) and write a program to find which
 * cell was flipped. Your program should prompt the user to enter a 6-by-6 array
 * with 0s and 1s and find the first row r and first column c where the even number
 * of the 1s property is violated (i.e., the number of 1s is not even). The flipped cell
 * is at (r, c). Here is a sample run:
 * 
 * ---------------------------------------
 * Enter a 6-by-6 matrix row by row:
 * 1 1 1 0 1 1 [ENTER]
 * 1 1 1 1 0 0 [ENTER]
 * 0 1 0 1 1 1 [ENTER]
 * 1 1 1 1 1 1 [ENTER]
 * 0 1 1 1 1 0 [ENTER]
 * 1 0 0 0 0 1 [ENTER]
 * The flipped cell is at (0, 1)
 * ---------------------------------------
 * 
 * Commentary: I will need to adjust methods from Exercise 8.22 and return
 * the row and column of the matrix when a row or column is not even. I will
 * then print the verdict and corresponding row/column as shown in the sample
 * run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/17/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.23
 */

import java.util.Scanner;

public class EX23_FindFlippedCell {

    public static void main(String[] args) {
        
        // assign user input to 6 by 6 matrix
        System.out.println("Enter a 6-by-6 matrix row by row: ");
        int[][] matrix = getMatrix();
        
        // determine if an odd row/column count was discovered and assign to variables
        int row = checkRows(matrix);
        int column = checkColumns(matrix);
        
        // print verdict and output as shown in sample run
        if (row < 0 || column < 0) 
            System.out.println("No cell was flipped in the matrix.");
        else
            System.out.println("The flipped cell is at (" + row + ", " + column + ")");
            
    }
    
    // method to get user data and fill matrix, then return matrix to variable
    public static int[][] getMatrix() {
        Scanner input = new Scanner(System.in); 
        int[][] m = new int[6][6];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = input.nextInt();
            }
        }
        
        return m;
    }
    
    // method to count all elements in a row and determine if row count is even, if not, return row index
    public static int checkRows(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int sum = 0;
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
            }
            
            if (sum % 2 != 0)
                return i;
        }
        return -1;
    }
    
    // method to count all elements in a column and determine if column count is even, if not, return column index
    public static int checkColumns(int[][] m) {
        for (int i = 0; i < m[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < m.length; j++) {
                sum += m[j][i];
            }
            
            if (sum % 2 != 0)
                return i;
        }
        return -1;
    }
    
}
