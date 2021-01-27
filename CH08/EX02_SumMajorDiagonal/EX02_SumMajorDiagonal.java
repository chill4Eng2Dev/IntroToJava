/**
 * (Sum the major diagonal in a matrix) Write a method that sums all the numbers
 * in the major diagonal in an n * n matrix of double values using the following
 * header:
 * 
 * public static double sumMajorDiagonal(double[][] m)
 * 
 * Write a test program that reads a 4-by-4 matrix and displays the sum of all its
 * elements on the major diagonal. Here is a sample run:
 * 
 * ----------------------------------------------------
 * Enter a 4-by-4 matrix row by row:
 * 1 2 3 4.0
 * 5 6.5 7 8
 * 9 10 11 12
 * 13 14 15 16
 * Sum of the elements in the major diagonal is 34.5
 * -----------------------------------------------------
 * 
 * Commentary: I will need to make a variable that holds the sum of every element
 * within the matrix. A nested for loop will be used to cycle through the matrix.
 * I will print the output as shown in the sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/15/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.2
 */

import java.util.Scanner;

public class EX02_SumMajorDiagonal {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // assign user input to two dimensional matrix
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        double[][] m = getMatrix();
        
        System.out.println("Sum of the elements in the major diagonal is " + sumMajor(m));
    }

    // method sumDiagonal that will return the sum the major diagonal of a n-by-n matrix
    public static double sumMajor(double[][] m) {
        double sumDiagonal = 0;
        for (int i = 0; i < m.length; i++) {
            sumDiagonal += m[i][i];
        }
        
        return sumDiagonal;
    }
    
    // method to get user data and fill matrix, then return matrix to variable
    public static double[][] getMatrix() {
        
        Scanner input = new Scanner(System.in); 
        double[][] m = new double[4][4];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        
        return m;
    }

}
