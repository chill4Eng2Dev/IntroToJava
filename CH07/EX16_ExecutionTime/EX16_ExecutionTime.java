/**
 * (Execution time) Write a program that randomly generates an array of 100,000
 * integers and a key. Estimate the execution time of invoking the linearSearch
 * method in Listing 7.6. Sort the array and estimate the execution time of invoking
 * the binarySearch method in Listing 7.7. You can use the following code
 * template to obtain the execution time:
 * 
 * long startTime = System.currentTimeMillis();
 * perform the task;
 * long endTime = System.currentTimeMillis();
 * long executionTime = endTime - startTime;
 * 
 * Commentary: The start and end times populated were equal nearly every time and did
 * not show a different in complexity to run. I am curious if that has something to do
 * with my processor and how data is handled now in memory? Not sure. I will add listing
 * 7.6 and 7.7 and check execution time for linear search and binary search. What takes
 * the most time is the sorting. I will print output as stated in problem statement.
 * 
 * Author: chill4Eng2Dev 
 * Date: 10/16/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.16
 */

public class EX16_ExecutionTime {
    
    public static void main(String[] args) {
        
        // create array
        int amount = 100000;
        int[] randomNums = new int[amount];
        
        // assign random nums to array
        for (int i = 0; i < randomNums.length; i++)
            randomNums[i] = (int)(Math.random() * amount);
        
        // generate random key to be searched
        int key = (int)(Math.random() * amount);
        
        // check execution time for linear search
        long startTime = System.currentTimeMillis();
        boolean found = (linearSearch(randomNums, key) > 0 ? true : false);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        
        // print output of execution
        System.out.println("\nThe time taken to perform linear search was " + executionTime);
        
        // sort random nums array in ascending order
        selectionSort(randomNums);
        
        // check execution time for binary search
        startTime = System.currentTimeMillis();
        found = (binarySearch(randomNums, key) > 0 ? true : false);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        
        // print output of execution time
        System.out.println("\nThe time taken to perform binary search was " + executionTime);
        
    }
    
    // method to search for key within array in order
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }
    
    // method to select sort an array in ascending order
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;
            
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin < list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            
            // swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
         
    // binary search method to search a sorted list
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1 - 1; // now high < low, key not found
    }
}

