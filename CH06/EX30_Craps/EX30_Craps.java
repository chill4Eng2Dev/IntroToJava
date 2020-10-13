/**
 * (Game: craps) Craps is a popular dice game played in casinos. Write a program
 * to play a variation of the game, as follows:
 * 
 * Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively.
 * Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
 * lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
 * (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
 * a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
 * 
 * Your program acts as a single player. Here are some sample runs.
 * 
 * ----------------------------------
 * You rolled 5 + 6 = 11
 * You win
 * ----------------------------------
 * ----------------------------------
 * You rolled 1 + 2 = 3
 * You lose
 * ----------------------------------
 * ----------------------------------
 * You rolled 4 + 4 = 8
 * point is 8
 * You rolled 6 + 2 = 8
 * You win
 * ----------------------------------
 * ----------------------------------
 * You rolled 3 + 2 = 5
 * point is 5
 * You rolled 2 + 5 = 7
 * You lose
 * ----------------------------------
 * 
 * Commentary: I broke down nearly every sentence in the description to be its own method
 * and will use these checks to determine the ultimate outcome. The only thing I was unsure
 * of was the point method. The sample run shows the final verdict on whether a point was
 * matched or the dice rolled a 7, however the dice is rolled at random and I would assume
 * all outputs need to be shown which is the direction I took with this program.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/29/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.30
 */


public class EX30_Craps {

    public static void main(String[] args) {
        
        // get initial result of the two die
        int result = rollTwoDice();
        
        // call methods for craps and natural and assign boolean
        boolean crapsVerdict = craps(result);
        boolean naturalVerdict = natural(result);
        
        // if statement to cycle through the verdicts
        if (crapsVerdict) {
            System.out.println("You lose");
        } else if (naturalVerdict) {
            System.out.println("You win");
        } else
            point(result);
            
    }
    
    // roll two dice and return the result
    public static int rollTwoDice() {
        int dice1 = (int)(1 + Math.random() * 6);
        int dice2 = (int)(1 + Math.random() * 6);
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
        return dice1 + dice2;
    }
    
    // if the two dice result is 2, 3, or 12, that is craps the user loses
    public static boolean craps(int result) {
        if (result == 2 || result == 3 || result == 12)
            return true;
        else
            return false;
    }
    
    // if first result is 7 or 11, the user wins
    public static boolean natural(int result) {
        if (result == 7 || result == 11)
            return true;
        else
            return false;
    }
    
    // if the result is anything other than 2, 3, 12, 7, or 11, it's a point, and needs to be rerolled
    public static void point(int result) {
        int newPoint;
        System.out.println("point is " + result);
        
        do {
            newPoint = rollTwoDice();
        } while (newPoint != 7 && newPoint != result);  // reroll value until 7 or equal to point
        
        // output verdict of roll
        if (newPoint == 7)
            System.out.println("You lose");
        else
            System.out.println("You win");
            
    }
    
}
