
/**
 * Write a program that plots the sine function in red and cosine in blue.
 * Hint: The unicode for PI is \u03c0. To display -2PI, use Text(x, y, "-2\u03c0").
 * For trigonometric function like sin(x), x is in radians. Use the following loop
 * to add the points to a polyline:
 * 
 *      Polyline polyline = new Polyline();
 *      ObservableList<Double> list = polyline.getPoints();
 *      double scaleFactor = 50;
 *      for (int x = -170; x <= 170; x++) {
 *          list.add(x + 200.0);
 *          list.add(100 - 50 * Mat.sin((x / 100.0) * 2 * Math.PI);
 *      }
 * 
 * Commentary: I will use multiple panes to place the plotted function, axes, and text.  
 * 
 * Author: chill4Eng2Dev
 * Date: 8/9/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 14.19
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class EX19_PlotSineCosine extends Application {

    @Override       // override start method for Application class
    public void start(Stage primaryStage) {
        // create a pane to add the polyline
        Pane polyPane = new Pane();
        polyPane.setPadding(new Insets(48, 25, 10, 50));
        Pane graphPane = new Pane();
        
        // create sin polyline and add the points to the polyPane
        Polyline sinPoly = new Polyline();
        sinPoly.setStroke(Color.RED);
        polyPane.getChildren().add(sinPoly);   // add polyline to pane here
        ObservableList<Double> sinList = sinPoly.getPoints();
        double scaleFactor = 50;
        for (int x = -170; x <= 170; x++) {
            sinList.add(x + 200.0);                                                     // x-component for plotting
            sinList.add(100 - scaleFactor * Math.sin(( x / 100.0) * 2 * Math.PI));      // y-component for plotting
        }
        
        // declare or initialize variables for the PI text within polyPane
        int count = -2;
        double yValue, xValue;
        for (int x = -125; x <= 125; x++) {             // lessen range to populate text as shown in exercise sample
            xValue = x + 200.0;
            yValue = 100 - scaleFactor * Math.sin(( x / 100.0) * 2 * Math.PI);
            if (Math.round(yValue) == 100 & xValue == 200) {        // special case for "0"
                Text text = new Text(xValue, yValue + 10, "0");
                polyPane.getChildren().add(text);
                count++;
            } else if (Math.round(yValue) == 100) {                 // all other instances
                Text text = new Text(xValue, yValue + 10, count + "\u03c0");
                polyPane.getChildren().add(text);
                count++;
            } else {
                continue;                                           // removed special case for PI instead of 1PI, 1PI seems acceptable
            }
        }
        
        // create cos polyline and add the points to the polyPane
        Polyline cosPoly = new Polyline();
        cosPoly.setStroke(Color.BLUE);
        polyPane.getChildren().add(cosPoly);   // add polyline to pane here
        ObservableList<Double> cosList = cosPoly.getPoints();
        for (int x = -170; x <= 170; x++) {
            cosList.add(x + 200.0);                                                     // x-component for plotting
            cosList.add(100 - scaleFactor * Math.cos(( x / 100.0) * 2 * Math.PI));      // y-component for plotting
        }
        
        // create the x and y axis lines, add them to the arrow pane
        Line lineX = new Line(10, 100, 400, 100);
        Line lineY = new Line(lineX.getEndX() / 2, 10, lineX.getEndX() / 2, 200);
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
        
        Scene scene = new Scene(graphPane);                             // create scene and set pane
        primaryStage.setTitle("Graphed Function: cos(x) and sin(x)");   // set the stage name
        primaryStage.setScene(scene);                                   // set the scene to the stage
        primaryStage.show();                                            // show the stage
        
    }

}
