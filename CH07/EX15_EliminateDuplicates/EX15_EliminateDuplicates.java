/**
 * (Eliminate duplicates) Write a method that returns a new array by eliminating the
 * duplicate values in the array using the following method header:
 * 
 * public static int[] eliminateDuplicates(int[] list)
 * 
 * Write a test program that reads in ten integers, invokes the method, and displays
 * the result. Here is the sample run of the program:
 * 
 * ------------------------------------------------------
 * Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
 * The distinct numbers are: 1 2 3 6 4 5
 * ------------------------------------------------------
 * 
 * Commentary: I will need to pass the user supplied list into a method that will 
 * use a for loop and linear search to determine if a value is already in the new list.
 * If not, the element will be added to the new list. This list will be returned to the
 * passed through list. I will print output as shown in sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 10/16/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.15
 */

import java.util.Scanner;

public class EX15_EliminateDuplicates {

    public static void main(String[] args) {
        
        // create scanner
        Scanner input = new Scanner(System.in);
        
        // create array and variable for values
        int[] list = new int[10];
        int value;
        
        // assign user input to array
        System.out.print("\nEnter ten numbers: ");
        for (int i = 0; i < list.length; i++) {
           value = input.nextInt();
           list[i] = value;
        }
        
        // store eliminated duplicates into list
        list = eliminateDuplicates(list);
        
        // print distinct numbers
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < list.length; i++)
            if (list[i] > 0)
                System.out.print(list[i] + " ");
        
    }
    
    // method to remove duplicates, return unique elements as list
    public static int[] eliminateDuplicates(int[] list) {
        int[] noDupsList = new int[list.length];
        int count = 0;
        for (int i = 0; i < list.length; i++) { 
                if (linearSearch(noDupsList, list[i]) < 0) {
                    noDupsList[count] = list[i];
                    count++;
                }
            }
            
        return noDupsList;
    }
    // use linear search, if not found -1 is returned and is assigned to array
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }
}
