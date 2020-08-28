/**
 * (Random character) Write a program that displays a random uppercase letter
 * using the Math.random() method.
 * 
 * Commentary: I will need to generate a random integer between 65 to 90 (inclusive).  
 * I will then need to convert the integer to a char and then print the char.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/27/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.16
 */


public class EX16_RandomCharacter {
    
    public static void main(String[] args) {
        
        // generate a random value between 65 and 90 (inclusive)
        int value = (int)(65 + Math.random() * 26);
        
        // cast integer into a character
        char ch = (char)value;
        
        // print character as stated in the problem statement
        System.out.println("The random uppercase character is " + ch);
    
    }
}
