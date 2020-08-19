/**
 * (Sum the digits in an integer) Write a program that reads an integer between 0 and
 * 1000 and adds all the digits in the integer. For example, if an integer is 932, the
 * sum of all its digits is 14.
 * Hint: use the % operator to extract digits, and use the / operator to remove the
 * extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 * 
 * Here is a sample run:
 * ----------------------------------------------
 * Enter a number between 0 and 1000: 999 [ENTER]
 * The sum of the digits is 27
 * ----------------------------------------------
 *
 * Commentary: I will need to have one integer type input for user input. I will then need
 * variables to hold the sum of digits, the remainder, and the values within each place numerical
 * location.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/18/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.6
 */
 
import java.util.Scanner;
 
public class EX06_SumDigitsInInteger {
 
   public static void main(String[] args) {
      
      // create scanner
      Scanner input = new Scanner(System.in);
      
      // declare and initialize variables
      int sumDigits = 0, remainder, modulus = 0;
   
      // gather user input to be summed
      System.out.print("Enter a number between 0 and 1000: "); 
      int value = input.nextInt();
   
      // ones place
      modulus = value % 10;
      sumDigits += modulus;   // same as sumDigits = sumDigits + modulus
   
      // tens place
      value /= 10;            // same as value = value / 10
      modulus = value % 10;
      sumDigits += modulus;
   
      // hundreds place
      value /= 10;
      modulus = value % 10;
      sumDigits += modulus;
   
      // thousands place
      value /= 10;
      sumDigits += value;
   
      // show output of the summed digits
      System.out.println("The sum of the digits is: " + sumDigits);
   
   }
}
 
 
 
