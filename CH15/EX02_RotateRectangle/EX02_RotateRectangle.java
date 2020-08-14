
/**
 * Write a program that rotates a rectangle 15 degrees right when
 * the Rotate button is clicked. 
 * 
 * Commentary: Using fundamentals taught in Listing 14.16, create
 * a rectangle. I will likely use a VBox for the rectangle and button.
 * Use Node Class setters and getters to handle rotation. 
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/13/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 15.2
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class EX02_RotateRectangle extends Application {
    @Override // override the start method of the Application class
    public void start(Stage primaryStage) {
        // create a vbox and set parameters
        VBox vPane = new VBox();
        vPane.setSpacing(20);
        vPane.setAlignment(Pos.CENTER);
        
        // set width, height, and other properties of rectangle
        Rectangle rect = new Rectangle(30, 60); 
        rect.setFill(Color.WHITE);
        rect.setStroke(Color.BLACK);
        
        Button btRotate = new Button("Rotate"); // create rotate button
        
        // create handler to get rotation of rect, then set new rotation + 15 degrees
        btRotate.setOnAction(e -> rect.setRotate(rect.getRotate() + 15));
        
        vPane.getChildren().addAll(rect, btRotate);
        
        // create a scene and place it in the stage
        Scene scene = new Scene(vPane, 150, 200);
        primaryStage.setTitle("RotateRectangle"); // set the stage title
        primaryStage.setScene(scene); // place the scene in the stage
        primaryStage.show(); // display the stage
    }

}
