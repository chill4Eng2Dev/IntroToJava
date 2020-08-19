/**
 * (Financial application: calculate tips) Write a program that reads the subtotal
 * and the gratuity rate, then computes the gratuity and total. For example, if the
 * user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
 * as gratuity and $11.5 as total. Here is a sample run:
 *
 * -----------------------------------------------------
 * Enter the subtotal and a gratuity rate: 10 15 [ENTER]
 * The gratuity is $1.5 and total is $11.5
 * -----------------------------------------------------
 *
 * Commentary: I will need to have two inputs as type double for total and gratuity
 * rate. Gratuity and total will be another variable declared and used for the calulation. 
 * Then output everything calculated as shown in the sample.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/18/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.5
 */
 
import java.util.Scanner;
 
public class EX05_CalculateTips {
 
   public static void main(String[] args) {
   
      // create a scanner
      Scanner input = new Scanner(System.in);
   
      // declare all variables
      double subtotal, gratuityRate, gratuity, total;
   
      // gather user input for subtotal and gratuityRate
      System.out.print("Enter the subtotal and a gratuity rate: ");
      subtotal = input.nextDouble();
      gratuityRate = input.nextDouble();
   
      // calculate the gratuity and total from user input
      gratuity = subtotal * gratuityRate / 100;
      total = subtotal + gratuity;
   
      // output the gratuity and total as shown in sample
      System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
   
   }
 
}
