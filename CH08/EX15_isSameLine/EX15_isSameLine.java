/**
 * ((Geometry: same line?) Programming Exercise 6.39 gives a method for testing
 * whether three points are on the same line.
 * 
 * Write the following method to test whether all the points in the array points are
 * on the same line.
 * 
 * public static boolean sameLine(double[][] points)
 * 
 * Write a program that prompts the user to enter five points and displays whether
 * they are on the same line. Here are sample runs:
 * 
 * ---------------------------------------------------------------
 * Enter five points: 3.4 2 6.5 9.5 2.3 2.3 5.5 5 -5 4 [ENTER]
 * The five points are not on the same line
 * ---------------------------------------------------------------
 * 
 * ---------------------------------------------------------------
 * Enter five points: 1 1 2 2 3 3 4 4 5 5 [ENTER]
 * The five points are on the same line
 * ---------------------------------------------------------------
 *
 * Commentary: 
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/16/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.15
 */

import java.util.Scanner;

public class EX15_isSameLine {
    
    public static void main(String[] args) {
        
        // assign user inputs to points matrix
        System.out.print("Enter five points: ");
        double[][] points = getMatrix();
        
        // print outputs and verdict as shown in sample run
        System.out.println("The five points are " + (sameLine(points) ? "" : "not ") + "on the same line");
        
    }
    
    // method to check if points are on same line
    public static boolean sameLine(double[][] points) {
        boolean onLine = true;
        
        // Start for loop that continuely check each sequential three points to make sure they are all are on the same line
        for (int i = 0; i < points.length - 2 && onLine; i++) {
            // ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) == 0 
            onLine = ((points[i + 1][0] - points[i][0]) * (points[i + 2][1] - points[i][1]) - 
                      (points[i + 2][0] - points[i][0]) * (points[i + 1][1] - points[i][1])) == 0;
        }
        
        return onLine;
    }
    
    // method to get user data and fill matrix, then return matrix to variable
    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in); 
        double[][] m = new double[5][2];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        
        return m;
    }
}
