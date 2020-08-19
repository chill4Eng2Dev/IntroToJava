/**
 * (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
 * a double value from the console, then converts it to Fahrenheit and displays the
 * result. the formula for the conversion is as follows:
 *
 * fahrenheit = (9 / 5) * celsius + 32
 * Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
 * 
 * Here is a sample run:
 * -------------------------------------
 * Enter a degree in Celsius: 43 [ENTER]
 * 43 Celsius is 109.4 Fahrenheit
 * -------------------------------------
 *
 * Commentary: I will need to use 9.0 / 5 to force the value to widen its type. I
 * will need to import a scanner as well for user input.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/18/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.1
 */
 
import java.util.Scanner;
 
public class EX01_CelsiusToFahrenheit {
 
   public static void main(String[] args) {
   
      // create scanner for user input
      Scanner input = new Scanner(System.in);
   
      // declare and initialize celsius with user input
      System.out.print("Enter a degree in Celsius: ");
      double celsius = input.nextDouble();
   
      // calculate fahrenheit as a variable
      double fahrenheit = (9.0 / 5) * celsius + 32.0;
   
      // print out the output as shown in the sample output
      System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
   
   }
 
}