/**
 * (Use the Date class) Write a program that creates a Date object, sets its elapsed
 * time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
 * 10000000000, and 100000000000, and displays the date and time using the
 * toString() method, respectively.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/27/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 9.3
 */

import java.util.Date;

public class EX03_TestDateClass {
    
    public static void main(String[] args) {
        // initialize date object
        Date date = new Date();
        
        // set max long variable
        long max = 100000000000L;
        
        // print output as described in problem statement
        for (long i = 10000; i <= max; i *= 10) {
            date.setTime(i);
            System.out.printf("\nThe date and time is: %-20s", date.toString());        
        }
        
    }
}
