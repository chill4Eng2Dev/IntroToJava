/**
 * (Count single digits) Write a program that generates 100 random integers between
 * 0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
 * say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 * 
 * 
 * Commentary: I will use Math.random() to generate random numbers between 0-9 and store
 * the counts of each number into an array. I will then print the counts out as described
 * in the problem statement.
 *
 * Author: chill4Eng2Dev 
 * Date: 10/15/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 7.7
 */

public class EX07_CountSingleDigits {

    public static void main(String[] args) {
        
        // create an array
        int[] counts = new int[10];
        
        // get random nums count
        counts = getCountsOfRandNum();
        
        // print counts in tabular format
        System.out.println("\nThe counts are: ");
        System.out.printf("%3d%3d%3d%3d%3d%3d%3d%3d%3d%3d\n", 0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("-------------------------------");
        for (int i = 0; i < counts.length; i++)
            System.out.printf("%3d", counts[i]);
            
    }
    
    // method to generate random numbers that have been counted in the returning array
    public static int[] getCountsOfRandNum() {
        int[] nums = new int[10];
        int num;
        for (int i = 0; i < 100; i++) {
            num = (int)(Math.random() * 10);
            nums[num]++;
        }
        
        return nums;
    }
}
