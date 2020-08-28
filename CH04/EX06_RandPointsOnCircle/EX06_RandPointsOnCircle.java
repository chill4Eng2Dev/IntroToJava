/**
 * (Random points on a circle) Write a program that generates three random points
 * on a circle centered at (0, 0) with radius 40 and display three angles in a triangle
 * formed by these three points, as shown in Figure 4.7a. (Hint: Generate a random
 * angle A in radians between 0 and 2PI, as shown in Figure 4.7b and the point determined
 * by this angle is (r*cos(A), r*sin(A)).)
 * 
 * For reference, from Section 4.2.6:
 *      A = acos((a * a - b * b - c * c) / (-2 * b * c))
 *      B = acos((b * b - a * a - c * c) / (-2 * a * c))
 *      C = acos((c * c - a * a - b * b) / (-2 * a * b))
 *      
 * Distance formula for reference:
 *      dist = ((X2 - X1)^2 + (Y2 - Y1)^2)^0.5
 *      
 * Commentary: I will need to use the Math class, PI, and Trig methods. I will then
 * need to calculate the distance to the points using a distance formula. Then I will need
 * to use Section 4.2.6 formula to calculate angles within triangle. Then I will need to 
 * display the angles within the triangle formed from the points.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/25/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.6
 */

public class EX06_RandPointsOnCircle {

    public static void main(String[] args) {
        
        // declare and initialize radius at 40
        double r = 40;
        
        // declare and initialize points with random variable, calc x and y for each point
        double alpha = Math.random() * 2 * Math.PI;
        double x1 = r * Math.cos(alpha);
        double y1 = r * Math.sin(alpha);
        
        alpha = Math.random() * 2 * Math.PI;
        double x2 = r * Math.cos(alpha);
        double y2 = r * Math.sin(alpha);
        
        alpha = Math.random() * 2 * Math.PI;
        double x3 = r * Math.cos(alpha);
        double y3 = r * Math.sin(alpha);
        
        // calculate the sides of the triangle
        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(x1 - x3, 2));
        
        // calculate the angle at points with calculated sides
        double angleA = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double angleB = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double angleC = Math.toDegrees(Math.acos((c * c - a * a - b * b) / (-2 * a * b)));
        
        // print output for coordinates, sides, and angles
        System.out.println("Point 1: (" + x1 + ", " + y1 + ")");
        System.out.println("Point 2: (" + x2 + ", " + y2 + ")");
        System.out.println("Point 3: (" + x3 + ", " + y2 + ")");
        System.out.println("Side a is: " + a);
        System.out.println("Side b is: " + b);
        System.out.println("Side c is: " + c);
        System.out.println("Angle A is: " + (Math.round(angleA * 100) / 100.0) + " degrees");
        System.out.println("Angle B is: " + (Math.round(angleB * 100) / 100.0) + " degrees");
        System.out.println("Angle C is: " + (Math.round(angleC * 100) / 100.0) + " degrees");
        System.out.println("Sum of Angles is: " + Math.round(angleA + angleB + angleC) + " degrees");
        
    }
        
        
        
}
