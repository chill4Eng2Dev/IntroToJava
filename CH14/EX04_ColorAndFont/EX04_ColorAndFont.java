package EX04_ColorAndFont;

/**
 * Write a program that displays five texts vertically. Set a random color and opacity for each text and set the font of each text
 * to Times Roman, bold, italic, and 22 pixels.
 * 
 * Commentary: Sample graphic looks like a 1x5 matrix with (5) "Java" texts.
 * 
 * Author: chill4Eng2Dev
 * Date: 8/3/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 14.4
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;


public class EX04_ColorAndFont extends Application {
    @Override       // override the start method in the Application class
    public void start(Stage primaryStage) {
        HBox pane = new HBox(10);
        pane.setPadding(new Insets(20, 10, 20, 10));
        
        for(int i = 0; i < 5; i++) {
            Text aText = new Text("Java");
            aText.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            aText.setFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));
            aText.setRotate(90);
            pane.getChildren().add(aText);
        }
        
        // create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ColorAndFont");  // set the stage title
        primaryStage.setScene(scene);           // place the scene in the stage
        primaryStage.show();                    // display the stage
    }
}
