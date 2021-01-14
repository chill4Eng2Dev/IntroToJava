/**
 * (Revise selection sort) In Section 7.11, you used selection sort to sort an array.
 * The selection-sort method repeatedly finds the smallest number in the current
 * array and swaps it with the first. Rewrite this program by finding the largest number
 * and swapping it with the last. Write a test program that reads in ten double
 * numbers, invokes the method, and displays the sorted numbers.
 * 
 * Commentary: I will use listing 7.11 and reverse much of the algorithm used to sort the
 * array using the max values. I will start at the end of the array, searching for the max
 * value for each passing, swapping as necessary to sort the values. I will print output
 * as shown in List 7.11.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/9/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.20
 */

import java.util.Scanner;

public class EX20_ReviseSelectionSort {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        
        // assign user inputs to the array
        System.out.print("\n\nEnter numbers to be sorted: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        
        // sort values within array using the modified selection sort
        selectionSort(numbers);
        
        // print sorted array
        System.out.print("The sorted list is: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    
    // method selection sort that sorts values by finding the max value and starting at the end of the array
    public static void selectionSort(int[] numbers) {
        for (int i = numbers.length - 1; i > 0; i--) {
            // Find the max in the list
            int currentMax = numbers[i];
            int currentMaxIndex = i;

            // reassign max value and index when found
            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < numbers[j]) {
                    currentMax = numbers[j];
                    currentMaxIndex = j;
                }
            }

            // Swap list[i] with list[currentMaxIndex] if necessary
            if (currentMaxIndex != i) {
                numbers[currentMaxIndex] = numbers[i];
                numbers[i] = currentMax;
            }
        }
    }
}
