package EX21_TwoCircDistance;



/**
 * Write a program that draws two filled circles with radius 15 pixels, cemtered at ramdom
 * locations, with a line connectin the two circles. This distance between the two centers
 * is displayed on the line. 
 * 
 * Commentary: I will use Math.random() but likely control the amount of variability that 
 * the random values can be. I will then tie the line end points to the centers of the circle.
 *  
 * 
 * Author: chill4Eng2Dev
 * Date: 8/4/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 14.21
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

public class EX21_TwoCircDistance extends Application {
    @Override           // override start method of Application class
    public void start(Stage primaryStage) {
        // create a pane and assign properties
        Pane pane = new Pane();
        
        // create circle 1 and circle 2 and assign their properties 
        Circle c1 = new Circle(50 + Math.random() * 201, 50 + Math.random() * 201, 15);
        c1.setFill(Color.RED);
        c1.setStroke(Color.BLACK);
        
        Circle c2 = new Circle(50 + Math.random() * 201, 50 + Math.random() * 201, 15);
        c2.setFill(Color.RED);
        c2.setStroke(Color.BLACK);
        
        // add line and have it adjust to the circle centers
        Line line1 = new Line(c1.getCenterX(), c1.getCenterY(), c2.getCenterX(), c2.getCenterY());
        
        // distance calculation
        double distance = Math.sqrt(Math.pow(line1.getEndY() - line1.getStartY(), 2) + Math.pow(line1.getEndX() - line1.getStartY(),2));
        
        // have the distance populate at the middle of the line length
        double xLoc = (line1.getEndX() + line1.getStartX()) / 2;
        double yLoc = (line1.getEndY() + line1.getStartY()) / 2;
        
        // have text for line and circle centers. the circle center text is not required but I wanted to confirm distance calc
        Text text1 = new Text(xLoc, yLoc, distance + "");
        Text text2 = new Text(c1.getCenterX(), c1.getCenterY(), c1.getCenterX() + ", " + c1.getCenterY());
        Text text3 = new Text(c2.getCenterX(), c2.getCenterY(), c2.getCenterX() + ", " + c2.getCenterY());
        
        // add everything to pane
        pane.getChildren().addAll(c1, c2, line1, text1, text2, text3);
        
        // create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("TwoCircDistance");      // set the stage title
        primaryStage.setScene(scene);               // place the scene in the stage
        primaryStage.show();                        // displace the stage

    }

}
