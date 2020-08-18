/**
 * (Occurences of a specified character in an array) Write a recursive method that
 * finds the number of occurrences of a specified character in an array. You need to
 * define the following two methods. The second one is a recursive helper method.
 *
 * public static int count(char[] chars, char ch)
 * public static int count(char[] chars, char ch, int high)
 *
 * Write a test program that prompts the user to enter a list of characters in one line,
 * and a character, and displays the number of occurences of the character in the list.
 *
 * Commentary: I will need to use .toCharArray() method to create a char array from
 * user input. High will be the length of the array minus 1 to match the array index.
 * Base case will be when index is less than zero. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/17/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 18.17
 */
 
import java.util.Scanner;
 
public class EX17_CountCharsInArray {
 
   public static void main(String[] args) {
      
      // create scanner
      Scanner input = new Scanner(System.in);
      
      // gather user input for char array
      System.out.println("Please enter list of characters in one line: ");
      char[] chars = input.nextLine().toCharArray();
      
      // gather char input from user to compare for counter
      System.out.println("Please enter char to count the ocurences in the array: ");
      char ch = input.nextLine().charAt(0);
   
      // show char that was counted and the count
      System.out.print("The number of times '" + ch + "' is found in the array is: " + count(chars, ch));
   
   }
 
   // recursive method and develop new parameter for help
   public static int count(char[] chars, char ch) {
      int high = chars.length - 1;
      return count(chars, ch, high);
   }
 
   // helper recursive method
   public static int count(char[] chars, char ch, int high) {
   
      int counter = 0;
   
      if (high < 0)  // base case
         return counter;
      else if(Character.toLowerCase(ch) == Character.toLowerCase(chars[high])) { // compare char with char in array
         counter++;
         return counter + count(chars, ch, high - 1); // increment counter and call next counter recursive method
      } else
         return count(chars, ch, high - 1); // check next char without incrementing counter
   }
 
}