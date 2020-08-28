/**
 * (Days of a month) Write a program that prompts the user to enter a year and the
 * first three Letters of a month name (with the first letter in uppercase) and displays
 * the number of days in the month. Here is a sample run:
 * 
 * --------------------------
 * Enter a year: 2001 [ENTER]
 * Enter a month: Jan [ENTER]
 * Jan 2001 has 31 days
 * --------------------------
 * --------------------------
 * Enter a year: 2016 [ENTER]
 * Enter a month: Feb [ENTER]
 * Jan 2016 has 29 days
 * --------------------------
 * 
 * Commentary: I will need to use the year entry to determine leap year. I will build a
 * couple of strings to compare the month string to which determines days in the month.
 * I will need to use an if-else statement to cycle through the options. I will print the 
 * output as shown in the sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/27/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.17
 */

import java.util.Scanner;

public class EX17_DaysOfMonth {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize year with user input
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        
        // determine if leap year and set boolean
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        // declare and initialize month with user input
        System.out.print("Enter a month: ");
        String month = input.next();
        
        // validate if month is entered correctly
        if (!Character.isUpperCase(month.charAt(0)) || !(month.length() == 3)) {
            System.out.println("Please enter the first three letters of the month with the first letter uppercase.");
            System.exit(1);
        }

        // create base strings to compare
        String strThirtyOne = "Jan.Mar.May.Jul.Aug.Oct.Dec";
        String strThirty = "Apr.Jun.Sep.Nov";
        
        // use .contains() method to see if user input is a substring within the parent string
        if (strThirtyOne.contains(month))
            System.out.println(month + " " + year + " has 31 days");
        else if (strThirty.contains(month))
            System.out.println(month + " " + year + " has 30 days");
        else if (month.equals("Feb"))
            System.out.println(month + " " + year +  " has " + ((isLeapYear) ? 29 : 28) + " days");
        else
            System.out.println("Invalid entry. Please try again.");
            
        }
}
