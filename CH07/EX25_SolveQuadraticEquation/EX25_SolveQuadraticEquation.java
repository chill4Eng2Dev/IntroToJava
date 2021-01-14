
/**
 * (Algebra: solve quadratic equations) Write a method for solving a quadratic
 * equation using the following header:
 * 
 * public static int solveQuadratic(double[] eqn, double[] roots)
 * 
 * The coefficients of a quadratic equation ax^2 + bx + c = 0 are passed to the
 * array eqn and the real roots are stored in roots. The method returns the number
 * of real roots. See Programming Exercise 3.1 on how to solve a quadratic
 * equation.
 * 
 * Write a program that prompts the user to enter values for a, b, and c and displays
 * the number of real roots and all real roots.
 *
 * Commentary: I will need to reorganize the problem solved in Exercise 3.1. I will
 * move all math and root determination to the solveQuadratic method and the printing
 * to the main method. I will print output to show the roots, if any, based on the users
 * inputs.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/9/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.25
 */

import java.util.Scanner;

public class EX25_SolveQuadraticEquation {

    public static void main(String[] args) {
        
        // declare and initialize scanner/variables
        Scanner input = new Scanner(System.in);
        double[] eqn = new double[3];
        double[] roots = new double[2];

        // assign user input to coefficient array
        System.out.print("\n\nEnter a, b, c: ");
        for (int i = 0; i < eqn.length; i++)
            eqn[i] = input.nextDouble();
        
        // call solveQuadratic equation and store root count
        int numOfRoots = solveQuadratic(eqn, roots);
        
        // print verdict based on number of roots
        if (numOfRoots == 0)
            System.out.println("No real roots.");
        else
            for (int i = 0; i < numOfRoots; i++) {
                System.out.print("Root " + (i + 1) + ": " + roots[i] + "\n");
        }
        
    }
    
    public static int solveQuadratic(double[] eqn, double[] roots) {
        // assign coefficients from array
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
        
        // initialize return variable
        int numRoots = 0;
        
        // calculate the discriminate
        double discriminate = Math.pow(b, 2) - 4 * a * c;
        
        if (discriminate > 0) {    
            // positive discriminate, calc roots, print output as shown in sample run
            roots[0] = (-b + Math.pow(discriminate, 0.5)) / (2 * a);   
            roots[1] = (-b - Math.pow(discriminate, 0.5)) / (2 * a);   
            numRoots = 2;
        }
        
        if (discriminate == 0) {
            // zero discriminate, calc simplified root, print output as shown in sample run
            roots[0] = -b / (2 * a);
            numRoots = 1;
        } 
        
        return numRoots;
    }
}
