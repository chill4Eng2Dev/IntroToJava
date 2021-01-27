/**
 * (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
 * identical if their corresponding elements are equal. Write a method that returns
 * true if m1 and m2 are strictly identical, using the following header:
 * 
 * public static boolean equals(int[][] m1, int[][] m2)
 * 
 * Write a test program that prompts the user to enter two 3 * 3 arrays of
 * integers and displays whether the two are strictly identical. Here are the
 * sample runs.
 * 
 * -------------------------------------------
 * Enter list1: 51 22 25 6 1 4 24 54 6 [ENTER]
 * Enter list2: 51 22 25 6 1 4 24 54 6 [ENTER]
 * The two arrays are strictly identical
 * -------------------------------------------
 * 
 * -------------------------------------------
 * Enter list1: 51 25 22 6 1 4 24 54 6 [ENTER]
 * Enter list2: 51 22 25 6 1 4 24 54 6 [ENTER]
 * The two arrays are not strictly identical
 * -------------------------------------------
 * 
 * Commentary: I will need to compare the elements of each matrix to each other and
 * return false if the element does not match at the same matrix location. I will print
 * output as shown in sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/16/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.28
 */

import java.util.Scanner;

public class EX28_StrictlyIdenticalArrays {

    public static void main(String[] args) {
        
        System.out.print("\nEnter list1: "); 
        int[][] list1 = getMatrix();
        
        System.out.print("Enter list2: ");
        int[][] list2 = getMatrix();
        
        System.out.println("The two arrays are " + (equals(list1, list2) ? "" : "not ") + "strictly identical");
    }
    
    // method to get user data and fill matrix, then return matrix to variable
    public static int[][] getMatrix() {
        
        Scanner input = new Scanner(System.in); 
        int[][] m = new int[3][3];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = input.nextInt();
            }
        }
        
        return m;
    }
    
    // method to compare each element of two arrays by comparing elements at each location for the two matrices
    public static boolean equals(int[][] m1, int[][] m2) {
        
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        
        return true;
    }
               
}
