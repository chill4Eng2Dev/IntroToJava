/**
 * (The Fan class) Design a class named Fan to represent a fan. The class contains:
 * 
 * ■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
 * denote the fan speed.
 * ■ A private int data field named speed that specifies the speed of the fan (the
 * default is SLOW).
 * ■ A private boolean data field named on that specifies whether the fan is on (the
 * default is false).
 * ■ A private double data field named radius that specifies the radius of the fan
 * (the default is 5).
 * ■ A string data field named color that specifies the color of the fan (the default
 * is blue).
 * ■ The accessor and mutator methods for all four data fields.
 * ■ A no-arg constructor that creates a default fan.
 * ■ A method named toString() that returns a string description for the fan. If
 * the fan is on, the method returns the fan speed, color, and radius in one combined
 * string. If the fan is not on, the method returns the fan color and radius
 * along with the string “fan is off” in one combined string.
 * 
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that creates two Fan objects. Assign maximum speed, radius 10, color
 * yellow, and turn it on to the first object. Assign medium speed, radius 5, color
 * blue, and turn it off to the second object. Display the objects by invoking their
 * toString method.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/27/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 9.8
 */

public class EX08_TestFan {
    
    public static void main(String[] args) {
        
        // create two fan objects
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        
        // set fan properties for first fan and print output as described in problem statement
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println("\n----Fan 1----\n" + fan1.toString());
        
        // set fan properties for second fan and print output as described in problem statement
        fan2.setSpeed(Fan.MEDIUM);
        System.out.println("\n----Fan 2----\n" + fan2.toString());
    }

}
