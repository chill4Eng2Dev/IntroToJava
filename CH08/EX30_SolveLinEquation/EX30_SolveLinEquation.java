/**
 * (Algebra: solve linear equations) Write a method that solves the following
 * 2 * 2 system of linear equations:
 * 
 * [SEE PHOTO IN FOLDER]
 * 
 * The method header is
 * 
 * public static double[] linearEquation(double[][] a, double[] b)
 * 
 * The method returns null if a00*a11 - a01*a10 is 0. Write a test program that
 * prompts the user to enter a00, a01, a10, a11, b0, and b1, and displays the result. If
 * a00*a11 - a01*a10 is 0, report that “The equation has no solution.” A sample run is
 * similar to Programming Exercise 3.3.
 * 
 * Commentary: Nothing out of the ordinary for this exercise. I will print output as
 * shown in Exercise 3.3.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/16/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.30
 */

import java.util.Scanner;

public class EX30_SolveLinEquation {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        
        double[][] a = new double[2][2];
        
        double[] b = new double[2];
        
        // assign a## to a matrix
        System.out.print("\nEnter a00, a01, a10, a11, b0, and b1: ");
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = input.nextDouble();
        
        // assign b# to b array
        for (int i = 0; i < b.length; i++)
            b[i] = input.nextDouble();
        
        // store x, y or null
        double[] xAndY = linearEquation(a, b);
        
        // print results as shown in exercise 3.3 sample runs
        if (xAndY == null)
            System.out.println("The equation has no solution");
        else
            System.out.println("x is " + xAndY[0] + " and y is " + xAndY[1]);
               
        
    }
    
    // method to calculate the x and y solution to linear equations
    public static double[] linearEquation(double[][] a, double[] b) {
        double[] result = new double[2];
        double divisor = a[0][0] * a[1][1] - a[0][1] * a[1][0];
        
        if (divisor == 0)
            return null;
        else {
            result[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / divisor;
            result[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / divisor;
        }
        
        return result;        
    }

}
