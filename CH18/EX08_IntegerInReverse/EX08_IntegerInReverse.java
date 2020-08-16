/**
 * (Print the digits in an integer reversely). Write a recursive method
 * that displays an int value reversely on the console using the following
 * header:
 *
 * public static void reverseDisplay(int value)
 *
 * For exmaple, reverseDisplay(12345) displays 54321. Write a test program
 * that prompts the user to enter an integer and displays its reversal.
 *
 * Commentary: I will need to use modulus and division operator to strip the
 * input integer so that it eventually truncates to nothing. Once the value
 * of modulus is 0 (base case), the recursion will stop. I will print the value
 * in recursive method due to void return type.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/16/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 18.8
 */
 
import java.util.Scanner;
 
public class EX08_IntegerInReverse {
   
   /** main method */
   public static void main(String[] args) {
      
      // create a scanner
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer to be reversed: ");
      int value = input.nextInt();
      
      // show the output of the user input
      System.out.print("The reversed value of the originally entered integer of " + value + " is ");
      reverseDisplay(value);
         
   }
      
   /** the method for reversing the user int value */
   public static void reverseDisplay(int value) {
      if (value > 0) { // base case
         System.out.print(value % 10);
         reverseDisplay(value / 10);
      }
      
   }
        
 
}