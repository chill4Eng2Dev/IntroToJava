
/**
 * (Algebra: solve quadratic equations) The two roots of a quadratic equation 
 * ax^2 + bx + c = 0 can be obtained using the following formula:
 * 
 * r1 = (-b + (b^2 - 4ac)^0.5) / 2a AND r2 = (-b - (b^2 - 4ac)^0.5) / 2a
 * 
 * b^2 - 4ac is called the discriminant of the quadratic equation. If it is positive,
 * the equation has two real roots. If it is zero, the equation has one root. If it is
 * negative, the equation has no real roots.
 * 
 * Write a program that prompts the user to enter values for a, b, and c and displays
 * the result based on the discriminant. If the discriminant is positive, display two
 * roots. If the discriminant is 0, display one root. Otherwise, display "The equation
 * has no real roots".
 * 
 * Note that you can use Math.pow(x, 0.5) to compute (x)^0.5. 
 * 
 * Here are some sample runs:
 * -------------------------------------------------
 * Enter a, b, c: 1.0 3 1 [ENTER]
 * The equation has two roots -0.381966 and -2.61803
 * -------------------------------------------------
 * -------------------------------------------------
 * Enter a, b, c: 1 2.0 1 [ENTER]
 * The equation has one root -1
 * -------------------------------------------------
 * -------------------------------------------------
 * Enter a, b, c: 1 2 3 [ENTER]
 * The equation has no real roots
 * -------------------------------------------------
 *
 * Commentary: I will need to use an if-else statement to cycle through the discriminant
 * options. One root shortens to -b / 2a. Else statement will default as the negative
 * discriminant. I will print the output as shown in the sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/21/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.1
 */

import java.util.Scanner;

public class EX01_QuadracticEquation {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare variables
        double root1, root2;
        
        // declare and intialize variables with user input
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        // calculate the discriminant
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        
        if (discriminant > 0) {    
            // positive discriminant, calc roots, print output as shown in sample run
            root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);   
            root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);   
            System.out.println("The equation has two roots " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            // zero discriminant, calc simplified root, print output as shown in sample run
            root1 = -b / (2 * a);
            System.out.println("The equation has one root " + root1);
        } else {
            // negative discriminant, print statement as shown in sample run
            System.out.println("The equation has no real roots");
        }
        
    }

}
