/**
 * (Geometry: intersecting point) Write a method that returns the intersecting point of
 * two lines. The intersecting point of the two lines can be found by using the formula
 * shown in Programming Exercise 3.25. Assume that (x1, y1) and (x2, y2) are the
 * two points on line 1 and (x3, y3) and (x4, y4) are on line 2. The method header is
 * 
 * public static double[] getIntersectingPoint(double[][] points)
 * 
 * The points are stored in a 4-by-2 two-dimensional array points with
 * (points[0][0], points[0][1]) for (x1, y1). The method returns the intersecting
 * point or null if the two lines are parallel. Write a program that prompts
 * the user to enter four points and displays the intersecting point. See Programming
 * Exercise 3.25 for a sample run.
 *  
 * FOR REFERENCE:
 * 
 *  (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 *  (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
 * 
 * For reference, Cramer's rule from Exercise 1.13 & Exercise 3.3: 
 *          ax + by = e    x = (ed - bf) / (ad - bc)
 *          cx + dy = f    y = (af - ec) / (ad - bc)
 * 
 * Commentary: Nothing out of the ordinary for this exercise. I will print output as
 * shown in Exercise 3.25.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/16/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.31
 */

import java.util.Scanner;

public class EX31_IntersectingPoint {

    public static void main(String[] args) {
        
        // assign user input to points matrix
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double[][] points = getMatrix();
        
        // store intersection point if found, otherwise null
        double[] intersectPoint = getIntersectingPoint(points);
        
        // print output to match Exercise 3.25 sample runs
        if (intersectPoint == null)
            System.out.println("The two lines are parallel");
        else
            System.out.println("The intersecting point is at (" + intersectPoint[0] + ", " + intersectPoint[1] + ")");
            
    }
    
    // method to determine intersecting point of two lines, or if parallel per Cramer's rule
    public static double[] getIntersectingPoint(double[][] points) {
        double[] result = new double[2];
        
        double a = points[0][1] - points[1][1];     // (y1 - y2)
        double b = -1 * (points[0][0] - points[1][0]); // -1 * (x1 - x2)
        double c = points[2][1] - points[3][1]; // (y3 - y4)
        double d = -1 * (points[2][0] - points[3][0]); // -1 * (x3 - x4)
        double e = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1]; // (y1 - y2) * x1 - (x1 - x2) * y1
        double f = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1]; // (y3 - y4) * x3 - (x3 - x4) * y3
        
        double divisor = (a * d - b * c);
        
        if (divisor == 0)
            return result = null;
        else {
            result[0] = (e * d - b * f) / divisor;
            result[1] = (a * f - e * c) / divisor;
        }
        
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
