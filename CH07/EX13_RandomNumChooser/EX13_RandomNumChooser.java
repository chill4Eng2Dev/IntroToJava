/**
 * (Random number chooser) Write a method that returns a random number between
 * 1 and 54, excluding the numbers passed in the argument. The method header is
 * specified as follows:
 * 
 * public static int getRandom(int... numbers)
 * 
 * Commentary: I will need to use a test main method to pass through values. I will
 * use a while loop to process the excluded numbers within the getRandom method.
 * A for-each loop will need to be used to check if the random number is excluded
 * from the numbers array, if not, return value.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/9/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.13
 */

import java.util.Scanner;

public class EX13_RandomNumChooser {

    // main to test and call getRandom
    public static void main(String[] args) {
        System.out.println(getRandom(1, 3, 5, 6, 45, 14, 19));
    }
        
    // method to return a unique number that is not excluded from entry
    public static int getRandom(int... numbers) {
        int ranNum = -1;            // initialize, otherwise will not run
        boolean isExcluded = true;  // boolean statement
        while (isExcluded) {
            ranNum = 1 + (int)(Math.random() * 54); // generate random number
            for (int e: numbers) {  // cycle through array and determine if number is excluded
                if (e != ranNum)
                    isExcluded = false;
            }
        }
           
        return ranNum;  // return random number number
    }
}
