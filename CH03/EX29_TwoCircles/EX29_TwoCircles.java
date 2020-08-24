/**
 * (Geometry: two circles) Write a program that prompts the user to enter the center
 * coordinates and radii of two circles and determines whether the second circle is
 * inside the first or overlaps with the first, as shown in Figure 3.10. (Hint: circle2
 * is inside circle1 if the distance between the two centers <= |r1 - r2| and circle2
 * overlaps circle1 if the distance between the two centers <= r1 + r2. Test your
 * program to cover all cases.)
 * 
 * Here are the sample runs:
 * -------------------------------------------------------------------------
 * Enter circle1's center x-, y-coordinates, and radius: 0.5 5.1 13 [ENTER]
 * Enter circle2's center x-, y-coordinates, and radius: 1 1.7 4.5 [ENTER]
 * circle2 is inside circle1
 * -------------------------------------------------------------------------
 * -------------------------------------------------------------------------
 * Enter circle1's center x-, y-coordinates, and radius: 3.4 5.7 5.5 [ENTER]
 * Enter circle2's center x-, y-coordinates, and radius: 6.7 3.5 3 [ENTER]
 * circle2 overlaps circle1
 * -------------------------------------------------------------------------
 * -------------------------------------------------------------------------
 * Enter circle1's center x-, y-coordinates, and radius: 3.4 5.5 1 [ENTER]
 * Enter circle2's center x-, y-coordinates, and radius: 5.5 7.2 1 [ENTER]
 * circle2 does not overlap circle1
 * -------------------------------------------------------------------------
 * 
 * For reference: 
 *      The formula for computing the distance is ((x2 - x1)^2 + (y2 - y1)^2)^0.5.
 * 
 * Commentary: I will need to calculate distance using the distance formula. I will
 * compare the distance to the provided hint formulas. I will need to use an if-else
 * statement to cycle through the verdict and print output as shown in sample runs. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/24/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.29
 */

import java.util.Scanner;

public class EX29_TwoCircles {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize variables with user input for circle1
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double radius1 = input.nextDouble();
        
        // declare and initialize variables with user input for circle2
        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double radius2 = input.nextDouble();
        
        // calculate distance between circle centers
        double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        
        // print first portion of output statement
        System.out.print("circle2 ");
        
        // check dist with provided formulas in problem statement to determine verdict for output
        if (distance <= Math.abs(radius1 - radius2)) 
            System.out.print("is inside ");
        else if (distance <= radius1 + radius2)
            System.out.print("overlaps ");
        else
            System.out.print("does not overlap ");
        
        // print last portion of output statement
        System.out.println("circle1");
            
    }

}
