package EX02_TicTacToeBoard;


/**
 * Write a program that displays a tic-tac-te board. A cell may be X, O, or empty.
 * What to display at each cell is randomly decided. The X and O are images in the
 * files x.gif and o.gif.
 * 
 * Sample graphic given in book looks like a 3x3 matrix with randomly displayed X/O/Blank.
 * 
 * Author: chill4Eng2Dev
 * Date: 8/3/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 14.2
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EX02_TicTacToeBoard extends Application {
    @Override          // override the start method in the application class
    public void start(Stage primaryStage) {
        
        // set up gridpane offsets
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10, 30, 10, 30));
        pane.setHgap(5);
        pane.setVgap(5);
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                int rNum = (int)(Math.random() * 3);
                
                // load images in gridpane left to right, top to bottom
                if(rNum == 0)
                    pane.add(new ImageView(new Image("image/x.gif")), j, i);
                else if (rNum == 1) 
                    pane.add(new ImageView(new Image("image/o.gif")), j, i);
                else 
                    continue;
                
            }  
        }
    
        // create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("TicTacToeBoard");    // set the stage title
        primaryStage.setScene(scene);               // place the scene in the stage
        primaryStage.show();                        // display the stage

        
    }
}
