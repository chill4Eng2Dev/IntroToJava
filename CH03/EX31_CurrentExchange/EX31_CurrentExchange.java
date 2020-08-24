/**
 * (Financials: currency exchange) Write a program that prompts the user to enter
 * the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user
 * to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
 * Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars
 * or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively. Here
 * are the sample runs:
 * 
 * -------------------------------------------------------------
 * Enter the exchange rate from dollars to RMB: 6.81 [ENTER]
 * Enter 0 to convert dollars to RMB and 1 vice versa: 0 [ENTER]
 * Enter the dollar amount: 100 [ENTER]
 * $100.0 is 681.0 yuan
 * -------------------------------------------------------------
 * -------------------------------------------------------------
 * Enter the exchange rate from dollars to RMB: 6.81 [ENTER]
 * Enter 0 to convert dollars to RMB and 1 vice versa: 5 [ENTER]
 * Enter the dollar amount: 10000 [ENTER]
 * 10000.0 yuan is $1468.43
 * -------------------------------------------------------------
 * 
 * Commentary: Entry for conversion option in sample run has "5" which I think is a typo? 
 * But I will just allow any value greater than 0 be a conversion operation. I will use 
 * if statements and convert values accordingly. I will then need to print output as shown 
 * in sample runs. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/23/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.31
 */

import java.util.Scanner;

public class EX31_CurrentExchange {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare variables
        double money;
        
        // declare and initialize variables with user input
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int conversion = input.nextInt();
        
        if (conversion == 0) {      // gather money input and print output as shown in sample run
            System.out.print("Enter the dollar amount: ");
            money = input.nextDouble();
            System.out.println("$" + money + " is " + (money * exchangeRate) + " yuan");
        } else {        // gather money input and print output as shown in sample run
            System.out.print("Enter the RMB amount: ");
            money = input.nextDouble();
            System.out.println(money + " yuan is $" + ((int)(money * 100 / exchangeRate) / 100.0));
        }
    }

}
