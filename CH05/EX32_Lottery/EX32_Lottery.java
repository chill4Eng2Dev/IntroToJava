/**
 * (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a two
 * digit number. The two digits in the number are distinct. (Hint: Generate the first
 * digit. Use a loop to continuously generate the second digit until it is different
 * from the first digit.)
 * 
 * Commentary: I will adjust the lottery variable to generate a single digit. I will use
 * a while loop to find next number and compare to first number. I will then reassign lottery
 * number with the two digit number. I will print the output as shown in the Listing run. 
 *
 * Author: chill4Eng2Dev 
 * Date: 9/5/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.32
 */

import java.util.Scanner;

public class EX32_Lottery {
    
    public static void main(String[] args) {
        // Generate a lottery number in tens place, must be 1 to 9
        int lottery = (int)(1 + Math.random() * 9);
        
        // assign lotteryNum2 to lottery
        int lotteryNum2 = lottery;
        
        // generate lottery numbers for num 2 until not equal to lottery num
        while (lotteryNum2 == lottery) {
            lotteryNum2 = (int)(Math.random() * 10);
        }
        
        // reassign lottery number1 to tens place and add the lottery num2 to ones place
        lottery = lottery * 10 + lotteryNum2;
            
        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();

        // Get digits from lottery
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        // Get digits from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        // Check the guess
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || 
                 guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }
    
}
