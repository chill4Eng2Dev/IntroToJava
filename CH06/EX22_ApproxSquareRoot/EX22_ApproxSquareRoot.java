/**
 * (Math: approximate the square root) There are several techniques for implementing
 * the sqrt method in the Math class. One such technique is known as the
 * Babylonian method. It approximates the square root of a number, n, by repeatedly
 * performing a calculation using the following formula:
 * 
 *      nextGuess = (lastGuess + n / lastGuess) / 2
 * 
 * When nextGuess and lastGuess are almost identical, nextGuess is the
 * approximated square root. The initial guess can be any positive value (e.g., 1).
 * This value will be the starting value for lastGuess. If the difference between
 * nextGuess and lastGuess is less than a very small number, such as 0.0001,
 * you can claim that nextGuess is the approximated square root of n. If not, next-
 * Guess becomes lastGuess and the approximation process continues. Implement
 * the following method that returns the square root of n.
 * 
 *      public static double sqrt(long n)
 * 
 * Commentary: I will use the problem statement as my guide on how to structure the
 * sqrt method. I will use a while loop within the sqrt method. I will print output
 * as stated in the problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/10/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.22
 */

import java.util.Scanner;

public class EX22_ApproxSquareRoot {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to number to find the square root
        System.out.print("Enter a number: ");
        long n = input.nextLong();
        
        // print output as stated in problem statement
        System.out.println("The square root of " + n + " is " + sqrt(n));
        
    }
    
    // method to calculate the sqrt based on the problem statement description
    public static double sqrt(long n) {
        double lastGuess = 1;
        double nextGuess = (lastGuess + n / lastGuess) / 2;
        
        while (Math.abs(nextGuess - lastGuess) > 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }
        
        return nextGuess;
    }

}
