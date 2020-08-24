/**
 * (Geometry: two rectangles) Write a program that prompts the user to enter the
 * center x-, y-coordinates, width, and height of two rectangles and determines
 * whether the second rectangle is inside the first or overlaps with the first, as shown
 * in Figure 3.9. Test your program to cover all cases.
 * 
 * Here are the sample runs:
 * -----------------------------------------------------------------------------
 * Enter r1's center x-, y- coordinates, width, and height: 2.5 4 2.5 43 [ENTER]
 * Enter r2's center x-, y- coordinates, width, and height: 1.5 5 0.5 3 [ENTER]
 * r2 is inside r1
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * Enter r1's center x-, y- coordinates, width, and height: 1 2 3 5.5 [ENTER]
 * Enter r2's center x-, y- coordinates, width, and height: 1.5 5 0.5 3 [ENTER]
 * r2 overlaps r1
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * Enter r1's center x-, y- coordinates, width, and height: 1 2 3 3 [ENTER]
 * Enter r2's center x-, y- coordinates, width, and height: 40 45 3 2 [ENTER]
 * r2 does not overlap r1
 * -----------------------------------------------------------------------------
 * 
 * Commentary: I will need to conside the x and y distances from the center of the
 * rectangles + or - the width / 2 and/or height / 2. I am assuming that the check
 * is only for positive values. I will need to use an if-else statement to cycle 
 * through the verdict and print output as shown in sample runs. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/24/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.29
 */

import java.util.Scanner;

public class EX28_TwoRectangles {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize variables with user input; rectangle 1
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double r1CenterX = input.nextDouble();
        double r1CenterY = input.nextDouble();
        double r1Width = input.nextDouble();
        double r1Height = input.nextDouble();
        
        // declare and initialize variable with user input; rectangle 2
        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double r2CenterX = input.nextDouble();
        double r2CenterY = input.nextDouble();
        double r2Width = input.nextDouble();
        double r2Height = input.nextDouble();
        
        // print first part of output
        System.out.print("r2 ");
        
        // determine verdict of rectangle 2 to rectangle 1 and print portion of output
        if ((Math.abs(r2CenterX - r1CenterX) + r2Width / 2 <= r1Width / 2) &&
            (Math.abs(r2CenterY - r2CenterY) + r2Height / 2 <= r1Height / 2))
            System.out.print("is inside ");
        else if ((r1CenterX + r1Width / 2 > r2CenterX - r2Width / 2) ||
                 (r1CenterY + r1Height / 2 > r2CenterY - r2Height / 2))
            System.out.print("overlaps ");
        else
            System.out.print("does not overlap ");
        
        // print last portion of output
        System.out.println("r1");
            
        
    }
        
        
}
