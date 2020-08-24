/**
 * (Geometry: point on line segment) Programming Exercise 3.32 shows how to test whether
 * a point is on an unbounded line. Revise Programming exercise 3.32 to test whether a
 * point is on a line segment. Write a program that prompts the user to enter the three
 * points for p0, p1, and p2 and displays whether p2 is on the line segment from p0 to
 * p1. Here are some sample runs:
 * 
 * -------------------------------------------------------------------------
 * Enter three points for p0, p1, and p2: 1 1 2.5 2.5 1.5 1.5 [ENTER]
 * (1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.5, 2.5)
 * -------------------------------------------------------------------------
 * -------------------------------------------------------------------------
 * Enter three points for p0, p1, and p2: 1 1 2 2 3.5 3.5 [ENTER]
 * (3.5, 3.5) is not on the line segment from (1.0, 1.0) to (2.0, 2.0)
 * -------------------------------------------------------------------------
 * 
 * Commentary: I will need to use a lot of boolean expression to check if p2 is on the
 * line segment. I will need to ensure that the p2 values are not less than or greater
 * than the p0 and p1 coordinates. I will need to check if it is 0 when calculated using
 * the formula provided from Exercise 32. Then I will need to print output as shown in 
 * sample runs. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/24/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.34
 */

import java.util.Scanner;

public class EX34_PointOnLineSegment {

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
        
        // calculate the resulting output from using the provided formula
        double result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        
        // determine a boolean verdict base on all limiting parameters
        boolean verdict = (result == 0 && y2 <= y1 && x2 <= x1 && y2 >= y0 && x2 >= x0); 
       
        // print the first third of the output
        System.out.print("(" + x2 + ", " + y2 + ") is on the ");
        
        // determine use boolean verdict and print output accordingly as shown in sample run
        if (verdict)
            System.out.print("line segment ");
        else 
            System.out.print("not on the line segment ");
        
        // print the last portion of the output.
        System.out.println("from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        
    }
}
