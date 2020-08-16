/**
 * (Print the characters in a string reversely) Write a recursive method
 * that displays a string reversely on the console using the following 
 * header:
 *
 * public static void reverseDisplay(String value)
 *
 * For exmaple, reverseDisplay("abcd") displays dcba. Write a test program
 * that prompts the user to enter a string and displays its reversal.
 *
 * Commentary: I will need to use a substring to lessen the string length
 * so that the recursion has a base case. I will print the last character of
 * the entered string first then drop the last character from the string
 * for each iteration after.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/16/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 18.9
 */
 
import java.util.Scanner;
 
public class EX09_StringReversed {
 
   public static void main(String[] args) {
      
      // create scanner
      Scanner input = new Scanner(System.in);
      
      // gather user input
      System.out.println("Please enter the string to be reversed: ");
      String value = input.nextLine();
   
      // show output from user input
      System.out.print("The string entered is " + value + " and when reversed is the following: ");
      reverseDisplay(value);
   
   }

   public static void reverseDisplay(String value) {
   
      if (value.length() > 0) {     // base case is when string length is 0
         System.out.print(value.charAt(value.length() - 1));   // print last char of string
         reverseDisplay(value.substring(0, value.length() - 1));  // remove last char of string each recursion call
      }
   
   }
}