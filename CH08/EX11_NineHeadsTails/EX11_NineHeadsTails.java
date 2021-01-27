/**
 * (Game: nine heads and tails) Nine coins are placed in a 3-by-3 matrix with some
 * face up and some face down. You can represent the state of the coins using a
 * 3-by-3 matrix with values 0 (heads) and 1 (tails). Here are some examples:
 * 
 * 0 0 0    1 0 1   1 1 0   1 0 1   1 0 0
 * 0 1 0    0 0 1   1 0 0   1 1 0   1 1 1
 * 0 0 0    1 0 0   0 0 1   1 0 0   1 1 0
 * 
 * Each state can also be represented using a binary number. For example, the preceding
 * matrices correspond to the numbers
 * 
 * 000010000 101001100 110100001 101110100 100111110
 * 
 * There are a total of 512 possibilities, so you can use decimal numbers 0, 1, 2, 3,
 * . . . , and 511 to represent all states of the matrix. Write a program that prompts
 * the user to enter a number between 0 and 511 and displays the corresponding
 * matrix with the characters H and T. Here is a sample run:
 * 
 * ---------------------------------------------------------------
 * Enter a number between 0 and 511: 7 [ENTER]
 * H H H
 * H H H
 * T T T
 * ---------------------------------------------------------------
 * 
 * The user entered 7, which corresponds to 000000111. Since 0 stands for H and
 * 1 for T, the output is correct.
 *
 * Commentary: I will need to use my calculations from exercise 5.37 to convert a decimal
 * to a binary number. I will then need to pad the binary number with extra zeros to equal 
 * a total string length of 9 (for the 3x3 matrix). I will then create a char matrix and 
 * print the values of the matrix as shown in the sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/17/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.11
 */

import java.util.Scanner;

public class EX11_NineHeadsTails {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 511: ");
        int decimal = input.nextInt();
        
        // check if the user entered a decimal number within range
        if (decimal < 0 || decimal > 511) {
            System.out.println("Value entered exceeds the allowable range (0-511). Please try again.");
            System.exit(1);
        }
        
        // convert the decimal value to binary
        String bin = getBinFromDec(decimal);
        
        // convert the string into a corresponding char matrix
        char[][] m = getMatrix(bin);
        
        // print the matrix as shown in sample run
        printMatrix(m);
        
    }

    // method to convert a decimal number to a binary string
    public static String getBinFromDec(int decimal) {
        String str = "";
        int remainder;
        
        // if decimal is initially entered as 0, str is zero then padded
        if (decimal == 0)
            str = "0";
        
        // convert the decimal entry to binary
        while (decimal != 0) {
            remainder = decimal % 2;
            decimal = decimal / 2;
            str = remainder + str;
        }
        
        // this portion pads the string with zeros should the string need them
        if (str.length() < 9) {
            for (int i = str.length(); i < 9; i++)
                str = "0" + str;
        }
        
        return str;
    }       
    
    // method to convert the binary string to a heads/tails matrix
    public static char[][] getMatrix(String s) {
        char[][] matrix = new char[3][3];
        int index = 0;  // incremented to check each char of string
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (s.charAt(index) == '0')
                    matrix[i][j] = 'H';
                else
                    matrix[i][j] = 'T';
                
                index++;
            }
        }
        return matrix;
    }
    
    // method to print matrix
    public static void printMatrix(char[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j] + " ");
                
            System.out.println();
        }
    }
}
