/**
 * (Convert pounds into kilograms) Write a program that converts pounds into
 * kilograms. The program prompts the user to enter a number in pounds, converts
 * it to kilograms, and displays the result. One pound is 0.454 kilograms. Here
 * is a sample run:
 *
 * --------------------------------------
 * Enter a number in pounds: 55.5 [ENTER]
 * 55.5 pounds is 25.197 kilograms
 * --------------------------------------
 *
 * Commentary: I will need to multiply the kilogram conversion to whatever is entered by
 * the user. The input will need to be of type double. Conversion value will be a constant
 * double.  
 *
 * Author: chill4Eng2Dev 
 * Date: 8/18/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.4
 */
 
import java.util.Scanner;
 
public class EX04_PoundsToKilograms {
 
   public static void main(String[] args) {
   
      // create a scanner
      Scanner input = new Scanner(System.in);
   
      // declare and initialize conversion constant
      final double POUND_TO_KILO = 0.454;
   
      // gather user input, declare and initialize variable
      System.out.print("Enter a number in pounds: ");
      double pounds = input.nextDouble();
   
      // output pounds to kilograms conversion
      System.out.print(pounds + " pounds is " + pounds * POUND_TO_KILO + " kilograms");
   
   }
 
}