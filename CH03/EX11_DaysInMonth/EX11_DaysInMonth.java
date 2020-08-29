/**
 * (Find the number of days in a month) Write a program that prompts the user
 * to enter the month and year and displays the number of days in the month. For
 * example, if the user entered month 2 and year 2012, the program should display
 * that February 2012 had 29 days. If the user entered month 3 and year 2015, the
 * program should display that march 2015 had 31 days.
 * 
 * Commentary: I will need to Listing 3.7 to determine if the input year is a leap
 * year. I can use a switch statement to cycle through the months and will have
 * an if statement within the February month to determine number of days.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/21/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.11
 */

import java.util.Scanner;

public class EX11_DaysInMonth {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize variables with user input
        System.out.print("Enter the month number (1-12): ");
        int month = input.nextInt();
        
        System.out.print("Enter the year (e.g., 2012): ");
        int year = input.nextInt();
        
        // determine if leap year and set boolean
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        // use switch-case statement to cycle through months, use if statement to determine february days
        switch (month) {
            case 1: System.out.println("January " + year + " had 31 days"); break;
            case 2: System.out.println("February " + year + " had " + (isLeapYear ? "29 days" : "28 days")); break;
            case 3: System.out.println("March " + year + " had 31 days"); break;
            case 4: System.out.println("April " + year + " had 30 days"); break;
            case 5: System.out.println("May " + year + " had 31 days"); break;
            case 6: System.out.println("June " + year + " had 30 days"); break;
            case 7: System.out.println("July " + year + " had 31 days"); break;
            case 8: System.out.println("August " + year + " had 31 days"); break;
            case 9: System.out.println("September " + year + " had 30 days"); break;
            case 10: System.out.println("October " + year + " had 31 days"); break;
            case 11: System.out.println("November " + year + " had 30 days"); break;
            case 12: System.out.println("December " + year + " had 31 days");
        }
        
    }
}
