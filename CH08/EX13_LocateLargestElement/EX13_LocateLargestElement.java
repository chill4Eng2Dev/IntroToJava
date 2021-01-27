/**
 * (Locate the largest element) Write the following method that returns the location
 * of the largest element in a two-dimensional array.
 * 
 * public static int[] locateLargest(double[][] a)
 * 
 * The return value is a one-dimensional array that contains two elements. These
 * two elements indicate the row and column indices of the largest element in the
 * two-dimensional array. Write a test program that prompts the user to enter a twodimensional
 * array and displays the location of the largest element in the array.
 * Here is a sample run:
 * 
 * ---------------------------------------------------------------
 * Enter the number of rows and columns of the array: 3 4 [ENTER]
 * Enter the array:
 * 23.5 35 2 10 [ENTER]
 * 4.5 3 45 3.5 [ENTER]
 * 35 44 5.5 9.6 [ENTER]
 * The location of the largest element is at (1, 2)
 * ---------------------------------------------------------------
 *
 * Commentary: I will need to search through the user defined matrix and update
 * indices when the max element is found. I will print output as shown in sample
 * run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/15/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.13
 */

import java.util.Scanner;

public class EX13_LocateLargestElement {
    
    public static void main(String[] args) {
        
        // get matrix from user
        double[][] m1 = getMatrix();

        // get indices of maximum element
        int[] indices = locateLargest(m1);
        
        // print output as shown in sample run
        System.out.println("The location of the largest element is at (" + indices[0] + ", " + indices[1] + ")");
    }
    
    // method locate largest will search for max element and reassign indices of row, column to a single array
    public static int[] locateLargest(double[][] a) {
        int[] indicesRowCol = new int[2];
        double currentMax = 0;
        int maxRow, maxCol;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (currentMax < a[i][j]) {
                    currentMax = a[i][j];
                    indicesRowCol[0] = i;
                    indicesRowCol[1] = j;
                }
            }
        }
        
        return indicesRowCol;
    }
        
            
    // method to get matrix size and assign user emtroes to matrix, then return matrix to variable
    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter the number of rows and columns of the array: ");
        double[][] m = new double[input.nextInt()][input.nextInt()];
        
        System.out.println("Enter the array: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        
        return m;
    }
}
