/**
 * (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point
 * at the 0 o'clock position, as shown in Figure 4.7c. Write a program that prompts
 * the user to enter the radius of the bounding circle of a pentagon and displays the
 * coordinates of the five corner points on the pentagon. Here is a sample run:
 * 
 * -------------------------------------------------------------------------
 * Enter the radius of the bounding circle: 100 [ENTER]
 * The coordinates of five points on the pentagon are
 * (95.1057, 30,9017)
 * (0.000132679, 100)
 * (-95.1056, 30.9019)
 * (-58.7788, -80.9015)
 * (58.7782, -80.902)
 * -------------------------------------------------------------------------
 * 
 * Commentary: I will need to use the Math class and Trig methods. I will need to
 * determine an angle amount to increment the starting angle with. I will then iteratively
 * calculate the value of x and y. I will then print out the points as shown in the sample
 * run using printf. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/25/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.7
 */

import java.util.Scanner;

public class EX07_CornerPointCoordinates {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize radius from user input
        System.out.print("Enter the radius of the bounding circle: ");
        double r = input.nextFloat();
        
        System.out.println("The coordinates of five points on the pentagon are");
        
        // calculate an incrementer and assign angle value
        double increment = Math.toRadians(360 / 5.0);           
        double angle = increment;
        
        // point 1, calculate x and y and print output
        double x1 = (r * Math.sin(angle));
        double y1 = (r * Math.cos(angle));
        System.out.printf("(%-7.4f, %-7.4f)\n", x1, y1);
        
        // point 2, calculate x and y and print output
        angle -= increment;
        double x2 = r * Math.sin(angle);
        double y2 = r * Math.cos(angle);
        System.out.printf("(%-7.4f, %-7.4f)\n", x2, y2);
        
        // point 3, calculate x and y and print output
        angle -= increment;
        double x3 = r * Math.sin(angle);
        double y3 = r * Math.cos(angle);
        System.out.printf("(%-7.4f, %-7.4f)\n", x3, y3);
        
        // point 4, calculate x and y and print output
        angle -= increment;
        double x4 = r * Math.sin(angle);
        double y4 = r * Math.cos(angle);
        System.out.printf("(%-7.4f, %-7.4f)\n", x4, y4);
        
        // point 5, calculate x and y and print output
        angle -= increment;
        double x5 = r * Math.sin(angle);
        double y5 = r * Math.cos(angle);
        System.out.printf("(%-7.4f, %-7.4f)\n", x5, y5);
    }
}

