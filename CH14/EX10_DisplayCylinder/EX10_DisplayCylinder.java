package EX10_DisplayCylinder;


/**
 * Write a program that draws a cylinder. You can use the following method to set the dashed stroke
 * for an arc:
 *              arc.getStrokeDashArray().addAll(6.0, 21.0);
 * 
 * Commentary: I will likely start with an arbitrarily sized ellipse then make all other items
 * a function of the ellipsis by using getXProperty or getYProperty methods. I will also need to
 * add all of these items to a normal Pane as I will need a coordinate system.
 * 
 * Author: chill4Eng2Dev
 * Date: 8/3/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 14.10
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.geometry.Insets;

public class EX10_DisplayCylinder extends Application {
    @Override           // override the start method of the Application class
    public void start(Stage primaryStage) {
        // create a pane and define its properties
        Pane pane = new Pane();
        pane.setPadding(new Insets(20, 20, 20, 20));
        
        // create arbitrarily sized ellipse and assign properties
        Ellipse eTop = new Ellipse(100, 75, 50, 25);
        eTop.setStroke(Color.BLACK);
        eTop.setFill(Color.WHITE);
        pane.getChildren().add(eTop);
        
        // create left line of cylinder and assign coordinates as a function of the ellipse
        Line lLine = new Line(eTop.getCenterX() - eTop.getRadiusX(), eTop.getCenterY(), eTop.getCenterX() - eTop.getRadiusX(), 200);
        lLine.setStroke(Color.BLACK);
        pane.getChildren().add(lLine);
        
        // create right line of cylinder and assign coordinates as a function of the ellipse
        Line rLine = new Line(eTop.getCenterX() + eTop.getRadiusX(), eTop.getCenterY(), eTop.getCenterX() + eTop.getRadiusX(), 200);
        rLine.setStroke(Color.BLACK);
        pane.getChildren().add(rLine);
        
        // create top arc of cylinder and assign coordinates as a function of the ellipse and lines
        Arc tArc = new Arc(eTop.getCenterX(), lLine.getEndY(), eTop.getRadiusX(), eTop.getRadiusY(), 0, 180);
        tArc.setType(ArcType.OPEN);
        tArc.setStroke(Color.BLACK);
        tArc.setFill(Color.WHITE);
        tArc.getStrokeDashArray().addAll(6.0, 21.0);
        pane.getChildren().add(tArc);
        
        // create bottom arc of cylinder and assign coordinates as a function of the ellipse and lines
        Arc bArc = new Arc(eTop.getCenterX(), lLine.getEndY(), eTop.getRadiusX(), eTop.getRadiusY(), 180, 180);
        bArc.setType(ArcType.OPEN);
        bArc.setStroke(Color.BLACK);
        bArc.setFill(Color.WHITE);
        pane.getChildren().add(bArc);
        
        // create a scene and place it in the stage
        Scene scene = new Scene(pane);              
        primaryStage.setTitle("DisplayCylinder");   // set the stage title
        primaryStage.setScene(scene);               // place the scene in the stage 
        primaryStage.show();                        // display the stage
    }

}
