/**
 * (Compute the volume of a cylinder) Write a program that reads in the radius
 * and length of a cylinder and computes the area and volume using the following
 * formulas:
 *
 *    area = radius * radius * PI
 *    volume = area * length
 * 
 * Here is a sample run:
 * ---------------------------------------------------------
 * Enter the radius and length of a cylinder: 5.5 12 [ENTER]
 * The area is 95.0331
 * The volume is 1140.4
 * ---------------------------------------------------------
 *
 * Commentary: I could use Math class to introduce Math.pow but I will forego
 * this class call at this time. Will take user input as a variable and calculate
 * the area and volume as a variable. These variables will then be displayed in
 * the output. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/18/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.2
 */
 
import java.util.Scanner;
 
public class EX02_CylinderProperties {
 
   public static void main(String[] args) {
   
      // create scanner for user input
      Scanner input = new Scanner(System.in);
      
      // declare and initialize variables
      final double PI = 3.14159;
      double area, volume, radius, length;
      
      // gather user inputs
      System.out.print("Enter the radius and length of a cylinder: ");
      radius = input.nextDouble();
      length = input.nextDouble();
   
      // calculate area and volume
      area = radius * radius * PI;
      volume = area * length;
   
      // display area and volume as outputs
      System.out.println("The area is " + area);
      System.out.println("The volume is " + volume);
   
   }
 
}
