
/**
 * (Cost of shipping) A shipping company uses the following function to calculate
 * the cost (in dollars) of shipping based on the weight of the package (in pounds).
 * 
 *   c(w) = { 3.5, if 0 < w <= 1
 *          { 5.5, if 1 < w <= 3
 *          { 8.5, if 3 < w <= 10
 *          { 10.5, if 10 < w <= 20
 * 
 * Write a program that prompts the user to enter the weight of the package and
 * display the shipping cost. If the weight is greater than 50, display a message "the
 * package cannot be shipped."
 * 
 * Commentary: I will need to use an if-else statement to cycle through the potential
 * options based on the user entry. The question is a bit confusing as there is nothing
 * to be done should the package weigh more than 20 lbs but less that 50 lbs, I assume
 * this is a typo... But I will follow the instructions. I will print output as stated 
 * in the description. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/22/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.18
 */

import java.util.Scanner;

public class EX18_CostOfShipping {
    
    public static void main(String[] args) {
        
    // create a scanner
    Scanner input = new Scanner(System.in);
    
    // declare and initialize variable with user input
    System.out.print("Enter weight of package: ");
    double weight = input.nextDouble();
    
    // if-else statement to check cost using formula from problem statement
    if (weight > 50 || weight < 0)  // check if package weight more than 50 lbs or is a negative number
        System.out.println("The package cannot be shipped.");
    else if (weight <= 1)
        System.out.println("The shipping cost is $3.50.");
    else if (weight <= 3)
        System.out.println("The shipping cost is $5.50.");
    else if (weight <= 10)
        System.out.println("The shipping cost is $8.50.");
    else if (weight <= 20)
        System.out.println("The shipping cost is $10.50.");
    else
        System.out.println("Unknown cost to weight calculation."); // if the weight is between 20-50 lbs, return this message
        
    }
        

}
