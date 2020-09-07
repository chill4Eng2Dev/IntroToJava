
/**
 * (Demonstrate cancellation errors) A cancellation error occurs when you are
 * manipulating a very large number with a very small number. The large number
 * may cancel out the smaller number. For example, the result of 100000000.0 +
 * 0.000000001 is equal to 100000000.0. To avoid cancellation errors and obtain
 * more accurate results, carefully select the order of computation. For example, in
 * computing the following series, you will obtain more accurate results by computing
 * from right to left rather than from left to right:
 * 
 * -------------------------------
 *      1 + 1/2 + 1/3 + ... + 1/n
 * -------------------------------
 * 
 * Write a program that compares the results of the summation of the preceding
 * series, computing from left to right and from right to left with n = 50000.
 * 
 * Commentary: I will create two for loops with two sum variables. I will sum one
 * series left to right, and another series right to left. I will print the two sum
 * series independently and show the difference between the two values.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/2/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.23
 */

public class EX23_DemoCancellationErrors {
    
    public static void main(String[] args) {
        
        // initialize sum1 and loop through series, left to right
        double sum1 = 0;
        for (int i = 1; i <= 50000; i++)
            sum1 = sum1 + (1.0 / i);
        // print output of series
        System.out.println("Sum of series (1) left to right: " + sum1);
        
        // initialize sum2 and loop through series, right to left
        double sum2 = 0;
        for (int j = 50000; j >= 1; j--)
            sum2 = sum2 + (1.0 / j);
        // print output of series    
        System.out.println("Sum of series (2) right to left: " + sum2);
        
        // calculate and print the difference between the two loops
        System.out.println("The difference between both numbers is (1 - 2): " + (sum1 - sum2));
        
        
    }
}
