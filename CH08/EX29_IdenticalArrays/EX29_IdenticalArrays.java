/**
 * (Identical arrays) The two-dimensional arrays m1 and m2 are identical if they
 * have the same contents. Write a method that returns true if m1 and m2 are identical,
 * using the following header:
 * 
 * public static boolean equals(int[][] m1, int[][] m2)
 * 
 * Write a test program that prompts the user to enter two 3 * 3 arrays of integers
 * and displays whether the two are identical. Here are the sample runs.
 * 
 * -------------------------------------------
 * Enter list1: 51 25 22 6 1 4 24 54 6
 * Enter list2: 51 22 25 6 1 4 24 54 6
 * The two arrays are identical
 * -------------------------------------------
 * 
 * -------------------------------------------
 * Enter list1: 51 5 22 6 1 4 24 54 6
 * Enter list2: 51 22 25 6 1 4 24 54 6
 * The two arrays are not identical
 * -------------------------------------------
 * 
 * Commentary: I will need to sort each user defined matrix. I will convert the matrix
 * to an array and then sort as this is less computation heavy. I will then compare the
 * two arrays and print output as shown in sample runs.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/16/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.29
 */

import java.util.Scanner;

public class EX29_IdenticalArrays {
    
    public static void main(String[] args) {
        
        System.out.print("\nEnter list1: "); 
        int[][] list1 = getMatrix();
        
        System.out.print("Enter list2: ");
        int[][] list2 = getMatrix();
        
        System.out.println("The two arrays are " + (equals(list1, list2) ? "" : "not ") + "identical");
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
    
    // sorts a matrix after converting matrix to array
    public static int[] sort(int[][] m) {
        int[] array = matrixToArray(m);
        
        for (int i = 0; i < array.length - 1; i++) {
            // start with min value
            int min = array[i];
            int minIndex = i;
            
            // search through remaining list to find smaller value
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minIndex = j;
                }
            }
    
            // swap the values if smaller value found
            if (minIndex != i) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
        return array;
    }
    
    // converted matrix to array to avoid a three nested for loop to sort 2-dimension array
    public static int[] matrixToArray(int[][] m) {
        int[] array = new int[m.length * m[0].length];
        int k = 0;
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                array[k] = m[i][j];
                k++;
            }
        }
        
        return array;
    }
    
    // method to compare each matrix (as an array) and determine if equal
    public static boolean equals(int[][] m1, int[][] m2) {
        int[] list1 = sort(m1);
        int[] list2 = sort(m2);
        
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                    return false;
        }
        
        return true;
    }

}
