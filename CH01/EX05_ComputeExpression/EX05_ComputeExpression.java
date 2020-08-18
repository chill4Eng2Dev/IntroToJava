/**
 * (Compute expressions) Write a program that displays the result of
 *
 *    9.5 X 4.5 - 2.5 X 3
 *    -------------------
 *         45.5 - 3.5
 *
 * Commentary: I will show the equation that will be computed and the
 * the result. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/17/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 1.5
 */
 
public class EX05_ComputeExpression {
 
   public static void main(String[] args) {
   
      System.out.println("9.5 X 4.5 - 2.5 X 3");
      System.out.println("-------------------");
      System.out.println("     45.5 - 3.5    ");
      System.out.println();
      System.out.println((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));
   
   }
}