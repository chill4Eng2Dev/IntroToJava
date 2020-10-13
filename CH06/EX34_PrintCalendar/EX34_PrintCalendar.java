/**
 * (Print calendar) Programming Exercise 3.21 uses Zeller’s congruence to calculate
 * the day of the week. Simplify Listing 6.12, PrintCalendar.java, using Zeller’s
 * algorithm to get the start day of the month.
 * 
 * For reference, the Zeller's congruence is shown below:
 * 
 *      Zeller's congruence is an algorithm developed by
 *      Christian Zeller to calculate the day of the week. The formula is
 * 
 *          h = (q + (26(m + 1)) / 10 + k + k / 4 + j / 4 + 5j) % 7
 *      
 *      where
 *      h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:
 *      Wednesday, 5: Thursday, 6: Friday).
 *      q is the day of the month
 *      m is the month (3: March, 4: April,..., 12: December). January and February
 *      are counted as months 13 and 14 of the previous year.
 *      j is the century (i.e., year / 100).
 *      k is the year of the century (i.e., year % 100).
 *  
 * Commentary: I will use Zeller's congruence to remove .getStartDay() and
 * .getTotalNumberOfDays. I will need to decreement zeller's congruence by 1 due
 * to this code using a different numerical representation of days. I will print the
 * output as shown in Listing 6.12.
 *
 * Author: chill4Eng2Dev 
 * Date: 10/12/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.34
 */

import java.util.Scanner;

public class EX34_PrintCalendar {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter year
        System.out.print("Enter full year (e.g., 2012): ");
        int year = input.nextInt();
        
        // Prompt the user to enter month
        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();
        
        // Print calendar for the month of the year
        printMonth(year, month);
    }

    /** Print the calendar for a month in a year */
    public static void printMonth(int year, int month) {
        // Print the headings of the calendar
        printMonthTitle(year, month);
        
        // Print the body of the calendar
        printMonthBody(year, month);
    }

    /** Print the month title, e.g., March 2012 */
    public static void printMonthTitle(int year, int month) {
        System.out.println("         " + getMonthName(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    /** Get the English name for the month */
    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
        case 1: monthName = "January"; break;
        case 2: monthName = "February"; break;
        case 3: monthName = "March"; break;
        case 4: monthName = "April"; break;
        case 5: monthName = "May"; break;
        case 6: monthName = "June"; break;
        case 7: monthName = "July"; break;
        case 8: monthName = "August"; break;
        case 9: monthName = "September"; break;
        case 10: monthName = "October"; break;
        case 11: monthName = "November"; break;
        case 12: monthName = "December";
        }

        return monthName;
    }

    /** Print month body */
    public static void printMonthBody(int year, int month) {
        // Get start day of the week for the first date in the month
        int startDay = getDayZellers(year, month);
        
        // Get number of days in the month
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
        
        // Pad space before the first day of the month
        int i = 0;
        for (i = 0; i < startDay; i++)
            System.out.print("    ");
        
        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);
        
            if ((i + startDay) % 7 == 0)
                System.out.println();
        }
        
        System.out.println();
    }

    // method to calculate first day of the provided month and year (0 = sunday through sat = 6), using Zeller's congruence
    public static int getDayZellers(int year, int month) {
        
        // check month parameter and set month and year to new value if needed
        if (month == 1 || month == 2) {
            month = month + 12;
            year = year - 1;
        }
               
        int q = 1; // first day of the month
        int j = year / 100;// declare and initialize century; from problem statement
        int k = year % 100;// declare and initialize year of the century; from problem statement
        
        // calculate zeller's congruence using provide formula in problem statement
        int h = (q + (26 * (month + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        
        // zeller's formula has saturday as 0, need sat to be 6 and sunday 0.
        if (h == 0)
            h = 6;
        else
            h--;
            
        return h;
    }
    
    /** Get the number of days in a month */
    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        
        if (month == 2) 
            return isLeapYear(year) ? 29 : 28;
            
        return 0; // If month is incorrect
    }
    
    /** Determine if it is a leap year */
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}

