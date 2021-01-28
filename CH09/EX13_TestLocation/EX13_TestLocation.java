/**
 * (The Location class) Design a class named Location for locating a maximal
 * value and its location in a two-dimensional array. The class contains public data
 * fields row, column, and maxValue that store the maximal value and its indices
 * in a two-dimensional array with row and column as int types and maxValue as
 * a double type.
 * 
 * Write the following method that returns the location of the largest element in a
 * two-dimensional array:
 * 
 * public static Location locateLargest(double[][] a)
 * 
 * The return value is an instance of Location. Write a test program that prompts
 * the user to enter a two-dimensional array and displays the location of the largest
 * element in the array. Here is a sample run:
 * 
 * --------------------------------------------------------------
 * Enter the number of rows and columns in the array: 3 4 [ENTER]
 * Enter the array:
 * 23.5 35 2 10 [ENTER]
 * 4.5 3 45 3.5 [ENTER]
 * 35 44 5.5 9.6 [ENTER]
 * The location of the largest element is 45 at (1, 2)
 * -------------------------------------------------------------- 
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/28/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 9.13
 */

import java.util.Scanner;

public class EX13_TestLocation {
    
    public static void main(String[] args) {
        
        // assign user entry to matrix
        double[][] a = getMatrix();
        
        // initialize location object with user input
        Location loc = locateLargest(a);
                
        // print output as described in problem statement
        System.out.println("The location of the largest elements is " + loc.maxValue + " at (" + loc.row + ", " + loc.column + ")");
        
    }
    
    // using locatelargest method to return an instance of location passing through the array
    public static Location locateLargest(double[][] a) {
        return new Location(a);
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
