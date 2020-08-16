/**
 * Rewrite the fib method in Listing 18.2 using iterations. 
 * Hint: To compute fib(n) without recursion, you need to obtain fib(n-2)
 * and fib(n-1) first. Let f0 and f1 denote the two previous Fibonacci
 * numbers. The current Fibonacci number would then be f0 + f1. The algorithm
 * can be described as follows:
 *        f0 = 0; // for fib(0)
 *        f1 = 1; // for fib(1)
 *        for (int i = 1; i <=n; i++) {
 *           currentFib = f0 + f1;
 *           f0 = f1;
 *           f1 = currentFib;
 *        }
 *        // After the loop, currentFib is fib(n)
 *
 * Write a test program that prompts the user to enter an index and displays
 * its Fibonacci number.
 * 
 * Commentary: Review listing 18.2. Use algorithm provided to iretatively
 * solve a fibonacci index input series. Base case will be when i is greater
 * than n which is taken care of in the for loop. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/16/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 18.2
 */
 
import java.util.Scanner;
 
public class EX02_FibNums {
 
   public static void main(String[] args) {
      
      // declare and initialize scanner 
      Scanner input = new Scanner(System.in);
      
      // gather input from user
      System.out.println("Enter a Fibonacci index number: ");
      int index = input.nextInt();
   
      // print output of fibonacci number
      System.out.println("The Fibonacci number for an index of " + index + " is " + fib(index));
     
   }
 
 /** iterative fibonacci method */
   public static long fib(long n) {
   
      long f0 = 0;         // for fib(0)
      long f1 = 1;         // for fib(1)
      long currentFib = 0; // sum of f0 and f1 in for loop
   
      // from listing 18.2, check if index is 0 or 1 first
      if(n == 0)
         return 0;
      else if(n == 1)
         return 1;
      
      /** if index is not 0 or 1, perform iterative fibonacci
        * book gives i <= n, should be i < n for correct output
        */
      for (int i = 1; i < n; i++) {      
         currentFib = f0 + f1;
         f0 = f1;
         f1 = currentFib;
      }
      return currentFib;
   }
 
}