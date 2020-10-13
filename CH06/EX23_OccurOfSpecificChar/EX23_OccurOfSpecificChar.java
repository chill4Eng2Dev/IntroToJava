/**
 * (Occurrences of a specified character) Write a method that finds the number of
 * occurrences of a specified character in a string using the following header:
 * 
 *      public static int count(String str, char a)
 * 
 * For example, count("Welcome", 'e') returns 2. Write a test program that
 * prompts the user to enter a string followed by a character and displays the number
 * of occurrences of the character in the string.
 * 
 * Commentary: I will need to use a for loop within the count method to cycle through
 * the string and count the number of times the character is found. I will print
 * output as stated in problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/9/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.23
 */

import java.util.Scanner;

public class EX23_OccurOfSpecificChar {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user inputs to variables
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        System.out.print("Enter a character to be counted in string: ");
        char ch = input.next().charAt(0);
        
        // print output as stated in problem statement and call count method
        System.out.println("The number of times " + ch + " is found in the string " + str + " is " + count(str, ch));
        
    }
    
    // method to count char found in string, removed case sensitivity
    public static int count(String str, char a) {
        int count = 0;
        str = str.toLowerCase();
        a = Character.toLowerCase(a);
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a)
                count++;
        }
        
        return count;
    }
        

}
