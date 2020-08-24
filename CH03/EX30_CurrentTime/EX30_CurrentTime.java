/**
 * (Current time) Revise Programming Exercise 2.8 to display the hour using a
 * 12-hour clock. Here is sample run:
 * 
 * --------------------------------------------------------
 * Enter the time zone offset to GMT: -5 [ENTER]
 * The current time is 4:50:34 AM
 * --------------------------------------------------------
 * 
 * Commentary: I will need to modify Exercise 2.8 and update the output. I will likely
 * need to use division and modulus and add an "AM" or "PM" unit to define the time 
 * further. I will then need to print output as shown in sample runs. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/23/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.30
 */

import java.util.Scanner;

public class EX30_CurrentTime {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();
        
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = (totalHours + offset) % 24;

        // Display results - revised with currentHour division checked, if value greater than 0 then PM
        System.out.println("Current time is " + ((currentHour / 12 > 0) ? currentHour % 12 : currentHour) + ":" + 
        currentMinute + ":" + currentSecond + ((currentHour / 12 > 0) ? " PM " : " AM ") + "GMT");
    }
}
