/**
 * (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon
 * in which all sides are of the same length and all angles have the same degree (i.e.,
 * the polygon is both equilateral and equiangular). The formula for computing the
 * area of a regular polygon is
 * 
 *      Area = (n x s^2) / (4 X tan(PI / n))
 * 
 * Write a method that returns the area of a regular polygon using the following header:
 *      
 *      public static double area(int n, double side)
 * 
 * Write a main method that prompts the user to enter the number of sides and the
 * side of a regular polygon and displays its area. Here is a sample run:
 * 
 * ------------------------------------------------
 * Enter the number of sides: 5 [ENTER]
 * Enter the side: 6.5 [ENTER]
 * The area of the polygon is 72.69017017488385
 * ------------------------------------------------
 * 
 * Commentary: I will calculate the formula within the method as provided in the
 * problem statement. I will print output as shown in sample run. 
 *
 * Author: chill4Eng2Dev 
 * Date: 9/9/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.36
 */

import java.util.Scanner;

public class EX36_AreaOfRegPolygon {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to variables
        System.out.print("Enter the number of sides: ");
        int sides = input.nextInt();
        
        System.out.print("Enter the side: ");
        double sideLength = input.nextDouble();
        
        // print output as shown in sample run and call area method
        System.out.println("The area of the polygon is " + area(sides, sideLength));
        
        
    }
    
    // calculate area based on formula provided in problem statement
    public static double area(int n, double side) {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
        

}
