package EX07_Random0or1;


/**
 * Write a program that displays a 10-by-10 square matrix. Each element in the matrix is 0 or 1, randomly generated.
 * Display each number centered in a text field. Use TextField's setText method to set value 0 or 1 as a string.
 * 
 * Commentary: Nested for loop and create TextField with random 0 or 1, added to pane. 10x10 matrix. 
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
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;

public class EX07_Random0or1 extends Application {
    @Override // override the start method in the Application class
    public void start(Stage primaryStage) {
        // create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(5, 5, 5, 5));
        
        // nested for loop to create pane of 0's and 1's
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                int num = (int) (Math.random() * 2);
                String binaryStr = (num > 0) ? "0": "1"; // check number and provide string equivalent
                TextField txtFld = new TextField(binaryStr);
                txtFld.setAlignment(Pos.CENTER); // aligns txtFld to center
                txtFld.setPrefColumnCount(1);
                pane.add(txtFld, j, i); // populated left to right, top to bottom
            }
        }
        
        // create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Random0or1");        // set the stage title
        primaryStage.setScene(scene);               // place the scene in the stage
        primaryStage.show();                        // display the stage
    }
}
