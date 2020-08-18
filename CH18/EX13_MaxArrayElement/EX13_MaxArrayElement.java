/**
 * (Find the largest number in an array) Write a recursive method that returns the
 * largest integer in an array. Write a test program that prompts the user to enter
 * a list of eight integers and displays the largest element. 
 *
 * Commentary: I will need to use a helper that stores the value of the max element
 * and another helper for the index to go through the array. The base case will be
 * when the array index has cycled through and less than 0. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/17/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 18.13
 */
 
import java.util.Scanner;
 
public class EX13_MaxArrayElement {
 
   public static void main(String[] args) {
      
      // create scanner
      Scanner input = new Scanner(System.in);
      
      // create int array for user input
      int[] values = new int[8]; 
   
      // gather user input and put integers in array
      System.out.println("Please enter 8 integers into the array: ");
      for(int i = 0; i < values.length; i++)
         values[i] = input.nextInt();
      
      // display the output using recursion
      System.out.println("The maximum value entered into the array is: " + max(values));
     
   }
 
   // take array inputs and expand recursive function with a helper, creating an index and a current "max"
   public static int max(int[] values) {
      return max(values, values.length - 1, values[values.length - 1]);
   }
   
   // helper recursive function
   public static int max(int[] values, int index, int max) {
      if (index < 0) // base case when index less than 0
         return max;
      else if (values[index] > max) 
         return max(values, index - 1, values[index]); // recursive call should a new max be found
      else
         return max(values, index - 1, max); // recursive call to check next index, max remains
   }
      
}