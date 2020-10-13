/**
 * (Sum series) Write a method to compute the following series:
 * 
 *          m(i) = 1 / 2 + 2 / 3 + ... + i / (i + 1)
 *          
 * Write a test program that displays the following table:
 * 
 *      i           m(i)
 *      --------------------
 *      1           0.5000
 *      2           1.1667
 *      ...
 *      19          16.4023
 *      20          17.3546
 *  
 * Commentary: I will create a method that returns m(i) as double for each value 
 * of i. I will need to use a for loop to print the table while calling the sumSeries
 * method. I will print output to match the sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/13/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.13
 */

public class EX13_SumSeries {
    
    public static void main(String[] args) {
        
        // print headers for tables
        System.out.printf("\n%-10s%-10s\n", "i", "m(i)");
        System.out.println("-----------------");
        
        // print table and call sumSeries method to calculate each summations
        for (int i = 1; i <= 20; i++)
            System.out.printf("%-10d%-10.4f\n", i, sumSeries(i));
    }
    
    // method to calculate summation of series based on the iterations entered
    public static double sumSeries(int sumIterations) {
        double summation = 0;
        
        for (int i = 1; i <= sumIterations; i++) 
            summation = summation + i / (i + 1.0);
        
        return summation;
    }

}



