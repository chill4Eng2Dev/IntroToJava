/**
 * (Use the &&, ||, and ^ operators) Write a program that prompts the user to enter
 * an integer and determines whether it is divisible by 5 and 6, whether it is divisible
 * by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a sample run
 * of this program:
 * 
 * ---------------------------------------------
 * Enter an integer: 10 [ENTER]
 * Is 10 divisible by 5 and 6? false
 * Is 10 divisible by 5 or 6? true
 * Is 10 divisible by 5 or 6, but not both? true
 * ---------------------------------------------
 * 
 * Commentary: This one will require using AND, OR, and XOR operands to determine verdicts 
 * between two outcomes. I will then need to print output as shown in sample runs. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/23/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.26
 */

import java.util.Scanner;

public class EX26_UseAndOrNotOps {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize variable with user input
        System.out.print("Enter an integer: ");
        int value = input.nextInt();
        
        // show output and verdict as shown in sample run
        System.out.println("Is 10 divisible by 5 and 6? " + ((value % 5 == 0) && (value % 6 == 0)));
        System.out.println("Is 10 divisible by 5 or 6? " + ((value % 5 == 0) || (value % 6 == 0)));
        System.out.println("Is 10 divisible by 5 or 6, but not both? " + ((value % 5 == 0) ^ (value % 6 == 0)));
    }

}
