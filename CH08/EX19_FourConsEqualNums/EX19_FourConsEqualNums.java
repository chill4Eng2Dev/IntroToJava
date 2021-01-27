/**
 * (Pattern recognition: four consecutive equal numbers) Write the following
 * method that tests whether a two-dimensional array has four consecutive numbers
 * of the same value, either horizontally, vertically, or diagonally.
 * 
 * public static boolean isConsecutiveFour(int[][] values)
 * 
 * Write a test program that prompts the user to enter the number of rows and columns
 * of a two-dimensional array and then the values in the array and displays
 * true if the array contains four consecutive numbers with the same value. Otherwise,
 * display false. Here are some examples of the true cases:
 * 
 * [SEE PHOTO IN FOLDER]
 *
 * Commentary: I will need to break this problem down in multiple methods. I will use nested
 * for loops to cycle through checks that I will need (rows, columns, and diagonals). The diagonals
 * will be the most challenging but I should be able to use (3) separate incrementers to cycle
 * through the matrix. I will print output as described in problem statement.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/24/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.19
 */

import java.util.Scanner;

public class EX19_FourConsEqualNums {

    public static void main(String[] args) {
        
        int[][] values = getMatrix();   // get size of matrix and values
        System.out.println("Does the matrix have any four consecutive numbers? " + isConsecutiveFour(values));
        
    }
    
    // method to call all other boolean methods to check array for consecutive values
    public static boolean isConsecutiveFour(int[][] values) {
        return isConsecutiveRow(values) || isConsecutiveCol(values) || isConsL2R(values) || isConsR2L(values);
    }
    
    // method to check consecutive values for rows
    public static boolean isConsecutiveRow(int[][] values) {
        
        for (int i = 0; i < values.length; i++) {
            int start = values[i][0];   // start with the first value in row
            int count = 1;            
            for (int j = 1; j < values[i].length; j++) {
                if (values[i][j] == start) {
                    count++;
                    if (count == 4)
                        return true;
                } else {
                    start = values[i][j];   // if value not consecutive, look at next number
                    count = 1;
                }
            }
        }
        
        return false;
    }
    
    // method to check consecutive values for column
    public static boolean isConsecutiveCol(int[][] values) {
        
        for (int i = 0; i < values[0].length; i++) {
            int start = values[0][i]; // start with the first value in column
            int count = 1;            
            for (int j = 1; j < values.length; j++) {
                if (values[j][i] == start) {
                    count++;
                    if (count == 4)
                        return true;
                } else {
                    start = values[j][i]; // if value not consecutive, look at next number
                    count = 1;
                }
            }
        }
        
        return false;
    }

    // method to check consecutive diagonal, starting from top-left to bottom-right
    public static boolean isConsL2R(int[][] values) {
        
        // this will start at top-left, go to bottom right, and review the lower area of the matrix
        for (int i = 0; i < values.length; i++) {
            int start = values[i][0];
            int count = 1;            
            for (int j = i + 1, k = 1; j < values.length && k < values[i].length; j++, k++) {
                if (values[j][k] == start) {
                    count++;
                    if (count == 4)
                        return true;
                } else {
                    start = values[j][k];
                    count = 1;
                }
            }
        }
        
        // this will start at top-left, go to bottom right, and review the up area of the matrix
        for (int i = 1; i < values[0].length; i++) {
            int start = values[0][i];
            int count = 1;            
            for (int j = 1, k = i + 1; j < values.length && k < values[j].length; j++, k++) {
                if (values[j][k] == start) {
                    count++;
                    if (count == 4)
                        return true;
                } else {
                    start = values[j][k];
                    count = 1;
                }
            }
        }
   
        return false;
    }
    
    // method to check consecutive diagonal, starting from top-right to bottom-left
    public static boolean isConsR2L(int[][] values) {
        
        // this will start at top-right, go to bottom-left, and review the bottom area of the matrix
        for (int i = 0; i < values.length; i++) {
            int start = values[i][values[i].length - 1];
            int count = 1;            
            for (int j = i + 1, k = values[i].length - 2; j < values.length && k >= 0; j++, k--) {
                if (values[j][k] == start) {
                    count++;
                    if (count == 4)
                        return true;
                } else {
                    start = values[j][k];
                    count = 1;
                }
            }
        }
        
        // this will start at top-right, go to bottom-left, and review the top area of the matrix
        for (int i = values[0].length - 2; i >= 0; i--) {
            int start = values[0][i];
            int count = 1;            
            for (int j = 1, k = i - 1; j < values.length && k >= 0; j++, k--) {
                if (values[j][k] == start) {
                    count++;
                    if (count == 4)
                        return true;
                } else {
                    start = values[j][k];
                    count = 1;
                }
            }
        }
               
        return false;
    }
    
    // method to get user input for the matrix and the values of the matrix
    public static int[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEnter the number of rows and columns for the array: ");
        int[][] m = new int[input.nextInt()][input.nextInt()];
        
        System.out.println("Enter values for the " + m.length + "-by-" + m[0].length + " matrix: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = input.nextInt();
                
        return m;
    }
}
