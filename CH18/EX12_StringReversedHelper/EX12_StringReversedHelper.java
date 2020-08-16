/**
 * (Print the characters in a string reversely) Rewrite Programming Exercise 18.9
 * using a helper method to pass the substring high index to the method. The
 * helper method header is:
 *
 * public static void reverseDisplay(String value, int high)
 *
 * Commentary: I will need to use high as length of string minus 1. Then pass
 * the recursive method through with the new parameter. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/16/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 18.12
 */
 
import java.util.Scanner;
 
public class EX12_StringReversedHelper {
 
   
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
   
   /** create helper method */
   public static void reverseDisplay(String value) {
      reverseDisplay(value, value.length() - 1);
   }
   
   /** new recursive method with helper parameter */  
   public static void reverseDisplay(String value, int high) {
   
      if (high >= 0) {     // base case is when string length is 0
         System.out.print(value.charAt(high));   // print character at high value
         reverseDisplay(value, high - 1);  // decrease the high value and thus index of string from tail end to print char
      }
   
   }
   
   
   
}
