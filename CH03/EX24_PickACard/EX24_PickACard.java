/**
 * (Game: pick a card) Write a program that simulates picking a card from a deck
 * of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9,
 * 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card. 
 * Here is a sample run of the program:
 * 
 * -------------------------------------
 * The card you picked is Jack of Hearts
 * -------------------------------------
 * 
 * Commentary: I can't tell if I am supposed to have a user pick a card. I will assume not?
 * I will then need to generate a number between 1-13 for the card, and 0-3 (or 1-4) for the
 * suite. Then I will use two switch-case statements to piece together the final output
 * as shown in the sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/23/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.24
 */


public class EX24_PickACard {
    
    public static void main(String[] args) {
        
        // declare variables
        int cardValue, suite; 
        
        // intialize variables with random values between 1 to 13 or 0 to 3
        cardValue = (int)(Math.random() * 13 + 1);
        suite = (int)(Math.random() * 4);
        
        // print start of output wording as shown in sample run
        System.out.print("The card you picked is ");
        
        // use switch-case statement to cycle through card options and print output
        switch (cardValue) {
            case 1: System.out.print("Ace of "); break;
            case 2: System.out.print(cardValue + " of "); break;
            case 3: System.out.print(cardValue + " of "); break;
            case 4: System.out.print(cardValue + " of "); break;
            case 5: System.out.print(cardValue + " of "); break;
            case 6: System.out.print(cardValue + " of "); break;
            case 7: System.out.print(cardValue + " of "); break;
            case 8: System.out.print(cardValue + " of "); break;
            case 9: System.out.print(cardValue + " of "); break;
            case 10: System.out.print(cardValue + " of "); break;
            case 11: System.out.print("Jack of "); break;
            case 12: System.out.print("Queen of "); break;
            case 13: System.out.print("King of ");
        }
        
        // use switch-case statement to cycle through suite options and print output
        switch (suite) {
            case 0: System.out.println("Clubs"); break;
            case 1: System.out.println("Diamonds"); break;
            case 2: System.out.println("Hearts"); break;
            case 3: System.out.println("Spades");
        }
            
    }
}

