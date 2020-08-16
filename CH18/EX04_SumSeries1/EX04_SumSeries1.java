/**
 * Write a recursive method to compute the following series:
 *
 * m(i) = 1 + 1 / 2 + 1 / 3 + ... + 1 / i
 * 
 * Write a test program that displays m(i) for i = 1, 2, ..., 10.
 *
 * Commentary: I will use 10 as my recursive call parameter. And 
 * return the value as a double. I believe the entirety of the recursive call
 * must be as type double.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/16/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 18.4
 */
 
public class EX04_SumSeries1 {
 
   public static void main(String[] args) {
   
      // declare and initialize final value from problem statement
      final double SERIES_I = 10.0;
   
      // show output of sumSeries recursive method
      System.out.println("The sum of the series pattern 1 / i is: " + sumSeries(SERIES_I));
   
   }
 
   // recursive call to sume the series pattern as shown in problem statement
   public static double sumSeries(double n) {
   
      if (n == 1)   // base case
         return 1;
      else
         return (1 / n) + sumSeries(n - 1);
   
   }
 
}