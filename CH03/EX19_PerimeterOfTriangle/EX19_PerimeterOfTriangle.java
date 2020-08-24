/**
 * (Compute the perimeter of a triangle) Write a program that reads three edges for
 * a triangle and computes the perimeter if the input is valid. Otherwise, display
 * that the input is invalid. The input is valid if the sum of every pair of two edges
 * is greater than the remaining edge.
 * 
 * Commentary: I will need to use an if-else statement to cycle through the potential
 * options based on the user entry. There will be an extensive boolean test to validate
 * that the sides, when added, are greater than the last remaining side not added. I will 
 * print output as stated in the description. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/22/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.19
 */

import java.util.Scanner;

public class EX19_PerimeterOfTriangle {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize variables with user input
        System.out.print("Enter lengths for each side of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        
        // caluclate the perimeter
        double perimeter = side1 + side2 + side3;
        
        // check the sum of two sides (must be greater than) and compare to remaining side
        if ((side1 + side2 >= side3) && (side1 + side3 >= side2) && (side2 + side3 >= side1))
            System.out.println("The perimeter of the triangle is: " + perimeter);
        else
            System.out.println("The input is invalid.");
        
    }
}
