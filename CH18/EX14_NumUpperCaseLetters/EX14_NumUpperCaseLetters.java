/**
 * (Find the number of upper case letters in a string) Write a recursive method
 * to return the number of uppercase letters in a string. Write a test program that
 * prompts the user to enter a string and displays the number of uppercase letters
 * in the string.
 *
 * Commentary: I will need to use a helper method to count and increment the number
 * of times an upper case letter is found. I will need another helper to be the index
 * of the string and check each character individually. The base case will be when
 * the array index is less than 0.  
 *
 * Author: chill4Eng2Dev 
 * Date: 8/17/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 18.14
 */
 
import java.util.Scanner;
 
public class EX14_NumUpperCaseLetters {

   public static void main(String[] args) {
   
      // create scanner
      Scanner input = new Scanner(System.in);
   
      // ask user for input string
      System.out.println("Please enter a string to have the upper case letters counted: ");
      String str = input.nextLine();
      
      // show output of uppercase count recursion method
      System.out.println("The number of upper case letters in string " + str + " is: " + upperCaseCount(str));
   
   }
 
   // recursive method and setting up method for helper
   public static int upperCaseCount(String str) {
      int count = 0;
      int index = str.length() - 1;
      return upperCaseCount(str, index, count);
   }
 
   // helper method with two more parameters
   public static int upperCaseCount(String str, int index, int count) {
      if (index < 0)    // base case
         return count;
      else if(Character.isUpperCase(str.charAt(index))) // check if character in string upper case and count it if it is
         return upperCaseCount(str, index - 1, count + 1);
      else
         return upperCaseCount(str, index - 1, count); // if no upper case, move to next index of string
   
   }
}