
/**
 * (Sum a series) Write a program to sum the following series:
 * 
 * ---------------------------------------------------------------
 *      1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99
 * ---------------------------------------------------------------
 * 
 * Commentary: I will right a for loop that will sum the series with the pattern
 * of i / 2 * i. I will print out the result of the sum at the end of the for loop.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/2/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.24
 */

public class EX24_SumASeries {
    
    public static void main(String[] args) {
        
        // initialize sum variable as 0
        double sum = 0;
        
        // for loop to sum the series
        for (int i = 1; i < 97; i++) 
            sum = sum + i / (2.0 * i);
            
        // print the sum as the output
        System.out.println("The sum of the series is: " + sum);
        
    }
}
