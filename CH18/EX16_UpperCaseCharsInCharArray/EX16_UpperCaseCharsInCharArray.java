/**
 * (Find the number of uppercase letters in an array) Write a recursive method
 * to return the number of uppercase letters in an array of characters. You need
 * to define the following two methods. The second one is a recursive helper method.
 *
 * public static int count(char[] chars)
 * public static int count(char[] chars, int high)
 * 
 * Write a test program that prompts the user to enter a list of characters in one line
 * and displays the number of uppercase letters in the list. 
 *
 * Commentary: I will need to use .toCharArray() method to create a char array from
 * user input. High will be the length of the array minus 1 to match the array index.
 * Base case will be when index is less than zero. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/17/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 18.16
 */
 
import java.util.Scanner;
 
public class EX16_UpperCaseCharsInCharArray {
 
   public static void main(String [] args) {
   
      // create scanner
      Scanner input = new Scanner(System.in);
      
      // gather input from user
      System.out.println("Enter characters for array in one line: ");
      char[] a = input.nextLine().toCharArray();
      
      // show output count of all capital chars
      System.out.println("The number of capital letters entered into the array is: " + count(a));
            
   }
   
   // recursive method and create parameter for helper
   public static int count(char[] a) {
      int high = a.length - 1;
      return count(a, high);
   }
   
   // helper recursive method
   public static int count(char[] a, int high) {
      int counter = 0; // initialize capital char counter
      if(high < 0) // base case
         return counter;
      else if(Character.isLetter(a[high]) && Character.isUpperCase(a[high])) { // had to add "isLetter" because spaces sometimes threw the count off
         counter++; // increment counter
         return counter + count(a, high - 1); // add counter (1) to the recursive call count
      } else
         return count(a, high - 1); // char not match, count still 0, use recursion to compare next char
      
   }
   
}