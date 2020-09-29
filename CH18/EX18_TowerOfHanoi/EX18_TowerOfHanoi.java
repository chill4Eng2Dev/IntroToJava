  
/**
 * (Tower of Hanoi) Modify Listing 18.8, TowerOfHanoi.java, so that the program
 * finds the number of moves needed to move n disks from tower A to tower B.
 * (Hint: Use a static variable and increment it every time the method is called.)
 * 
 * Commentary: I will need a static variable that counts each time the moveDisks
 * method is called I will print output as shown in Listing sample run.
 *      
 * Author: chill4Eng2Dev 
 * Date: 9/15/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 18.18
 */

import java.util.Scanner;

public class EX18_TowerOfHanoi {

    public static int countABMoves = 0;
    
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = input.nextInt();

        // Find the solution recursively
        System.out.println("The moves are:");
        moveDisks(n, 'A', 'B', 'C');
        System.out.println("The number of moves needed to move " + n + " disks from Tower A to Tower B is: " + countABMoves);
    }

    /** The method for finding the solution to move n disks
        from fromTower to toTower with auxTower */
    public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
        countABMoves++;
        if (n == 1) // Stopping condition
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
        else {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }
    }

}
