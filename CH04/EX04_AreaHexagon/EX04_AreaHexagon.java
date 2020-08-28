/**
 * (Geometry: area of a hexagon) The area of a hexagon can be computed using the
 * following formula (s is the length of a side):
 * 
 *      Area = (6 X s^2) / (4 X tan(PI / 6))
 *      
 * Write a program that prompts the user to enter the side of a hexagon and displays
 * its area. Here is a sample run:
 * 
 * --------------------------------
 * Enter the side: 5.5 [ENTER]
 * The area of the hexagon is 78.59
 * --------------------------------
 * 
 * Commentary: I will need to use the Math class, PI, rounding, and Trig methods. I will then
 * need to calculate area. I will round the area after calculation. Then I will 
 * need to print output as shown in sample runs. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/25/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.4
 */

import java.util.Scanner;

public class EX04_AreaHexagon {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize side with user input
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        
        // calcualte area using formula provided in problem
        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
        
        // round the area and adjust formatting
        area = Math.round(area * 100.0) / 100.0;
        
        // print output of the area as shown in sample run
        System.out.println("The area of the hexagon is " + area);
        
    }

}
