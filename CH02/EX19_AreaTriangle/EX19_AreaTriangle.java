/**
 * (Geometry: area of a triangle) Write a program that prompts the user to enter
 * three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
 * The formula for computing the area of a triangle is
 * 
 *      s = (side1 + side2 + side3)/2;
 *      area = (s(s - side1)(s - side2)(s - side3))^0.5
 *      
 * Here is a sample run:
 * ------------------------------------------------------------------
 * Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4 [ENTER]
 * The area of the triangle is 33.6
 * ------------------------------------------------------------------
 * 
 * Commentary: I will need to create a few variables of type double. I will need to 
 * use the math class and calculate s and area as provided in the problem statement.
 * I will need to calculate side using the distance formula from Exercise 2.15. Once
 * that is complete, I can calculate s and then area. I will show my output as shown 
 * in the sample run. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/19/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.19
 */

import java.util.Scanner;

public class EX19_AreaTriangle {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare variables
        double x1, y1, x2, y2, x3, y3, s, area, side1, side2, side3;
        
        // initialize variables with user input
        System.out.print("Enter three points for a triangle: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        
        // calculate side using the distance formula from Exercise 2.15
        side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
        
        // calculate s and area using previously calculated sides
        s = (side1 + side2 + side3) / 2;
        area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        
        // print output of triangle angle as shown in sample run
        System.out.println("The area of the triangle is " + area);
        
    }
}
