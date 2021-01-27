/**
 * (Geometry: rightmost lowest point) In computational geometry, often you need
 * to find the rightmost lowest point in a set of points. Write the following method
 * that returns the rightmost lowest point in a set of points.
 * 
 * public static double[] getRightmostLowestPoint(double[][] points)
 * 
 * Write a test program that prompts the user to enter the coordinates of six points
 * and displays the rightmost lowest point. Here is a sample run:
 * 
 * ----------------------------------------------------------------
 * Enter 6 points: 1.5 2.5 -3 4.5 5.6 -7 6.5 -7 8 1 10 2.5 [ENTER]
 * The rightmost lowest point is (6.5, -7.0)
 * ----------------------------------------------------------------
 * 
 * Commentary: 
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/16/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.34
 */

import java.util.Scanner;

public class EX34_RightmostLowestPoint {
    
    public static void main(String[] args) {
        
        // assign user input to points matrix
        System.out.print("Enter 6 points: ");
        double[][] points = getMatrix();
        
        // get right most lowest point
        double[] rightMost = getRightmostLowestPoint(points);
        
        // print output as shown in sample run
        System.out.println("The right most lowest point is (" + rightMost[0] + ", " + rightMost[1] + ")");
        
    }
    
    // method to find right most (max x coordinate) and bottom most (min y coordinate) of points
    public static double[] getRightmostLowestPoint(double[][] points) {
        double[] rightMost = {points[0][0], points[0][1]};
        
        for (int i = 0; i < points.length; i++)
            if (rightMost[0] <= points[i][0] && rightMost[1] >= points[i][1]) {
                rightMost[0] = points[i][0];    // assign new max x value
                rightMost[1] = points[i][1];    // assign new min y value
            }
            
        return rightMost;
        
    }
    
    // method to get user data and fill matrix, then return matrix to variable
    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in); 
        double[][] m = new double[6][2];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        
        return m;
    }

}
