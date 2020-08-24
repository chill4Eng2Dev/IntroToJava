/**
 * (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, tolet the 
 * user enter weight, feet, and inches. For example, if a person is 5 feet and 10 inches, 
 * you will enter 5 for feet and 10 for inches. Here is a sample run:
 * 
 * -----------------------------------
 * Enter weight in pounds: 140 [ENTER]
 * Enter feet: 5 [ENTER]
 * Enter inches: 10 [ENTER]
 * BMI is 20.087702275404553
 * Normal
 * -----------------------------------
 *  
 * Commentary: I will need to add a new input variable and convert feet to inches, then
 * convert inches to meters using the code from Listing 3.4. I will print the output 
 * as shown in the sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/21/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.6
 */

import java.util.Scanner;

public class EX06_HealthAppBMI {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        
        // Prompt the user to enter feet
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        
        // Prompt the user to enter inches
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();
        
        final double KILOGRAMS_PER_POUND = 0.45359237; // constant
        final double METERS_PER_INCH = 0.0254; // constant
        
        // compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = (feet * 12 + inches) * METERS_PER_INCH; // convert feet to inches, inches to meters
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        
        // display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
        

}
