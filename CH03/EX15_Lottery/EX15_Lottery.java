/**
 * (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three
 * digit number. The program prompts the user to enter a three-digit number and
 * determines whether the user wins according to the following rules:
 * 
 * 1. If the user input matches the lottery number in the exact order, the award is
 * $10,000.
 * 2. If all digits in the user input match all digits in the lottery number, the award
 * is $3,000.
 * 3. If one digit in the user input matches a digit in the lottery number, the award is 
 * $1,000. 
 * 
 * Commentary: I will need to modify Listing 3.8 to account for three-digits instead of two.
 * The skeleton of the code looks to be mostly complete to what I will need. I will need to
 * add a few extra boolean checks to account for the extra digit. I will print output to match 
 * the listing sample runs.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/22/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.15
 */

import java.util.Scanner;

public class EX15_Lottery {
    
    public static void main(String[] args) {
    // Generate a lottery number, must always be three digits (+100) and less than four digits (100 + 900, exclusive)
    int lottery = (int)(100 + Math.random() * 900);

    // Prompt the user to enter a guess
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your lottery pick (three digits): ");
    int guess = input.nextInt();
    
    // Get digits from lottery
    int lotteryDigit1 = lottery % 10; // ones place
    int lotteryDigit2 = lottery / 10;
    lotteryDigit2 = lotteryDigit2 % 10; // tens place
    int lotteryDigit3 = (int)(lottery / 100);
    lotteryDigit3 = lotteryDigit3 % 100; // hundreds place

    // Get digits from guess
    int guessDigit1 = guess % 10; // ones place
    int guessDigit2 = guess / 10;
    guessDigit2 = guessDigit2 % 10; // tens place
    int guessDigit3 = (int)(guess / 100);
    guessDigit3 = guessDigit3 % 10; // hundreds place
    
    System.out.println("The lottery number is " + lottery);
    
    // check guess, need to build boolean matrix to check all possible permutations
    if (guess == lottery)
        System.out.println("Exact match: you win $10,000");
    else if ((guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit3) ||
             (guessDigit3 == lotteryDigit1 && guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3) ||
             (guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2 && guessDigit1 == lotteryDigit3) ||
             (guessDigit1 == lotteryDigit1 && guessDigit3 == lotteryDigit2 && guessDigit2 == lotteryDigit3) ||
             (guessDigit3 == lotteryDigit1 && guessDigit2 == lotteryDigit2 && guessDigit1 == lotteryDigit3) ||
             (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2 && guessDigit3 == lotteryDigit3))
        System.out.println("Match all digits: you win $3,000");
    else if ((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3) ||
             (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3) ||
             (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3))
        System.out.println("Match one digit: you win $1,000");
    else
        System.out.println("Sorry, no match");
    }
}

