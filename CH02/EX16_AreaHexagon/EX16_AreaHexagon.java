
/**
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter the
 * side of a hexagon and displays its area. The formula for computing the area of a
 * hexagon is
 * 
 *          Area = (3 * (3)^0.5) / 2 * s^2
 * 
 * where s is the length of a side. Here is a sample run:
 *  
 * ----------------------------------
 * Enter the side: 5.5 [ENTER]
 * The area of the hexagon is 78.5895
 * ----------------------------------
 * 
 * Commentary: I will need to create a few variables of type double. I will need to 
 * use the math class and calculate the area using the provided formula. I will 
 * show my output as shown in the sample run. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/19/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.16
 */

import java.util.Scanner;

public class EX16_AreaHexagon {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare variables
        double area, s;
        
        // initialize variable with user input
        System.out.print("Enter the side: ");
        s = input.nextDouble();
        
        // calculate area with the provided formula
        area = ((3.0 * Math.pow(3.0, 0.5)) / 2) * Math.pow(s, 2);
        
        // print output of the hexagon area as shown in sample run
        System.out.println("The area of the hexagon is " + area);
        
        /** The output does not match sample run. I assume this is due to rounding issues. */
    }
}
