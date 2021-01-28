/**
 * (Geometry: intersecting point) Suppose two line segments intersect. The two endpoints
 * for the first line segment are (x1, y1) and (x2, y2) and for the second line
 * segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter
 * these four endpoints and displays the intersecting point. As discussed in Programming
 * Exercise 3.25, the intersecting point can be found by solving a linear equation.
 * Use the LinearEquation class in Programming Exercise 9.11 to solve this
 * equation. See Programming Exercise 3.25 for sample runs.
 * 
 * FOR REFERENCE ---- Exercise 3.25 Sample Runs
 * --------------------------------------------------------------------------
 * Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0 [ENTER]
 * The intersecting point is at (2.88889, 1.1111)
 * --------------------------------------------------------------------------
 * --------------------------------------------------------------------------
 * Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 7 6.0 4.0 2.0 -1.0 -2.0 [ENTER]
 * The two lines are parallel
 * --------------------------------------------------------------------------
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/28/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 9.12
 */

import java.util.Scanner;

public class EX12_TestIntersectingPoint {

    public static void main(String[] args) {
        
        // assign user input to points matrix
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double[][] points = getMatrix();
        
        // calculate coefficients using points
        double[] coef = getCoefficients(points);
        
        // pass coefficients through to linear equations objects
        LinearEquation linEq = new LinearEquation(coef[0], coef[1], coef[2], coef[3], coef[4], coef[5]);
        
        // check if divisor is zero print output as necessary
        if(linEq.isSolvable())
            System.out.println("The interesting point is at (" + linEq.getX() + ", " + linEq.getY() + ")");
        else
            System.out.println("The two lines are parallel");
        
        
    }
    
    // method to determine coefficients for cramer's rule
    public static double[] getCoefficients(double[][] points) {
        double[] result = new double[6];
        
        result[0] = points[0][1] - points[1][1];     // a = (y1 - y2) 
        result[1] = -1 * (points[0][0] - points[1][0]); // b = -1 * (x1 - x2)
        result[2] = points[2][1] - points[3][1]; // c = (y3 - y4) 
        result[3] = -1 * (points[2][0] - points[3][0]); // d = -1 * (x3 - x4)
        result[4] = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1]; // e = (y1 - y2) * x1 - (x1 - x2) * y1
        result[5] = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1]; // f = (y3 - y4) * x3 - (x3 - x4) * y3 
        
        return result;
    }
    
    // method to get user data and fill matrix, then return matrix to variable
    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in); 
        double[][] m = new double[4][2];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        
        return m;
    }
}
