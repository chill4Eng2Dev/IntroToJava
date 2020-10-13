/**
 * (Display an integer reversed) Write a method with the following header to display
 * an integer in reverse order:
 * 
 *      public static void reverse(int number)
 * 
 * For example, reverse(3456) displays 6543. Write a test program that prompts
 * the user to enter an integer and displays its reversal.
 * 
 * Commentary: I will use use a while loop to cycle through the int value within
 * the reverse method. I will print the output as stated in problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/7/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.4
 */

import java.util.Scanner;

public class EX04_DisplayIntReversed {
    
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to entry variable
        System.out.print("\nEnter a number: ");
        int entry = input.nextInt();
        
        // print output of reversal
        System.out.print("The reversal of " + entry + " is: ");
        reverse(entry);
        
    }
    
    // use while loop to print passed through number
    public static void reverse(int number) {
        while (number != 0) {
            System.out.print(number % 10);
            number = number / 10;
        }
    }
}
