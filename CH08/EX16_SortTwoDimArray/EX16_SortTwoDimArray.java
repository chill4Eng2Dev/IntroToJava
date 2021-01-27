/**
 * (Sort two-dimensional array) Write a method to sort a two-dimensional array
 * using the following header:
 * 
 * public static void sort(int m[][])
 * 
 * The method performs a primary sort on rows and a secondary sort on columns.
 * For example, the following array
 * 
 * {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
 * 
 * will be sorted to
 * 
 * {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
 *
 * Commentary: I will need to modify selection sort to account for a two dimensional
 * array. The adjusted selection sort is only good for a n-by-2 array. The for loops
 * will need to search for the smallest value in the matrix and swap with the current
 * position. I will print the matrix before and after sorting.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/22/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.16
 */

public class EX16_SortTwoDimArray {
    
    public static void main(String[] args) {
        int[][] m = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};

        System.out.println("\nThe matrix prior to sorting is: ");
        printMatrix(m);
        
        sort(m);
        
        System.out.println("\nThe matrix after sorting is: ");
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
    
    // adjusted selection sort method to work for a two dimensional array
    public static void sort(int[][] m) {
        int[] temp = new int[2];
        
        for (int i = 0; i < m.length - 1; i++) {
            temp[0] = m[i][0];
            temp[1] = m[i][1];
            int minIndex = i;
            for (int j = i + 1; j < m.length; j++) {
                if (m[j][0] < temp[0] || m[j][0] == temp[0] && m[j][1] < temp[1]) {
                    temp[0] = m[j][0];
                    temp[1] = m[j][1];
                    minIndex = j;
                }
            }
            
            if (minIndex != i) {
                m[minIndex][0] = m[i][0];
                m[minIndex][1] = m[i][1];
                m[i][0] = temp[0];
                m[i][1] = temp[1];
            }
        }
          
    }
}
