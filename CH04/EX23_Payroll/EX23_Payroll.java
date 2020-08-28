/**
 * (Financial application: payroll) Write a program that reads the following information
 * and prints a payroll statement:
 * 
 *      Employee's name (e.g., Smith)
 *      Number of hours worked in a weed (e.g., 10)
 *      Hourly pay rate (e.g., 9.75)
 *      Federal tax withholding rate (e.g., 20%)
 *      State tax withholding rate (e.g., 9%)
 * 
 * A sample run is shown below:
 * 
 * --------------------------------------------------
 * Enter employee's name: Smith [ENTER]
 * Enter number of hours worked in a week: 10 [ENTER]
 * Enter hourly pay rate: 9.75 [ENTER]
 * Enter federal tax withholding rate: 0.20 [ENTER]
 * Enter state tax withholding rate: 0.09 [ENTER]
 * 
 * Empoyee name: Smith
 * Hours Worked: 10.0
 * Pay Rate: $9.75
 * Gross Pay: $97.5
 * Deductions:
 *   Federal Withholding (20.0%): $19.5
 *   State Withholding (9.0%): $8.77
 *   Total Deduction: $28.27
 * Net Pay: $69.22
 * --------------------------------------------------
 *  
 * Commentary: I will need to use basic arithmetic to calculate some of the variables based
 * on the user input. I will need to use .printf() to control the formatted output after 
 * calculating type double variables. I will print the output very closely as shown in the 
 * sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/28/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.23
 */

import java.util.Scanner;

public class EX23_Payroll {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize user input
        System.out.print("Enter employee's name: ");
        String name = input.nextLine(); 
        
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        
        System.out.print("Enter federal tax withholding rate: ");
        double fedTax = input.nextDouble();
        
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();
        
        // calculate pay, withholdings and deduction
        double grossPay = payRate * hours;
        double fedWithhold = fedTax * grossPay;
        double stateWithhold = stateTax * grossPay;
        double totDeduct = fedWithhold + stateWithhold;
        double netPay = grossPay - totDeduct;
        
        // using println and printf, print output as shown in sample run
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.printf("Pay Rate: $%-4.2f\n", payRate);
        System.out.printf("Gross Pay: $%-4.2f\n", grossPay);
        System.out.println("Deductions: ");
        System.out.printf("   Federal Withholding (%-4.2f%%): $%-4.2f\n", fedTax * 100, fedWithhold);
        System.out.printf("   State Withholding (%-4.2f%%): $%-4.2f\n", stateTax * 100, stateWithhold);
        System.out.printf("   Total Deduction: $%-4.2f\n", totDeduct);
        System.out.printf("Net Pay: $%-4.2f\n", netPay);
        
    }
        
        

}
