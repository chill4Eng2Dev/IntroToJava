/**
 * (Largest row and column) Write a program that randomly fills in 0s and 1s into
 * a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
 * most 1s. Here is a sample run of the program:
 * 
 * --------------------------------------------
 * 0011
 * 0011
 * 1101
 * 1010
 * The largest row index: 2
 * The largest column index: 2
 * --------------------------------------------
 * 
 * Commentary: I will need to have a method to randomly generate binary numbers in
 * a matrix. I will then need to use a nested for loop to find the maximum row and
 * return the index. Same criteria for column index. I will print output as shown
 * in sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/15/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.10
 */

public class EX10_LargestRowColumn {
    
    public static void main(String[] args) {
        
        // use randBinFill method to fill matrix with random 0 or 1's, "4" and "4" is to define size of matrix
        int[][] m = randBinFill(4, 4);
        
        // print matrix as shown in sample run
        print(m);
        
        // call and print output of row index and column index
        System.out.println("The largest row index: " + getRow(m));
        System.out.println("The largest column index: " + getCol(m));
                
    }
    
    // method to fill matrix of user defined size with random 0's and 1's
    public static int[][] randBinFill(int a, int b) {
        int[][] result = new int[a][b];
        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = (int)(Math.random() * 2);
            }
        }
        
        return result;
    }
    
    // method to sum values of each row and compare each row to current max, return row index of max row sum
    public static int getRow(int[][] m) {
        int maxRow = 0;
        int max = 0;
        for (int i = 0; i < m.length; i++) {
            int sum = 0;
            for (int j = 0; j < m[0].length; j++) {
                sum += m[i][j];
            }
            
            if (sum > max) {
                max = sum;
                maxRow = i;
            }
        }
        return maxRow;
    }
        
    // method to sum values of each column and compare each column to current max, return column index of max column sum
    public static int getCol(int[][] m) {
        int maxCol = 0;
        int max = 0;
        for (int i = 0; i < m[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < m.length; j++) {
                sum += m[j][i];
            }
            
            if (sum > max) {
                max = sum;
                maxCol = i;
            }
        }
        return maxCol;
    }

    // method to print matrix as shown in sample run
    public static void print(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
}
