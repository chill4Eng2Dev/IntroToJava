
/**
 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of 
 * health on weight. It can be calculated by taking your weight in kilograms 
 * and dividing by the square of your height in meters. Write a program that
 * prompts the user to enter a weight in pounds and height in inches and displays
 * the BMI. Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 * Here is a sample run:
 *  
 * ------------------------------------
 * Enter weight in pounds: 95.5 [ENTER]
 * Enter height in inches: 50 [ENTER]
 * BMI is 26.8573
 * ------------------------------------
 * 
 * Commentary: I will need to create constant variables and other variables to calculate
 * BMI. I will need to use the math class. I will use the formula provided in the problem
 * statement to calculate BMI. I will show my output as shown in the sample run. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/19/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.14
 */

import java.util.Scanner;

public class EX14_ComputeBMI {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and/or initialize variables
        final double POUND_TO_KILO = 0.45359237;
        final double INCH_TO_METER = 0.0254;
        double weight, height, BMI;
        
        // initialize variable with user input
        System.out.print("Enter weight in pounds: ");
        weight = input.nextDouble();
        
        // initialize variable with user input
        System.out.print("Enter height in inches: ");
        height = input.nextDouble();
        
        // calculate conversions and BMI
        weight *= POUND_TO_KILO;          // same as weight = weight * POUND_TO_KILO
        height *= INCH_TO_METER;          // same as weight = height * INCH_TO_METER  
        BMI = weight / Math.pow(height, 2);
        
        // print output of BMI as shown in sample run
        System.out.println("BMI is " + BMI);
    }
}

