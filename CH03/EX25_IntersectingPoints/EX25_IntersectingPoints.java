/**
 * (Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and (x2,
 * y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a-b. 
 * The intersecting point of the two lines can be found by solving the following linear
 * equation:
 * 
 *      (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 *      (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
 * 
 * This linear equation can be solved using Cramer's rule (see Programming Exercise 3.3).
 * If the equation has no solutions, the two lines are parallel (Figure 3.8c). 
 * Write a program that prompts the user to enter four points and displays the
 * intersecting point. Here are sample runs:
 * 
 * --------------------------------------------------------------------------
 * Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0 [ENTER]
 * The intersecting point is at (2.88889, 1.1111)
 * --------------------------------------------------------------------------
 * --------------------------------------------------------------------------
 * Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 7 6.0 4.0 2.0 -1.0 -2.0 [ENTER]
 * The two lines are parallel
 * --------------------------------------------------------------------------
 * 
 * For reference, Cramer's rule from Exercise 1.13 & Exercise 3.3: 
 *          ax + by = e    x = (ed - bf) / (ad - bc)
 *          cx + dy = f    y = (af - ec) / (ad - bc)
 * 
 * Commentary: Listed Cramer's rule for reference. I should be able to assing (y1 - y2) to
 * a, and (x1 - x2) to b, and so on. I will need to use an if statement to check if the
 * divisor is equal to zero. If zero, then I'll need to say the two lines are parallel. I
 * will then need to print output as shown in sample runs. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/23/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.25
 */

import java.util.Scanner;

public class EX25_IntersectingPoints {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize variables with user input
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        
        // calculate a - f of Cramer's rule to determine x and y
        double a = (y1 - y2);
        double b = -1 * (x1 - x2);
        double c = (y3 - y4);
        double d = -1 * (x3 - x4);
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;
        
        // calculate divisor to determine parralel or interestion
        double divisor = (a * d - b * c);
        
        if (divisor == 0)
            System.out.println("The two lines are parallel");
        else {      // calculate x and y and print output as shown in sample run
            double x = (e * d - b * f) / divisor;
            double y = (a * f - e * c) / divisor;
            System.out.println("The intersecting point is at (" + x + ", " + y + ")");
        }
    }
        
}
