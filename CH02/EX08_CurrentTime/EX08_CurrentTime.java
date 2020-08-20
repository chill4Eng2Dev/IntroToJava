
/**
 * (Current time) Listing 2.7, ShowCurrenttime.java, gives a program that displays
 * the current time in GMT. Revise the program so that it prompts the user to enter
 * the time zone offset to GMT and displays the time in the specified time zone. Here
 * is a sample run:
 * 
 * ---------------------------------------------
 * Enter the time zone offset to GMT: -5 [ENTER]
 * The current time is 4:50:34
 * ---------------------------------------------
 * 
 * Commentary: I will need to refer back to Listing 2.7. This excercise uses a lot of
 * modulus and division manipulation to capture values. I will then add the input value
 * from the user to the remaining hour variable. Then will print output as shown in sample 
 * run.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/19/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 2.8
 */

import java.util.Scanner;

public class EX08_CurrentTime {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare variables
        int offset;
        long totalMilliseconds, totalSeconds, currentSecond, totalMinutes, currentMinute, totalHours, currentHour;
        
        // initialize variable with user input
        System.out.print("Enter the time zone offset to GMT: ");
        offset = input.nextInt();
        
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        currentMinute = totalMinutes % 60;

        // Obtain the total hours
        totalHours = totalMinutes / 60;

        // Compute the current hour + offset value
        currentHour = (totalHours + offset) % 24;

        // Display results
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }

}