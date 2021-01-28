/**
 * (Use the Random class) Write a program that creates a Random object with seed
 * 1000 and displays the first 50 random integers between 0 and 100 using the
 * nextInt(100) method.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/27/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 9.4
 */

import java.util.Random;

public class EX04_TestRandomClass {
    
    public static void main(String[] args) {
        
        // initialize object with seed
        Random rand = new Random(1000);
        
        // print output as described in problem statement
        for (int i = 1; i <= 50; i++) {
            if (i % 10 == 0)
                System.out.printf("%-3d \n",rand.nextInt(100));
            else
                System.out.printf("%-3d ", rand.nextInt(100));
        }
        
    }

}
