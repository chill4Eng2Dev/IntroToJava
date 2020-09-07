
/**
 * (Compute PI) You can approximate PI by using the following series:
 * 
 *      PI = 4(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + (-1)^i+1 / (2i - 1))
 *  
 * Write a program that displays the p value for i = 10000, 20000, ..., and
 * 100000.
 * 
 * Commentary: I will use the formula provided within a for loop and have the
 * incrementer and value of pi printed every 10,000 increments in a table.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/2/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.25
 */

public class EX25_ComputePI {
    
    public static void main(String[] args) {
        
        // initialize the pi variable
        double pi = 0;
        
        // print out header for pi and i table
        System.out.printf("\n%-15s%-15s\n", "PI", "i value");
        System.out.println("----------------------");
        
        // use a for loop to calculate and print out the approximation of pi
        for (int i = 1; i <= 100000; i++) {
            pi = pi + 4.0 * (Math.pow(-1.0, i + 1) / (2.0 * i - 1.0));
            if (i % 10000 == 0)
                System.out.printf("%-1.9f    %-15d\n", pi, i);

        }
        
    }
}
