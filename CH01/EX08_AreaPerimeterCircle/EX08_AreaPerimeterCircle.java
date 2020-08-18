/**
 * (Area and perimeter of a circle) Write a program that displays the area and
 * perimeter of a circle that has a radius of 5.5 using the following formula:
 *
 *          perimeter = 2 X radius X PI
 *          area = radius X radius X PI
 *
 * Commentary: I will show the formulas first, then the calculation. I will use
 * 3.14159 to represent PI.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/18/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 1.8
 */
 
public class EX08_AreaPerimeterCircle {
 
   public static void main(String[] args) {
   
      System.out.println("perimeter = 2 X radius X PI");
      System.out.println(2 * 5.5 * 3.14159);
      System.out.println();
      System.out.println("area = radius X radius X PI");
      System.out.println(5.5 * 5.5 * 3.14159);
   
   }
}