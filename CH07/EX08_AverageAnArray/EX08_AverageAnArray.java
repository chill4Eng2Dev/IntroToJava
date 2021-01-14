/**
 * (Average an array) Write two overloaded methods that return the average of an
 * array with the following headers:
 * 
 * public static int average(int[] array)
 * public static double average(double[] array)
 * 
 * Write a test program that prompts the user to enter ten double values, invokes this
 * method, and displays the average value.
 * 
 * Commentary: Will proceed as described in problem statement. The method that fits the
 * parameters will override the other method and return the average. I will print output
 * as described in problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 10/16/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.8
 */

import java.util.Scanner;

public class EX08_AverageAnArray {
    
    public static void main(String[] args) {
        
        // create scanner
        Scanner input = new Scanner(System.in);
        
        // create array and declare value variable
        double[] values = new double[10];
        double value;
        
        // assign user input to array
        System.out.print("\nEnter ten inputs for the array: ");
        for (int i = 0; i < values.length; i++) {
           value = input.nextDouble();
           values[i] = value;
        }
        
        // print average output as described in exercise
        System.out.println("The average is: " + average(values));
    }

    // method to calculate average for int array with int return
    public static int average(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++)
            total = total + array[i];
        
        return total / array.length;
    }
    
    // method to calculate average for double array with double return (this will override)
    public static double average(double[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++)
            total = total + array[i];
        
        return total / array.length;
    }
}
