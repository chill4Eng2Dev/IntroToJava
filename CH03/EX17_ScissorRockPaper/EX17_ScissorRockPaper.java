
/**
 * (Game: scissor, rock, paper) Write a program that plays the popular scissor-rock-
 * paper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper 
 * can wrap a rock.) The program prompts the user to enter a number 0, 1, or 2
 * and displays a message indicating whether the user or the computer wins, loses, 
 * or draws. Here are sample runs:
 * 
 * -------------------------------------------------------
 * scissor (0), rock (1), paper (2): 1 [ENTER]
 * The computer is scissor. You are rock. You won.
 * -------------------------------------------------------
 * -------------------------------------------------------
 * scissor (0), rock (1), paper (2): 2 [ENTER]
 * The computer is paper. You are paper too. It is a draw.
 * -------------------------------------------------------
 * 
 * Commentary: I will need to use Math.random() to generate the computer's selection. 
 * I will need switch statements for the generated  integers and the user input. I 
 * will use an if-else statement to cycle through if the computer or the user won. I 
 * will print output as shown in sample run. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/22/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.16
 */

import java.util.Scanner;

public class EX17_ScissorRockPaper {
    
    public static void main(String[] args) {
       
       // create a scanner
       Scanner input = new Scanner(System.in);
       
       // generate a random number for the computer
       int computerPick = (int)(Math.random() * 3);
       
       // initialize variable with user input
       System.out.print("scissor (0), rock (1), paper (2): ");
       int userValue = input.nextInt();
       
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
       else if ((userValue == 0 && computerPick == 2) || (userValue == 1 && computerPick == 0) || (userValue == 2 && computerPick == 1))
            System.out.println("You won.");
       else
            System.out.println("You lose.");
    }

}
