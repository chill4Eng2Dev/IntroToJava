/**
 * (Cost of driving) Write a program that prompts the user to enter the distance to
 * drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
 * and displays the cost of the trip. Here is a sample run:
 * 
 * -----------------------------------------
 * Enter the driving distance: 900.5 [ENTER] 
 * Enter miles per gallon: 25.5 [ENTER]
 * Enter price per gallon: 3.55 [ENTER]
 * The cost of driving is $125.36
 * -----------------------------------------
 *  
 * Commentary: I will need to create a few variables of type double. I will need to do 
 * basic arithmetic to calculate the driving cost. Problem statement does not provide
 * distance units (miles or feet) but I will assume miles, so no conversion is necessary.
 * I will show my output as shown in the sample run. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/19/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.23
 */

import java.util.Scanner;

public class EX23_CostOfDriving {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare variables
        double distance, milesPerGallon, pricePerGallon, cost;
        
        // initialize variables from user input
        System.out.print("Enter the driving distance: ");
        distance = input.nextDouble();
        
        System.out.print("Enter miles per gallon: ");
        milesPerGallon = input.nextDouble();
        
        System.out.print("Enter price per gallon: ");
        pricePerGallon = input.nextDouble();
        
        // calculate cost from user entries
        cost = distance / milesPerGallon * pricePerGallon;
        
        // print output of cost as shown in sample run
        System.out.println("The cost of driving is $" + cost);
        
    }
}
