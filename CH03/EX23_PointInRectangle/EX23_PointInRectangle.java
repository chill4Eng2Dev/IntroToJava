/**
 * (Geometry: point in a rectangle?) Write a program that prompts the user to enter
 * a point (x, y) and checks whether the point is within the rectangle centered at
 * (0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle and
 * (6, 4) is outside the rectangle, as shown in Figure 3.7b. (Hint: a point is in the
 * rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and
 * its vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program
 * to cover all cases.) Here are two sample runs.
 * 
 * -----------------------------------------------
 * Enter a point with two coordinates: 2 2 [ENTER]
 * Point (2.0, 2.0) is in the rectangle.
 * -----------------------------------------------
 * -----------------------------------------------
 * Enter a point with two coordinates: 6 4 [ENTER]
 * Point (6.0, 4.0) is not in the rectangle.
 * -----------------------------------------------
 * 
 * Commentary: I will need to gather user input and check if the values are negative. 
 * If the values are negative, I will need to multiple the value by -1 since I haven't
 * "learned" Math.abs() thus far. I will then compare the points to the rectangle boundary
 * and print the output with verdict.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/23/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.23
 */

import java.util.Scanner;

public class EX23_PointInRectangle {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and intialize constants
        final double RECT_WIDTH = 10.0;
        final double RECT_HEIGHT = 5.0;
        
        // declare and initialize variables with user input
        System.out.print("Enter a point wth two coordinates: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        // print output as shown in sample runs using original inputs
        System.out.print("Point (" + x1 + ", " + y1 + ") is ");
        
        // convert values to positive values to simplify check
        x1 = Math.abs(x1);
        y1 = Math.abs(y1);
        
        // print output of verdict
        System.out.println(((x1 > RECT_WIDTH / 2 || y1 > RECT_HEIGHT / 2) ? "not " : "") + "in the rectangle");
        
    }
}
