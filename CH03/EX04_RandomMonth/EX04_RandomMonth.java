/**
 * (Random month) Write a program that randomly generates an integer between 1
 * and 12 and displays the English month name January, February, ..., December for
 * the number 1, 2, ..., 12, accordingly.
 *
 * Commentary: I will need to use Math.random() * 13 and case value down to integer.
 * I will use a switch-case statement to check the random number generated and process
 * the month output. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/21/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 3.4
 */

public class EX04_RandomMonth {

    public static void main(String[] args) {
        
        // declare and initialize a variable with a random number
        int number = (int)(1 + Math.random() * 12);
        
        // switch statement based on number passed through
        switch(number) {
            case 1: System.out.println("The number is " + number + " and the month is January"); break;
            case 2: System.out.println("The number is " + number + " and the month is February"); break;
            case 3: System.out.println("The number is " + number + " and the month is March"); break;
            case 4: System.out.println("The number is " + number + " and the month is April"); break;
            case 5: System.out.println("The number is " + number + " and the month is May"); break;
            case 6: System.out.println("The number is " + number + " and the month is June"); break;
            case 7: System.out.println("The number is " + number + " and the month is July"); break;
            case 8: System.out.println("The number is " + number + " and the month is August"); break;
            case 9: System.out.println("The number is " + number + " and the month is September"); break;
            case 10: System.out.println("The number is " + number + " and the month is October"); break;
            case 11: System.out.println("The number is " + number + " and the month is November"); break;
            case 12: System.out.println("The number is " + number + " and the month is December"); 
        }
    }
        
}
