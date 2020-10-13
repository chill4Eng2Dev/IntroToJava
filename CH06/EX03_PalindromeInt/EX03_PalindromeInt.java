/**
 * (Palindrome integer) Write the methods with the following headers
 * 
 * // Return the reversal of an integer, i.e., reverse(456) returns 654
 * public static int reverse(int number)
 * 
 * // Return true if number is a palindrome
 * public static boolean isPalindrome(int number)
 * 
 * Use the reverse method to implement isPalindrome. A number is a palindrome
 * if its reversal is the same as itself. Write a test program that prompts the
 * user to enter an integer and reports whether the integer is a palindrome.
 * 
 * Commentary: I will need to chain methods together. Start with isPalindrome and 
 * then chain the reverse method prior to checking the entry versus the reversed
 * value. I will use a while loop to reverse the entry to a reversed string and
 * return the string as an int using parseInt. I will print output as stated in
 * problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/7/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.3
 */

import java.util.Scanner;

public class EX03_PalindromeInt {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // user input assigned to entry value to be checked
        System.out.print("\nEnter a number: ");
        int entry = input.nextInt();
        
        // print output as stated in problem, call isPalindrome here
        System.out.println("The entry of " + entry + " is " + ((isPalindrome(entry)) ? "" : "not ") + "a palindrome");

    }
    
    // check number to the returned int from method call reverse
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
    
    public static int reverse(int number) {
        String reversedValue = ""; // use string to build reversed string
        
        while (number != 0) {
            reversedValue = reversedValue + (number % 10); 
            number = number / 10;
        }
        
        return Integer.parseInt(reversedValue); // parseInt string to return as int
    }
    
    
    
}
