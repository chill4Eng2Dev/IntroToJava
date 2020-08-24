
/**
 * (Algebra: solve 2 X 2 linear equations) A linear equation can be solved using
 * Cramer's rule given in Programming Exercise 1.13. Write a program that prompts
 * the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0,
 * report that "The equation has no solution."
 * 
 * Sample runs:
 * -----------------------------------------------------------
 * Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0 [ENTER]
 * x is -2.0 and y is 3.0
 * -----------------------------------------------------------
 * -----------------------------------------------------------
 * Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0 [ENTER]
 * The equation has no solution
 * -----------------------------------------------------------
 * 
 * For reference, Cramer's rule from Exercise 1.13: 
 *          ax + by = e    x = (ed - bf) / (ad - bc)
 *          cx + dy = f    y = (af - ec) / (ad - bc)
 *
 * Commentary: I will need to modify the code used in Listing 3.1. I will add a new
 * variable for a newly created number. I will use the System.currenttimeMillis() 
 * method used in Listing 3.1 though I would prefer Math.random() from section 3.7.
 * I will print the output as shown in the sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/21/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.3
 */

import java.util.Scanner;

public class EX03_LinearEquations {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare variables
        double x, y;
        
        // declare and initialize variables with user input
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        
        // calculate divisor for if statement check
        double divisor = (a * d - b * c);
        
        // check if divisor is zero print output as necessary
        if(divisor == 0)
            System.out.println("The equation has no solution");
        else {
            x = (e * d - b * f) / divisor;  // calculate x
            y = (a * f - e * c) / divisor;  // calculate y
            System.out.println("x is " + x + " and y is " + y);
        }
        
    }
            
}
