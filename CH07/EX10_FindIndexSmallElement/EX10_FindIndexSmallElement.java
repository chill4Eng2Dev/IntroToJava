/**
 * (Find the index of the smallest element) Write a method that returns the index of
 * the smallest element in an array of integers. If the number of such elements is
 * greater than 1, return the smallest index. Use the following header:
 * 
 * public static int indexOfSmallestElement(double[] array)
 * 
 * Write a test program that prompts the user to enter ten numbers, invokes this
 * method to return the index of the smallest element, and displays the index.
 * 
 * Commentary: I will need to complete the same methodology as shown in Exercise 7.9. 
 * I will need to add a new variable to store the index of the minimum value found and
 * return said variable. I will print output as described in problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 10/16/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.10
 */

import java.util.Scanner;

public class EX10_FindIndexSmallElement {

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
        System.out.println("The minimum number at the following index is: " + indexOfSmallestElement(values));
    }
    
    // method that returns the minimum index when comparing values entered into an array
    public static int indexOfSmallestElement(double[] array) {
        double min = array[0]; // start min value at start of array
        int index = 0; // start min index at first array element
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
            
        return index;
     }
}
