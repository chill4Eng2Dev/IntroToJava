
/**
 * (Find the number of years) Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion), and displays the number of years and days for the
 * minutes. For simplicity, assume a year has 365 days. Here is a sample run:
 * 
 * -----------------------------------------------------------
 * Enter the number of minutes: 1000000000 [ENTER]
 * 1000000000 minutes is approximately 1902 years and 214 days
 * -----------------------------------------------------------
 *
 * Commentary: I will need to use modulus to extract the remainder of minutes after
 * calculating years. Then using remainder, can calculate days. Then will print output
 * as shown in sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/19/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.7
 */

import java.util.Scanner;

public class EX07_NumOfYears {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare variables of type int
        int years, days, minutes, minsRemain;
        
        // gather user input
        System.out.print("Enter the number of minutes: ");
        minutes = input.nextInt();
        
        // calculate years, remaining minutes, and days from user input
        years = minutes / (365 * 24 * 60);          // mins / (365 d / yr * 24 hr / d * 60 min / hr)
        minsRemain = minutes % (365 * 24 * 60);
        days = minsRemain / (24 * 60);              // mins / (24 hr / d * 60 mins / hr)
        
        // print out outputs as shown in sample run
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
