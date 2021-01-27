/**
 * (Guess the capitals) Write a program that repeatedly prompts the user to enter
 * a capital for a state. Upon receiving the user input, the program reports whether
 * the answer is correct. Assume that 50 states and their capitals are stored in a two-
 * dimensional array, as shown in Figure 8.10. The program prompts the user to
 * answer all states’ capitals and displays the total correct count. The user’s answer
 * is not case-sensitive.
 *
 * [SEE PHOTO IN FOLDER]
 * 
 * Here is a sample run:
 * 
 * ----------------------------------------------------------------
 * What is the capital of Alabama? Montogomery
 * The correct answer should be Montgomery
 * What is the capital of Alaska? Juneau
 * Your answer is correct
 * What is the capital of Arizona? ...
 * ...
 * The correct count is 35
 * ----------------------------------------------------------------
 * 
 * Commentary: I will need to find a list of the states and capitals and add them to a 50 x 2
 * matrix. I will then use a for-loop to display the state and compare the users input
 * to the matrices stored capital. I will increment a counter for correct answers. I will print
 * output to match sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/22/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.37
 */

import java.util.Scanner;

public class EX37_GuessCapitals {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("The correct count is " + guessCapitals(input));
        
    }
    
    public static int guessCapitals(Scanner s) {
        int count = 0;
        
        String[][] capitals = {
          {"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"}, {"Arkansas", "Little Rock"}, {"California", "Sacramento"},
          {"Colorado", "Denver"}, {"Connecticut", "Hartford"}, {"Delaware", "Dover"}, {"Florida", "Tallahassee"}, {"Georgia", "Atlanta"},
          {"Hawaii", "Honolulu"}, {"Idaho", "Boise"}, {"Illinois", "Springfield"}, {"Indiana", "Indianapolis"}, {"Iowa", "Des Moines"},
          {"Kansas", "Topeka"}, {"Kentucky", "Frankfort"}, {"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"}, {"Maryland", "Annapolis"},
          {"Massachusetts", "Boston"}, {"Michigan", "Lansing"}, {"Minnesota", "St. Paul"}, {"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"},
          {"Montana", "Helena"}, {"Nebraska", "Lincoln"}, {"Nevada", "Carson City"}, {"New Hampshire", "Concord"}, {"New Jersey", "Trenton"},
          {"New Mexico", "Santa Fe"}, {"New York", "Albany"}, {"North Carolina", "Raleigh"}, {"North Dakota", "Bismarck"}, {"Ohio", "Columbus"},
          {"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"}, {"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"}, {"South Carolina", "Columbia"},
          {"South Dakota", "Pierre"}, {"Tennessee", "Nashville"}, {"Texas", "Austin"}, {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"},
          {"Virginia", "Richmond"}, {"Washington", "Olympia"}, {"West Virginia", "Charleston"}, {"Wisconsin", "Madison"}, {"Wyoming", "Cheyenne"}};
      
        for (int i = 0; i < capitals.length; i++) {
            System.out.print("What is the capital of " + capitals[i][0] + "? ");
            String str = s.nextLine();
            if (str.equalsIgnoreCase(capitals[i][1])) {
                System.out.println("Your answer is correct");
                count++;
            } else
                System.out.println("The correct answer should be " + capitals[i][1]);
        }
        
        return count;
    }
}
