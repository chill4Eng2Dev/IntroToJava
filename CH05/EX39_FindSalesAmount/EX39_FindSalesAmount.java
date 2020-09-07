/**
 * (Financial application: find the sales amount) You have just started a sales job
 * in a department store. Your pay consists of a base salary and a commission. The
 * base salary is $5,000. The scheme shown below is used to determine the commission
 * rate.
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
 * Your goal is to earn $30,000 a year. Write a program that finds the minimum sales
 * you have to generate in order to make $30,000.
 * 
 * Commentary: I assume the goal is to earn $30,000 total so that will be the base plus the
 * commission rate. I will need a do while loop and cycle through each penny until the total
 * salary is equal to 30,000. I will need to calculate the graduate rate each iteration. I
 * will print the output as stated in the problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/5/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.39
 */

public class EX39_FindSalesAmount {
    
    public static void main(String[] args) {
        
        // initialize variables
        double base = 5000;
        double salary = base;
        double salesAmount = 0;
        
        do {
            
            salesAmount = salesAmount + 0.01;   // increment sales amount per penny
            salary = base;  // reset the salary to base
            
            // calculate the total salary per the graduated rate
            if (salesAmount <= 5000)    
                salary = salary + salesAmount * 0.08;
            else if (salesAmount <= 10000)
                salary = salary + 5000 * 0.08 + (salesAmount - 5000) * 0.10;
            else
                salary = salary + 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12;
        

        } while (salary < 30000);
        
        // print salary once commission rate is determined
        System.out.printf("\nThe sales amount to hit a salary of $%-5.2f is %-10.2f\n", salary, salesAmount);
        
    }
}
