/**
 * (Display characters) Write a method that prints characters using the following
 * header:
 * 
 * public static void printChars(char ch1, char ch2, int numberPerLine)
 * 
 * This method prints the characters between ch1 and ch2 with the specified numbers
 * per line. Write a test program that prints ten characters per line from 1 to Z.
 * Characters are separated by exactly one space.
 *  
 * Commentary: I will use a for loop and increment characters in the for loop to be
 * printed. Characters can be incremented much like int, so I will not have to cast
 * the character into an int first. I will print output as stated in the problem 
 * statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/9/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.12
 */

public class EX12_DisplayChars {
    
    public static void main(String[] args) {
        // initialize variables
        char ch1 = '1';
        char ch2 = 'Z';
        int charsPerLine = 10;
        
        // print characters as stated in problem statement
        System.out.println("\nThe characters printed from " + ch1 + " to " + ch2 + " are: ");
        printChars(ch1, ch2, charsPerLine);
        
    }
    
    // method to print the characters per the range and items per rows
    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int count = 1;
        for (char c = ch1; c <= ch2; c++) {
            if (count % numberPerLine == 0)
                System.out.println(c);
            else
                System.out.print(c + " ");
                
            count++;
        }
    }

}
