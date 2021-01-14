/**
 * (Game: bean machine) The bean machine, also known as a quincunx or the Galton
 * box, is a device for statistics experiments named after English scientist Sir
 * Francis Galton. It consists of an upright board with evenly spaced nails (or pegs)
 * in a triangular form, as shown in Figure 7.13.
 * 
 * [SEE IMAGE IN FOLDER]
 * 
 * Balls are dropped from the opening of the board. Every time a ball hits a nail, it
 * has a 50% chance of falling to the left or to the right. The piles of balls are accumulated
 * in the slots at the bottom of the board.
 * 
 * Write a program that simulates the bean machine. Your program should prompt
 * the user to enter the number of the balls and the number of the slots in the machine.
 * Simulate the falling of each ball by printing its path. For example, the path for
 * the ball in Figure 7.13b is LLRRLLR and the path for the ball in Figure 7.13c is
 * RLRRLRR. Display the final buildup of the balls in the slots in a histogram. Here
 * is a sample run of the program:
 *
 * --------------------------------------------------------
 * Enter the number of balls to drop: 5 [ENTER]
 * Enter the number of slots in the bean machine: 8 [ENTER]
 * 
 *      LRLRLRR
 *      RRLLLRR
 *      LLRLLRR
 *      RRLLLLL
 *      LRLRRLR
 *     
 *     
 *          O
 *          O
 *        OOO
 * --------------------------------------------------------
 * 
 * (Hint: Create an array named slots. Each element in slots stores the number
 * of balls in a slot. Each ball falls into a slot via a path. The number of Rs in
 * a path is the position of the slot where the ball falls. For example, for the path
 * LRLRLRR, the ball falls into slots[4], and for the path is RRLLLLL, the ball
 * falls into slots[2].)
 *
 * Commentary: I will need to have a method that creates the paths of each ball
 * and increments the slot the ball falls in using 'R' occurances for each ball.
 * Printing the slots would be easier with a 2D array but I will need to find the required
 * "height" or max value of the slots array. I will then print the occurences of
 * each ball in the slots. I will print output as shown in sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/12/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.21
 */

import java.util.Scanner;

public class EX21_BeanMachine {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // assign paths array with ball entry, length of array equals ball count
        System.out.print("\nEnter the number of balls to drop: ");
        String[] paths = new String[input.nextInt()];
        
        // assign slots count to array
        System.out.print("Enter the number of slots in the bean machine: ");
        int[] slots = new int[input.nextInt()];
        
        // call drop ball method and pass the paths and slots through
        dropBall(paths, slots);

        // print paths array after paths are generated
        printPaths(paths);
   
        // print balls in slots
        printBalls(slots);
    }
    
    public static void dropBall(String[] paths, int[] slots) {
                
        // each element in array will have a fully generated path
        for (int i = 0; i < paths.length; i++) {
            String str = "";
            int posRight = 0;
            for (int j = 0; j < slots.length - 1; j++) {
                if (getRandomNum() == 0)
                    str = str + "L";
                else {
                    str = str + "R";
                    posRight++; // each occurence of R, increase position of ball
                }
            }
            paths[i] = str;
            slots[posRight]++; // increment slot position to count ball
        }       
                    
    }
    
    // method to generate a 0 or 1
    public static int getRandomNum() {
        return (int)(Math.random() * 2);
    }
    
    // method to print balls within slots
    public static void printBalls(int[] slots) {
        int colHght = columnHeight(slots);  // get max count (max ball height)
    
        for (int i = colHght; i > 0; i--) {
            System.out.println();
            for (int j = 0; j < slots.length; j++) {
                if (slots[j] >= colHght) {
                    System.out.print("O");
                }
                else
                    System.out.print(" ");
            }

        }
        System.out.println();
    }
    
    // method to find tallest column (max value) of slots
    public static int columnHeight(int[] list) {
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max)
                max = list[i];
        }
        return max;
    }
    
    // method to print stored string in paths array
    public static void printPaths(String[] paths) {
        
        for (int i = 0; i < paths.length; i++) 
            System.out.println(paths[i]);
    }
}
