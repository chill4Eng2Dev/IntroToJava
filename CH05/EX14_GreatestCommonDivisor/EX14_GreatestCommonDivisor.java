/**
 * (Compute the greatest common divisor) Another solution for Listing 5.9 to find
 * the greatest common divisor of two integers n1 and n2 is as follows: First find d
 * to be the minimum of n1 and n2, then check whether d, d-1, d-2, . . . , 2, or 1 is
 * a divisor for both n1 and n2 in this order. The first such common divisor is the
 * greatest common divisor for n1 and n2. Write a program that prompts the user to
 * enter two positive integers and displays the gcd. 
 * 
 * Commentary: I will start with the sample in Listing 5.9 and modify the code to meet
 * the description as described in the exercise. I will print output as shown in listing
 * sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/1/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.14
 */

import java.util.Scanner;

public class EX14_GreatestCommonDivisor {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();
        
        // d is the divisor, using starting with the smallest of the two entries
        int d = ((n1 < n2) ? n1: n2);
        
        // if both are not equal to 0 then decrement the divisor and check again
        while (n1 % d != 0 || n2 % d != 0) {
            d--;
        }
        
        // print output of the values entered and the greatest common divisor
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + d);
    }
}
