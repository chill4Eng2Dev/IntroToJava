           // UML Class Diagram                     
/***************************************************
*                   Fan                            *  
* -------------------------------------------------*  
* -SLOW: int                                       *
* -MEDIUM: int                                     *
* -FAST: int                                       *
* -speed: int                                      *
* -on: boolean                                     *
* -radius: double                                  *
* -color: String                                   *
* -------------------------------------------------* 
* +Fan()                                           *
* +getSpeed(): int                                 *
* +isOn(): boolean                                 *
* +getRadius(): double                             *
* +getColor(): String                              *
* +setSpeed(speed: int): void                      *
* +setOn(on: boolean): boolean                     *
* +setRadius(radius: double): void                 *
* +setColor(color: String): void                   *
* +toString(): void                                *
***************************************************/

public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    
    // default constructor
    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    
    /** accessor methods */
    // return current speed
    public int getSpeed() {
        return speed;
    }
    
    // return if the fan is on or not
    public boolean isOn() {
        return on;
    }
    
    // return the fans radius
    public double getRadius() {
        return radius;
    }
    
    // return the current color of fan
    public String getColor() {
        return color;
    }
    
    /** mutator methods */
    // method to change the fan speed
    public void setSpeed(int speed) { 
        this.speed = speed;
    }
    
    // method to turn the fan on or off
    public void setOn(boolean on) {
        this.on = on;
    }
    
    // method to set fan radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // method to change color of fan
    public void setColor(String color) {
        this.color = color;
    }
    
    // method to print a small description of the fan
    public String toString() {
        if (isOn())
            return "Speed: " + getSpeed() + "\nColor: " + getColor() + "\nRadius: " + getRadius();
        else
            return "Color: " + getColor() + "\nRadius: " + getRadius() + "\nStatus: Fan is OFF";
    }

}
