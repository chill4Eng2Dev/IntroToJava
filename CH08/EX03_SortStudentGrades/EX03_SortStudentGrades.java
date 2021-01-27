/**
 * (Sort students on grades) Rewrite Listing 8.2, GradeExam.java, to display the
 * students in increasing order of the number of correct answers.
 * 
 * Commentary: I will need to create a new two dimensional array for each students
 * total number of correct answers. I will need to sort the array using selection sort
 * and sorting by grade. I will then print output as shown in listing sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/15/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.3
 */

public class EX03_SortStudentGrades {
    
    public static void main(String[] args) {
        // Students' answers to the questions
        char[][] answers = {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        
        // array that holds each students grade
        int[][] studentGrade = new int[answers.length][2];
        
        // Grade all answers for each student
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    studentGrade[i][0] = i;
                    studentGrade[i][1]++;
                }
            }
        }
        
        // pass matrix through sort method
        sort(studentGrade);
        
        // print output as shown in listing but in ascending order by grade
        for (int i = 0; i < studentGrade.length; i++) {
            System.out.println("Student " + studentGrade[i][0] + "'s correct count is " + studentGrade[i][1]);
        }
    }
    
    // method to sort array in ascending order using selection sort
    public static void sort(int[][] m) {
        
        for (int i = 0; i < m.length - 1; i++) {
            
            int curMinStudent = m[i][0];
            int curMinGrade = m[i][1];
            int curMinIndex = i;
            
            // if value of min grade is greater than the reviewed grade, assign reviewed grade to min
            for (int j = i + 1; j < m.length; j++) {
                if (curMinGrade > m[j][1]) {
                    curMinGrade = m[j][1];
                    curMinStudent = m[j][0];
                    curMinIndex = j;
                }
                
            }
            
            // swap grade and student number
            if (curMinIndex != i) {
                m[curMinIndex][0] = m[i][0];    // student number
                m[curMinIndex][1] = m[i][1];    // student grade
                m[i][0] = curMinStudent;
                m[i][1] = curMinGrade;
            }
        }
    }
        
}


