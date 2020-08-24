
/**
 * (Sort three integers) Write a program that prompts the user to enter three integers
 * and display the integers in non-decreasing order.
 * 
 * Commentary: I will need to assign user input to variables and develop multiway if-else 
 * nested statements that check the three statements. I will print the list of values
 * in ascending order.  
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/21/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.8
 */

import java.util.Scanner;

public class EX08_SortThreeIntegers {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize variables with user input
        System.out.print("Enter 3 integers to be sorted in ascending order: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        // multiway nested if-else statement
        if (num1 > num2 && num1 > num3) {   // num1 will be largest value
            if (num2 > num3)
                System.out.println("The numbers in ascending order are: " + num3 + ", " + num2 + ", " + num1);
            else
                System.out.println("The numbers in ascending order are: " + num2 + ", " + num3 + ", " + num1);
        } else if (num2 > num1 && num2 > num3) {    // num2 will be largest value
            if (num1 > num3)
                System.out.println("The numbers in ascending order are: " + num3 + ", " + num1 + ", " + num2);
            else
                System.out.println("The numbers in ascending order are: " + num1 + ", " + num3 + ", " + num2);
        } else if (num1 > num2)     // num3 will be largest value
            System.out.println("The numbers in ascending order are: " + num2 + ", " + num1 + ", " + num3);
        else
            System.out.println("The numbers in ascending order are: " + num1 + ", " + num2 + ", " + num3);
            
    }
} 
