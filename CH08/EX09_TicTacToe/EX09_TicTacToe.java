/**
 * (Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns
 * marking an available cell in a 3 * 3 grid with their respective tokens (either
 * X or O). When one player has placed three tokens in a horizontal, vertical, or
 * diagonal row on the grid, the game is over and that player has won. A draw (no
 * winner) occurs when all the cells on the grid have been filled with tokens and
 * neither player has achieved a win. Create a program for playing tic-tac-toe.
 * 
 * The program prompts two players to enter an X token and O token alternately.
 * Whenever a token is entered, the program redisplays the board on the
 * console and determines the status of the game (win, draw, or continue). Here
 * is a sample run:
 * 
 * ---------------------------------------------------------------
 * -------------
 * |   |   |   |
 * -------------
 * |   |   |   |
 * -------------
 * |   |   |   |
 * -------------
 * Enter a row (0, 1, or 2) for player X: 1 [ENTER]
 * Enter a column (0, 1, or 2) for player X: 1 [ENTER]
 * 
 * -------------
 * |   |   |   |
 * -------------
 * |   | X |   |
 * -------------
 * |   |   |   |
 * -------------
 * Enter a row (0, 1, or 2) for player O: 1 [ENTER]
 * Enter a column (0, 1, or 2) for player O: 2 [ENTER]
 * 
 * -------------
 * |   |   |   |
 * -------------
 * |   | X | O |
 * -------------
 * |   |   |   |
 * -------------
 * Enter a row (0, 1, or 2) for player X:
 * . . .
 * 
 * -------------
 * | X |   |   |
 * -------------
 * | O | X | O |
 * -------------
 * |   |   | X |
 * -------------
 * X player won
 * ---------------------------------------------------------------
 * 
 * Commentary: I will need to combine lessens learned from multiple exercises
 * to complete this exercise. A lot of the code will be broken down into
 * smaller methods to control code readability. I will print output as shown
 * in sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/24/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.9
 */

import java.util.Scanner;

public class EX09_TicTacToe {
    
    public static void main(String[] args) {
        // start the game
        playGame();
    }
    
    // method that allows the users to play the game, most of the method coordination occurs here
    public static void playGame() {
        int status = 2;     // status to control end output or to continue running game
        boolean whoseTurn = true; 
        int[][] board = getBoard(); // initialize the board
        
        do {
            String token = whoseTurn ? "X" : "O" ;  // switch tokens based on player turn
            
            printBoard(board);  // print board
            
            int[] rowAndCol = getInput(board, token);   // get the validated row and column entry from user
            
            board[rowAndCol[0]][rowAndCol[1]] = (token == "X" ? 1 : 0); // add token to board based on user row and column entry
            
            status = getStatus(board);  // determine statues
            
            // 0 = draw, 1 = someone won, 2 = keep playing
            if (status == 0) {
                printBoard(board);
                System.out.println("The game is a draw!");
            } else if (status == 1) {
                printBoard(board);
                System.out.println(token + " player won");
            } else
                whoseTurn = !whoseTurn; // change player turn
                
            
        } while (status == 2);
              
    }
    
    // method to determine status of the game
    public static int getStatus(int[][] board) {
        int xCount = 0;
        int oCount = 0;
        
        // check rows
        for (int i = 0; i < board.length; i++) {
            xCount = 0;
            oCount = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1)
                    xCount++;
                if (board[i][j] == 0)
                    oCount++;
            }
            
            if (xCount == 3 || oCount == 3)
                return 1;
        
        }
        
        // check columns
        for (int i = 0; i < board.length; i++) {
            xCount = 0;
            oCount = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] == 1)
                    xCount++;
                if (board[j][i] == 0)
                    oCount++;
            }
            
            if (xCount == 3 || oCount == 3)
                return 1;
        
        }
        
        // check diagonal top-left to bottom-right
        xCount = 0;
        oCount = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1)
                xCount++;
            if (board[i][i] == 0)
                oCount++;
        }
            
        if (xCount == 3 || oCount == 3)
            return 1;
        
        // check diagonal top-right to bottom-left
        xCount = 0;
        oCount = 0;
        for (int i = board.length - 1; i >= 0; i--) {
            if (board[i][i] == 1)
                xCount++;
            if (board[i][i] == 0)
                oCount++;
        }
            
        if (xCount == 3 || oCount == 3)
            return 1;
            
        // check if users can keep going
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                if (board[i][j] == -1)
                    return 2;
        
        return 0;   // the game is a draw
    }
    
    // method to get user input and will not terminate until valid entry is entered
    public static int[] getInput(int[][] board, String token) {
        Scanner input = new Scanner(System.in);
        int[] rAndC = new int[2];
                
        do {
            System.out.print("Enter a row (0, 1, 2) for player " + token + ": ");
            rAndC[0] = input.nextInt();
            
            System.out.print("Enter a column (0, 1, 2) for player " + token + ": ");
            rAndC[1] = input.nextInt();
            
        } while (!inputValid(rAndC[0], rAndC[1], board));   // validates input before breaking loop
        
        return rAndC;
    }
    
    // method to validate the user input and let them know if it's incorrect
    public static boolean inputValid(int r, int c, int[][] board) {
        if (r <= 2 && r >= 0 && c <= 2 && c >= 0 && board[r][c] == -1)
            return true;
        else {
            System.out.println("\nInvalid input. Try again.\n");
            return false;
        }
    }

    // method to initialize a 3-by-3 board with -1, this is for comparison purposes in other methods
    public static int[][] getBoard() {
        int[][] b = new int[3][3];
        
        for (int i = 0; i < b.length; i++)
            for (int j = 0; j < b[i].length; j++)
                b[i][j] = -1;
                
        return b;
    }
    
    // method to print board as shown in sample run
    public static void printBoard(int[][] m) {
        
        System.out.println("\n-------------");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                if (m[i][j] == -1)
                    System.out.print("|   ");
                else if (m[i][j] == 0)
                    System.out.print("| O ");
                else
                    System.out.print("| X ");
                
            System.out.println("|");
            System.out.println("-------------");
        }
        
    }
                
}
