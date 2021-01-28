/**
 * (Stopwatch) Design a class named StopWatch. The class contains:
 * 
 * ■ Private data fields startTime and endTime with getter methods.
 * ■ A no-arg constructor that initializes startTime with the current time.
 * ■ A method named start() that resets the startTime to the current time.
 * ■ A method named stop() that sets the endTime to the current time.
 * ■ A method named getElapsedTime() that returns the elapsed time for the
 * stopwatch in milliseconds.
 * 
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that measures the execution time of sorting 100,000 numbers using
 * selection sort.
 * 
 * Commentary: 
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/27/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 9.6
 */

public class EX06_TestStopWatch {

    public static void main(String[] args) {
        
        // declare array and and create object
        int[] array = new int[100000];
        StopWatch sw = new StopWatch();
        
        // initialize array
        for (int i = 0; i < array.length; i++)
            array[i] = (int)(Math.random() * 100000);
        
        // measure the time elapsed to sort the array
        sw.start();
        selectionSort(array);
        sw.stop();
        
        // print output as described in the problem statement
        System.out.println("The elapsed time of sorting 100,000 integers in an array is: " + sw.getElapsedTime());
            
    }
    
    // selection sort method for a one-dimensional array
     public static void selectionSort(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            int max = array[0];
            int index = 0;
            for (int j = 0; j <= i; j++) { // find max value and its index
                if (array[j] > max) {
                    max = array[j];
                    index = j;
                }
            }
          
            // swap max value with value in index i
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
