/**
 * (Markov matrix) An n * n matrix is called a positive Markov matrix if each
 * element is positive and the sum of the elements in each column is 1. Write the
 * following method to check whether a matrix is a Markov matrix.
 * 
 * public static boolean isMarkovMatrix(double[][] m)
 * 
 * Write a test program that prompts the user to enter a 3 * 3 matrix of double
 * values and tests whether it is a Markov matrix. Here are sample runs:
 * 
 * ---------------------------------------
 * Enter a 3-by-3 matrix row by row:
 * 0.15 0.875 0.375 [ENTER]
 * 0.55 0.005 0.225 [ENTER]
 * 0.30 0.12 0.4 [ENTER]
 * It is a Markov matrix
 * ---------------------------------------
 * 
 * ---------------------------------------
 * Enter a 3-by-3 matrix row by row:
 * 0.95 -0.875 0.375 [ENTER]
 * 0.65 0.005 0.225 [ENTER]
 * 0.30 0.22 -0.4 [ENTER]
 * It is not a Markov matrix
 * ---------------------------------------
 * 
 * Commentary: I will need to use a nested for loop the sums each column and determine
 * if any value is a negative value. I will print output as shown in sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/16/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.25
 */

import java.util.Scanner;

public class EX25_MarkovMatrix {
    
    public static void main(String[] args) {
        
        // assign user inputs to matrix
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        double[][] m = getMatrix();
        
        // print output and verdict as shown in sample run
        System.out.println("It is " + (isMarkovMatrix(m) ? "" : "not ") + "a Markov matrix");
    }
    
    // method to check if Markov matrix
    public static boolean isMarkovMatrix(double[][] m) {
        
        for (int i = 0; i < m.length; i++) {
            double sumCol = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[j][i] < 0)    // check if value in matrix is negative
                    return false;   // return false if negative
                
                sumCol += m[j][i];  // if not negative, add column value
            }
            
            if (sumCol != 1)    // if sum of column is not 1, return false
                return false;
        }
        
        return true;
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

}
