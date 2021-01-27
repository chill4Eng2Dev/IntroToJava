/**
 * (Algebra: add two matrices) Write a method to add two matrices. The header of
 * the method is as follows:
 * 
 * public static double[][] addMatrix(double[][] a, double[][] b)
 * 
 * In order to be added, the two matrices must have the same dimensions and the
 * same or compatible types of elements. Let c be the resulting matrix. Each element
 * cij is aij + bij. For example, for two 3 * 3 matrices a and b, c is
 * 
 * [SEE PHOTO IN FOLDER]
 * 
 * Write a test program that prompts the user to enter two 3 * 3 matrices and
 * displays their sum. Here is a sample run:
 * 
 * ---------------------------------------------------
 * Enter matrix1: 1 2 3 4 5 6 7 8 9 [ENTER]
 * Enter matrix2: 0 2 4 1 4.5 2.2 1.1 4.3 5.2 [ENTER]
 * The matrices are added as follows
 * 1.0 2.0 3.0      0.0 2.0 4.0     1.0 4.0 7.0
 * 4.0 5.0 6.0  +   1.0 4.5 2.2  =  5.0 9.5 8.2
 * 7.0 8.0 9.0      1.1 4.3 5.2     8.1 12.3 14.2
 * ---------------------------------------------------
 * 
 * Commentary: I will use a nested for loop to add the two user defined matrices
 * together. Printing will require me to consider "padding" between the matrices
 * as I cycle through the prints. Within the padding, I will need to consider which
 * row I am on and print "+" or "=". I will print output to match sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/15/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.5
 */

import java.util.Scanner;

public class EX05_AddTwoMatrices {
    
    public static void main(String[] args) {
                
        // assign user defined data to matrix 1
        System.out.print("\nEnter matrix1: ");
        double[][] m1 = getMatrix();
        
        // assign user defined data to matrix 2
        System.out.print("Enter matrix2: ");
        double[][] m2 = getMatrix();
        
        // check if matrices can be added. Not necessary for this problem as matrix size is hard coded, but good practice to consider error handling
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            System.out.println("Matrices cannot be added due to matrix sizes not matching in rows, columns, or both. Try again.");
            System.exit(0);
        }
        
        // add matrix 1 and matrix 2 to get resultant matrix
        double[][] c = addMatrix(m1, m2);
        
        // print all matrices as shown in sample run
        System.out.println("The matrices are added as follows");
        printMatrix(m1, m2, c);
    }
    
    // method to add matrix a with matrix b
    public static double[][] addMatrix(double[][] a, double[][] b) {
        
        double[][] result = new double[a.length][a[0].length];
        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
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
                System.out.print(" +  ");
                
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
