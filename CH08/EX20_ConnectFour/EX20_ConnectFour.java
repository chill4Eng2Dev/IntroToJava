/**
 * (Game: connect four) Connect four is a two-player board game in which the
 * players alternately drop colored disks into a seven-column, six-row vertically
 * suspended grid, as shown below.
 * 
 * [SEE PHOTO IN FOLDER]
 * 
 * The objective of the game is to connect four same-colored disks in a row, a column,
 * or a diagonal before your opponent can do likewise. The program prompts
 * two players to drop a red or yellow disk alternately. In the preceding figure, the
 * red disk is shown in a dark color and the yellow in a light color. Whenever a disk
 * is dropped, the program redisplays the board on the console and determines the
 * status of the game (win, draw, or continue). Here is a sample run:
 *
 * ----------------------------------------------
 * | | | | | | | |
 * | | | | | | | |
 * | | | | | | | |
 * | | | | | | | |
 * | | | | | | | |
 * | | | | | | | |
 * ———————————————
 * Drop a red disk at column (0–6): 0 [ENTER]
 * | | | | | | | |
 * | | | | | | | |
 * | | | | | | | |
 * | | | | | | | |
 * | | | | | | | |
 * |R| | | | | | |
 * ———————————————
 * Drop a yellow disk at column (0–6): 3 [ENTER]
 * | | | | | | | |
 * | | | | | | | |
 * | | | | | | | |
 * | | | | | | | |
 * | | | | | | | |
 * |R| | |Y| | | |
 * . . .
 * . . .
 * . . .
 * Drop a yellow disk at column (0–6): 6 [ENTER]
 * | | | | | | | |
 * | | | | | | | |
 * | | | |R| | | |
 * | | | |Y|R|Y| |
 * | | |R|Y|Y|Y|Y|
 * |R|Y|R|Y|R|R|R|
 * ———————————————
 * The yellow player won
 * -----------------------------------------------
 * 
 * Commentary: I will need to combine methods from Exercises 8.09 (Tic Tac Toe) and 8.19 
 * (Four Consecutive Numbers) to complete this exercise. I will print output as shown in
 * sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/25/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.20
 */

import java.util.Scanner;

public class EX20_ConnectFour {
    
    public static void main(String[] args) {
        
        int[][] board = getBoard();
        
        playGame();
        
    }
    
    // method that allows the users to play the game, most of the method coordination occurs here
    public static void playGame() {
        int status = 2;     // status to control end output or to continue running game
        boolean whoseTurn = true; 
        int[][] board = getBoard(); // initialize the board
        
        do {
            String token = whoseTurn ? "red" : "yellow" ;  // switch tokens based on player turn
            
            printBoard(board);  // print board
            
            int[] rowAndCol = getInput(board, token);   // get the validated row and column entry from user
            
            board[rowAndCol[0]][rowAndCol[1]] = (token == "red" ? 1 : 0); // add token to board based on user row and column entry
            
            status = getStatus(board, token);  // determine statues
            
            // 0 = draw, 1 = someone won, 2 = keep playing
            if (status == 0) {
                printBoard(board);
                System.out.println("The game is a draw!");
            } else if (status == 1) {
                printBoard(board);
                System.out.println("The " + token + " player won");
            } else
                whoseTurn = !whoseTurn; // change player turn
                
            
        } while (status == 2);
              
    }
    
    // method to get user input and will not terminate until valid entry is entered
    public static int[] getInput(int[][] board, String token) {
        Scanner input = new Scanner(System.in);
        int[] rAndC = new int[2];
                
        do {
            System.out.print("Drop a " + token + " disk at column (0-6): ");
            rAndC[1] = input.nextInt();
            
        } while (!inputValid(rAndC, board));   // validates input before breaking loop
        
        return rAndC;
    }
    
    // method to validate the user input and let them know if it's incorrect
    public static boolean inputValid(int[] array, int[][] board) {
        if (array[1] <= 6 && array[1] >= 0)
            return isColumnOpen(array, board);
        else {
            System.out.println("\nInvalid column input range. Try again.\n");
            return false;
        }
    }
    
    // method to validate that the column has room to drop token
    public static boolean isColumnOpen(int[] array, int[][] board) {

        for (int i = board.length - 1, j = array[1]; i >= 0; i--) {
            if (board[i][j] == -1) {
                array[0] = i;
                return true;
            }
        }
        
        System.out.println("\nNo room in column to drop token. Try again.\n");
        return false;
    }
    
    // method to determine status of the game
    public static int getStatus(int[][] board, String token) {
        int count;
        int t = (token == "red" ? 1 : 0);

        // check rows
         for (int i = 0; i < board.length; i++) {
            count = 0;       
            for (int j = 1; j < board[i].length; j++) {
                if (board[i][j] == t) {
                    count++;
                    if (count == 4)
                        return 1;
                } else
                    count = 0;
            }
        }
        
        // check columns    
        for (int i = 0; i < board[0].length; i++) {
            count = 0;      
            for (int j = 1; j < board.length; j++) {
                if (board[j][i] == t) {
                    count++;
                    if (count == 4)
                        return 1;
                } else
                    count = 0;
            }
        }
        
        // this will start at top-left, go to bottom right, and review the lower area of the matrix
        for (int i = 0; i < board.length; i++) {
            count = 0;    
            for (int j = i + 1, k = 1; j < board.length && k < board[i].length; j++, k++) {
                if (board[j][k] == t) {
                    count++;
                    if (count == 4)
                        return 1;
                } else
                    count = 0;
            }
        }
        
        // this will start at top-left, go to bottom right, and review the up area of the matrix
        for (int i = 1; i < board[0].length; i++) {
            count = 0;  
            for (int j = 1, k = i + 1; j < board.length && k < board[j].length; j++, k++) {
                if (board[j][k] == t) {
                    count++;
                    if (count == 4)
                        return 1;
                } else {
                    count = 0;
                }
            }
        }
        
        // this will start at top-right, go to bottom-left, and review the bottom area of the matrix
        for (int i = 0; i < board.length; i++) {
            count = 0;
            for (int j = i + 1, k = board[i].length - 2; j < board.length && k >= 0; j++, k--) {
                if (board[j][k] == t) {
                    count++;
                    if (count == 4)
                        return 1;
                } else
                    count = 0;
            }
        }
        
        // this will start at top-right, go to bottom-left, and review the top area of the matrix
        for (int i = board[0].length - 2; i >= 0; i--) {
            count = 0;             
            for (int j = 1, k = i - 1; j < board.length && k >= 0; j++, k--) {
                if (board[j][k] == t) {
                    count++;
                    if (count == 4)
                        return 1;
                } else
                    count = 0;
            }
        }
            
        // check if users can keep going
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                if (board[i][j] == -1)
                    return 2;
        
        return 0;   // the game is a draw
    }
    
    // method to initialize a 6-by-7 board with -1, this is for comparison purposes in other methods
    public static int[][] getBoard() {
        int[][] b = new int[6][7];
        
        for (int i = 0; i < b.length; i++)
            for (int j = 0; j < b[i].length; j++)
                b[i][j] = -1;
                
        return b;
    }
    
    // method to print board as shown in sample run
    public static void printBoard(int[][] m) {
        
        System.out.println();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++)
                if (m[i][j] == -1)
                    System.out.print("| ");
                else if (m[i][j] == 1)
                    System.out.print("|R");
                else
                    System.out.print("|Y");
                
            System.out.println("|");
            
        }
        System.out.println("---------------");
    }

}
