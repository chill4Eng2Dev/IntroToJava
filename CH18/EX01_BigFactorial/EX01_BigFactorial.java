/**
 * Using the BigInteger class introduced in Section 10.9, you can find the
 * factorial for a large number (e.g., 100!). Implement the factorial method
 * using recursion. Write a program that prompts the user to enter an integer
 * and displays its factorial.  
 * 
 * Commentary: Review section 10.9. Use recursion to calculate factorial.
 * Base case will terminate at value = 1 or 0. The terminating mechanic 
 * will reduce the value entered by 1 until reaching base case. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/16/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 18.1
 */

import java.util.Scanner;
import java.math.*;

public class EX01_BigFactorial {

/** Main method */
   public static void main(String[] args) {
   // create scanner
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a nonnegative integer: ");
      int n = input.nextInt();
      
      // create BigInteger value to string equivalent, BigInteger parameter takes string
      BigInteger bigN = new BigInteger(String.valueOf(n));
      
   
   // display factorial
      System.out.println("Factorial of " + n + " is " + factorial(bigN));
   }
   
   /** Return the factorial for the specified number */
   public static BigInteger factorial(BigInteger n) {
      if (n.equals(BigInteger.ZERO)) // base case
         return BigInteger.ONE;
      else
         return n.multiply(factorial(n.subtract(BigInteger.ONE))); // recursive call
   }
}
