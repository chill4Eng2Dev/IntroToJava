/**
 * (Geometry: area of a triangle) Write a method that returns the area of a triangle
 * using the following header:
 * 
 * public static double getTriangleArea(double[][] points)
 * 
 * The points are stored in a 3-by-2 two-dimensional array points with points[0]
 * [0] and points[0][1] for (x1, y1). The triangle area can be computed using the
 * formula in Programming Exercise 2.19. The method returns 0 if the three points
 * are on the same line. Write a program that prompts the user to enter three points of
 * a triangle and displays the triangle's area. Here is a sample run of the program:
 * 
 * ----------------------------------------------------------
 * Enter x1, y1, x2, y2, x3, y3: 2.5 2 5 -1.0 4.0 2.0 [ENTER]
 * The area of the triangle is 2.25 
 * ----------------------------------------------------------
 * 
 * ----------------------------------------------------------
 * Enter x1, y1, x2, y2, x3, y3: 2 2 4.5 4.5 6 6 [ENTER]
 * The three points are on the same line
 * ----------------------------------------------------------
 * 
 * Commentary: I will need to rely on formulas from Exercise 2.19 and Exercise 3.32 to
 * determine the area and whether the points are on the same line. I will print the
 * output as shown in sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/16/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.32
 */

import java.util.Scanner;

public class EX32_AreaOfTriangle {
    
    public static void main(String[] args) {
        
        // assign user inputs to matrix
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        double[][] triPoints = getMatrix();
        
        // get area of triangle
        double area = getTriangleArea(triPoints);
        
        // print output as shown in sample runs
        if (area == 0)
            System.out.println("The three points are on the same line");
        else
            System.out.printf("The area of the triangle is %3.2f\n", area);
        
    }
    
    // method to calculates a triangles area based based on Exercise 2.19
    public static double getTriangleArea(double[][] points) {
        if (sameLine(points)) // check if points on same line
            return 0;
        
        // calculate area of a triangle
        double s1 = getSide(points[0][0], points[0][1], points[1][0], points[1][1]);
        double s2 = getSide(points[1][0], points[1][1], points[2][0], points[2][1]);
        double s3 = getSide(points[2][0], points[2][1], points[0][0], points[0][1]);
        double s = (s1 + s2 + s3) / 2;
        double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        
        return area;
    }
    
    // method that checks if the points are on the same line using Exercise 3.32 problem statement
    public static boolean sameLine(double[][] points) {
        // ((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) == 0 
        return ((points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) - (points[2][0] - points[0][0]) * (points[1][1] - points[0][1])) == 0;
    }
    
    // method to calculate distance between points
    public static double getSide(double x1, double y1, double x2, double y2) {
        // SQRT((X2 - X1)^2 + (Y2 - Y1)^2)
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));       
    }
    
    // method to get user data and fill matrix, then return matrix to variable
    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in); 
        double[][] m = new double[3][2];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        
        return m;
    }
}
