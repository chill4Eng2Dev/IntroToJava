
/**
 * (Physics: acceleration) Average acceleration is defined as the change of velocity
 * divided by the time taken to make the change, as shown in the following formula:
 * 
 *          a = (v1 - v0) / t
 *          
 * Write a program that prompts the user to enter the starting velocity v0 in meters/
 * second, the ending velocity v1 in meters/second, and the time span t in seconds,
 * and displays the average acceleration. Here is a sample run:
 * 
 * -----------------------------------------
 * Enter v0, v1, and t: 5.5 50.9 4.5 [ENTER]
 * The average acceleration is 10.0889
 * -----------------------------------------
 * 
 * Commentary: I will need to use four variables of type double and assign inputs accordingly.
 * I will then use the provided formula to calculate acceleration. I will print the outputs 
 * as shown in the sample run. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/19/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.9
 */

import java.util.Scanner;

public class EX09_Acceleration {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare variables
        double v0, v1, t, a;
        
        // initialize variables with user input
        System.out.print("Enter v0, v1, and t: ");
        v0 = input.nextDouble();
        v1 = input.nextDouble();
        t = input.nextDouble();
        
        // calculate acceleration with the provided formula
        a = (v1 - v0) / t;
        
        // print the output of acceleration as shown in sample run
        System.out.println("The average acceleration is " + a);
        
    }
        
}
