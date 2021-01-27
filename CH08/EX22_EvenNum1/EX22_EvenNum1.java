/**
 * (Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
 * matrix filled with 0s and 1s, displays the matrix, and checks if every row and
 * every column have an even number of 1s.
 *
 * Commentary: I will need a method to evaluate each row or column and determine if
 * said row or column is even (sum % 2 == 0). I will print output as described in
 * problem statement.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/17/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.22
 */

public class EX22_EvenNum1 {
    
    public static void main(String[] args) {
        
        // assign random 0's and 1's to matrix
        int[][] binMatrix = getBinMatrix();
        
        // print matrix as described in problem statement
        printMatrix(binMatrix);
        
        // determine if matrix has even rows
        System.out.println("The matrix does " + (evenRows(binMatrix) ? "" : "not ") + 
                            "have an even number of 1's in all rows.");
        
        // determine if matrix has even columns
        System.out.println("The matrix does " + (evenColumns(binMatrix) ? "" : "not ") + 
                            "have an even number of 1's in all rows.");
        
    }
    
    // method to assign random 0's and 1's to a matrix
    public static int[][] getBinMatrix() {
        int[][] m = new int[6][6];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int)(Math.random() * 2);
            }
        }
        
        return m;
    }
    
    // method to count all elements in a row and determine if row count is even
    public static boolean evenRows(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int sum = 0;
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
            }
            
            if (sum % 2 != 0)
                return false;
        }
        return true;
    }
    
    // method to count all elements in a column and determine if column count is even
    public static boolean evenColumns(int[][] m) {
        for (int i = 0; i < m[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < m.length; j++) {
                sum += m[j][i];
            }
            
            if (sum % 2 != 0)
                return false;
        }
        return true;
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
}


