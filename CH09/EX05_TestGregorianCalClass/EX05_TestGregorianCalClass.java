/**
 * (Use the GregorianCalendar class) Java API has the GregorianCalendar class
 * in the java.util package, which you can use to obtain the year, month, and day of a
 * date. The no-arg constructor constructs an instance for the current date, and the methods
 * get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH),
 * and get(GregorianCalendar.DAY_OF_MONTH) return the year, month, and day.
 * Write a program to perform two tasks:
 * 
 * ■ Display the current year, month, and day.
 * ■ The GregorianCalendar class has the setTimeInMillis(long), which
 * can be used to set a specified elapsed time since January 1, 1970. Set the value
 * to 1234567898765L and display the year, month, and day.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/27/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 9.5
 */

import java.util.GregorianCalendar;

public class EX05_TestGregorianCalClass {
    
    public static void main(String[] args) {
        
        // initialize object with current date (default constructor)
        GregorianCalendar gregCal = new GregorianCalendar();
        System.out.println("The current year, month, and day is: " + gregCal.get(gregCal.YEAR) + " " + gregCal.get(gregCal.MONTH) + " " + gregCal.get(gregCal.DAY_OF_MONTH));
        
        // set seed for object and print output as described in problem statement
        gregCal.setTimeInMillis(1234567898765L);
        System.out.println("\nThe set year using, month, and day using the value '1234567898765L' is: " + gregCal.get(gregCal.YEAR) + " " + 
            gregCal.get(gregCal.MONTH) + " " + gregCal.get(gregCal.DAY_OF_MONTH));

    }
}
