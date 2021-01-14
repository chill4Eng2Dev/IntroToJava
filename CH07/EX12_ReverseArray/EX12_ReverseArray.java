/**
 * (Reverse an array) The reverse method in Section 7.7 reverses an array by
 * copying it to a new array. Rewrite the method that reverses the array passed in
 * the argument and returns this array. Write a test program that prompts the user to
 * enter ten numbers, invokes the method to reverse the numbers, and displays the
 * numbers.
 * 
 * Commentary: I will need to use a temporary element holder to store one of the elements
 * before swapping contents in the reverse method. I will also need to only perform this
 * task on half of the length of the array, otherwise I will reswap the values back into
 * the original order. I will print output as described in problem statement.
 * 
 * Author: chill4Eng2Dev 
 * Date: 10/16/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.12
 */

import java.util.Scanner;

public class EX12_ReverseArray {
    
    public static void main(String[] args) {
        
        // create scanner
        Scanner input = new Scanner(System.in);
        
        // create list and declare variable value
        int[] list = new int[10];
        int value;
        
        // assign user input to array
        System.out.print("\nEnter ten numbers: ");
        for (int i = 0; i < list.length; i++) {
           value = input.nextInt();
           list[i] = value;
        }

        // call reverse and return reversed list back into initially passed list
        list = reverse(list);
        
        // print output as stated in problem statement
        System.out.println("The numbers in reverse are: ");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        
    }
    
    // reverse method that instead swaps the passed through list rather than create a new list to return
    public static int[] reverse(int[] list) {
        
        // have to do half length, otherwise will reswap elements back in order
        for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
        
        return list;
    }
        
}
