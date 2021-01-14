/**
 * (Computing gcd) Write a method that returns the gcd of an unspecified number
 * of integers. The method header is specified as follows:
 * 
 * public static int gcd(int... numbers)
 * 
 * Write a test program that prompts the user to enter five numbers, invokes the
 * method to find the gcd of these numbers, and displays the gcd.
 * 
 * Commentary: If a greatest common denominator exists, it will be no more than the
 * smallest available number from the list, otherwise it's 1. I will need to determine
 * the minimum value of the entered numbers then cycle through the list determining the
 * gcd. If all values provide a remainder of zero after cycling through, then the value
 * is the next GCD. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/9/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.14
 */

import java.util.Scanner;

public class EX14_ComputeGCD {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // gather user input
        System.out.print("\nEnter 5 numbers to be evaluated for GCD: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        
        // pass user input through GCD method and print out GCD
        System.out.print("\nThe greatest common divisor is " + gcd(a, b, c, d, e));
    }
    
    // method to determine the gcd of a list of numbers
    public static int gcd(int... numbers) {
        int gcd = 1;    // start gcd at 1
        int minValue = min(numbers);    // determine the min value entered in list
        boolean isDivisor;  // is list checked with value a divisor
        
        // cycle through values up to the min value entered
        for (int i = 2; i <= minValue; i++) {
            isDivisor = true;
            for (int j: numbers) {  //check all values in list with incremented divisor
                if (j % i != 0) 
                    isDivisor = false;
            }
            
            if (isDivisor)  // update divisor if new divisor found
                gcd = i;
        }
        
        return gcd;
    }
    
    // method to determine the min value within a list
    public static int min(int... numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i])
                min = numbers[i];
        }
        return min;
    }
}
