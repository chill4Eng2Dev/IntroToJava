/**
 * (Geometry: area of a pentagon) Write a program that prompts the user to enter
 * the length from the center of a pentagon to a vertex and computes the area of the
 * pentagon, as shown in the following figure.
 * 
 * The formula for computing the area of a pentagon is Area = (5 x s^2) / (4 * tan(PI / 5))
 * where s is the length of a side. The side can be computed using the formula s = 2rsin(PI / 5),
 * where r is the length from the center of a pentagon to a vertex. Round up two digits
 * after the decimal point. Here is a sample run:
 * 
 * ---------------------------------------------------------
 * Enter the length from the center to a vertex: 5.5 [ENTER]
 * The area of the pentagon is 71.92
 * ---------------------------------------------------------
 * 
 * Commentary: I will need to use the Math class, PI, rounding, and Trig methods. I will then
 * need to calculate s and area. I will round the area after calculation. Then I will 
 * need to print output as shown in sample runs. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/25/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.1
 */

import java.util.Scanner;

public class EX01_AreaPentagon {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initalize radius with user input
        System.out.print("Enter the length from the center to the vertex: ");
        double r = input.nextDouble();
        
        // calculate side and area using provide formulas
        double s = 2 * r * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
        
        // round the area to two decimal places per problem statement
        area = Math.round(area * 100) / 100.0;
        
        // print output as shown in sample run
        System.out.println("The area of the pentagon is: " + area);
        
    }
}
