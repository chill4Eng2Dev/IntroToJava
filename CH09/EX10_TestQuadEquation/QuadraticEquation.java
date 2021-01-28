           // UML Class Diagram                     
/***************************************************
*                QuadraticEquations                *  
* -------------------------------------------------*  
* -a: double                                       *
* -b: double                                       *
* -c: double                                       *
* -------------------------------------------------* 
* +QuadraticEquations(a: double, b: double,        *
*                     c: double)                   *
* +getA(): double                                  *
* +getB(): double                                  *
* +getC(): double                                  *
* +getDiscriminant(): double                       *
* +getRoot1(): double                              *
* +getRoot2(): double                              *
***************************************************/

public class QuadraticEquation {
    
    private double a;
    private double b;
    private double c;
    
    // constructor that assigns user defined coefficients
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    /** accessor methods */
    // return current a coefficient
    public double getA() {
        return a;
    }
    
    // return current b coefficient
    public double getB() {
        return b;
    }
    
    // return current c coefficient
    public double getC() {
        return c;
    }
    
    // return discriminant calculation b^2 - 4*a*c
    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }
    
    // return x root 1: -b + (discriminant)^0.5 / (2 * a)
    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }
    
    // return x root 2: -b - (discriminant)^0.5 / (2 * a)
    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

}
