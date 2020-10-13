/**
 * (Geometry: point position) Programming Exercise 3.32 shows how to test whether
 * a point is on the left side of a directed line, on the right, or on the same line. Write
 * the methods with the following headers:
 *      
 *      // Return true if point (x2, y2) is on the left side of the 
 *      // directed line from (x0, y0) to (x1, y1) 
 *      public static boolean leftOfTheLine(double x0, double y0, 
 *              double x1, double y1, double x2, double y2)
 *      
 *      // Return true if point (x2, y2) is on the same 
 *      // line from (x0, y0) to (x1, y1) 
 *      public static boolean onTheSameLine(double x0, double y0,
 *              double x1, double y1, double x2, double y2)
 *      
 *      // Return true if point (x2, y2) is on the
 *      // line segment from (x0, y0) to (x1, y1) 
 *      public static boolean onTheLineSegment(double x0, double y0,
 *              double x1, double y1, double x2, double y2)
 * 
 * Write a program that prompts the user to enter the three points for p0, p1, and p2
 * and displays whether p2 is on the left of the line from p0 to p1, right, the same
 * line, or on the line segment. Here are some sample runs:
 *
 * ---------------------------------------------------------------------------
 * Enter three points for p0, p1, and p2: 1 1 2 2 1.5 1.5 [ENTER]
 * (1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.0, 2.0)
 * ---------------------------------------------------------------------------
 * ---------------------------------------------------------------------------
 * Enter three points for p0, p1, and p2: 1 1 2 2 3 3
 * (3.0, 3.0) is on the same line from (1.0, 1.0) to (2.0, 2.0)
 * ---------------------------------------------------------------------------
 * ---------------------------------------------------------------------------
 * Enter three points for p0, p1, and p2: 1 1 2 2 1 1.5
 * (1.0, 1.5) is on the left side of the line from (1.0, 1.0) to (2.0, 2.0)
 * ---------------------------------------------------------------------------
 * ---------------------------------------------------------------------------
 * Enter three points for p0, p1, and p2: 1 1 2 2 1 -1
 * (1.0, -1.0) is on the right side of the line from (1.0, 1.0) to (2.0, 2.0)
 * ---------------------------------------------------------------------------
 * 
 * Commentary: I will need to combine problem exercises 3.32 and 3.34 to complete
 * this assignment. I will evaluate the boolean for each method provided. I will
 * print output as shown in sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/10/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.39
 */

import java.util.Scanner;

public class EX39_PointPosition {
    
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);

        // declare and initialize variables with user input
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        // print the first third of the output
        System.out.print("(" + x2 + ", " + y2 + ") is on the "); 
        
        // determine verdict and print output accordingly as shown in sample run
        if (onTheLineSegment(x0, y0, x1, y1, x2, y2))
            System.out.print("line segment ");
        else if (leftOfTheLine(x0, y0, x1, y1, x2, y2))
            System.out.print("left side of the line ");
        else if (onTheSameLine(x0, y0, x1, y1, x2, y2))
            System.out.print("same line ");
        else
            System.out.print("right side of the line ");
        
        // print the last portion of the output.
        System.out.println("from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");

    }
    
    // Return true if point (x2, y2) is on the left side of the 
    // directed line from (x0, y0) to (x1, y1) 
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0;
    }
    
    // Return true if point (x2, y2) is on the same 
    // line from (x0, y0) to (x1, y1) 
    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
    }
    
    // Return true if point (x2, y2) is on the
    // line segment from (x0, y0) to (x1, y1) 
    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
        double result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return (result == 0 && y2 <= y1 && x2 <= x1 && y2 >= y0 && x2 >= x0);
    }

}

