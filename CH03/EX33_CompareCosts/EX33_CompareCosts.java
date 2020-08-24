/**
 * (Financial: compare costs) Suppose you shop for rice in two different packages.
 * You would like to write a program to compare the cost. The program prompts the
 * user to enter the weight and price of each package and displays the one with 
 * the better price. Here is a sample run:
 * 
 * ------------------------------------------------------
 * Enter weight and price for package 1: 50 24.59 [ENTER]
 * Enter weight and price for package 2: 25 11.99 [ENTER]
 * Package 2 has a better price.
 * ------------------------------------------------------
 * ------------------------------------------------------
 * Enter weight and price for package 1: 50 24.59 [ENTER]
 * Enter weight and price for package 2: 25 11.99 [ENTER]
 * Two packages have the same price.
 * ------------------------------------------------------
 * 
 * Commentary: I will need to calculate a unit price for each package and compare the
 * values using an if statement. Then print output as shown in sample runs. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/24/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.33
 */

import java.util.Scanner;

public class EX33_CompareCosts {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize variables with user input; package 1
        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        
        // declare and initialize variable with user input; package 2
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble(); 
        
        // calculate the unit price for each package
        double unitPrice1 = price1 / weight1;
        double unitPrice2 = price2 / weight2;
        
        // determine verdict and print output as shown in sample run
        if (unitPrice1 > unitPrice2 )
            System.out.println("Package 2 has a better price.");
        else if  (unitPrice1 == unitPrice2)
            System.out.println("Two packages have the same price.");
        else
            System.out.println("Package 1 has a better price.");
    }
}
