
/**
 * (Financial application: loan amortization schedule) The monthly payment for a
 * given loan pays the principal and the interest. The monthly interest is computed
 * by multiplying the monthly interest rate and the balance (the remaining principal).
 * The principal paid for the month is therefore the monthly payment minus
 * the monthly interest. Write a program that lets the user enter the loan amount,
 * number of years, and interest rate and displays the amortization schedule for the
 * loan. Here is a sample run:
 * 
 * -------------------------------------------------------------
 * Loan Amount: 10000 [ENTER]
 * Number of Years: 1 [ENTER]
 * Annual Interest Rate: 7 [ENTER]
 * 
 * Monthly Payment: 865.26
 * Total Payment: 10383.21
 * 
 * Payment#     Interest        Principal       Balance
 * 1            58.33           806.93          9193.07
 * 2            53.62           811.64          8381.43
 * ...
 * 11           10.0            855.26          860.27
 * 12           5.01            860.25          0.01
 * -------------------------------------------------------------   
 * Note
 * The balance after the last payment may not be zero. If so, the last payment should be
 * the normal monthly payment plus the final balance.

 * Hint: Write a loop to display the table. Since the monthly payment is the
 * same for each month, it should be computed before the loop. The balance
 * is initially the loan amount. For each iteration in the loop, compute the
 * interest and principal, and update the balance. The loop may look like this:
 *      for (i = 1; i <= numberOfYears * 12; i++) {
 *          interest = monthlyInterestRate * balance;
 *          principal = monthlyPayment - interest;
 *          balance = balance - principal;
 *          System.out.println(i + "\t\t" + interest
 *          + "\t\t" + principal + "\t\t" + balance);
 *      }
 * 
 * For reference, the formula from Listing 2.9 is: 
 *     monthlyPayment =               loanAmount * monthlyInterestRate 
 *                      ----------------------------------------------------------
 *                      (1 - 1 / (1 + monthlyInterestRate) ^ (numberOfYears * 12))
 *                      
 * Commentary: I will need to use Listing 2.9's monthly payment formula and the provided
 * algorithm to complete this problem. I will likely trade out the println() method for
 * printf(). I print output to match sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/2/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.22
 */

import java.util.Scanner;

public class EX22_LoanAmortizationSchedule {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user inputs to variables
        System.out.print("\nLoan Amount: ");
        double amount = input.nextDouble();
        
        System.out.print("Number of Years: ");
        int numOfYears = input.nextInt();
        
        System.out.print("Annual Interest Rate: ");
        double intRate = input.nextDouble();
        
        // calculate monthly interest rate and payment
        double monthlyIntRate = intRate / 1200;
        
        double monthlyPayment = (amount * monthlyIntRate) / (1.0 - 1.0 / Math.pow(1 + monthlyIntRate, numOfYears * 12));
        
        // print monthly payment and total payment
        System.out.printf("Monthly Payment: %-5.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %-8.2f\n", (monthlyPayment * numOfYears * 12));
        
        // declare variables for loop
        double interest, principal, balance = amount;
        
        // print headers of the table
        System.out.printf("%-15s%-15s%-15s%-15s\n", "Payment#", "Interest", "Principal", "Balance");
        
        // use for loop provided in problem statement and print table
        for (int i = 1; i <= numOfYears * 12; i++) {
            interest = monthlyIntRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%-15d%-15.2f%-15.2f%-15.2f\n", i, interest, principal, balance);
        }
        
    }
        
        

}
