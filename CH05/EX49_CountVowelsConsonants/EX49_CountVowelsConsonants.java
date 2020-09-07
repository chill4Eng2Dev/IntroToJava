/**
 * (Count vowels and consonants) Assume letters A, E, I, O, and U as the vowels.
 * Write a program that prompts the user to enter a string and displays the number
 * of vowels and consonants in the string.

 * ------------------------------------------
 * Enter a string: Programming is fun [ENTER]
 * The number of vowels is 5
 * The number of consonants is 11
 * ------------------------------------------
 * 
 * Commentary: I will need to check if the character is within the uppercase range
 * of A through Z, if it is, have a counter for vowels and consonants should the
 * character be either one of those options. I will print output as shown in sample
 * run.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/2/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 5.49
 */

import java.util.Scanner;

public class EX49_CountVowelsConsonants {
    
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // assign user input to string
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        // convert string to uppercase and initialize vowel & consonant counter
        str = str.toUpperCase();
        int vowel = 0, consonant = 0;
        
        // check if char within A-Z range, if so, check if vowel, otherwise it's a consonant
        for (int i = 0; i < str.length(); i++) {
            if(!(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))
                continue;
            else if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' ||
                     str.charAt(i) == 'O' || str.charAt(i) == 'U')
                vowel++;
            else
                consonant++;
        }
        
        // print output as shown in sample run
        System.out.println("The number of vowels is " + vowel);
        System.out.println("The number of consonants is " + consonant);
        
    }
                

}
