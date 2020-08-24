/**
 * (Science: day of the week) Zeller's congruence is an algorithm developed by
 * Christian Zeller to calculate the day of the week. The formula is
 * 
 *      h = (q + (26(m + 1)) / 10 + k + k / 4 + j / 4 + 5j) % 7
 *      
 * where
 * h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:
 * Wednesday, 5: Thursday, 6: Friday).
 * q is the day of the month
 * m is the month (3: March, 4: Aprial,..., 12: December). January and February
 * are counted as months 13 and 14 of the previous year.
 * j is the century (i.e., year / 100).
 * k is the year of the century (i.e., year % 100).
 * Note that the division in the formula performs an integer division. Write a program
 * that prompts the user to enter a year, month, and day of the month, and displays
 * the name of the day of the week. Here are some sample runs:
 * 
 * -----------------------------------------------
 * Enter year: (e.g., 2012): 2015 [ENTER]
 * Enter month: 1-12: 1 [ENTER]
 * Enter the day of the month: 1-31: 25 [ENTER]
 * Day of the week is Sunday
 * -----------------------------------------------
 * -----------------------------------------------
 * Enter year: (e.g., 2012): 2012 [ENTER]
 * Enter month: 1-12: 5 [ENTER]
 * Enter the day of the month: 1-31: 12 [ENTER]
 * Day of the week is Saturday
 * -----------------------------------------------
 * 
 * (Hint: January and February are counted as 13 and 14 in the formula, so you need
 * to convert the user input 1 to 13 and 2 to 14 for the month and change the year to
 * the previous year.)
 * 
 * Commentary: I will need to use an if statement to check the users input and make 
 * sure the values are within the acceptable parameters. I will require a couple of 
 * switch-case statements to cycle through day output and month input. I will print 
 * output to match the sample runs. It seems that the formula accounts for leap year 
 * so I added a month switch-case statement to let the user know how many days are
 * within a month, including leap year.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/23/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.21
 */

import java.util.Scanner;

public class EX21_DayOfTheWeek {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and intialize year with user input        
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        
        // determine if leap year and set boolean, this will be user in month switch statement prompt
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        // declare and initalize month with user input
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        
        // check month parameter and set month and year to new value if needed
        if (month == 1 || month == 2) {
            month = month + 12;
            year = year - 1;
        }
        
        // month switch statement to let the user know how many days are in a month, including leap year    
        System.out.print("Enter the day of the month: ");
        switch (month) {
            case 3: System.out.print("1 - 31: "); break;
            case 4: System.out.print("1 - 30: "); break;
            case 5: System.out.print("1 - 31: "); break;
            case 6: System.out.print("1 - 30: "); break;
            case 7: System.out.print("1 - 31: "); break;
            case 8: System.out.print("1 - 31: "); break;
            case 9: System.out.print("1 - 30: "); break;
            case 10: System.out.print("1 - 31: "); break;
            case 11: System.out.print("1 - 30: "); break;
            case 12: System.out.print("1 - 31: "); break;
            case 13: System.out.print("1 - 31: "); break;
            case 14: System.out.print("1 - " + (isLeapYear ? "29: " : "28: "));
        }
       
        int q = input.nextInt(); // declare and initialize variable with user input
        
        // declare and initialize century; from problem statement
        int j = year / 100;
        
        // declare and initialize year of the century; from problem statement
        int k = year % 100;
        
        // calculate zeller's congruence using provide formula in problem statement
        int h = (q + (26 * (month + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        
        // use a switch-case statement to state the day of the week
        System.out.print("Day of the week is ");
        switch (h) {
            case 0: System.out.println("Saturday"); break;
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday");
        }
            
    }
}
