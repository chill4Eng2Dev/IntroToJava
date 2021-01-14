/**
 * (Game: locker puzzle) A school has 100 lockers and 100 students. All lockers are
 * closed on the first day of school. As the students enter, the first student, denoted
 * S1, opens every locker. Then the second student, S2, begins with the second
 * locker, denoted L2, and closes every other locker. Student S3 begins with the
 * third locker and changes every third locker (closes it if it was open, and opens it if
 * it was closed). Student S4 begins with locker L4 and changes every fourth locker.
 * Student S5 starts with L5 and changes every fifth locker, and so on, until student
 * S100 changes L100.
 * 
 * After all the students have passed through the building and changed the lockers,
 * which lockers are open? Write a program to find your answer and display all
 * open locker numbers separated by exactly one space.
 * 
 * (Hint: Use an array of 100 Boolean elements, each of which indicates whether a
 * locker is open (true) or closed (false). Initially, all lockers are closed.)
 *
 * Commentary: I will need to have a nested for-loop and have 101 array boolean elements.
 * The 101 array boolean elements will make it easier for the program. The nest for-loop
 * will need to consider that j will need to start at i every iteration. I will need to
 * increment the student count by (1) every iteration but the locker opened or closed with
 * a multiple of the incremented student value. I will print output as described in the 
 * problem statement.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/11/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.23
 */

public class EX23_LockerPuzzle {
    
    public static void main(String[] args) {
        
        // create lockers array, ignore lockers[0]
        boolean[] lockers = new boolean[101];
        
        // nested for loop as described in the description
        for (int i = 1; i < lockers.length; i++) {
            for (int j = i; j < lockers.length; j += i) {
                lockers[j] = !lockers[j];
            }
        }
        
        // print open lockers
        System.out.print("\nThe open lockers are: ");
        for (int i = 1; i < lockers.length; i++) {
            if (lockers[i])
                System.out.print("L" + i + " ");
                
        }
        System.out.println();
    }

}
