/**
 * (Display calendars) Write a program that prompts the user to enter the year and
 * first day of the year and displays the calendar table for the year on the console. For
 * example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013,
 * your program should display the calendar for each month in the year, as follows:
 * 
 *                          January 2013
 *                  ---------------------------        
 *                  Sun Mon Tue Wed Thu Fri Sat
 *                            1   2   3   4   5
 *                    6   7   8   9  10  11  12
 *                   13  14  15  16  17  18  19
 *                   20  21  22  23  24  25  26
 *                   27  28  29  30  31
 *                   
 *                          December 2013
 *                  ---------------------------        
 *                  Sun Mon Tue Wed Thu Fri Sat
 *                    1   2   3   4   5   6   7
 *                    8   9  10  11  12  13  14
 *                   15  16  17  18  19  20  21
 *                   22  23  24  25  26  27  28
 *                   29  30  31
 *
 * Commentary: Use a for loop to cycle through months. Use a switch-case to print the
 * month. Print header and day names. Print blank spaces when first day of the month
 * is greater than 0. Create new variable to be a "days in month" max value and use
 * a for loop to cycle through printing the days of the month. I will print output as
 * shown in the sample run. Note: The sample shown in this code does not exactly represent 
 * what is shown in the exercise.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/5/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.29
 */

import java.util.Scanner;

public class EX29_DisplayCalendars {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to year and day variables
        System.out.print("Enter the year (e.g., 2013): ");
        int year = input.nextInt();
        
        System.out.print("Enter the first day of the year (e.g., 0 = Sunday through 6 = Saturday): ");
        int firstDay = input.nextInt();
        
        // evaluate year for leap year boolean
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);    // check if boolean
        
        // use i to cycle through the months in a for loop
        for (int i = 1; i <= 12; i++) {
            
            // print the month and year header
            switch(i) {
                case 1: System.out.printf("\n%18s %-15d\n", "January", year); break;
                case 2: System.out.printf("\n%18s %-15d\n", "February", year); break;
                case 3: System.out.printf("\n%18s %-15d\n", "March", year); break;
                case 4: System.out.printf("\n%18s %-15d\n", "April", year); break;
                case 5: System.out.printf("\n%18s %-15d\n", "May", year); break;
                case 6: System.out.printf("\n%18s %-15d\n", "June", year); break;
                case 7: System.out.printf("\n%18s %-15d\n", "July", year); break;
                case 8: System.out.printf("\n%18s %-15d\n", "August", year); break;
                case 9: System.out.printf("\n%18s %-15d\n", "September", year); break;
                case 10: System.out.printf("\n%18s %-15d\n", "October", year); break;
                case 11: System.out.printf("\n%18s %-15d\n", "November", year); break;
                case 12: System.out.printf("\n%18s %-15d\n", "December", year); break;
            }
            
            // print line break
            System.out.println("---------------------------------------");
            
            // print the day name header
            System.out.printf("%-6s%-6s%-6s%-6s%-6s%-6s%-6s\n","Sun","Mon","Tue","Wed", "Thu", "Fri", "Sat");
            
            // print spacing should the firstDay not be 0
            for (int j = 0; j < firstDay; j++) 
                System.out.print("      ");
            
            // use count for printing days and creating a new line, initialize days in month
            int count = firstDay;    
            int daysInMonth = 0;
            
            // recalculate first day of next month and assign days in a month 
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                firstDay = (firstDay + 31) % 7;
                daysInMonth = 31;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                firstDay = (firstDay + 30) % 7;
                daysInMonth = 30;
            } else {
                firstDay = (firstDay + ((isLeapYear) ? 29 : 28)) % 7;
                daysInMonth = ((isLeapYear) ? 29 : 28);
            }
            
            // print calendar and step to next line as necessary using count
            for (int k = 1; k <= daysInMonth; k++) {
                
                if (count == 7) {
                    System.out.println();
                    count = 0;
                } 
                
                System.out.printf("%2d    ", k);
                count++;
                
            }
            
            System.out.println();
        }
        
    }
}
