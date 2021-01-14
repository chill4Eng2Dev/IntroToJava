/**
 * (Partition of a list) Write the following method that partitions the list using the
 * first element, called a pivot.
 * 
 * public static int partition(int[] list)
 * 
 * After the partition, the elements in the list are rearranged so that all the elements
 * before the pivot are less than or equal to the pivot and the elements after the pivot
 * are greater than the pivot. The method returns the index where the pivot is located
 * in the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8}. After the partition,
 * the list becomes {3, 2, 5, 9, 6, 8}. Implement the method in a way that takes
 * at most list.length comparisons. Write a test program that prompts the user
 * to enter a list and displays the list after the partition. Here is a sample run. Note
 * that the first number in the input indicates the number of the elements in the list.
 * This number is not part of the list.
 * 
 * -----------------------------------------------------
 * Enter list: 8 10 1 5 16 61 9 11 1 [ENTER]
 * After the partition, the list is 9 1 5 1 10 61 11 16
 * -----------------------------------------------------
 * 
 * Commentary: I will have a method that determines the pivot index as described in problem
 * statement. Note: I am not completely sure what "..Implement the method in a way that takes
 * at most list.length comparisons" means. I think it means only a for loop or while loop
 * to solve the issue (no nested loops). If that's that case, I am unable to have the output
 * match what is shown in the sample run. However, the output matches the problem description 
 * in concept which I believe is acceptable.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/11/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.32
 */

import java.util.Scanner;

public class EX32_PartitionOfList {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // assign user input to array declaration and initialization
        System.out.print("Enter list: ");
        int[] list = new int[input.nextInt()];
        
        for (int i = 0; i < list.length; i++)
            list[i] = input.nextInt();
            
        // call method to get pivot index
        int index = partition(list);
       
        // call new method to create the partition array
        int[] partList = getPartitionList(list, index);
       
        // print output of partitioned list as shown in sample run
        System.out.print("After the partition, the list is ");
        for (int i = 0; i < partList.length; i++)
            System.out.print(partList[i] + " ");
        System.out.println();     
    }
    
    // method partition to return index of pivot point
    public static int partition(int[] list) {
        int pivot = list[0];
        int pivotIndex = 0;
        
        for (int i = 1; i < list.length; i++) {
            if (pivot > list[i])
                pivotIndex++;
        }
        
        return pivotIndex;
    }       

    // method to return array of partitioned array using index of pivot point
    public static int[] getPartitionList(int[] list, int pivotPoint) {
        // declare multiple variable counters to traverse the array
        int pivot = list[0];
        int low = 0;
        int high = list.length - 1;
        int[] partList = new int[list.length];        
        
        for (int i = 0; i < partList.length; i++) {
            if (list[i] == pivot) {
                partList[pivotPoint] = pivot;
            } else if (list[i] < pivot) {
                partList[low] = list[i];
                low++;
            } else {
                partList[high] = list[i];
                high--;
            }
        }
        
        return partList;
    }
}
