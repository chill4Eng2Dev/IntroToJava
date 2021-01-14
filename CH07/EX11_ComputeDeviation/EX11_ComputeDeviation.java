/**
 * (Statistics: compute deviation) Programming Exercise 5.45 computes the standard
 * deviation of numbers. This exercise uses a different but equivalent formula to
 * compute the standard deviation of n numbers.
 * 
 * [SEE IMAGE IN FOLDER]
 * 
 * To compute the standard deviation with this formula, you have to store the individual
 * numbers using an array, so that they can be used after the mean is obtained.
 * Your program should contain the following methods:
 * 
 * // Compute the deviation of double values 
 * public static double deviation(double[] x)
 * 
 * // Compute the mean of an array of double values
 * public static double mean(double[] x)
 * 
 * Write a test program that prompts the user to enter ten numbers and displays the
 * mean and standard deviation, as shown in the following sample run:
 * 
 * -----------------------------------------------------------
 * Enter ten numbers: 1.9 2.5 3.7 2 1 6 3 4 5 2 [ENTER]
 * The mean is 3.11
 * The standard deviation is 1.55738
 * -----------------------------------------------------------
 *
 * Commentary: This one is fairly straight forward. I will create the methods as requested
 * in the problem statement and print output as shown in sample run.  
 * 
 * Author: chill4Eng2Dev 
 * Date: 10/16/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.11
 */

import java.util.Scanner;

public class EX11_ComputeDeviation {
    
    public static void main(String[] args) {
        
        // create scanner
        Scanner input = new Scanner(System.in);
        
        // create array and declare variable for values
        double[] values = new double[10];
        double value;
        
        // assign user input to array
        System.out.print("\nEnter ten numbers: ");
        for (int i = 0; i < values.length; i++) {
           value = input.nextDouble();
           values[i] = value;
        }
        
        // print output as shown in sample run
        System.out.println("The mean is " + mean(values));
        System.out.println("The standard deviation is " + deviation(values));
        
    }
    
    // method to calculate the mean from the values stored in the array
    public static double mean(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++)
            sum = sum + x[i];
            
        return sum / x.length;
    }
    
    // method to calculate the standard deviation from the values in array and mean
    public static double deviation(double[] x) {
        double squareSum = 0;
        double meanValue = mean(x); // call and store mean value
        for (int i = 0; i < x.length; i++)
            squareSum = squareSum + Math.pow(x[i] - meanValue, 2);  // calculate numerator of formula
        
        return Math.sqrt(squareSum / (x.length - 1));   // return the rest of the calculation as std dev.
    }
}
