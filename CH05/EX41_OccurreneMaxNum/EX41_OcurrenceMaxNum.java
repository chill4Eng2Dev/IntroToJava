/**
 * (Occurrence of max numbers) Write a program that reads integers, finds the largest
 * of them, and counts its occurrences. Assume that the input ends with number
 * 0. Suppose that you entered 3 5 2 5 5 5 0; the program finds that the largest
 * is 5 and the occurrence count for 5 is 4.
 * 
 * (Hint: Maintain two variables, max and count. max stores the current max number,
 * and count stores its occurrences. Initially, assign the first number to max
 * and 1 to count. Compare each subsequent number with max. If the number is
 * greater than max, assign it to max and reset count to 1. If the number is equal to
 * max, increment count by 1.)
 * 
 * ---------------------------------------------------
 * Enter numbers: 3 5 2 5 5 5 0 [ENTER]
 * The largest number is 5
 * The occurrence count of the largest number is 4
 * ---------------------------------------------------
 * 
 * Commentary: I assume negative numbers are allowed so I did not create a parameter
 * to control the user input here. I will check if the first entry is zero and let
 * the user know they'll need to try again. If-else statement within a for loop
 * to count or reassign the max value. I will print output as shown in sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/2/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.41
 */

import java.util.Scanner;

public class EX41_OcurrenceMaxNum {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign first entry to variable
        System.out.print("Enter numbers: ");
        int nums = input.nextInt();
        
        // check if first entry is not zero
        if(nums != 0) {
            int max = nums; // assign count and max to first entry if not zero
            int count = 1;
            while(nums != 0) {  // sentinel while loop
                nums = input.nextInt();
                if (nums > max) {   // reassign max and count
                    count = 1;
                    max = nums;
                } else if (nums == max) // increase count
                    count++;
            }  
            
            // print output as shown in sample run
            System.out.println("The largest number is " + max);
            System.out.println("The occurrence count of the largest number is " + count);
            
        } else      // if first entry is zero, less user know to try again
            System.out.print("First entry is zero. Please try again.");
        
    }    
    
}
