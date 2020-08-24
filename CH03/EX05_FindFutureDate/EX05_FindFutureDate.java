/**
 * (Find future dates) Write a program that prompts the user to enter an integer for
 * today's day of the week (Sunday is 0, Monday is 1, ..., and Saturday is 6). Also
 * prompt the user to enter the number of days after today for a future day and display
 * the future day of the week. Here is a sample run:
 * 
 * --------------------------------------------------------
 * Enter today's day: 1 [ENTER]
 * Enter the number of days elapsed since today: 3 [ENTER]
 * Today is Monday and the future day is Thursday
 * --------------------------------------------------------
 * --------------------------------------------------------
 * Enter today's day: 0 [ENTER]
 * Enter the number of days elapsed since today: 31 [ENTER]
 * Today is Sunday and the future day is Wednesday
 * --------------------------------------------------------
 * 
 * Commentary: I will need to have two switch statements. One switch statement for the
 * first entry, the second switch statement for the adjusted day count, using modulus
 * to find the remainder. The print statements will be broken up between the two
 * switch statements. I will print the output as shown in the sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/21/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.5
 */

import java.util.Scanner;

public class EX05_FindFutureDate {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize variable with user input
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDays = input.nextInt();
        
        // calculate the second switch statements variable
        int adjustedDays = (today + elapsedDays) % 7;
        
        // switch statement for first today
        switch (today) {
            case 0: System.out.print("Today is Sunday "); break;
            case 1: System.out.print("Today is Monday "); break;
            case 2: System.out.print("Today is Tuesday "); break;
            case 3: System.out.print("Today is Wednesday "); break;
            case 4: System.out.print("Today is Thursday "); break;
            case 5: System.out.print("Today is Friday "); break;
            case 6: System.out.print("Today is Saturday "); 
        }
        
        // switch statement for today plus elapsed days
        switch (adjustedDays) {
            case 0: System.out.println("and the future day is Sunday"); break;
            case 1: System.out.println("and the future day is Monday"); break;
            case 2: System.out.println("and the future day is Tuesday"); break;
            case 3: System.out.println("and the future day is Wednesday"); break;
            case 4: System.out.println("and the future day is Thursday"); break;
            case 5: System.out.println("and the future day is Friday"); break;
            case 6: System.out.println("and the future day is Saturday");
        }
        
    }
}
