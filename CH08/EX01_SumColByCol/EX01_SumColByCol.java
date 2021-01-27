/**
 * (Sum elements column by column) Write a method that returns the sum of all the
 * elements in a specified column in a matrix using the following header:
 * public static double sumColumn(double[][] m, int columnIndex)
 * 
 * Write a test program that reads a 3-by-4 matrix and displays the sum of each
 * column. Here is a sample run:
 * 
 * ----------------------------------------------------
 * Enter a 3-by-4 matrix row by row:
 * 1.5 2 3 4 [ENTER]
 * 5.5 6 7 8 [ENTER]
 * 9.5 1 3 1 [ENTER]
 * Sum of the elements at column 0 is 16.5
 * Sum of the elements at column 1 is 9.0
 * Sum of the elements at column 2 is 13.0
 * Sum of the elements at column 3 is 13.0
 * -----------------------------------------------------
 * 
 * Commentary: Use nested for loop to assign user input and pass matrix through 
 * sumColumn method. SumColumn will need to cycle through each row with the supplied
 * column index and sum the values. I will print output as shown in sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/15/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.1
 */

import java.util.Scanner;

public class EX01_SumColByCol {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // assign user input to two dimensional matrix
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double[][] m = getMatrix();
        
        // call sumColumn method and cycle through each column and print output
        for (int i = 0; i < m[0].length; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(m, i));
        }

    }
    
    // method sumColumn that will return the sum of each column of the passed through matrix
    public static double sumColumn(double[][] m, int columnIndex) {
        double sumTotal = 0;
        for (int row = 0; row < m.length; row++) {
            sumTotal += m[row][columnIndex];
        }
        
        return sumTotal;
    }

    // method to get user data and fill matrix, then return matrix to variable
    public static double[][] getMatrix() {
        
        Scanner input = new Scanner(System.in); 
        double[][] m = new double[3][4];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        
        return m;
    }
}
