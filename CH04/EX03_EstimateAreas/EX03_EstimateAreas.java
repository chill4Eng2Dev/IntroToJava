/**
 * (Geography: estimate areas) Find the GPS locations for Atlanta, Georgia; Orlando,
 * Florida; Savannah, Georgia; and Charlotte, North Carolina from www.gps-data-team.com/map/
 * and compute the estimated area enclosed by these four cities. (Hint: Use the formula in
 * Programming Exercise 4.2 to compute the distance between two cities. Divide the polygon
 * into two triangles and use the formula in Programming Exercise 2.19 to compute the
 * area of a triangle).
 * 
 * For reference, from Exercises 4.2 and 2.19, distance formula and area of a triangle formula:
 *   
 *   Exercise 4.2
 *   d = raidus X arccos(sin(x1) X sin(x2) + cos(x1) X cos(x2) X cos(y1 - y2))
 *   
 *   Exercise 2.19
 *   s = (side1 + side2 + side3)/2;                     
 *   area = (s(s - side1)(s - side2)(s - side3))^0.5
 * 
 * Commentary: The provided website does not work. I used Google Earth instead and converted
 * the DD'MM'SS to decimal format. I will use the following values for each City, State:
 *      Atlanta, Georgia            33.75, -84.39
 *      Orlando, Florida            28.54, -81.40
 *      Savannah, Georgia           32.08, -81.09
 *      Charlotte, North Carolina   35.23, -80.84
 *      
 * I will make one triangle Atl --> Orl --> Sav. The second triangle will be Atl --> Char -->
 * Sav. I will need to use Math methods such as trig and power functions. I will print the 
 * total area output after computing the area for each triangle. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/25/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 4.3
 */

public class EX03_EstimateAreas {
    
    public static void main(String[] args) {
        
        // declare and initialize constant
        final double RADIUS = 6371.01;
        
        // declare and initialize lat/long's of each city as radians
        double xAtl = Math.toRadians(33.75);
        double yAtl = Math.toRadians(-84.39);
        double xOrl = Math.toRadians(28.54);
        double yOrl = Math.toRadians(-81.40);
        double xSav = Math.toRadians(32.08);
        double ySav = Math.toRadians(-81.09);
        double xChar = Math.toRadians(35.23);
        double yChar = Math.toRadians(-80.84);
        
        // calculate the distance for each location to location
        double dAtlOrl = RADIUS * Math.acos(Math.sin(xAtl) * Math.sin(xOrl) + 
                            Math.cos(xAtl) * Math.cos(xOrl) * Math.cos(yAtl - yOrl));
                            
        double dOrlSav = RADIUS * Math.acos(Math.sin(xOrl) * Math.sin(xSav) + 
                            Math.cos(xOrl) * Math.cos(xSav) * Math.cos(yOrl - ySav));
                            
        double dSavAtl = RADIUS * Math.acos(Math.sin(xSav) * Math.sin(xAtl) + 
                            Math.cos(xSav) * Math.cos(xAtl) * Math.cos(ySav - yAtl));
                            
        double dAtlChar = RADIUS * Math.acos(Math.sin(xAtl) * Math.sin(xChar) + 
                            Math.cos(xAtl) * Math.cos(xChar) * Math.cos(yAtl - yChar));
                            
        double dCharSav = RADIUS * Math.acos(Math.sin(xChar) * Math.sin(xSav) + 
                            Math.cos(xChar) * Math.cos(xSav) * Math.cos(yChar - ySav));
        
        
        // calculate s and area for each triangle.
        // triangle 1 is ATL -> ORL, ORL -> SAV, SAV -> ATL
        // triangle 2 is ATL -> CHAR, CHAR -> SAV, SAV -> ATL
        double sTri1 = (dAtlOrl + dOrlSav + dSavAtl) / 2;
        double area1 = Math.sqrt(sTri1 * (sTri1 - dAtlOrl) * (sTri1 - dOrlSav) * (sTri1 - dSavAtl));
        
        double sTri2 = (dAtlChar + dCharSav + dSavAtl) / 2;
        double area2 = Math.sqrt(sTri2 * (sTri2 - dAtlChar) * (sTri2 - dCharSav) * (sTri2 - dSavAtl));
        
        // calculate and round total area
        double totalArea = Math.round((area1 + area2) * 100.0) / 100.0;

        // print output of the total area
        System.out.println("The total area covered between the four cities is " + totalArea + " km^2");
        
    }
        

    
}
