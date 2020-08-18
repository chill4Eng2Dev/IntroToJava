/**
 * (Approximate PI) PI can be computed using the following formula:
 *
 *   PI = 4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
 *
 * Write a program that displays the result of 
 * 
 *   4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) and 
 *   4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) 
 * 
 * Use 1.0 instead of 1 in your program.
 *
 * Commentary: I will show the approximation and the result. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/17/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 1.7
 */
 
public class EX07_ApproximatePI {
 
   public static void main(String[] args) {
   
      System.out.println("4 X (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11)");
      System.out.println(4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
      System.out.println();
      System.out.println("4 X (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13)");
      System.out.println(4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13)));
   
   }
}