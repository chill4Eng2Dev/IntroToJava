package EX01_DisplayFlags;


/**
 * Write a program that displays four images in a grid pane, as shown in Figure 14.43a
 * 
 * Commentary: Sample graphic looks like a 2x2 matrix with flag of UK/CA/China/US.
 * 
 * Author: chill4Eng2Dev
 * Date: 8/2/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 14.1
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class EX01_DisplayFlags extends Application {
    @Override       // override the start method in the application class
    public void start(Stage primaryStage) {
        // create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setHgap(5);
        pane.setVgap(5);
        
        pane.add(new ImageView(new Image("image/uk.gif")), 0, 0);
        pane.add(new ImageView(new Image("image/ca.gif")), 1, 0);
        pane.add(new ImageView(new Image("image/china.gif")), 0, 1);
        pane.add(new ImageView(new Image("image/us.gif")), 1, 1);
        
        // create a scene and plate it in the stage
        Scene scene = new Scene(pane);
        
        primaryStage.setTitle("DisplayFlags");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
	public static void main(String[] args) {
		Application.launch(args);
	}

}
