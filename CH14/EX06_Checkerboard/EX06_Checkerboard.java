package EX06_Checkerboard;


/**
 * Write a program that displays a checkerboard in which each white and black cell is a rectangle with a fill color black or white.
 * 
 * Commentary: I might be able to do a counter for each for loop to offset the count and combine an if odd, 
 * do white rect, if even do black rect. 8x8 matrix
 * 
 * Author: chill4Eng2Dev
 * Date: 8/3/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 14.6
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.GridPane;


public class EX06_Checkerboard extends Application {
    @Override       // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        
        int count = 1;
        
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                Rectangle rect = new Rectangle(50,50);
                if (count % 2 == 0) {
                    rect.setFill(Color.BLACK);
                    pane.add(rect, j, i);
                } else {
                    rect.setFill(Color.WHITE);
                    pane.add(rect, j, i);
                }
                count++;
            }
            count++;
        }
        
        //create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Checkerboard");      // set the stage title
        primaryStage.setScene(scene);               // place the scene in the stag
        primaryStage.show();                        // display the stage
    }
}
