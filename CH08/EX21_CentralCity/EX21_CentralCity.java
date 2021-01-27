/**
 * (Central city) Given a set of cities, the central city is the city that has the shortest
 * total distance to all other cities. Write a program that prompts the user to enter
 * the number of the cities and the locations of the cities (coordinates), and finds
 * the central city and its total distance to all other cities.
 * 
 * -------------------------------------------------------
 * Enter the number of cities: 5 [ENTER]
 * Enter the coordinates of the cities:
 * 2.5 5 5.1 3 1 9 5.4 54 5.5 2.1 [ENTER]
 * The central city is at (2.5, 5.0)
 * The total distance to all other cities is 60.81
 * -------------------------------------------------------
 *
 * Commentary: I will need to use the distance method to find the distance starting from one
 * city and summing the distance to travel to all other cities. I will then need to do the
 * same process for each city. I will then need to find the minimum distance. I will print
 * output as shown in sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/23/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.21
 */

import java.util.Scanner;

public class EX21_CentralCity {
    
    public static void main(String[] args) {
        
        // get city count and city coordinates from user and store in matrix
        double[][] cityCoords = getMatrix();
    
        // call method to get city center and the distance needed to travel to visit all cities
        double[] cityCenter = getCityAndDistance(cityCoords);
        
        // print output as shown in sample run
        System.out.println("The central city is at (" + cityCenter[0] + ", " + cityCenter[1] + ")");
        System.out.printf("The total distance to all other cities is %2.2f\n", cityCenter[2]);
    }
    
    public static double[] getCityAndDistance(double[][] cityCoords) {
        double[] array = new double[3]; // array that stores coordinates of center city and min distance
        
        // find distance between all cities from potentional center city
        for (int i = 0; i < cityCoords.length; i++) {
            for (int j = 0; j < cityCoords.length; j++) {
                if (j != i)
                    cityCoords[i][2] += distance(cityCoords[i][0], cityCoords[i][1], cityCoords[j][0], cityCoords[j][1]);
            }
        }
        
        // find the minimum distance to travel and store corresponding coordinates in array
        for (int i = 0; i < cityCoords.length; i++) {
            if (cityCoords[i][2] < array[2] || array[2] == 0) { // distance must be greater than zero
                for (int j = 0; j < cityCoords[i].length; j++) {
                    array[j] = cityCoords[i][j];
                }
            }
        }
        
        return array;
    }    
        
    // method to get user data and fill matrix, then return matrix to variable
    public static double[][] getMatrix() {
        // get number of cities
        Scanner input = new Scanner(System.in); 
        System.out.print("\nEnter the number of cities: ");
        double[][] m = new double[input.nextInt()][3];
        
        // store user inputs into matrix
        System.out.println("Enter the coordinates of the cities: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length - 1; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        
        return m;
    }
    
    // Compute the distance between two points (x1, y1) and (x2, y2)
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }    

}
