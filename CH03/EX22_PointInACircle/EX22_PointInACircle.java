/**
 * (Geometry: point in a circle?) Write a program that prompts the user to enter a
 * point (x, y) and checks whether the point is within the circle centered at (0, 0)
 * with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
 * circle, as shown in Figure 3.7a.
 * 
 * (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to
 * 10. The formula for computing the distance is ((x2 - x1)^2 + (y2 - y1)^2)^0.5. Test
 * your program to cover all cases.) Two sample runs are shown below.
 * 
 * -----------------------------------------------
 * Enter a point with two coordinates: 4 5 [ENTER]
 * Point (4.0, 5.0) is in the circle.
 * -----------------------------------------------
 * -----------------------------------------------
 * Enter a point with two coordinates: 9 9 [ENTER]
 * Point (9.0, 9.0) is not in the circle.
 * -----------------------------------------------
 * 
 * Commentary: I will need to gather user input and calculate distance. Then I will
 * use an if statement to check if distance is less than or equal to 10. I will print
 * output as shown in sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/23/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.22
 */

import java.util.Scanner;

public class EX22_PointInACircle {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare or initialize constants
        final double RADIUS = 10.0;
        final double CENTER_X1 = 0.0;
        final double CENTER_Y1 = 0.0;
        
        // declare and initialize variables with user inputs
        System.out.print("Enter a point with two coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        // calculate distance with the provided formula
        double distance = Math.pow(Math.pow(x2 - CENTER_X1, 2) + Math.pow(y2 - CENTER_Y1, 2), 0.5);
        
        // print output with verdict as shown in sample runs
        System.out.println("Point (" + x2 + ", " + y2 + ") is " + ((distance > RADIUS) ? "not " : "") + "in the circle");
        
    }
}
