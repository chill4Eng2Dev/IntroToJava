/**
 * (Sorted?) Write the following method that returns true if the list is already sorted
 * in increasing order.
 * 
 * public static boolean isSorted(int[] list)
 * 
 * Write a test program that prompts the user to enter a list and displays whether
 * the list is sorted or not. Here is a sample run. Note that the first number in the
 * input indicates the number of the elements in the list. This number is not part
 * of the list.
 * 
 * -------------------------------------------------
 * Enter list: 8 10 1 5 16 61 9 11 1 [ENTER]
 * The list is not sorted
 * -------------------------------------------------
 * 
 * -------------------------------------------------
 * Enter list: 10 1 1 3 4 4 5 7 9 11 21 [ENTER]
 * The list is already sorted
 * -------------------------------------------------
 * 
 * Commentary: I will need to check if a swap will need to occur when comparing values
 * in the array list. If a swap is required, then the list is not sorted, and I will break
 * the check and return a false boolean, otherwise true. I print output as shown in sample
 * run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/9/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.19
 */

import java.util.Scanner;

public class EX19_Sorted {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // first entry used to assign array size
        System.out.print("\nEnter list: ");
        int[] list = new int[input.nextInt()];
        
        // follow entries assigned to array values
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        
        // call isSorted method and print verdict
        System.out.println("The list is " + (isSorted(list) ? "already sorted" : "not sorted"));
    }
    
    // method to check if a list is sorted
    public static boolean isSorted(int[] list) {
        boolean sorted = true;
        
        // if a swap is necessary, break loop and return verdict, otherwise list is sorted
        for (int i = 0; i < list.length - 1; i++) { // minus 1 to length otherwise check goes out of array boundary
            if (list[i] > list[i + 1]){
                sorted = false;
                break;
            }
        }
        
        return sorted;
    }
}
