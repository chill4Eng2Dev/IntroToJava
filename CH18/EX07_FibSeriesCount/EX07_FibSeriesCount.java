/**
 * Modify Listing 18.2, ComputeFibonacci.java, so that the program
 * finds the number of times the fib method is called. (Hint: Use
 * a static variable and increment it every time the method is called.)
 *
 * Commentary: I will create a static variable counter to increment each
 * iteration that the fibonacci method is called. Use Listing 18.2 as base
 * code to be modified.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/16/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 18.7
 */
 
import java.util.Scanner;
 
public class EX07_FibSeriesCount {
   
   public static int numberFibs = 0;  // declare static variable outside of main method... Needs to be in class.
   
   public static void main(String[] args) {
      
      // create a scanner
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an index for a Fibonacci number: ");
      int index = input.nextInt();
      
      // find and display the fibonacci number
      System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
      System.out.println("The number of times the recursive call is invoked is: " + numberFibs + " times.");     
   }
      
   /** the method for finding the Fibonacci number */
   public static long fib(long index) {
      numberFibs++;  // count incrementer for static variable
      if (index == 0) // base case
         return 0;
      else if (index == 1) // base case
         return 1;
      else // reduction and recursive calls
         return fib(index - 1) + fib(index - 2);
      
   }
        
 
}