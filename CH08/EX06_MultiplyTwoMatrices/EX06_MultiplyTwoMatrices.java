/**
 * (Algebra: multiply two matrices) Write a method to multiply two matrices. The
 * header of the method is:
 * 
 * public static double[][] multiplyMatrix(double[][] a, double[][] b)
 * 
 * To multiply matrix a by matrix b, the number of columns in a must be the same as
 * the number of rows in b, and the two matrices must have elements of the same or
 * compatible types. Let c be the result of the multiplication. Assume the column size
 * of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + c + ain * bnj.
 * 
 * For example, for two 3 * 3 matrices a and b, c is
 * 
 * [SEE PHOTO IN FOLDER]
 * 
 * where cij = ai1 * b1j + ai2 * b2j + ai3 * b3j.
 * Write a test program that prompts the user to enter two 3 * 3 matrices and displays
 * their product. Here is a sample run:
 * 
 * --------------------------------------------------
 * Enter matrix1: 1 2 3 4 5 6 7 8 9 [ENTER]
 * Enter matrix2: 0 2 4 1 4.5 2.2 1.1 4.3 5.2 [ENTER]
 * The multiplication of the matrices is
 * 1 2 3        0 2.0 4.0       5.3 23.9 24
 * 4 5 6    *   1 4.5 2.2   =   11.6 56.3 58.2
 * 7 8 9        1.1 4.3 5.2     17.9 88.7 92.4
 * ----------------------------------------------------
 * 
 * Commentary: I will use a nested for loop to add the two user defined matrices
 * together. Printing will require me to consider "padding" between the matrices
 * as I cycle through the prints. Within the padding, I will need to consider which
 * row I am on and print "+" or "=". I will print output to match sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/15/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.6
 */

import java.util.Scanner;

public class EX06_MultiplyTwoMatrices {
    
    public static void main(String[] args) {
                
        // assign user defined data to matrix 1
        System.out.print("\nEnter matrix1: ");
        double[][] m1 = getMatrix();
        
        // assign user defined data to matrix 2
        System.out.print("Enter matrix2: ");
        double[][] m2 = getMatrix();
        
        // check if matrices can be multiplied. Not necessary for this problem as matrix size is hard coded, but good practice to consider error handling
        if (m1[0].length != m2.length) {
            System.out.println("Matrices cannot be multiplied due to columns from Matrix 1 not matching rows from Matrix 2 in length. Try again.");
            System.exit(0);
        }
        
        // multiply matrix 1 and matrix 2 to get resultant matrix
        double[][] c = multiplyMatrix(m1, m2);
        
        // print all matrices as shown in sample run
        System.out.println("The multiplication of the matrices is ");
        printMatrix(m1, m2, c);
    }
    
    // method to multiply matrix a with matrix b
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        
        double[][] result = new double[a[0].length][b.length];

        for (int i = 0; i < result.length; i++) {   // row for matrix a
            for (int j = 0; j < result[0].length; j++) {    // column for matrix b
                for (int k = 0; k < result[0].length; k++) {    // incrementer to cycle through row of matrix a, and column of matrix b
                    result[i][j] += a[i][k] * b[k][j];  // assign the cross product of the matrices to resulting matrix
                }
            }
        }
        
        return result;
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
    
    // print method to show each matrix as shown in the sample run
    public static void printMatrix(double[][] a, double[][] b, double[][] c) {
        
        for (int i = 0; i < c.length; i++) {    // cycle through the rows
            
            for (int j = 0; j < a[0].length; j++)   // print matrix a
                System.out.printf("%3.1f ", a[i][j]);
            
            if (i != 1) // padding between matrices
                System.out.print("    ");
            else
                System.out.print(" *  ");
                
            for (int k = 0; k < b[0].length; k++)   // print matrix b
                System.out.printf("%3.1f ", b[i][k]);
            
            if (i != 1) // padding between matrices
                System.out.print("    ");
            else
                System.out.print(" =  ");
                
            for (int n = 0; n < c[0].length; n++)   // print resulting matrix
                System.out.printf("%3.1f ", c[i][n]);
                
            System.out.println();
        }
    }
}