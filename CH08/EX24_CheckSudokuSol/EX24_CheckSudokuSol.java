/**
 * (Check Sudoku solution) Listing 8.4 checks whether a solution is valid by checking
 * whether every number is valid in the board. Rewrite the program by checking
 * whether every row, every column, and every small box has the numbers 1 to 9.
 * 
 * Commentary: I will start with Listing 8.4 and break each check into it's own method.
 * I will also have each row or column be checked, allowing the program to break as soon
 * as a problem is found. The longest time needed to run the entire check is when the
 * solution is a valid entry. I will print output as shown in Listing 8.4 and use the sample
 * valid entry (shown below).
 * 
 * Trial Entry for Valid Solution:
 * [Multi-Line]
 * 9 6 3 1 7 4 2 5 8
 * 1 7 8 3 2 5 6 4 9
 * 2 5 4 6 8 9 7 3 1
 * 8 2 1 4 3 7 5 9 6
 * 4 9 6 8 5 2 3 1 7
 * 7 3 5 9 6 1 8 2 4
 * 5 8 9 7 1 3 4 6 2
 * 3 1 7 2 4 6 9 8 5
 * 6 4 2 5 9 8 1 7 3
 * 
 * [One Line for Quick Copy & Paste] 
 * 9 6 3 1 7 4 2 5 8 1 7 8 3 2 5 6 4 9 2 5 4 6 8 9 7 3 1 8 2 1 4 3 7 5 9 6 4 9 6 8 5 2 3 1 7 7 3 5 9 6 1 8 2 4 5 8 9 7 1 3 4 6 2 3 1 7 2 4 6 9 8 5 6 4 2 5 9 8 1 7 3
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/22/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.24
 */

import java.util.Scanner;

public class EX24_CheckSudokuSol {
    public static void main(String[] args) {
        // Read a Sudoku solution
        int[][] grid = readASolution();

        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
    }

    /** Read a Sudoku solution from the console */
    public static int[][] readASolution() {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j] = input.nextInt();

        return grid;
    }

    /** Check whether a solution is valid */
    public static boolean isValid(int[][] grid) {
        return isValidEntry(grid) && isValidRows(grid) && isValidCols(grid) && isValidBox(grid);
    }
    
    // method to check if entered values are valid entries
    public static boolean isValidEntry(int[][] grid) {
        
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (grid[i][j] < 1 || grid[i][j] > 9)
                    return false;
                    
        return true; // The entries are within 1-9 range
    }

    // method to check if rows are valid
    public static boolean isValidRows(int[][] grid) {
        
        for (int i = 0; i < 9; i++) {
            int[] rowCount = new int[9];    // initialize to store counts
            for (int j = 0; j < 9; j++) {
                rowCount[grid[i][j] - 1]++; // increment index in array by 1
            }
            
            // check if row is uniquely entered with 1-9 range
            if (!checkCount(rowCount))  
                return false;
        }
        return true;
    }
    
    // method to check if columns are valid
    public static boolean isValidCols(int[][] grid) {
        
        for (int i = 0; i < 9; i++) {
            int[] colCount = new int[9];    // initialize to store counts
            for (int j = 0; j < 9; j++) {
                colCount[grid[j][i] - 1]++; // increment index in array by 1
            }
            
            // check if column is uniquely entered with 1-9 range
            if (!checkCount(colCount))
                return false;
        }
        return true;
    }
    
    // method to check if each 3-by-3 box is valid
    public static boolean isValidBox(int[][] grid) {
        
         for (int i = 0; i < 9; i += 3) {   // check 0, 3, and 6 rows
             for (int j = 0; j < 9; j += 3) { // check 0, 3, and 6 column
                 int[] boxCounts = new int[9]; // initialize and store counts
                 for (int row = i; row < i + 3; row++) {    // nested for loop to check 3-by-3 matrix starting at i, j
                     for (int col = j; col < j + 3; col++) {
                         boxCounts[grid[row][col] - 1]++;
                     }
                 }
                 
                 // check if box is uniquely entered with 1-9 range
                 if (!checkCount(boxCounts))
                    return false;
             }
         }

         return true;
    }
    
    // ensure each array[index] has a value of 1, which means each value is unique
    public static boolean checkCount(int[] array) {
        for (int i = 0; i < array.length; i++) 
            if (array[i] != 1)
                return false;
             
        return true;
    }

    
}
