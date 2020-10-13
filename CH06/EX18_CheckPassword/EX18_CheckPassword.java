/**
 * (Check password) Some websites impose certain rules for passwords. Write a
 * method that checks whether a string is a valid password. Suppose the password
 * rules are as follows:
 * 
 * ■ A password must have at least eight characters.
 * ■ A password consists of only letters and digits.
 * ■ A password must contain at least two digits.
 * 
 * Write a program that prompts the user to enter a password and displays Valid
 * Password if the rules are followed or Invalid Password otherwise.
 * 
 * Commentary: I will check each condition as its own boolean method. I will need
 * to use a loop to check each character of the string and determine if the char
 * is a valid entry. I will print output as stated in problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/10/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.18
 */

import java.util.Scanner;

public class EX18_CheckPassword {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to password variable
        System.out.print("Enter a password to test: ");
        String password = input.nextLine();
        
        // call boolean methods and print verdict based on determination
        if (checkLength(password) && checkDigitsLetters(password) && checkNumDigits(password))
            System.out.println("The password is valid.");
        else
            System.out.println("The password is not valid.");
        
    }
    
    // check password length method
    public static boolean checkLength(String password) {
        return password.length() >= 8;
    }
    
    // ensure all characters are either a digit or char
    public static boolean checkDigitsLetters(String password) {
        for (int i = 0; i < password.length(); i++)  {
            if (!Character.isLetterOrDigit(password.charAt(i)))
                return false;
        }
        
        return true;
    }
    
    // check digit count method
    public static boolean checkNumDigits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)))
                count++;
        }
        
        return count >= 2;
    }

}
