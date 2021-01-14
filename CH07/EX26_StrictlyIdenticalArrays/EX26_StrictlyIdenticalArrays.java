/**
 * (Strictly identical arrays) The arrays list1 and list2 are strictly identical
 * if their corresponding elements are equal. Write a method that returns true if
 * list1 and list2 are strictly identical, using the following header:
 * 
 * public static boolean equals(int[] list1, int[] list2)
 * 
 * Write a test program that prompts the user to enter two lists of integers and displays
 * whether the two are strictly identical. Here are the sample runs. Note that
 * the first number in the input indicates the number of the elements in the list. This
 * number is not part of the list.
 * 
 * --------------------------------------------------
 * Enter list1: 5 2 5 6 1 6 [ENTER]
 * Enter list2: 5 2 5 6 1 6 [ENTER]
 * Two lists are strictly identical
 * --------------------------------------------------
 * 
 * --------------------------------------------------
 * Enter list1: 5 2 5 6 6 1 [ENTER]
 * Enter list2: 5 2 5 6 1 6 [ENTER]
 * Two lists are not strictly identical
 * --------------------------------------------------
 *
 * Commentary: I will add an input prompt for the list size as I find the unspoken entry
 * a bit odd and bad user interface. If I chose to allow the user to input the size of the 
 * list as shown in the sample run, I would need to compare the list sizes prior to the 
 * element comparison within the equals method. Regardless, I will need to compare the elements
 * at one list index to the other and return the verdict (t/f). I will print output roughly as
 * shown in the sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 10/18/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.26
 */

import java.util.Scanner;

public class EX26_StrictlyIdenticalArrays {
    
    public static void main(String[] args) {
        
        // create scanner
        Scanner input = new Scanner(System.in);
        
        // assign capacity size of the lists from user input
        System.out.print("\nEnter the list capacity: ");
        int capacity = input.nextInt();
        
        // assign values to list1 from user
        System.out.print("Enter list1: ");
        int[] list1 = getList(capacity, input);
        
        // assign values to list2 from user
        System.out.print("Enter list2: ");
        int[] list2 = getList(capacity, input);
        
        // print output as shown in sample run using equals method
        System.out.println("Two lists are " + (equals(list1, list2) ? "" : "not ") + "strictly identical");
        
    }
    
    // method getList to retrieve user input and assign to list
    public static int[] getList(int size, Scanner input) {
        int[] list = new int[size];
        for(int i = 0; i < list.length; i++)
            list[i] = input.nextInt();
        
        return list;
    }
        
    // method to evaluate if the two lists are strictly equal
    public static boolean equals(int[] list1, int [] list2) {
        
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }
        
        return true;
    }
               
}
