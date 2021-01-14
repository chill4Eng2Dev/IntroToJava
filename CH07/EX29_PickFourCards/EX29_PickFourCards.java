/**
 * (Game: pick four cards) Write a program that picks four cards from a deck of 52
 * cards and computes their sum. An Ace, King, Queen, and Jack represent 1, 13,
 * 12, and 11, respectively. Your program should display the number of picks that
 * yields the sum of 24.
 *
 * Commentary: I will need to create (2) arrays, one for the deck and the other for the
 * four cards picked. I will have (4) random cards picked and stored in an array. I will 
 * then need to check the sum of the cards based on the value system provided in the problem
 * statement. I will print output as described in the problem statement.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/12/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.29 
 */

public class EX29_PickFourCards {
    
            
    public static void main(String[] args) {
        // declare arrays and intialize count
        int[] deck = new int[52];
        int[] pickedCards = new int[4];
        int count = 0;
        
        // initialize deck
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;

        // pick cards until picked cards add up to 24
        do {
            pickedCards = getFourCards(deck);
            count++;
        } while (!isPick24(pickedCards));
        
        // print output of cards and the count of picks
        displayCards(pickedCards);
        System.out.println("Number of picks: " + count);

    }
       
    // method picks (4) random cards from the deck
    public static int[] getFourCards(int[] deck) {
        int[] cards = new int[4];
        for (int i = 0; i < cards.length; i++) 
            cards[i] = (int)(Math.random() * 52);
            
        return cards;
    }
   
    // method will calculate sum of cards passed through as an array
    public static boolean isPick24(int[] cards) {
        
        int sum = 0;
        for (int i = 0; i < cards.length; i++) { 
            sum = sum + (cards[i] % 13 + 1);
        }
                   
        return sum == 24;
    }
    
    // method to print out the cards selected and print count of draws
    public static void displayCards(int[] deck) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println(rank + " of " + suit);
        }
    }

}
