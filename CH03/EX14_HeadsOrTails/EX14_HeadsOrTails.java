
/**
 * (Game: heads or tails) Write a program that lets the user guess whether the flip of
 * a coin results in heads or tails. The program dandomly generates an integer 0 or 1,
 * which represents head or tail. The program prompts the user to enter a guess and
 * reports whether the guess is correct or incorrect.
 * 
 * Commentary: I will need to use Math.random() and compare the user input to the randomly
 * generated number. I will compare the entry to the generated number using an if statement
 * and print output accordingly.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/22/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.14
 */

import java.util.Scanner;

public class EX14_HeadsOrTails {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // declare and initialize user input
        System.out.print("Enter a number for heads or tails (0 or 1): ");
        int guess = input.nextInt();
        
        // initialize the random number to be compared
        int headOrTail = (int)(Math.random() * 2);
        
        // print output of guess and the comparison verdict
        System.out.println("Your guess of " + ((guess == 0) ? "heads " : "tails ") + "is " + ((guess == headOrTail) ? "correct!" : "incorrect!"));
        
    }

}
