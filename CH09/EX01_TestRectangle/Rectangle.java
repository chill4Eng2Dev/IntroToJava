           // UML Class Diagram                     
/***************************************************
*                   Rectangle                      *  
* -------------------------------------------------*  
* +width: doublewidth: double                      *
* +height: double                                  *
* -------------------------------------------------* 
* +Rectangle()                                     *  
* +Rectangle(width: double, height: double)        *
* +getArea(): double                               *
* +getPerimeter(): double                          *
***************************************************/

public class Rectangle {

    double width;
    double height;
    
    // setup default constructor
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }
    
    // set up constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    // method to return rectangle area
    public double getArea() {
        return width * height;
    }
    
    // method to return rectangle perimeter
    public double getPerimeter() {
        return width * 2 + height * 2;
    }
    
}
