/**
 * (Algebra: quadratic equations) Design a class named QuadraticEquation for
 * a quadratic equation ax2 + bx + x = 0. The class contains:
 * 
 * ■ Private data fields a, b, and c that represent three coefficients.
 * ■ A constructor for the arguments for a, b, and c.
 * ■ Three getter methods for a, b, and c.
 * ■ A method named getDiscriminant() that returns the discriminant, which is
 * b2 - 4ac.
 * ■ The methods named getRoot1() and getRoot2() for returning two roots of
 * the equation
 * 
 * [SEE PHOTO IN FOLDER]
 * 
 * These methods are useful only if the discriminant is nonnegative. Let these methods
 * return 0 if the discriminant is negative.
 * 
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that prompts the user to enter values for a, b, and c and displays the result
 * based on the discriminant. If the discriminant is positive, display the two roots. If
 * the discriminant is 0, display the one root. Otherwise, display “The equation has
 * no roots.” See Programming Exercise 3.1 for sample runs.
 * 
 * FOR REFERENCE ---- Exercise 3.1 Sample Runs:
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
 * Author: chill4Eng2Dev 
 * Date: 1/28/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 9.10
 */

import java.util.Scanner; 

public class EX10_TestQuadEquation {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and intialize variables with user input
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        // initialize quadratic equation object
        QuadraticEquation eq = new QuadraticEquation(a, b, c);
        
        // calculate the discriminate
        double discriminate = eq.getDiscriminant();
        
        if (discriminate > 0)     // positive discriminate, calc roots, print output as shown in sample run
            System.out.println("The equation has two roots " + eq.getRoot1() + " and " + eq.getRoot2());
        else if (discriminate == 0)      // zero discriminate, calc simplified root, print output as shown in sample run
            System.out.println("The equation has one root " + eq.getRoot1());
        else      // negative discriminate, print statement as shown in sample run
            System.out.println("The equation has no real roots");
        
    }
}
