/**
 * (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
 * seconds. Write a program that display the average speed in miles per hour. (Note
 * that 1 mile is 1.6 kilometers.)
 *
 * Commentary: I will show the formulas first, then the calculation.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/18/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 1.10
 */
 
public class EX10_AverageSpeedMiles {
 
   public static void main(String[] args) {
   
      System.out.println("Average Speed (mph) = (Kilometers / Time) * (1 mile / 1.6 Kilometers)");
      // need to add decimal points other wise rounds as integer and become infinite
      System.out.println((14.0 / (45.0 / 60 + 30.0 / 3600)) * (1.0 / 1.6));         
   }
}
