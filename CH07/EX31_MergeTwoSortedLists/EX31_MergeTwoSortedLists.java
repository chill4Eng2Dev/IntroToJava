/**
 * (Merge two sorted lists) Write the following method that merges two sorted lists
 * into a new sorted list.
 * 
 * public static int[] merge(int[] list1, int[] list2)
 *  
 * Implement the method in a way that takes at most list1.length + list2.
 * length comparisons. Write a test program that prompts the user to enter two
 * sorted lists and displays the merged list. Here is a sample run. Note that the first
 * number in the input indicates the number of the elements in the list. This number
 * is not part of the list.
 * 
 * --------------------------------------------
 * Enter list1: 5 1 5 16 61 111 [ENTER]
 * Enter list2: 4 2 4 5 6 [ENTER]
 * The merged list is 1 2 4 5 5 6 16 61 111
 * --------------------------------------------
 *
 * Commentary: There are two approaches I can use here; merge two sorted arrays and re-sort
 * the merged array with bubble sort or selection sort. Or, I can compare the two merging 
 * arrays and merge the values into the merged array using a comparator and decrement values
 * as necessary. First approach requires (2) for loops, the later method requires (1) for
 * loop. I will use the latter method and print outout as shown in sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/10/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.31
 */

import java.util.Scanner;

public class EX31_MergeTwoSortedLists {

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
            
        int[] list3 = merge(list1, list2);
        
        System.out.print("The merged list is ");
        for (int i = 0; i < list3.length; i++)
            System.out.print(list3[i] + " ");
    }
    
    public static int[] merge(int[] list1, int[] list2) {
        
        // create new merged array and initialize decrement variables
        int[] mergedList = new int[list1.length + list2.length];
        int j = list1.length - 1;
        int k = list2.length - 1;
        
        // start at end of list and check each array position for max value
        for (int i = mergedList.length - 1; i >= 0; i--) {
            if (list1[j] > list2[k]) {
                mergedList[i] = list1[j];
                if ((j - 1) < 0)    // stops an out of bounds error
                    j = 0;
                else
                    j--;
            } else {
                mergedList[i] = list2[k];
                if ((k - 1) < 0)    // stop an out of bounds error
                    k = 0;
                else
                    k--;
            }
        }
        
        // if the arrays are uneven, the last array variable can be missed
        // this if statement takes care of that issue
        if (list1.length > list2.length)
            mergedList[0] = list1[0];
        else
            mergedList[0] = list2[0];
            
        return mergedList;
    }
    
    
}
