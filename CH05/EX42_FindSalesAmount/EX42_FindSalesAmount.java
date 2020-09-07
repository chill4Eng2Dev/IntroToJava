/**
 * (Financial application: find the sales amount) Rewrite Programming Exercise
 * 5.39 as follows:
 * Use a for loop instead of a do-while loop.
 * Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant.
 * 
 * For reference, the graduated commission table is shown below:
 *      Sales Amount                 Commission Rate
 *      --------------------------------------------
 *      $0.01–$5,000                       8 percent
 *      $5,000.01–$10,000                 10 percent
 *      $10,000.01 and above              12 percent
 * 
 * Commentary: I will use user input to calculate sales amount required to achieve
 * the sought after commission. I will use a for loop to cycle through the sales amount
 * needed as commission and sought after commission are compared. I will print the output
 * as stated in the problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/5/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.42
 */

import java.util.Scanner;

public class EX42_FindSalesAmount {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign the sought after commission to a constant
        System.out.print("Enter a commission you would like to make: ");
        final double COMMISSION_SOUGHT = input.nextDouble();
        
        // declare or initialize variables
        double salesAmount;
        double commission = 0;
        
        // increment sales amount in for loop should the calculate commission not be commission sought
        for (salesAmount = 0.01; commission < COMMISSION_SOUGHT; salesAmount += 0.01) {
            
            if (salesAmount <= 5000)    
                commission = salesAmount * 0.08;
            else if (salesAmount <= 10000)
                commission = 5000 * 0.08 + (salesAmount - 5000) * 0.10;
            else
                commission = 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12;

        }
        
        // print required sales amount to achieve commission sought
        System.out.printf("\nThe commission sought is %-5.2f and you will need to sale $%-7.2f worth " +
                        "of goods to achieve the sought after commission.", COMMISSION_SOUGHT, salesAmount);
        
    }
}
