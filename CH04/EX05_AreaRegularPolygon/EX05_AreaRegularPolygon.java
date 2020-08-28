/**
 * (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in
 * which all sides are of the same length and all angles have the same degree (i.e., the
 * polygon is both equilateral and equiangular). The formula for computering the area
 * of a regular polygon is
 * 
 *              area = (n X s^2) / (4 X tan (PI / n))
 * 
 * Here, s is the length of a side. Write a program that prompts the user to enter the
 * number of sides and their length of a regular polygon and displays its area. Here is
 * a sample run:
 * 
 * -------------------------------------------------------------------------
 * Enter the number of sides: 5 [ENTER]
 * Enter the side: 6.5 [ENTER]
 * The area of the polygon is 74.69017017488385
 * -------------------------------------------------------------------------
 * 
 * Commentary: I will need to use the Math class, PI, and Trig methods. I will then
 * need to calculate area. Then I will need to print output as shown in sample runs. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/25/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.5
 */

import java.util.Scanner;

public class EX05_AreaRegularPolygon {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize number of sides with user input
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();
        
        // declare and initialize side length with user input
        System.out.print("Enter the side length: ");
        double s = input.nextDouble();
        
        // calculate area using provided formula from problem
        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
        
        // print output of the area        
        System.out.println("The area of the polygon is " + area);
        
    }
}
