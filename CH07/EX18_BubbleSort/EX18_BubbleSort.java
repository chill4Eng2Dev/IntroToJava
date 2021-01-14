/**
 * (Bubble sort) Write a sort method that uses the bubble-sort algorithm. The bubblesort
 * algorithm makes several passes through the array. On each pass, successive
 * neighboring pairs are compared. If a pair is not in order, its values are swapped;
 * otherwise, the values remain unchanged. The technique is called a bubble sort or
 * sinking sort because the smaller values gradually “bubble” their way to the top
 * and the larger values “sink” to the bottom. Write a test program that reads in ten
 * double numbers, invokes the method, and displays the sorted numbers.
 * 
 * Commentary: I am confused from the description what is "top" or "bottom" in an array
 * but I will assume the list needs to be sorted in ascending order. I will need to start
 * from 0 each time I look through the list and decrement the amount of checks at the end
 * of the array, as they are already sorted. I will then print out the numbers as requested
 * in the problem statement.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/9/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.18
 */

import java.util.Scanner;

public class EX18_BubbleSort {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] values = new int[10];
        
        // assign user inputs to array
        System.out.print("\n\nEnter 10 numbers to be sorted: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }
        
        // print array as entered
        System.out.print("Numbers entered before sorting: ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        
        // call method to sort values
        bubbleSort(values);
        
        // print sorted values within array
        System.out.print("\nNumbers sorted using Bubble Sort Method: ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
    }
    
    // method bubble sort, used to sort values in ascending order
    public static void bubbleSort(int[] values) {
        int temp;
        boolean nextPass = true;
        
        for (int i = 1; i < values.length && nextPass; i++) {       // terminate loop if at end of array or a new pass is not needed
            nextPass = false;
            for (int j = 0; j < values.length - i; j++) {
                if (values[j] > values[j + 1]) {    // current value greater than the next? swap values
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                    nextPass = true; 
                }
            }
        }
        
        
    }
        
        
        
}
