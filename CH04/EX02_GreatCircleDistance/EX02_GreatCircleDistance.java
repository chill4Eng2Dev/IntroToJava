/**
 * (Geometry: great circle distance) The great circle distance is the distance between
 * two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical
 * latitude and longitude of two points. The great circle distance between the two
 * points can be computed using the following formula:
 * 
 * d = raidus X arccos(sin(x1) X sin(x2) + cos(x1) X cos(x2) X cos(y1 - y2))
 * 
 * Write a program that prompts the user to enter the latitude and longitude of two
 * points on the earth in degrees and displays its great circle distance. The average
 * earth radius is 6,371.01 km. Note that you need to convert the degrees into radians
 * using the Math. toRadians method since the Java trigonometric methods use radians.
 * The latitude and longitude degrees in the formula are for north and west. Use
 * negative to indicate south and east degrees. Here is a sample run:
 * 
 * -------------------------------------------------------------------------
 * Enter point 1 (latitude and longitude) in degrees: 39.55, -116.25 [ENTER]
 * Enter point 2 (latitude and longitude) in degrees: 41.5, 87.37 [ENTER]
 * The distance between the two points is 10691.79183231593 km
 * -------------------------------------------------------------------------
 * 
 * Commentary: I will need to use trigonometry methods from Math class to calculate the
 * distance using the provided formula. I will need to convert the user entries into radians
 * after input. Then I will need to print output as shown in sample run. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/25/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.2
 */

import java.util.Scanner;

public class EX02_GreatCircleDistance {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize user inputs into first point
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        // declare and initialize user inputs into second point
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        // convert values to radians
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        
        // initialize radius with value from problem statement
        double r = 6371.01;
        
        // calculate the distance with formula from problem statement
        double dist = r * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        
        // print output as shown in sample run
        System.out.println("The distance between the two points is " + dist + " km");
        
    }
        
}
