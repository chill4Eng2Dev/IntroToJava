
/**
 * (Science: calculating energy) Write a program that calculates the energy needed
 * to heat water from an initial temperature to a final temperature. Your program
 * should prompt the user to enter the amount of water in kilograms and the initial
 * and final temperatures of the water. The formula to compute the energy is
 * 
 * Q = M * (finalTemperature - initialTemperature) * 4184
 * 
 * where M is the weight of water in kilograms, temperatures are in degrees Celsius,
 * and energy Q is measured in joules. Here is a sample run:
 * 
 * ----------------------------------------------------
 * Enter the amount of water in kilograms: 55.5 [ENTER]
 * Enter the initial temperature: 3.5 [ENTER]
 * Enter the final temperature: 10.5 [ENTER]
 * The energy needed is 1625484.0
 * ----------------------------------------------------
 * 
 * Commentary: I will need to use four variables of type double and assign inputs accordingly.
 * I will then use the provided formula to calculate energy. I will print the outputs as shown 
 * in the sample run. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/19/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.10
 */

import java.util.Scanner;

public class EX10_CalcEnergy {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare variables
        double q, m, finalTemperature, initialTemperature;
        
        // gather user input and initialize variables
        System.out.print("Enter the amount of water in kilograms: ");
        m = input.nextDouble();
        
        System.out.print("Enter the initial temperature: ");
        initialTemperature = input.nextDouble();
        
        System.out.print("Enter the final temperature: ");
        finalTemperature = input.nextDouble();
        
        // calculate Q (energy) per the given formula
        q = m * (finalTemperature - initialTemperature) * 4184;
        
        // print output as shown in sample run
        System.out.println("The energy needed is " + q);
        
    }
}
