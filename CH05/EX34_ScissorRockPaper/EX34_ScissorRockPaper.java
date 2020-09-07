/**
 * (Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that
 * plays the scissor-rock-paper game. Revise the program to let the user continuously
 * play until either the user or the computer wins more than two times than its
 * opponent.
 * 
 * Commentary: I will revise Exercise 3.17 and write a sentinel loop to run until either
 * the computer or the user has achieved a win count higher than two. This will require
 * two separate counters for the computer and the user. I will print output as shown in
 * Exercise 3.17.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/3/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.34
 */

import java.util.Scanner;

public class EX34_ScissorRockPaper {

    public static void main(String[] args) {
       // create a scanner
       Scanner input = new Scanner(System.in);
       
       // initialize comp and user win counter
       int compWins = 0, userWins = 0;
       
       while (!(compWins > 2) && !(userWins > 2)) {  
           // generate a random number for the computer
           int computerPick = (int)(Math.random() * 3);
           
           // initialize variable with user input
           System.out.print("Enter value of scissor (0), rock (1), paper (2): ");
           int userValue = input.nextInt();
           
           if (userValue > 2 || userValue < 0) {
               System.out.println("Invalid entry. Entry must be between (0 - 2). Please try again.");
               
           } else {
                   // switch statement to print out part of the output statement
                   switch (computerPick) {
                       case 0: System.out.print("The computer is scissor. "); break;
                       case 1: System.out.print("The computer is rock. "); break; 
                       case 2: System.out.print("The computer is paper. "); 
                   }
                   
                   // switch statement to print out part of the output statement with if statements for "too." or "."
                   switch (userValue) {
                        case 0: System.out.print("You are scissor" + ((userValue == computerPick) ? " too. " : ". ")); break;
                        case 1: System.out.print("You are rock" + ((userValue == computerPick) ? " too. " : ". ")); break;
                        case 2: System.out.print("You are paper" + ((userValue == computerPick) ? " too. " : ". ")); 
                   }
                   
                   // check if the user wins, if the user does not win or draw, then the user loses
                   if (computerPick == userValue)
                       System.out.println("It is a draw.");
                   else if ((userValue == 0 && computerPick == 2) || (userValue == 1 && computerPick == 0) || (userValue == 2 && computerPick == 1)) {
                        userWins++;
                        System.out.println("You won this round!");
                   } else {
                        compWins++;
                        System.out.println("You lost this round!");
                   }
                   
                   // print status of wins for computer and user thus far
                   System.out.println("Computer wins so far: " + compWins);
                   System.out.println("User wins so far: " + userWins);
           }
       }
       
       // print message based on the results of the game
       if (userWins > compWins)
          System.out.println("Congratulations, you won the game!");
       else
          System.out.println("The computer won the game! Try again soon!");
            
    }
    
}

