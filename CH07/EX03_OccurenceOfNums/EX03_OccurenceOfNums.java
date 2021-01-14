/**
 * (Count occurrence of numbers) Write a program that reads the integers between 1
 * and 100 and counts the occurrences of each. Assume the input ends with 0. Here
 * is a sample run of the program:
 * 
 * --------------------------------------------------------------------
 * Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0 [ENTER]
 * 2 occurs 2 times
 * 3 occurs 1 time
 * 4 occurs 1 time
 * 5 occurs 2 times
 * 6 occurs 1 time
 * 23 occurs 1 time
 * 43 occurs 1 time
 * --------------------------------------------------------------------
 * 
 * Note that if a number occurs more than one time, the plural word “times” is used
 * in the output.
 * 
 * Commentary: I will need to have a while loop to validate entries until termination
 * from the user. I will then print output as shown in sample run using for loop. The
 * approach use here could be adjusted and simplified if I were to consider the array
 * as [101] instead of [100]. I could then assign the entry to the index of the array
 * without manipulating the array entry as an index - 1. However, I am unsure of common
 * practices and whether this is appropriate in a professional setting - so I will follow
 * the books processes. 
 *
 * Author: chill4Eng2Dev 
 * Date: 10/15/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.3
 */

import java.util.Scanner;

public class EX03_OccurenceOfNums {
    
    public static void main(String[] args) {
        
        // create array
        int[] counted = new int[100];
        
        // call occurences method to count entries from user input
        occurences(counted);
        
        // for loop to print output as stated in sample run
        for (int i = 0; i < counted.length; i++) {
            if (counted[i] > 0)
                System.out.println((i + 1) + " occurs " + counted[i] + ((counted[i] == 1) ? " time" : " times"));
        }
        
    }
    
    // method to count occurences from user input
    public static void occurences(int[] counted) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the integers between 1 and 100: ");
        
        // while loop to terminate at 0, and to check if value is between 1-100
        int value = -1;
        while (value != 0) {
            value = input.nextInt();
            if (value >= 1 && value <= 100)
                counted[value - 1]++;
        }
    }
   
}
