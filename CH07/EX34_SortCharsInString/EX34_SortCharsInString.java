/**
 * (Sort characters in a string) Write a method that returns a sorted string using the
 * following header:
 * 
 * public static String sort(String s)
 * 
 * For example, sort("acb") returns abc.
 * 
 * Write a test program that prompts the user to enter a string and displays the sorted
 * string.
 * 
 * Commentary: I will pass the string through sort method and store the string into a char
 * array. Char array can be evaluated as an integer, therefore using the selection sort
 * method should allow me to sort the char array. Once the array is sorted, I will create
 * a string to be returned from the char array and print output as described in problem
 * statement.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/10/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.34
 */

import java.util.Scanner;

public class EX34_SortCharsInString {
    
    public static void main(String[] args) {
                
        Scanner input = new Scanner(System.in);
        
        // assign user input to string to be sorted
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        // call sort method and print output
        System.out.println("The sorted string is " + sort(str));
        
    }
    
    // method sort that stores passed string in a char array, sorts array, and returns a string from array
    public static String sort(String s) {
        char[] sortChars = new char[s.length()];
        String sortedString = "";
        
        // store string values into array
        for (int i = 0; i < sortChars.length; i++) {
            sortChars[i] = s.charAt(i);
        }
        
        // selection sort used to sort char array
        for (int i = 0; i < sortChars.length - 1; i++) {
            // Find the minimum in the list
            char currentMin = sortChars[i];
            int currentMinIndex = i;
            
            for (int j = i + 1; j < sortChars.length; j++) {
                if (currentMin > sortChars[j]) {
                    currentMin = sortChars[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                sortChars[currentMinIndex] = sortChars[i];
                sortChars[i] = currentMin;
            }
                        
        }
        
        // create string from the sorted char array
        for (int i = 0; i < sortChars.length; i++)
            sortedString = sortedString + sortChars[i];
        
        return sortedString;
    }
        

}
