/**
 * (Game: hangman) Write a hangman game that randomly generates a word and
 * prompts the user to guess one letter at a time, as shown in the sample run. Each
 * letter in the word is displayed as an asterisk. When the user makes a correct
 * guess, the actual letter is then displayed. When the user finishes a word, display
 * the number of misses and ask the user whether to continue to play with another
 * word. Declare an array to store words, as follows:
 * 
 * // Add any words you wish in this array
 * String[] words = {"write", "that", ...};
 * 
 * -------------------------------------------------------
 * (Guess) Enter a letter in word ******* > p [ENTER]
 * (Guess) Enter a letter in word p****** > r [ENTER]
 * (Guess) Enter a letter in word pr**r** > p [ENTER]
 * p is already in the word
 * (Guess) Enter a letter in word pr**r** > o [ENTER]
 * (Guess) Enter a letter in word pro*r** > g [ENTER]
 * (Guess) Enter a letter in word progr** > n [ENTER]
 * n is not in the word
 * (Guess) Enter a letter in word progr** > m [ENTER]
 * (Guess) Enter a letter in word progr*m > a [ENTER]
 * The word is program. You missed 1 time
 * Do you want to guess another word? Enter y or n>
 * -------------------------------------------------------
 * 
 * Commentary: I will need to use a static variable to count the misses. I will need a
 * nested while or do-while loop. I will need multiple methods to check the user input.
 * The check methods will need to check if the word is solved. Another method will need
 * to check if the character guess has already been guessed within the word, or if the 
 * letter is not in the word. The sentinel loop will be used to prompt the user
 * on whether they'd like to run another game. I will print output as shown in sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/11/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.35
 */

import java.util.Scanner;

public class EX35_Hangman {
    
    // used a static variable to count the misses
    public static int missed; 
    
    public static void main(String[] args) {
        
        // create scanner and sentinel loop variable
        Scanner input = new Scanner(System.in);
        String another = "y";
        
        while (another.equalsIgnoreCase("y")) {
            // get word, create asterisk word, and reset misses
            String word = getWord();
            char[] asterisk = getAsterisk(word);
            missed = 0;
        
            while (!isSolved(asterisk)) {   // once word is solved, terminate game
                
                // prompt user to enter guess
                System.out.print("(Guess) Enter a letter in word ");
                System.out.print(asterisk);
                System.out.print(" > ");
                String guess = input.next();
                
                // check the guess
                checkGuess(asterisk, word, guess);
                
            }
            
            // print summary of the game
            System.out.println("The word is " + word + ". You missed " + missed + (missed == 1 ? " time" : " times"));
        
            // ask user if they'd like to play again
            System.out.print("Do you want to guess another word? Enter y or n > ");
            another = input.next();
            System.out.println("\n\n");
        }

    }
    
    // this method returns a random word from a list of words
    public static String getWord() {
        String[] words = {"recursion", "methods", "objects", "inheritance", "polymorphism", "arrays", "generics", 
               "lists", "stacks", "graphs", "queues", "hashing", "maps", "trees"};
               
        return words[(int)(Math.random() * 15)];
    }
    
    // this method returns the word as an equivalent asterisk char array of same word length
    public static char[] getAsterisk(String s) {
        char[] asterisk = new char[s.length()];
        for (int i = 0; i < asterisk.length; i++) {
            asterisk[i] = '*';
        }
        
        return asterisk;
    }
    
    // this method checks the users guess
    public static void checkGuess(char[] asterisk, String word, String s) {
        
        // convert guess string to char
        char guess = s.charAt(0);
        int count = 0;
        
        // loop to check if the guess has already been used and is present in the word
        for (int i = 0; i < asterisk.length; i++) {
            if (guess == asterisk[i]) {
                System.out.println("\t" + guess + " is already in the word.");
                break;
            }
        }
        
        // loop to check if the letter guessed is in the word and if not, let user know and count miss
        for (int i = 0; i < word.length(); i++) {
            if (guess != word.charAt(i))
                count++;
                
            if (count == word.length()) {
                System.out.println("\t" + guess + " is not in the word");
                missed++;
                break;
            }
        }
        
        // loop to find letter to convert from '*' to the guess char        
        for (int i = 0; i < asterisk.length; i++) {
            if (guess == word.charAt(i))
                asterisk[i] = guess;
        }
        
    }
    
    // checks if asterisk list has been solved (no asterisks = solved)
    public static boolean isSolved(char[] asterisk) {
        for (char b: asterisk) {
            if (b == '*') 
                return false;
        }
        
        return true;
    }
}
