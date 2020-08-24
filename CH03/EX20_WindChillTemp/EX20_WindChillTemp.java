/**
 * (Science: wind-chill temperature) Programming Exercise 2.17 gives a formula
 * to compute the wind-chill temperature. The formula is valid for temperatures in
 * the range between -58F and 41F and wind speed greater than or equal to 2.
 * Write a program that prompts the user to enter a temperature and a wind speed.
 * The program displays the wind-chill temperature if the input is valid; otherwise,
 * it displays a message indicating whether the temperature and/or wind speed is
 * invalid.
 * 
 * Commentary: I will need to use if statements to check the users input and make sure
 * the values are within the acceptable parameters. This will require nested if
 * statements within an if-else statement. Print the output of the wind chill otherwise. 
 * I will match the sample run output as listed in 2.17 and the problem requirements.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/23/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.20
 */

import java.util.Scanner; 

public class EX20_WindChillTemp {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize variable with user input
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double ta = input.nextDouble();
        
        // declare and initialize variable with user input
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double v = input.nextDouble();
        
        // check if any parameter is invalid
        if (ta < -58 || ta > 41 || v < 2) {
            
            System.out.print("The ");
            if (ta < -58 || ta > 41)    // check temp
                System.out.print("temperature ");
                
            if (ta < -58 || ta > 41 && v < 2)   // check temp and wind speed
                System.out.print("and ");
                
            if (v < 2)  // check just wind speed
                System.out.print("wind speed ");
            
            System.out.println("is invalid.");
            System.exit(1);
            
        } else {
            // calculate wind-chill per the provided equation
            double twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v, 0.16);
        
            // print output of wind chill as shown in sample run
            System.out.println("The wind chill index is " + twc);
        }
    }
}
