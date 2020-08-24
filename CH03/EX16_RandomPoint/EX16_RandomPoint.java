/**
 * (Random point) Write a program that displays a random coordinate in a rectangle.
 * The rectangle is centered at (0, 0) with width 100 and height 200.
 * 
 * Commentary: I will need to use Math.random() and add some specific parameters that the
 * numbers can generate within. X coordinate cannot go beyond (-50, 50) and Y coordinate cannot
 * exceed (-100, 100). I will print output to display the coordinates.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/22/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.16
 */
public class EX16_RandomPoint {
    
    public static void main(String[] args) {
        
        // declare and initialize random values into variables
        int width = (int)(Math.random() * 101 - 50);
        int height = (int)(Math.random() * 201 - 100);
        
        // print out values that were generated within the rectangle parameters
        System.out.println("The rectangle is centered at (0, 0) with a width of 100 and height 200.");
        System.out.println("A point randomly generated within the rectangle is at: (" + width + ", " + height + ")");
    }
    
}

