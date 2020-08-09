package EX26_DisplayTwoClocks;

/**
 * Write a program that displays two clocks. The hour, minute, and second values are 4, 20, 45
 * for the first clock and 22, 46, 15 for the second clock. Use the "ClockPane" class from
 * the sample listing of the chapter.
 * 
 * Commentary: I will need to do a HBox. Create two instances of the clocks and supply
 * the problem provided times. 
 * 
 * Author: chill4Eng2Dev
 * Date: 8/4/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 14.26
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.geometry.Insets;

public class EX26_DisplayTwoClocks extends Application {
    @Override       // override start method of Application class
    public void start(Stage primaryStage) {
        // create pane and assign its properties
        HBox pane = new HBox(15);
        pane.setPadding(new Insets(15, 15, 15, 15));
        
        // define and set two clocks
        ClockPane clock1 = new ClockPane(4, 20, 45);
        ClockPane clock2 = new ClockPane(22, 46, 15);
        
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(clock1, clock2);
        
        // create scene and set to the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("DisplayTwoClocks");  // set the stage title
        primaryStage.setScene(scene);               // place the scene in the stage
        primaryStage.show();                        // display the stage
        
        
        
        
    }

}
