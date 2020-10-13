/**
 * (Geometry: area of a pentagon) The area of a pentagon can be computed using the
 * following formula:
 * 
 *      Area = (5 X s^2) / (4 x tan(PI / 5))
 * 
 * Write a method that returns the area of a pentagon using the following header:
 * 
 *      public static double area(double side)
 *      
 * Write a main method that prompts the user to enter the side of a pentagon and
 * displays its area. Here is a sample run:
 * 
 * ------------------------------------------------
 * Enter the side: 5.5 [ENTER]
 * The area of the pentagon is 52.04444136781625
 * ------------------------------------------------
 * 
 * Commentary: I will calculate the formula within the method as provided in the
 * problem statement. I will print output as shown in sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/9/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.35
 */

import java.util.Scanner;

public class EX35_AreaOfAPentagon {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to side
        System.out.print("Enter the side: ");
        double s = input.nextDouble();
        
        // print output as shown in sample run and call area method
        System.out.println("The area of the pentagon is " + area(s));
    }
    
    // area method with pentagon area formula
    public static double area(double side) {
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    }
        

}
