           // UML Class Diagram                     
/***************************************************
*                LinearEquations                   *  
* -------------------------------------------------*  
* -a: double                                       *
* -b: double                                       *
* -c: double                                       *
* -d: double                                       *
* -e: double                                       *
* -f: double                                       *
* -------------------------------------------------* 
* +LinearEquation(a: double, b: double, c: double,*
*                  d: double, e: double, f: double)*
* +getA(): double                                  *
* +getB(): double                                  *
* +getC(): double                                  *
* +getD(): double                                  *
* +getE(): double                                  *
* +getF(): double                                  *
* +isSolvable(): boolean                           *
* +getX(): double                                  *
* +getY(): double                                  *
***************************************************/

public class LinearEquation {
    
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    
    // constructor using user defined coefficients
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
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
    
    // return current d coefficient
    public double getD() {
        return d;
    }
    
    // return current e coefficient
    public double getE() {
        return e;
    }
    
    // return current f coefficient
    public double getF() {
        return f;
    }
    
    // return if equation is solvable 
    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }
    
    // return x value of linear equation
    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }
    
    // return y value of linear equation
    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }

}
