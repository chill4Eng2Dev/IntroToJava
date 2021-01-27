/**
 * (Column sorting) Implement the following method to sort the columns in a twodimensional
 * array. A new array is returned and the original array is intact.
 * 
 * public static double[][] sortColumns(double[][] m)
 * 
 * Write a test program that prompts the user to enter a 3 * 3 matrix of double
 * values and displays a new column-sorted matrix. Here is a sample run:
 * 
 * ---------------------------------------
 * Enter a 3-by-3 matrix row by row:
 * 0.15 0.875 0.375 [ENTER]
 * 0.55 0.005 0.225 [ENTER]
 * 0.30 0.12 0.4 [ENTER]
 * 
 * The column-sorted array is
 * 0.15 0.0050 0.225
 * 0.3 0.12 0.375
 * 0.55 0.875 0.4
 * ---------------------------------------
 * 
 * Commentary: I will need to use a nested for-loop (n^3) to cycle through the matrix.
 * I will use a selection sort to only review the column and nothing beyond the current column
 * and sort elements in ascending order. I will print output as shown in sample runs. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/22/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.27
 */

import java.util.Scanner;

public class EX27_ColSorting {

    public static void main(String[] args) {
        
        // assign user inputs to 3 by 3 matrix
        System.out.println("\nEnter a 3-by-3 matrix row by row: ");
        double[][] m = getMatrix();
        
        // call method to sort matrix and return a new matrix
        double[][] colSorted = sortCols(m);
        
        // print sorted matrix as shown in sample run
        System.out.println("\nThe column-sorted array is ");
        printMatrix(colSorted);
        
        
    }
    
    // method to get user data and fill matrix, then return matrix to variable
    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in); 
        double[][] m = new double[3][3];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        
        return m;
    }
    
    // method to print matrix with a space in between elements
    public static void printMatrix(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // method to sort rows of a 2D matrix
    public static double[][] sortCols(double[][] m) {
        double[][] sorted = new double[m.length][m[0].length];
        
        // copy elements from parent matrix to a matrix to be sorted
        for (int i = 0; i < sorted.length; i++)
            for (int j = 0; j < sorted[i].length; j++) 
                sorted[i][j] = m[i][j];
        
        // this section performs the sort
        for (int i = 0; i < sorted[0].length; i++) {   // loop controls the column
            
            for (int j = 0; j < sorted.length - 1; j++) {    // nested for-loop performs selection sort per column
                double minValue = sorted[i][j];
                int minIndex = j;
                for (int k = j + 1; k < sorted.length; k++) {    // for-loop for the row of the column being looked at
                    if (minValue > sorted[k][i]) {
                        minValue = sorted[k][i];
                        minIndex = k;
                    }
                }
                
                // if a value is found to be sorted, swap the values
                if (minIndex != j) {
                    sorted[minIndex][i] = sorted[j][i];
                    sorted[j][i] = minValue;
                }
            }
        }

        return sorted;
    }
}
