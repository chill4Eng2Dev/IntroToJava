/**
 * (Display the first days of each month) Write a program that prompts the user to
 * enter the year and first day of the year, and displays the first day of each month
 * in the year. For example, if the user entered the year 2013, and 2 for Tuesday,
 * January 1, 2013, your program should display the following output:
 * 
 *      January 1, 2013 is Tuesday
 *      ...
 *      December 1, 2013 is Sunday
 * 
 * Commentary: I will need to use previous exercises to piece together this exercise.
 * I will calculate a boolean for leap year. I will use a for loop to cycle through
 * the months, and two switch-case statements to cycle through month print out and day
 * print out. I will use an if-else statement to add the days per a month and find the
 * remainder of the added days for the first day of the next month. I will print the
 * output as described in the problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/5/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.28
 */

import java.util.Scanner;

public class EX28_FirstDaysOfEachMonth {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to year and day variables
        System.out.print("Enter the year (e.g., 2013): ");
        int year = input.nextInt();
        
        System.out.print("Enter the first day of the year (e.g., 0 = Sunday through 6 = Saturday): ");
        int day = input.nextInt();
        
        // evaluate year for leap year boolean
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);    // check if boolean
        
        // use i to cycle through the months in a for loop
        for (int i = 1; i <= 12; i++) {
            
            switch(i) {
                case 1: System.out.print("January 1, "); break;
                case 2: System.out.print("February 1, "); break;
                case 3: System.out.print("March 1, "); break;
                case 4: System.out.print("April 1, "); break;
                case 5: System.out.print("May 1, "); break;
                case 6: System.out.print("June 1, "); break;
                case 7: System.out.print("July 1, "); break;
                case 8: System.out.print("August 1, "); break;
                case 9: System.out.print("September 1, "); break;
                case 10: System.out.print("October 1, "); break;
                case 11: System.out.print("November 1, "); break;
                case 12: System.out.print("December 1, "); break;
            }
            
            // print year
            System.out.print(year);
            
            // switch through days
            switch(day) {
                case 0: System.out.println(" is Sunday"); break;
                case 1: System.out.println(" is Monday"); break;
                case 2: System.out.println(" is Tuesday"); break;
                case 3: System.out.println(" is Wednesday"); break;
                case 4: System.out.println(" is Thursday"); break;
                case 5: System.out.println(" is Friday"); break;
                case 6: System.out.println(" is Saturday"); 
            }
            
            // recalculate day remainder based on the month, this will be the first day of the next month 
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
                day = (day + 31) % 7;
            else if (i == 4 || i == 6 || i == 9 || i == 11)
                day = (day + 30) % 7;
            else 
                day = (day + ((isLeapYear) ? 29 : 28)) % 7;
        }
        
    }

}
