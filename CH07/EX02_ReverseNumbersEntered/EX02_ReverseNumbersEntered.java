/**
 * (Reverse the numbers entered) Write a program that reads ten integers and displays
 * them in the reverse of the order in which they were read.
 * 
 * Commentary: I will create a for loop to assign array with user input. I will then
 * print out, in order, what the user entered, and print out what the user entered in
 * reverse.
 *
 * Author: chill4Eng2Dev 
 * Date: 10/14/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.2
 */

import java.util.Scanner;

public class EX02_ReverseNumbersEntered {
    
    public static void main(String[] args) {
        
        // create scanner and array
        Scanner input = new Scanner(System.in);
        int[] values = new int[10];
        
        // assign user inputs to array elements
        System.out.print("\nEnter ten integers: ");
        for (int i = 0; i < values.length; i++)
            values[i] = input.nextInt();
        
        // print array in order
        System.out.print("\nValues entered in order: ");
        for (int i = 0; i < values.length; i++)
            System.out.print(values[i] + " ");
        
        // print array in reverse order
        System.out.print("\nValue printed in reverse order: ");
        for (int i = values.length - 1; i >= 0; i--)
            System.out.print(values[i] + " ");
        
    }

}
