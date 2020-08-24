
/**
 * (Geometry: points in triangle?) Suppose a right triangle is placed in a plane as
 * shown below. The right-angle point is placed at (0, 0), and the other two points
 * are placed at (200, 0), and (0, 100). Write a program that prompts the user to enter
 * a point with x- and y-coordinates and determines whether the point is inside the
 * triangle. Here are the sample runs:
 * 
 * --------------------------------------------------------
 * Enter a point's x- and y-coordinates: 100.5 25.5 [ENTER]
 * The point is in the triangle
 * --------------------------------------------------------
 * --------------------------------------------------------
 * Enter a point's x- and y-coordinates: 100.5 50.5 [ENTER]
 * The point is not in the triangle
 * --------------------------------------------------------
 * 
 * For reference from Exercise 3.32:
 * 
 *                                           { >0 p2 is on the left side of the line
 * (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) { =0 p2 is on the same line
 *                                           { <0 p2 is on the right side of the line
 *                                               
 * Commentary: I will use the Hint provided in Exercise 3.32 to complete this check.
 * I think the best approach for me is to determine a side that the point must be on
 * for all sides of the triangle, and if true, then the point is inside the triangle,
 * otherwise the point is outside of the triangle. I will then need to print output as 
 * shown in sample runs. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/24/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.27
 */

import java.util.Scanner;

public class EX27_PointsInTriangle {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize variables for x2 and y2 from user input
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        /** 
         * Use formula provided in Exercise 3.32. If the value is <= 0 then the point is 
         * on the right side of the line. I have entered the points into the formula in
         * a clockwise fashion starting at point (0, 0) to (0, 100), then (0, 100) to (200, 0)
         * and finally (200, 0) to (0, 0). If the value is <= 0 for all lines the point is 
         * within the triangle, otherwise it is outside of the triangle.
         */
        
        double line1Value = (0 - 0) * (y2 - 0) - (x2 - 0) * (100 - 0);
        double line2Value = (200 - 0) * (y2 - 100) - (x2 - 0) * (0 - 100);
        double line3Value = (0 - 200) * (y2 - 0) - (x2 - 200) * (0 - 0);
        
        if (line1Value <= 0 && line2Value <= 0 && line3Value <= 0)
            System.out.println("The point is in the triangle");
        else
            System.out.println("The point is not in the triangle");
        
    }
        
        
}
