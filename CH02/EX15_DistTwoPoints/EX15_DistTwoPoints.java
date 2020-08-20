
/**
 * (Geometry: distance of two points) Write a program that prompts the user to enter
 * two points (x1, y1) and (x2, y2) and displays their distance between them. The
 * formula for computing the distance is ((x2 - x1)^2 + (y2 - y1)^2)^0.5. Note that
 * you can use Math.pow(a, 0.5) to compute (a)^0.5. Here is a sample run:
 *  
 * --------------------------------------------------------
 * Enter x1 and y1: 1.5 -3.4 [ENTER]
 * Enter x2 and y2: 4 5 [ENTER]
 * The distance between the two points is 8.764131445842194
 * --------------------------------------------------------
 * 
 * Commentary: I will need to create a few variables of type double. I will need to 
 * use the math class and calculate the distance using the provided formula. I will 
 * show my output as shown in the sample run. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/19/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.15
 */

import java.util.Scanner;

public class EX15_DistTwoPoints {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare variables
        double x1, y1, x2, y2, distance;
        
        // initialize variables for first point
        System.out.print("Enter x1 and y1: "); 
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        
        // initialize variables for second point
        System.out.print("Enter x2 and y2: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        
        // calculate the distance between points using provided formula
        distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        
        // print output of distance as shown in sample run
        System.out.println("The distance between the two points is " + distance);
        
    }

}
