/**
 * (Physics: finding runway length) Given an airplane's acceleration a and take-off
 * speed v, you can compute the minimum runway length needed for an airplane to
 * take off using the following formula:
 * 
 *          length = v^2 / 2a
 *          
 * Write a program that prompts the user to enter v in meters/second (m/s) and the
 * acceleration a in meters/second squared (m/s^2), and displays the minimum runway
 * length. Here is a sample run:
 * 
 * ------------------------------------------------------
 * Enter speed and acceleration: 60 3.5 [ENTER]
 * The minimum runway length for this airplane is 514.286
 * ------------------------------------------------------
 * 
 * Commentary: I will need to create type double variables and assign user input. I will
 * use the math class. I will calculate the length of runway and print the output as 
 * shown in the sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/19/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.12
 */

import java.util.Scanner;

public class EX12_RunwayLength {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare variables
        double v, a, length; 
        
        // initialize variables with user input
        System.out.print("Enter speed and acceleration: ");
        v = input.nextDouble();
        a = input.nextDouble();
        
        // calculate length using provided formula
        length = Math.pow(v, 2) / (2 * a);
        
        // print output to match sample run
        System.out.println("The minimum runway length for this airplace is " + length);
        
    }
    
}
