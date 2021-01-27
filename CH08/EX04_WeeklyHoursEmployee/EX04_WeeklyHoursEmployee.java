/**
 * (Compute the weekly hours for each employee) Suppose the weekly hours for all
 * employees are stored in a two-dimensional array. Each row records an employee’s
 * seven-day work hours with seven columns. For example, the following
 * array stores the work hours for eight employees. Write a program that displays
 * employees and their total hours in decreasing order of the total hours.
 * 
 * [SEE PHOTO IN FOLDER]
 * 
 * Commentary: I will need to sum each row and assign each total and each row to
 * a new two dimensional array. I will sort the array using selection sort in descending
 * order. I will print output as described in the problem statement.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/15/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.4
 */

public class EX04_WeeklyHoursEmployee {
    
    public static void main(String[] args) {
        
        // initialize employee hours
        int[][] weeklyHours = {{2, 4, 3, 4, 5, 8, 8},
                               {7, 3, 4, 3, 3, 4, 4},
                               {3, 3, 4, 3, 3, 2, 2},
                               {9, 3, 4, 7, 3, 4, 1},
                               {3, 5, 4, 3, 6, 3, 8},
                               {3, 4, 4, 6, 3, 4, 4},
                               {3, 7, 4, 8, 3, 8, 4},
                               {6, 3, 5, 9, 2, 7, 9}};
        
        // get total hours for the week for each employee
        int[][] totalHours = getTotalHours(weeklyHours);
        
        // pass totalHours to be sorted
        sort(totalHours);
        
        // print total hours for each employee in descending order per problem statement
        for (int i = 0; i < totalHours.length; i++) {
            System.out.println("Employee " + totalHours[i][0] + " total weekly hours: " + totalHours[i][1]);
        }
    }
    
    // method to calculate the total weekly hours for each employee
    public static int[][] getTotalHours(int[][] m) {
        int[][] sumHours = new int[m.length][2];
        
        for (int i = 0; i < m.length; i++) {
            sumHours[i][0] = i;
            for (int j = 0; j < m[0].length; j++) {
                sumHours[i][1] += m[i][j];
            }
        }
        
        return sumHours;
    }

    // method to sort array in descending order using selection sort
    public static void sort(int[][] m) {
        
        for (int i = 0; i < m.length - 1; i++) {
            
            int curMaxEmployee = m[i][0];
            int curMaxHours = m[i][1];
            int curMaxIndex = i;
            
            // if value of max hours is less than the reviewed hours, reassign new max hours
            for (int j = i + 1; j < m.length; j++) {
                if (curMaxHours < m[j][1]) {
                    curMaxHours = m[j][1];
                    curMaxEmployee = m[j][0];
                    curMaxIndex = j;
                }
                
            }
            
            // swap employee and total hours
            if (curMaxIndex != i) {
                m[curMaxIndex][0] = m[i][0];    // employee number
                m[curMaxIndex][1] = m[i][1];    // employee total hours
                m[i][0] = curMaxEmployee;
                m[i][1] = curMaxHours;
            }
        }
    }
}
