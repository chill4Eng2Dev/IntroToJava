/**
 * (Print distinct numbers) Write a program that reads in ten numbers and displays
 * the number of distinct numbers and the distinct numbers separated by exactly one
 * space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
 * Read a number and store it to an array if it is new. If the number is already in the
 * array, ignore it.) After the input, the array contains the distinct numbers. Here is
 * the sample run of the program:
 * 
 * ----------------------------------------------------------
 * Enter ten numbers: 1 2 3 2 1 6 3 4 5 2 [ENTER]
 * The number of distinct number is 6
 * The distinct numbers are: 1 2 3 6 4 5
 * ----------------------------------------------------------
 * 
 * Commentary: I will use linear search to check the entry to the arrays elements. I will
 * then print out count and values as shown in sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 10/15/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.5
 */

import java.util.Scanner;

public class EX05_PrintDistinctNumbers {
    
    public static void main(String[] args) {
        
        // create scanner and array
        Scanner input = new Scanner(System.in);
        int[] distNums = new int[10];
        
        // gather user inputs and check if value is distinct, if it is, assign and increment count
        System.out.print("\nEnter ten numbers: ");
        int value = 0;
        int count = 0;
        for (int i = 0; i < distNums.length; i++) {
            value = input.nextInt();
            if (linearSearch(distNums, value) < 0) {
                distNums[count] = value;
                count++;
            }
        }
        
        // print count
        System.out.println("The number of distinct number is " + count);
        
        // print distinct numbers
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++)
            System.out.print(distNums[i] + " ");
        
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

