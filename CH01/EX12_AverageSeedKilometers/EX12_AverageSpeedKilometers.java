/**
 * (Average speed in kilometers) Assume a runner run 24 miles in 1 hour, 40 minutes,
 * and 35 secods. Write a program that displays the average speed in kilometers per
 * hour. (Note that 1 mile is 1.6 kilometers.)
 *
 * Commentary: I will show the formulas first, then the calculation. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/18/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 1.12
 */
 
public class EX12_AverageSpeedKilometers {
 
   public static void main(String[] args) {
   
      System.out.println("Average speed (k/hr) = (miles / time) * (1.6 kilometer / 1.0 mile)");
      System.out.println(24.0 / (1 + 40.0 / 60 + 35.0 / 3600) * (1.6 / 1.0));
   
   }
 
}