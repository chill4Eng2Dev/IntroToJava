           // UML Class Diagram                     
/***************************************************
*                RegularPolygon                    *  
* -------------------------------------------------*  
* -n: int                                          *
* -side: double                                    *
* -x: double                                       *
* -y: double                                       *
* -------------------------------------------------* 
* +RegularPolygon()                                *
* +RegularPolygon(n: int, side: double)            *
* +RegularPolygon(n: int, side: double,            *
*                 x: double, y: double)            *
* +getN(): int                                     *
* +getSide(): double                               *
* +getX(): double                                  *
* +getY(): double                                  *
* +setN(n: int): void                              *
* +setSide(side: double): void                     *
* +setX(x: double): void                           *
* +setY(y: double): void                           *
* +getPerimeter(): double                          *
* *getArea(): double                               *
***************************************************/

public class RegularPolygon {

    private int n;
    private double side;
    private double x;
    private double y;
    
    // default constructor
    public RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }
    
    // constructor that accepts user defined sides and side lengths
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        x = 0;
        y = 0;
    }
    
    // constructor that accepts user defined sides, side lengths, x-, and y-coordinate
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this. y = y;
    }
        
    /** accessor methods */
    // return current side count
    public int getN() {
        return n;
    }
    
    // return current side length
    public double getSide() {
        return side;
    }
    
    // return polygon's x center coordinate
    public double getX() {
        return x;
    }
    
    // return polygon's y center coordinate
    public double getY() {
        return y;
    }
    
    /** mutator methods */
    // method to change the number of sides
    public void setN(int n) {
        this.n = n;
    }
    
    // method to change the side length
    public void setSide(double side) {
        this.side = side;
    }
    
    // method to change x coordinate of polygon
    public void setX(double x) {
        this.x = x;
    }
    
    // method to change y coordinate of polygon
    public void setY(double y) {
        this.y = y;
    }
    
    /** other methods */
    // method to calculate the perimeter of the polygon
    public double getPerimeter() {
        return n * side;
    }
    
    // method to calculate the area of the polygon
    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
    
    
}
