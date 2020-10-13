/**
 * (Generate random characters) Use the methods in RandomCharacter in Listing
 * 6.10 to print 100 uppercase letters and then 100 single digits, printing ten per line.
 *  
 * Commentary: I will need two for loops to print the upper case letters then the numbers.
 * The methods from Listing 6.10 will be the getRandomCharacter(), getRandomUpperCase(),
 * and getRandomDigitCharacter(). I will print output as stated in the problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 9/9/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 6.38
 */

public class EX38_GenRandomChars {
    
    public static void main(String[] args) {
        
        // initialize constants
        final int NUMBER_OF_CHARS = 100;
        final int CHARS_PER_LINE = 10;
        
        // for loop for the upper case letters
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = getRandomUpperCaseLetter();
            if ((i + 1) % CHARS_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
        
        // for loop for the random numbers
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = getRandomDigitCharacter();
            if ((i + 1) % CHARS_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }

    }
    
    // random character generator method
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    
    // random upper case method
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }
    
    // random digit method
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
    
}
