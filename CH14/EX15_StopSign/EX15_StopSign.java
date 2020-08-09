
/**
 * Write a program that displays a STOP sign. The octagon is in red and the sign is in white. 
 * (Hint: Place an octagon and a text in a stack pane.)
 * 
 * Commentary: I will use a StackPane to place the text on top of the red octagon.  
 * 
 * Author: chill4Eng2Dev
 * Date: 8/9/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 14.15
 */

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;

public class EX15_StopSign extends Application {
    @Override       // override the start method in the Application class
    public void start(Stage primaryStage) {
        // create a stackpane so that the polygon and the text are centered 

        StackPane pane = new StackPane();
        
        // create polygon, set properties, rotate polygon 45/2 = 22.5 to match stop sign orientation
        Polygon polygon = new Polygon();
        pane.getChildren().add(polygon);
        polygon.setFill(Color.RED);
        polygon.setRotate(22.5);
        ObservableList<Double> list = polygon.getPoints();
        
        // set relative heights of width, height, and raidus of the polygon
        final double WIDTH = 200, HEIGHT = 200;
        double centerX = WIDTH / 2, centerY = HEIGHT / 2;
        double radius = Math.min(WIDTH, HEIGHT) * 0.4;
        
        // add points to the polygon list
        for (int i = 0; i < 8; i++) {
            list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
            list.add(centerY + radius * Math.sin(2 * i * Math.PI / 8));
        }
        
        // create text last and place on top of the polygon within the StackPane
        Text stopText = new Text("STOP");
        stopText.setFont(Font.font("Times New Roman", HEIGHT / 5));
        stopText.setFill(Color.WHITE);
        pane.getChildren().add(stopText);
        
        // set pane to scene
        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setTitle("ShowPolygon");       // set the stage title
        primaryStage.setScene(scene);               // place the scene in the stage
        primaryStage.show();                        // display the stage
        
    }

}

