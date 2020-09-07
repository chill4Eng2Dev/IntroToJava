/**
 * (Simulation: heads or tails) Write a program that simulates flipping a coin one
 * million times and displays the number of heads and tails.
 * 
 * Commentary: I will use a for loop and Math.random() value to simulate either 0 or 1. 
 * Heads will be zero and tails 1. I will store the values into a counter for each. I 
 * will print output as described in problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/2/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.40
 */

public class EX40_HeadsOrTails {

    public static void main(String[] args) {
        
        // initialize variables
        int heads = 0, tails = 0, num;
        
        // for loop to cycle through million values, increase counter based on value randomly generated
        for(int i = 0; i < 1000000; i++) {
            num = (int)(Math.random() * 2);
            if (num == 0) 
                heads++; 
            else
                tails++;
        }
        
        // print output as described in problem statement
        System.out.println("The number of heads versus tails after flipping a coin " +
        "one million times is: " + "\n\tHeads: " + heads + "\n\tTails: " + tails); 
    }
}
