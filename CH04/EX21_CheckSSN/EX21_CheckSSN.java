
/**
 * (Check SSN) Write a program that prompts the user to enter a Social Security
 * number in the format DDD-DD-DDDD, where D is a digit. Your program should
 * check whether the input is valid. Here are sample runs:
 * 
 * -----------------------------------------------
 * Enter a SSN: 232-23-5435 [ENTER]
 * 232-23-5435 is a valid social security number
 * -----------------------------------------------
 * -----------------------------------------------
 * Enter a SSN: 23-23-5435 [ENTER]
 * 23-23-5435 is an invalid social security number
 * -----------------------------------------------
 *  
 * Commentary: I will need to check if the hyphens are in the correct location. I can
 * likely create substrings of each group of numbers and convert to integer and check length.
 * If these two items work, then the entry should be sufficient. If it doesn't convert well
 * then the entry is invalid. I will print the output as shown in the sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/28/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.21
 */

import java.util.Scanner;

public class EX21_CheckSSN {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int threeDigit, twoDigit, fourDigit;
        
        System.out.print("Enter a SSN: ");
        String str = input.nextLine();
        
        if ((str.length() == 11) && str.charAt(3) == '-' && str.charAt(6) == '-') {
            threeDigit = Integer.parseInt(str.substring(0, str.indexOf('-')));
            twoDigit = Integer.parseInt(str.substring(str.indexOf('-') + 1, str.lastIndexOf('-')));
            fourDigit = Integer.parseInt(str.substring(str.lastIndexOf('-') + 1));
            System.out.println(str + " is a valid social security number");
        } else
            System.out.println(str + " is an invalid social security number");
        
    }
            
}
