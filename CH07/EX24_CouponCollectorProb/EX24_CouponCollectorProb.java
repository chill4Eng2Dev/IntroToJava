/**
 * (Simulation: coupon collector’s problem) Coupon collector is a classic statistics
 * problem with many practical applications. The problem is to pick objects from
 * a set of objects repeatedly and find out how many picks are needed for all the
 * objects to be picked at least once. A variation of the problem is to pick cards from
 * a shuffled deck of 52 cards repeatedly and find out how many picks are needed
 * before you see one of each suit. Assume a picked card is placed back in the deck
 * before picking another. Write a program to simulate the number of picks needed
 * to get four cards from each suit and display the four cards picked (it is possible a
 * card may be picked twice). Here is a sample run of the program:
 *
 * ---------------------------------
 * Queen of Spades
 * 5 of Clubs
 * Queen of Hearts
 * 4 of Diamonds
 * Number of picks: 12
 * ---------------------------------
 *
 * Commentary: I will need to create (2) arrays, one for the deck and the other for the
 * four cards picked. I will need to shuffle the deck per the problem description. I will
 * then have (4) random cards picked and stored in an array. I will then need to check
 * if the (4) cards selected are of each suit. Based on the description, I believe the 
 * count incrementer is for each set of (4) cards selected. I will print output to 
 * match sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/11/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.24
 */

public class EX24_CouponCollectorProb {
    
    public static void main(String[] args) {
        
        // declare arrays and intialize count
        int[] deck = new int[52];
        int[] pickedCards = new int[4];
        int count = 0;
        
        // initialize deck
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;
        
        // call shuffle deck method
        shuffleDeck(deck);
        
        // pick cards until all suits are selected in one draw
        do {
            pickedCards = getFourCards(deck);
            count++;
        } while (!isAllSuits(pickedCards));
        
        // print output of cards and the count of picks
        displayCards(pickedCards);
        System.out.println("Number of picks: " + count);

    }
    
    // method will shuffle array integers of a passed through array
    public static void shuffleDeck(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }
    
    // method picks (4) random cards from the shuffled deck
    public static int[] getFourCards(int[] deck) {
        int[] cards = new int[4];
        for (int i = 0; i < cards.length; i++) 
            cards[i] = (int)(Math.random() * 52);
            
        return cards;
    }
    
    // check if each suit has been picked per draw
    public static boolean isAllSuits(int[] cards) {
        int[] check = new int[cards.length];
      
        // increment check array by 1 for each suit found
        for (int i = 0; i < cards.length; i++) { 
            check[cards[i] / 13]++;
        }
        
        // if any of the checks are 0, a suit is missing, return false
        for (int i = 0; i < check.length; i++) {
            if (check[i] == 0)
                return false;
        }
        
        return true;
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
