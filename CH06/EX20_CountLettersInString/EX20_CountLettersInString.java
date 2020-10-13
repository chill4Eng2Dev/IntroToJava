/**
 * (Count the letters in a string) Write a method that counts the number of letters in
 * a string using the following header:
 * 
 *      public static int countLetters(String s)
 * 
 * Write a test program that prompts the user to enter a string and displays the number
 * of letters in the string.
 * 
 * Commentary: I will need to check each index char and use .isLetter() to determine if 
 * the char at index is a letter. If letter, then count goes up, otherwise, check next 
 * character. I will print output as stated in problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/9/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.20
 */

import java.util.Scanner;

public class EX20_CountLettersInString {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign input to string variable
        System.out.print("\nEnter string to have letters counted: ");
        String str = input.nextLine();
        
        // print output as stated in problem statement and call countLetters method
        System.out.println("The number of letters in the string \"" + str + "\" is: " + countLetters(str));
        
    }
    
    // method counts letters in string using for loop and .isLetter() method
    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i)))
                count++;
        }
        
        return count;
    }
        
        

}
