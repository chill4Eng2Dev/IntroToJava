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
    
      // set up table to show i and m(i)
      System.out.println(" i | m(i) ");
      System.out.println("----------");
      for(int i = 1; i <= 10; i++) {
         System.out.printf("%2d |%5.2f\n", i, sumSeries(i));  // recursively call series for each i
      }
   }
 
   // recursive call to sume the series pattern as shown in problem statement
   public static double sumSeries(double n) {
   
      if (n == 1)   // base case
         return 1;
      else
         return (1 / n) + sumSeries(n - 1);
   
   }
 
}