/**
 * (Guess birthday) Rewrite Listing 4.3, GuessBirthday.java, to prompt the user to
 * enter the character Y for Yes and N for No rather than entering 1 for Yes and 0
 * for No. 
 * 
 * Commentary: I will need to modify the code for Listing 4.3. I will need to take 
 * the user input as a string then pull then extract the entry as a char using charAt(0). 
 * I will then need to revise all statements that rely on the user entry being 0 or 1 to
 * be Y or N. I will use "ignores case" to simplify the code. I will match the listing 
 * sample run.
 *
 * Author: chill4Eng2Dev 
 * Date: 8/25/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.10
 */

import java.util.Scanner; 

public class EX10_GuessBirthday {

    public static void main(String[] args) {
        String set1 = " 1 3 5 7\n" +
                      " 9 11 13 15\n" +
                      "17 19 21 23\n" +
                      "25 27 29 31";
        
        String set2 = " 2 3 6 7\n" + 
                      "10 11 14 15\n" + 
                      "18 19 22 23\n" + 
                      "26 27 30 31";
        
        String set3 = " 4 5 6 7\n" +
                      "12 13 14 15\n" +
                      "20 21 22 23\n" +
                      "28 29 30 31";

        String set4 = " 8 9 10 11\n" +
                      "12 13 14 15\n" +
                      "24 25 26 27\n" +
                      "28 29 30 31";
        
        String set5 = "16 17 18 19\n" +
                      "20 21 22 23\n" +
                      "24 25 26 27\n" +
                      "28 29 30 31";
                      
        int day = 0;

        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to answer questions
        System.out.print("Is your birthday in Set1?\n");
        System.out.print(set1);
        System.out.print("\nEnter 'N' for No and 'Y' for Yes: ");
        String str = input.nextLine();
        char answer = str.toLowerCase().charAt(0);

        if (answer == 'y')
            day += 1;
        
        // Prompt the user to answer questions
        System.out.print("\nIs your birthday in Set2?\n");
        System.out.print(set2);
        System.out.print("\nEnter 'N' for No and 'Y' for Yes: ");
        str = input.nextLine();
        answer = str.toLowerCase().charAt(0);
        
        if (answer == 'y')
            day += 2;

        // Prompt the user to answer questions
        System.out.print("Is your birthday in Set3?\n");
        System.out.print(set3);
        System.out.print("\nEnter 'N' for No and 'Y' for Yes: ");
        str = input.nextLine();
        answer = str.toLowerCase().charAt(0);
        
        if (answer == 'y')
            day += 4;

        // Prompt the user to answer questions
        System.out.print("\nIs your birthday in Set4?\n");
        System.out.print(set4);
        System.out.print("\nEnter 'N' for No and 'Y' for Yes: ");
        str = input.nextLine();
        answer = str.toLowerCase().charAt(0);
        
        if (answer == 'y')
            day += 8;
        
        // Prompt the user to answer questions
        System.out.print("\nIs your birthday in Set5?\n");
        System.out.print(set5);
        System.out.print("\nEnter 'N' for No and 'Y' for Yes: ");
        str = input.nextLine();
        answer = str.toLowerCase().charAt(0);
        
        if (answer == 'y')
            day += 16;

        System.out.println("\nYour birthday is " + day + "!");
    }
}