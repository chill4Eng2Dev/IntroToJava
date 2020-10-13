/**
 * (Financial application: compute commissions) Write a method that computes the
 * commission, using the scheme in Programming Exercise 5.39. The header of the
 * method is as follows:
 * 
 * public static double computeCommission(double salesAmount)
 * 
 * Write a test program that displays the following table:
 * 
 *      Sales Amount        Commission
 *      ------------------------------
 *      10000                   900.0
 *      15000                  1500.0
 *      ...
 *      95000                 11100.0
 *      100000                11700.0
 * 
 * For reference, from Exercise 5.39:
 * 
 *      Sales Amount                 Commission Rate
 *      --------------------------------------------
 *      $0.01–$5,000                       8 percent
 *      $5,000.01–$10,000                 10 percent
 *      $10,000.01 and above              12 percent
 * 
 * Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next
 * $5000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the commission
 * is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
 * 
 * Commentary: I will utilize the method to calculate the commission rate every $5000
 * of sales. I will print output as shown in the sample table.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/9/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.11
 */

public class EX11_ComputeCommissions {
    
    public static void main(String[] args) {
        
        // print headers for table
        System.out.printf("%-13s%13s\n","Sales Amount", "Commission");
        System.out.println("---------------------------");
        
        // use print sales amount and commission amount in table format
        for(int i = 10000; i <= 100000; i += 5000)
            System.out.printf("%-13d%13.1f\n", i, computeCommission(i));
         
    }
    
    // method to calculate commission
    public static double computeCommission(double salesAmount) {
        if (salesAmount <= 5000)    
            return salesAmount * 0.08;
        else if (salesAmount <= 10000)
            return 5000 * 0.08 + (salesAmount - 5000) * 0.10;
        else
            return 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12;

    }

}


