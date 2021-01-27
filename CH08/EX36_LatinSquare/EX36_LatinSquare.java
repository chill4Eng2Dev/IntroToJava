/**
 * (Latin square) A Latin square is an n-by-n array filled with n different Latin letters,
 * each occurring exactly once in each row and once in each column. Write a
 * program that prompts the user to enter the number n and the array of characters,
 * as shown in the sample output, and checks if the input array is a Latin square.
 * The characters are the first n characters starting from A.
 * 
 * ----------------------------------------------------------------
 * Enter number n: 4 [ENTER]
 * Enter 4 rows of letters separated by spaces:
 * A B C D [ENTER]
 * B A D C [ENTER]
 * C D B A [ENTER]
 * D C A B [ENTER]
 * The input array is a Latin square
 * ----------------------------------------------------------------
 * 
 * ----------------------------------------------------------------
 * Enter number n: 3 [ENTER]
 * Enter 3 rows of letters separated by spaces:
 * A F D [ENTER]
 * Wrong input: the letters must be from A to C
 * ----------------------------------------------------------------
 * 
 * Commentary: I will need to utilize some of the methods from the sudoku exercise (EX 8.24)
 * to validate the uniqueness of the characters entered. Since characters are also able to be
 * interpreted as an integer, I will do much of my comparisons as an integer. I will print
 * output as shown in sample run.
 *  
 * Author: chill4Eng2Dev 
 * Date: 1/24/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.36
 */

import java.util.Scanner;

public class EX36_LatinSquare {
    
    public static void main(String[] args) {
        
        // assign user defined input to latin array
        char[][] latinArray = getInput();
        
        // print output as shown in sample run
        System.out.println("The input array is " + (isLatinSquare(latinArray) ? "" : "not ") + "a Latin square");
        
    }
    
    // initiates the row and column check, returning the corresponding boolean
    public static boolean isLatinSquare(char[][] c) {
        return isValidRows(c) && isValidCols(c);       
    }
    
    // method to check if rows are valid
    public static boolean isValidRows(char[][] c) {
        
        for (int i = 0; i < c.length; i++) {
            int[] rowCount = new int[c.length];    // initialize to store counts
            for (int j = 0; j < c[i].length; j++) {
                rowCount[c[i][j] - (int)'A']++; // increment index in array by 1
            }
            
            // check if row is uniquely entered
            if (!checkCount(rowCount))  
                return false;
        }
        return true;
    }
    
    // method to check if columns are valid
    public static boolean isValidCols(char[][] c) {
        
        for (int i = 0; i < c[0].length; i++) {
            int[] colCount = new int[c[0].length];    // initialize to store counts
            for (int j = 0; j < c.length; j++) {
                colCount[c[j][i] - (int)'A']++; // increment index in array by 1
            }
            
            // check if column is uniquely entered
            if (!checkCount(colCount))
                return false;
        }
        return true;
    }
    
    // ensure each array[index] = 1, which means each value is uniquely entered
    public static boolean checkCount(int[] array) {
        for (int i = 0; i < array.length; i++) 
            if (array[i] != 1)
                return false;
             
        return true;
    }
    
    // method to assign user input to latin square, checks entries as entered for valid inputs
    public static char[][] getInput() {
        Scanner input = new Scanner(System.in);
        int n;
        
        System.out.print("Enter number n: ");
        n = input.nextInt();
   
        char[][] c = new char[n][n];
        System.out.println("Enter " + n + " rows of letters separated by spaces: ");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = input.next().charAt(0);
                if (c[i][j] < 'A' || c[i][j] > ('A' + n - 1)) { // input needs to be within the latin square range
                    System.out.println("Wrong input: the letters must be from A to " + (char)('A' + n - 1));
                    System.exit(1);
                }
            }
        }
        
        return c;
    }
            
    

}
