/**
 * (Summation) Write a program to compute the following summation.
 * 
 * 1/(1 + 2^0.5) + 1/(2^0.5 + 3^0.5) + 1/(3^0.5 + 4^0.5) + ... + 1/(624^0.5 + 625^0.5) 
 * 
 * Commentary: I will right a for loop that will sum the series with the pattern
 * shown above. I will print out the result of the sum at the end of the for loop.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/3/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.35
 */

public class EX35_Summation {
    
    public static void main(String[] args) {
        
        // initialize variables
        double sum = 0;
        
        // use for loop to sum series
        for (int i = 1; i <= 624; i++)
            sum = sum + 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
        
        // print output of sum
        System.out.println("The sum of the series is: " + sum);
        
    }

}
