/**
 * (Format an integer) Write a method with the following header to format the integer
 * with the specified width.
 * 
 *      public static String format(int number, int width)
 * 
 * The method returns a string for the number with one or more prefix 0s. The size
 * of the string is the width. For example, format(34, 4) returns 0034 and format(
 * 34, 5) returns 00034. If the number is longer than the width, the method
 * returns the string representation for the number. For example, format(34, 1)
 * returns 34.
 * 
 * Write a test program that prompts the user to enter a number and its width and
 * displays a string returned by invoking format(number, width).
 *  
 * Commentary: I will need to conver the number to string and compare the string length
 * to the width number to determine how to process. I will concatenate the 0's to a string
 * and then append the number string at the end. I will print output as stated in the
 * problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/10/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.37
 */

import java.util.Scanner;

public class EX37_FormatInteger {
    
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to number and width
        System.out.print("\nEnter a number to format: ");
        int number = input.nextInt();
        
        System.out.print("Enter a width for format: ");
        int width = input.nextInt();
        
        // print output per problem statement and call format method
        System.out.println("The formatted number is: " + format(number, width));
    }
    
    // method to return string with new format
    public static String format(int number, int width) {
        String str = "";
        String num = number + "";
        
        if (width <= num.length()) // return number if width is less than number length
            return num;
        else {
            for (int i = 0; i < width - num.length(); i++)
                str = str.concat("0");
                
            return str.concat(num);
        }
    }
}
