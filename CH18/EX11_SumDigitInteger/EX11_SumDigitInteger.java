/**
 * (Sum the digits in an integer using recursion) Write a recursive method that
 * computers the sum of the digits in an integer. Use the following method headers:
 * 
 * public static int sumDigits(long n)
 *
 * For exmaple, sumDigits(234) returns 2 + 3 + 4 = 9. Write a test program that
 * prompts the user to eter an integer and displays its sum.
 *
 * Commentary: I will need to use division and modulus operates to separate the
 * individual values from the input value. I will need to add these values to 
 * each other for each recursion call.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/16/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 18.11
 */

import java.util.Scanner;

public class EX11_SumDigitInteger {

   public static void main(String[] args) {
      
      // create scanner
      Scanner input = new Scanner(System.in);
      
      // gather user input
      System.out.println("Please enter an integer to be summed: ");
      long n = input.nextLong();
   
      // show output from user input using recursion
      System.out.println("The value entered " + n + " when summed together is: " + sumDigits(n));
   
   }
   
   /** method to sum each digit within a long integer entry */
   public static int sumDigits(long n) {
      if (n > 0) // base is is when n is 0 or less
         return (int)(n % 10) + sumDigits(n / 10); // convert value to int and add each singular integer to each recursive call
      
      return 0; // if value is 0 or less, return 0
   }
   
}
