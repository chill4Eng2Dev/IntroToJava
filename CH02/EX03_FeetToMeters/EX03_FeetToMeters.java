/**
 * (Convert feet into meters) Write a program that reads a number in feet, converts it
 * to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
 *
 * ------------------------------------
 * Enter a value for feet: 16.5 [ENTER]
 * 16.5 feet is 5.0325 meters
 * ------------------------------------
 *
 * Commentary: I will need to multiply the meter conversion to whatever is entered by
 * the user. The input will need to be of type double. Conversion value will be a constant
 * double.  
 *
 * Author: chill4Eng2Dev 
 * Date: 8/18/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.3
 */
 
import java.util.Scanner;
 
public class EX03_FeetToMeters {
 
   public static void main(String[] args) {
      
      // create scanner
      Scanner input = new Scanner(System.in);
      
      // declare and initialize constant
      final double FEET_TO_METERS = 0.305;
   
      // gather user input, declare and initialize feet
      System.out.print("Enter a value for feet: ");
      double feet = input.nextDouble();
   
      // output conversion from feet to meters
      System.out.print(feet + " feet is " + feet * FEET_TO_METERS + " meters");
   
   }
 
}
