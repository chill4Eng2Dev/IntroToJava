/**
 * (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
 * 2 * 2 system of linear equations:
 * 
 * [SEE PHOTO IN FOLDER]
 * 
 * The class contains:
 * 
 * ■ Private data fields a, b, c, d, e, and f.
 * ■ A constructor with the arguments for a, b, c, d, e, and f.
 * ■ Six getter methods for a, b, c, d, e, and f.
 * ■ A method named isSolvable() that returns true if ad - bc is not 0.
 * ■ Methods getX() and getY() that return the solution for the equation.
 * 
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that prompts the user to enter a, b, c, d, e, and f and displays the result.
 * If ad - bc is 0, report that “The equation has no solution.” See Programming
 * Exercise 3.3 for sample runs.
 * 
 * FOR REFERENCE ---- Exercise 3.3 Sample Run:
 * -----------------------------------------------------------
 * Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0 [ENTER]
 * x is -2.0 and y is 3.0
 * -----------------------------------------------------------
 * -----------------------------------------------------------
 * Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0 [ENTER]
 * The equation has no solution
 * -----------------------------------------------------------
 *
 * Author: chill4Eng2Dev 
 * Date: 1/28/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 9.11
 */

import java.util.Scanner;

public class EX11_TestLinearEquations {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize variables with user input
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        
        // initialize linear equations object with user defined coefficients
        LinearEquation linEq = new LinearEquation(a, b, c, d, e, f);

        // check if divisor is zero print output as necessary
        if(linEq.isSolvable())
            System.out.println("x is " + linEq.getX() + " and y is " + linEq.getY());
        else
            System.out.println("The equation has no solution");

    }

}
