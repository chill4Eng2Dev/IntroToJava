/**
 * (Identical arrays) The arrays list1 and list2 are identical if they have the
 * same contents. Write a method that returns true if list1 and list2 are identical,
 * using the following header:
 * 
 * public static boolean equals(int[] list1, int[] list2)
 * 
 * Write a test program that prompts the user to enter two lists of integers and displays
 * whether the two are identical. Here are the sample runs. Note that the first
 * number in the input indicates the number of the elements in the list. This number
 * is not part of the list.
 * 
 * --------------------------------------------------
 * Enter list1: 5 2 5 6 6 1 [ENTER]
 * Enter list2: 5 5 2 6 1 6 [ENTER]
 * Two lists are identical
 * --------------------------------------------------
 * 
 * --------------------------------------------------
 * Enter list1: 5 5 5 6 6 1 [ENTER}
 * Enter list2: 5 2 5 6 1 6 [ENTER]
 * Two lists are not identical
 * --------------------------------------------------
 *
 * Commentary: I believe the easiest way to compare the arrays is to determine first if they
 * are of the same length, next, will be to sort each list. Once each list is sorted, compare
 * the two lists. I will then print verdict as shown in sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/9/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.27
 */

import java.util.Scanner;

public class EX27_IdenticalArrays {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // initialize list1 size
        System.out.print("\nEnter list1: ");
        int[] list1 = new int[input.nextInt()];
        
        // assign user inputs to array
        for (int i = 0; i < list1.length; i++)
            list1[i] = input.nextInt();
            
        // initialize list2 size
        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];
        
        // assign user inputs to array
        for (int i = 0; i < list2.length; i++)
            list2[i] = input.nextInt();
            
        // compare both lists and print verdict
        System.out.println("Two lists are " + (equals(list1, list2) ? "" : "not ") + "identical");
        
    }
    
    // method to compare two lists and determine if equal
    public static boolean equals(int[] list1, int[] list2) {
        boolean verdict = false;
        
        // use bubbleSort to sort each list
        list1 = bubbleSort(list1);
        list2 = bubbleSort(list2);
        
        if (list1.length == list2.length) {
            verdict = true;
            for (int i = 0; i < list1.length; i++) {
                if (list1[i] != list2[i]) {
                    verdict = false;
                    break;
                }
            }
        }
        return verdict;
    }
    
    // method bubble sort, used to sort values in ascending order
    public static int[] bubbleSort(int[] values) {
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
        
        return values;
    }
}
