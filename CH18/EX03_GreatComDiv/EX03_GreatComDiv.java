/**
 * The gcd(m, n) can also be defined recursively as follows:
 * 
 * If m % n is 0, gcd(m, n) is n
 * Otherwise, gcd(m, n) is gcd(n, m %n).
 * 
 * Write a recursive method to find the GCD. Write a test program that prompts
 * the user to enter two integers and display their GCD.
 *
 * Commentary: Use provided alrgorithm to find GCD. Base case to terminate
 * is when m % n is equal to 0.  
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/16/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 18.3
 */
 
import java.util.Scanner;
 
public class EX03_GreatComDiv {
 
   public static void main(String[] args) {
      
      // create scanner object
      Scanner input = new Scanner(System.in);
   
      // gather input from user
      System.out.println("Please enter two integers to determine the greatest common divisor: ");
      int m = input.nextInt();
      int n = input.nextInt();
   
      // show output to user
      System.out.println("The greatest common divisor for " + m + " and " + n + " is " + gcd(m, n));
   
   
   }
 
   /** recursive call of user inputs to find greatest common divisor */
   public static int gcd(int m, int n) {
      if (m % n == 0)   // base case
         return n;
      else
         return gcd(n, m % n);
   }
 
 
}
