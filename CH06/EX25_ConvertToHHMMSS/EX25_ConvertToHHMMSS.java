
/**
 * (Convert milliseconds to hours, minutes, and seconds) Write a method that converts
 * milliseconds to hours, minutes, and seconds using the following header:
 * 
 *      public static String convertMillis(long millis)
 * 
 * The method returns a string as hours:minutes:seconds. For example,
 * convertMillis(5500) returns a string 0:0:5, convertMillis(100000) returns
 * a string 0:1:40, and convertMillis(555550000) returns a string 154:19:10.
 * 
 * Commentary: I will need to extract hours, mins, and secs from the user input value.
 * I will use Listing 2.7 as my skeleton code and adjust as necessary. I will print output
 * as stated in the problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/10/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.25
 */

import java.util.Scanner;

public class EX25_ConvertToHHMMSS {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to variable to be converted
        System.out.print("Enter milliseconds to be converted: ");
        long millis = input.nextLong();
        
        // print output as stated in problem statement and call convertMillis
        System.out.println("The time converted to HH:MM:SS is: " + convertMillis(millis));
        
    }
    
    // method to conver milliseconnds to HH:MM:SS
    public static String convertMillis(long millis) {
        long sec = millis / 1000;       
        long hours = sec / (60 * 60);   
        sec %= (60 * 60);               
        long mins = sec / 60;
        sec %= 60;
        
        return hours + ":" + mins + ":" + sec;
    }

}
