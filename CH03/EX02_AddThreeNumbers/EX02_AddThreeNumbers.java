
/**
 * (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates
 * two integers and prompts the user to enter the sum of these two integers. Revise
 * the program to generate three single-digit integers and prompt the user to enter
 * the sum of these three integers.
 *
 * Commentary: I will need to modify the code used in Listing 3.1. I will add a new
 * variable for a newly created number. I will use the System.currenttimeMillis() 
 * method used in Listing 3.1 though I would prefer Math.random() from section 3.7.
 * I will print the output as shown in the sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/21/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.2
 */

import java.util.Scanner;

public class EX02_AddThreeNumbers {

    public static void main(String[] args) {
        
        // generate random values and cast down to integer
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
        int number3 = (int)(System.currentTimeMillis() * 7 % 10);
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // initialize user input
        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
        int answer = input.nextInt();
        
        // print output comparing user input to the true sum and print boolean verdict
        System.out.println(number1 + " + " + number2 + " + " + number3 + 
        " = " + answer + " is " + (number1 + number2 + number3 == answer));
        
    }
}
