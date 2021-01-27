/**
 * (Shuffle rows) Write a method that shuffles the rows in a two-dimensional int
 * array using the following header:
 * 
 * public static void shuffle(int[][] m)
 * 
 * Write a test program that shuffles the following matrix:
 * 
 * int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
 *
 * Commentary: I will cycle through each available row and shuffle the entire contents
 * of the current row, with the randomly generated row. The shuffle will be based on a 
 * random number generated between 0 and row length. I will print the matrix before and 
 * after the shuffle.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/22/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.18
 */

public class EX18_ShuffleRows {
    
    public static void main(String[] args) {
        
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        
        System.out.println("\nMatrix prior to shuffle: ");
        printMatrix(m);
        
        shuffle(m);
        
        System.out.println("\nMatrix after shuffle: ");
        printMatrix(m);
    
    }
    
    // method to print matrix with a space in between elements
    public static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // method to shuffle the entire row contents with a random row index of the matrix
    public static void shuffle(int[][] m) {
        int[] temp = new int[2];    // temp array to store values of matrix
        
        for (int i = 0; i < m.length; i++) {
            int randRow = (int)(Math.random() * m.length);
            
            // swap full row contents from matrix to new random row location
            temp[0] = m[i][0];
            temp[1] = m[i][1];
            m[i][0] = m[randRow][0];
            m[i][1] = m[randRow][1];
            m[randRow][0] = temp[0];
            m[randRow][1] = temp[1];
        }
    }
}
