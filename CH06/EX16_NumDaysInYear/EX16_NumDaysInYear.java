/**
 * (Number of days in a year) Write a method that returns the number of days in a
 * year using the following header:
 * 
 *      public static int numberOfDaysInAYear(int year)
 * 
 * Write a test program that displays the number of days in year from 2000 to 2020.
 * 
 * Commentary: I will use isLeapYear method to check the year and if the year has
 * 365 days versus 366 days. I will print the output as stated in the problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/9/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.16
 */

public class EX16_NumDaysInYear {
    
    public static void main(String[] args) {
        // print header of table
        System.out.println("The number of days in the years between 2000 to 2020 is: ");
        System.out.printf("\n%-10s%-10s\n", "Year", "Days");
        System.out.println("--------------");
        
        // for loop to print out the table and call method for days in a year
        for (int i = 2000; i <= 2020; i++)
            System.out.printf("%-10d%-10d\n", i, numberOfDaysInAYear(i));
    }

    // method to return number of days and calls isLeapYear
    public static int numberOfDaysInAYear(int year) {
        return (isLeapYear(year) ? 366 : 365);
    }
    
    // method to provide true/false if leap year
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
    
}
