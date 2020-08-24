
/**
 * (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a
 * subtraction question. Revise the program to randomly generate an addition question
 * with two integers less than 100.
 * 
 * Commentary: I will need to use Math.random() to generate numbers and adjust Listing
 * 3.3 for addition. I will print the output as shown in the Listing.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/21/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.10
 */

import java.util.Scanner;

public class EX10_AdditionQuiz {

    public static void main(String[] args) {
        // generate two random single-digit integers
        int number1 = (int)(Math.random() * 101);
        int number2 = (int)(Math.random() * 101);

        // prompt the student to answer ”What is number1 + number2?”
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // grade the answer and display the result
        if (number1 + number2 == answer)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
        }
    }
}

