/**
 * (The MyTriangle class) Create a class named MyTriangle that contains the
 * following two methods:
 * 
 * // Return true if the sum of any two sides is greater than the third side. 
 * public static boolean isValid(double side1, double side2, double side3)
 * 
 * // Return the area of the triangle.
 * public static double area(double side1, double side2, double side3)
 * 
 * Write a test program that reads three sides for a triangle and computes the area if
 * the input is valid. Otherwise, it displays that the input is invalid. The formula for
 * computing the area of a triangle is given in Programming Exercise 2.19.
 * 
 * Commentary: I will use the methods listed to validate the triangle and calculate the
 * area should the side lengths be valid. I have applied the formulas in Exercise 2.19
 * to the area method. I will print output as stated in problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 6/10/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.19
 */

import java.util.Scanner;

public class EX19_MyTriangle {
    
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // initialize variables with user input
        System.out.print("Enter three points for a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
                
        // if statement to call isValid method and area method should isValid is true
        if (isValid(side1, side2, side3))
            System.out.println("The area of the triangle is " + area(side1, side2, side3));
        else
            System.out.println("The entered sides are invalid.");

        
    }
    
    /** Return true if the sum of any two sides is less than third side */
    public static boolean isValid(double side1, double side2, double side3) {
        if (side1 + side2 < side3 || side2 + side3 < side1 || side1 + side3 < side2)
            return false;
        
        return true;
    }
    
    /** Return the area of the triangle. */
    public static double area(double side1, double side2, double side3) {
        // calculate s and area using previously calculated sides
        double s = (side1 + side2 + side3) / 2;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }
            

}
