/**
 * (Geometry: polygon subareas) A convex 4-vertex polygon is divided into four
 * triangles, as shown in Figure 8.9.
 * 
 * Write a program that prompts the user to enter the coordinates of four vertices and
 * displays the areas of the four triangles in increasing order. Here is a sample run:
 * 
 * [SEE PHOTO IN FOLDER]
 * 
 * ----------------------------------------------------------
 * Enter x1, y1, x2, y2, x3, y3, x4, y4:
 * -2.5 2 4 4 3 -2 -2 -3.5 [ENTER]
 * The areas are 6.17 7.96 8.08 10.42
 * ----------------------------------------------------------
 * 
 * Commentary: I will need to combine the code used in Exercise 8.31 and Exercise 8.32
 * to find the intersection of the entered points and calculate the areas of each triangle.
 * I will need to sort the areas in ascending order. I will print the output as shown
 * in sample run.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/23/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 8.33
 */

import java.util.Scanner;

public class EX33_PolygonSubareas {
    
    public static void main(String[] args) {
        
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double[][] points = getMatrix();
                
        double[] intersectPoint = getIntersectingPoint(points);
        
        // print output to match Exercise 3.25 sample runs
        if (intersectPoint == null) {
            System.out.println("There is no intersecting point or coordinates entered incorrectly (i.e., coordinates entered clockwise). Try again.");
            System.exit(1);
        }

        double[] subAreas = getPolyAreas(points, intersectPoint);
        
        bubbleSort(subAreas);
        
        System.out.print("The areas are ");
        for (int i = 0; i < subAreas.length; i++)
            System.out.printf("%2.2f ", subAreas[i]);
            
    }
    
    // method to pass arrays to a matrix and get triangle areas
    public static double[] getPolyAreas(double[][] coords, double[] intersect) {
        double[] areas = new double[coords.length];
        for (int i = 0; i < coords.length; i++) {
            int j = (i + 1) % coords.length;    // allows values to wrap back to the beginning when index surpasses array index boundary
            double[][] triPoints = {coords[i], coords[j], intersect};   
            areas[i] = getTriangleArea(triPoints);
        }
        
        return areas;
    }
    
    // method bubble sort, used to sort values in ascending order
    public static void bubbleSort(double[] values) {
        double temp;
        boolean nextPass = true;
        
        for (int i = 1; i < values.length && nextPass; i++) {       // terminate loop if at end of array or a new pass is not needed
            nextPass = false;
            for (int j = 0; j < values.length - i; j++) {
                if (values[j] > values[j + 1]) {    // current value greater than the next? swap values
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                    nextPass = true; 
                }
            }
        }
        
    }
    
    // method to determine intersecting point of two lines, or if parallel per Cramer's rule
    public static double[] getIntersectingPoint(double[][] points) {
        // need to swap (x2, y2) and (x3, y3) to allow interesting points method to work properly
        double[] temp = points[1];
        points[1] = points[2];
        points[2] = temp;
        
        double[] result = new double[2];
        
        double a = points[0][1] - points[1][1];     // (y1 - y2)
        double b = -1 * (points[0][0] - points[1][0]); // -1 * (x1 - x2)
        double c = points[2][1] - points[3][1]; // (y3 - y4)
        double d = -1 * (points[2][0] - points[3][0]); // -1 * (x3 - x4)
        double e = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1]; // (y1 - y2) * x1 - (x1 - x2) * y1
        double f = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1]; // (y3 - y4) * x3 - (x3 - x4) * y3
        
        double divisor = (a * d - b * c);
        
        if (divisor == 0)
            return result = null;
        else {
            result[0] = (e * d - b * f) / divisor;
            result[1] = (a * f - e * c) / divisor;
        }
        
        // swap (x2, y2) and (x3, y3) back before calculating triangle areas
        temp = points[1];
        points[1] = points[2];
        points[2] = temp;
        
        return result;
    }
    
    // method to calculates a triangles area based based on Exercise 2.19
    public static double getTriangleArea(double[][] points) {
        if (sameLine(points)) // check if points on same line
            return 0;
        
        // calculate area of a triangle
        double s1 = getSide(points[0][0], points[0][1], points[1][0], points[1][1]);
        double s2 = getSide(points[1][0], points[1][1], points[2][0], points[2][1]);
        double s3 = getSide(points[2][0], points[2][1], points[0][0], points[0][1]);
        double s = (s1 + s2 + s3) / 2;
        double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        
        return area;
    }
    
    // method that checks if the points are on the same line using Exercise 3.32 problem statement
    public static boolean sameLine(double[][] points) {
        // ((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) == 0 
        return ((points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) - (points[2][0] - points[0][0]) * (points[1][1] - points[0][1])) == 0;
    }
    
    // method to calculate distance between points
    public static double getSide(double x1, double y1, double x2, double y2) {
        // SQRT((X2 - X1)^2 + (Y2 - Y1)^2)
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));       
    }
    
    // method to get user data and fill matrix, then return matrix to variable
    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in); 
        double[][] m = new double[4][2];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        
        return m;
    }

}
