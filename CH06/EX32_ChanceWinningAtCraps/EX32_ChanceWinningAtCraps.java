/**
 * (Game: chance of winning at craps) Revise Exercise 6.30 to run it 10,000 times
 * and display the number of winning games.
 * 
 * Commentary: I will revise Exercise 6.30 and remove any output that shows the
 * "win" or "lose" commentary. I will instead replace these areas with a static variable
 * for wins and losses. I will print output to show wins, losses, and total iterations.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/29/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.32
 */

public class EX32_ChanceWinningAtCraps {
    
    public static int win = 0;
    public static int lose = 0;
    
    public static void main(String[] args) {
        
        int runs = 0;
        
        while (runs < 10000) {
            // get initial result of the two die
            int result = rollTwoDice();
            
            // call methods for craps and natural and assign boolean
            boolean crapsVerdict = craps(result);
            boolean naturalVerdict = natural(result);
            
            // if statement to cycle through the verdicts
            if (crapsVerdict) {
                lose++;
            } else if (naturalVerdict) {
                win++;
            } else
                point(result);
            
            runs++;
        }
        
        // print output of wins, losses, and combined iterations
        System.out.println("The total amount of wins: " + win);
        System.out.println("The total amount of losses: " + lose);
        System.out.println("The combined total of iterations: " + (win + lose));
        
    }
    
    // roll two dice and return the result
    public static int rollTwoDice() {
        int dice1 = (int)(1 + Math.random() * 6);
        int dice2 = (int)(1 + Math.random() * 6);
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
       
        do {
            newPoint = rollTwoDice();
        } while (newPoint != 7 && newPoint != result);  // reroll value until 7 or equal to point
        
        // output verdict of roll
        if (newPoint == 7)
            lose++;
        else
            win++;
            
    }
    
}
