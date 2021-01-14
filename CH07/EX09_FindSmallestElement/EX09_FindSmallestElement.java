/**
 * (Find the smallest element) Write a method that finds the smallest element in an
 * array of double values using the following header:
 * 
 * public static double min(double[] array)
 * 
 * Write a test program that prompts the user to enter ten numbers, invokes this
 * method to return the minimum value, and displays the minimum value. Here is a
 * sample run of the program:
 * 
 * ---------------------------------------------------------
 * Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2 [ENTER]
 * The minimum number is: 1.5
 * ---------------------------------------------------------
 * 
 * Commentary: The min method will compare the current element cycled in the array to
 * a min variable and reassign min variable should a smaller entry is found. I will print
 * output as shown in the sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 10/16/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.9
 */

import java.util.Scanner;

public class EX09_FindSmallestElement {

    public static void main(String[] args) {
        
        // create scanner
        Scanner input = new Scanner(System.in);
        
        // create array and declare value variable
        double[] values = new double[10];
        double value;
        
        // assign user input to array
        System.out.print("\nEnter ten numbers: ");
        for (int i = 0; i < values.length; i++) {
           value = input.nextDouble();
           values[i] = value;
        }
        
        // print min output as described in exercise
        System.out.println("The minimum number is: " + min(values));
    }
    
    // method that returns the minimum value entered in an array
    public static double min(double[] array) {
        double min = array[0]; // start min value at start of array
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
            }
            
        return min;
     }
}

