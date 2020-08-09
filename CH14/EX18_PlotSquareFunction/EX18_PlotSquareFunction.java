
/**
 * Write a program that draws a diagram for the function f(x) = x^2.
 * Hint: Add points to a polyline using the following code:
 * 
 *      Polyline polyline = new Polyline();
 *      ObservableList<Double> list = polyline.getPoints();
 *      double scaleFactor = 0.0125;
 *      for (int x = -100; x <= 100; x++) {
 *          list.add(x + 200.0);
 *          list.add(scaleFactor * x * x);
 *      }
 * 
 * Commentary: I will use multiple panes to place the plotted function, axes, and text.  
 * 
 * Author: chill4Eng2Dev
 * Date: 8/9/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 14.18
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;


public class EX18_PlotSquareFunction extends Application {
    @Override       // override start method for Application class
    public void start(Stage primaryStage) {
        // create a pane to add the polyline
        Pane polyPane = new Pane();
        polyPane.setRotate(180);
        polyPane.setPadding(new Insets(48, 25, 25, 50));
        Pane graphPane = new Pane();
        
        // create polyline and add the points to the polyline
        Polyline polyline = new Polyline();
        polyPane.getChildren().add(polyline);   // add polyline to pane here
        ObservableList<Double> list = polyline.getPoints();
        double scaleFactor = 0.0125;
        for (int x = -100; x <= 100; x++) {
            list.add(x + 200.0);                // x-component for plotting
            list.add(scaleFactor * x * x);      // y-component for plotting
        }
        
        // create the x and y axis lines, add them to the arrow pane
        Line lineX = new Line(10, 200, 353, 200);
        Line lineY = new Line(lineX.getEndX() / 2, 10, lineX.getEndX() / 2, 250);
        graphPane.getChildren().addAll(polyPane, lineX, lineY);
        
        // adding points in a clockwise fashion, add a polyline that draws an arrow for the x axis line
        Polyline polylineXArrow = new Polyline();
        graphPane.getChildren().add(polylineXArrow);
        ObservableList<Double> listXArrow = polylineXArrow.getPoints();
        listXArrow.addAll(lineX.getEndX() - 25, lineX.getEndY() - 10, lineX.getEndX(), lineX.getEndY(), lineX.getEndX() - 25, lineX.getEndY() + 10);
        
        // adding points in a clockwise fashion, add a polyline that draws an arrow for the y axis line; adjust offset values due to scale
        Polyline polylineYArrow = new Polyline();
        graphPane.getChildren().add(polylineYArrow);
        ObservableList<Double> listYArrow = polylineYArrow.getPoints();
        listYArrow.addAll(lineY.getStartX() - 10, lineY.getStartY() + 25, lineY.getStartX(), lineY.getStartY(), lineY.getStartX() + 10, lineY.getStartY() + 25);
        
        // add the "X" and "Y" labels to the axes
        Text textX = new Text(lineX.getEndX() - 5, lineX.getEndY() - 20, "X");
        Text textY = new Text(lineY.getStartX() + 20, lineY.getStartY() + 5, "Y");
        graphPane.getChildren().addAll(textX, textY);
        
        Scene scene = new Scene(graphPane);                         // create scene and set pane
        primaryStage.setTitle("Graphed Function: f(x) = x^2");      // set the stage name
        primaryStage.setScene(scene);                               // set the scene to the stage
        primaryStage.show();                                        // show the stage
        
    }

}
