/**
 * (Repeat additions) Listing 5.4, SubtractionQuizLoop.java, generates five random
 * subtraction questions. Revise the program to generate ten random addition questions
 * for two integers between 1 and 15. Display the correct count and test time.
 *  
 * Commentary: I will need to copy Listing 5.4 code and adjust to become an addition
 * quiz. I will change the randomly generated numbers to be 1 to 15 inclusive. I will update
 * the number of questions allowed. I will remove the swap if statement as it is no longer
 * required. I will print output as shown in the listing.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/31/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.2
 */

import java.util.Scanner;

public class EX02_RepeatAdditions {

    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 10; // Number of questions
        int correctCount = 0; // Count the number of correct answers
        int count = 0; // Count the number of questions
        long startTime = System.currentTimeMillis();
        String output = " "; // output string is initially empty
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            // 1. Generate two random single-digit integers
            int number1 = (int)(1 + Math.random() * 15);
            int number2 = (int)(1 + Math.random() * 15);

            // 2. Prompt the student to answer "What is number1 – number2?"
            System.out.print("\nWhat is " + number1 + " + " + number2 + "? ");
            int answer = input.nextInt();

            // 3. Grade the answer and display the result
            if (number1 + number2 == answer) {
                System.out.println("You are correct!");
                correctCount++; // Increase the correct answer count
            }
            else
                System.out.println("Your answer is wrong.\n" + number1 + " + " + number2 + 
                                    " should be " + (number1 + number2));

            // Increase the question count
            count++;

            output += "\n" + number1 + "+" + number2 + "=" + answer +
                        ((number1 + number2 == answer) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount + "\nTest time is " + 
                            testTime / 1000 + " seconds\n" + output);
    }
}