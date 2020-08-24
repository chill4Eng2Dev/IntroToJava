/**
 * (Geometry: point position) given a directed line from point p0(x0, y0) to p1(x1, y1),
 * you can use the following condition to decide whether a point p2(x2, y2) is on the
 * left of the line, on the right, or on the same line (see Figure 3.11):
 * 
 *                                           { >0 p2 is on the left side of the line
 * (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) { =0 p2 is on the same line
 *                                           { <0 p2 is on the right side of the line
 *                                               
 * Write a program that prompts the user to enter the three points for p0, p1, and p2
 * and displays whether p2 is on the left of the line from p0 to p1, on the right, or
 * on the same line. Here are some sample runs:
 * 
 * -------------------------------------------------------------------------
 * Enter three points for p0, p1, and p2: 4.4 2 6.5 9.5 -5 4 [ENTER]
 * (-5.0, 4.0) is on the left side of the line from (4.4, 2.0) to (6.5, 9.5)
 * -------------------------------------------------------------------------
 * -------------------------------------------------------------------------
 * Enter three points for p0, p1, and p2: 1 1 5 5 2 2 [ENTER]
 * (2.0, 2.0) is on the line from (1.0, 1.0) to (5.0, 5.0)
 * -------------------------------------------------------------------------
 * -------------------------------------------------------------------------
 * Enter three points for p0, p1, and p2: 3.4 2 6.5 9.5 5 2.5 [ENTER]
 * (5.0 2.5) is on the right side of the line from (3.4, 2.0) to (6.5, 9.5)
 * -------------------------------------------------------------------------
 * 
 * Commentary: I will need to use if statements to cycle through output verdict. 
 * I will use the provided formulas to calculate the output (0, >0, <0). I will then 
 * need to print output as shown in sample runs. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/23/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.32
 */

import java.util.Scanner;

public class EX32_PointPosition {

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
        
        // print the first third of the output
        System.out.print("(" + x2 + ", " + y2 + ") is on the ");
        
        // determine verdict and print output accordingly as shown in sample run
        if (result > 0)
            System.out.print("left side of the line ");
        else if (result == 0)
            System.out.print("line ");
        else
            System.out.print("right side of the line ");
        
        // print the last portion of the output.
        System.out.println("from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        
    }
}
