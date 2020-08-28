/**
 * (Financial application: monetary unit) Rewrite Listing 2.10, ComputeChange.
 * java, to fix the possible loss of accuracy when converting a float value to an int
 * value. Read the input as a string such as "11.56". Your program should extract
 * the dollar amount before the decimal point and the cents after the decimal amount
 * using the indexOf and substring methods.
 * 
 * Commentary: I will need to use substring and indexOf to extract portions of the string
 * just before and after the decimal point. I will revise Listing 2.10 to use the newly
 * extracted variables to achieve the same output as shown in the Listing 2.10 sample run. 
 *
 * Author: chill4Eng2Dev 
 * Date: 8/27/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.26
 */

import java.util.Scanner; 

public class EX26_MonetaryUnits {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // Receive the amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        String amount = input.nextLine();

        String dollars = amount.substring(0, amount.indexOf('.'));
        int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));
                
        // Find the number of quarters in cents variable
        int numberOfQuarters = cents / 25;
        cents = cents % 25;
        
        // Find the number of quarters in cents variable
        int numberOfDimes = cents / 10;
        cents = cents % 10;
        
        // Find the number of quarters in cents variable
        int numberOfNickels = cents / 5;
        cents = cents % 5;
        
        // Find the number of quarters in cents variable
        int numberOfPennies = cents;
        
        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + dollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
     }
}
