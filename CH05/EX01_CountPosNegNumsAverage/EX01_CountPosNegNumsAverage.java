/**
 * (Count positive and negative numbers and compute the average of numbers) Write
 * a program that reads an unspecified number of integers, determines how many
 * positive and negative values have been read, and computes the total and average of
 * the input values (not counting zeros). Your program ends with the input 0. Display
 * the average as a floating-point number. Here is a sample run:
 * 
 * ---------------------------------------------------------------
 * Enter an integer, the input ends if it is 0: 1 2 -1 3 0 [ENTER]
 * The number of positives is 3
 * The number of negatives is 1
 * The total is 5.0
 * The average is 1.25
 * ---------------------------------------------------------------
 * ---------------------------------------------------------------
 * Enter an integer, the input ends if it is 0: 0 [ENTER]
 * No numbers are entered except 0
 * ---------------------------------------------------------------
 * 
 * Commentary: I will need an if loop and check if first entry is 0 for first entry to show what is
 * listed in the sample run. I will need a while loop to gather user entries. Each entry will be checked
 * and a counter will increase for positive and negative values. A variable for total and 
 * average will be initialized with the values entered. I will print output as shown in sample
 * run.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/31/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.1
 */

import java.util.Scanner;

public class EX01_CountPosNegNumsAverage {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // initialize variables
        int posCount = 0, negCount = 0; 
        double total = 0, average = 0;
        
        // gather first user input
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int value = input.nextInt();
        
        // terminate program if first entry is 0
        if (value == 0) {
            System.out.println("No numbers are entered except 0.");
        } else {
            
            // if value not 0, keep counting and adding to value
            while (value != 0) {
                
                if(value > 0)
                    posCount++;
                else
                    negCount++;
                    
                total += value;
                
                value = input.nextInt();
            }
            
            // calculate average with both positive and negative counts
            average = total / (posCount + negCount);
            
            // print output as shown in sample run
            System.out.println("The number of positives is " + posCount);
            System.out.println("The number of negatives is " + negCount);
            System.out.println("The total is " + total);
            System.out.printf("The average is %-1.2f\n", average);
            
        }
    }
}
