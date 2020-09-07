/**
 * (Display leap years) Write a program that displays all the leap years, ten per line,
 * from 101 to 2100, separated by exactly one space. Also display the number of
 * leap years in this period.
 * 
 * For reference, to calculate if a year is a leap year:
 *        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
 * 
 * Commentary: 
 *
 * Author: chill4Eng2Dev 
 * Date: 9/2/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.27
 */

public class EX27_DisplayLeapYears {
    
    public static void main(String[] args) {
        
        // initialize variables
        boolean isLeapYear = false;
        int leapYearCount = 0;
        
        // increment a for loop between years 101 to 2100
        for (int i = 101; i <= 2100; i++) {
            isLeapYear = (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0);    // check if boolean
            if (isLeapYear) {
                // if leap year, print per problem statement instructions
                if (leapYearCount % 10 == 0)
                    System.out.print("\n" + i + " ");
                else
                    System.out.print(i + " ");
                
                leapYearCount++; // increment a counter per problem statement
            }
        }
        
        // print output as stated in the problem statement
        System.out.println("\nThe occurences of leap years between years 101 and 2100 is " + leapYearCount);
    }
            

}
