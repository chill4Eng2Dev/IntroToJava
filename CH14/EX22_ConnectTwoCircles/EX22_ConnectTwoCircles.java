package EX22_ConnectTwoCircles;


/**
 * Write a program that draws two circles with radius 15 pixels, centered at random locations, 
 * with a line connection the two circles.The line should not cross inside the circles.
 * 
 * Commentary: I will use Math.random() but likely control the amount of variability that 
 * the random values can be. I will then tie the line end points to the centers of the circle.
 * Add line to pane first, then place circles over, to remove view of line inside circle.
 *  
 * 
 * Author: chill4Eng2Dev
 * Date: 8/4/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 14.22
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.geometry.Insets;

public class EX22_ConnectTwoCircles extends Application {
@Override           // override start method of Application class
    public void start(Stage primaryStage) {
        // create a pane and assign properties
        Pane pane = new Pane();
        
        // create circle 1 and circle 2 and assign their properties 
        Circle c1 = new Circle(50 + Math.random() * 201, 50 + Math.random() * 201, 15);
        c1.setFill(Color.WHITE);
        c1.setStroke(Color.BLACK);
        
        Circle c2 = new Circle(50 + Math.random() * 201, 50 + Math.random() * 201, 15);
        c2.setFill(Color.WHITE);
        c2.setStroke(Color.BLACK);
        
        // add line and have it adjust to the circle centers
        Line line1 = new Line(c1.getCenterX(), c1.getCenterY(), c2.getCenterX(), c2.getCenterY());
      
        // tie the text call outs to their respective circles center coordinates
        Text text1 = new Text(c1.getCenterX(), c1.getCenterY(), "1");
        Text text2 = new Text(c2.getCenterX(), c2.getCenterY(), "2");
        
        // add everything to pane
        pane.getChildren().addAll(line1, c1, c2, text1, text2);
        
        // create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("TwoCircDistance");      // set the stage title
        primaryStage.setScene(scene);               // place the scene in the stage
        primaryStage.show();                        // displace the stage
    }
}
