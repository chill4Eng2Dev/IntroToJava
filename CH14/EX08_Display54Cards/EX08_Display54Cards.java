package EX08_Display54Cards;


/**
 * Expand DisplayThreeCards exercise to display all 54 cards (including two jokers), nine per row.
 * Image files for jokers are named 53.jpg and 54.jpg. 
 * 
 * Commentary: Sample graphic looks like a 9x6 matrix with (54) cards shown. Will use GridPane to organize cards.
 * 
 * Author: chill4Eng2Dev
 * Date: 8/3/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 14.3
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.ArrayList;

public class EX08_Display54Cards extends Application {

    @Override       // override the start method in the application class
    public void start(Stage primaryStage) {
        
        // start and populate integer arraylist
        ArrayList<Integer> cardList = new ArrayList<>();
        for(int i = 0; i < 54; i++) {
            cardList.add(i + 1);
        }
        
        // will continue to shuffle them
        java.util.Collections.shuffle(cardList);
        
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(5, 5, 5, 5));
        
        int count = 0;
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 9; j++) {
                pane.add(new ImageView(new Image("image/card/" + cardList.get(count) + ".png")),j, i);
                count++;
            }
        }
        
        // create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("DisplayThreeCards");     // set stage title
        primaryStage.setScene(scene);                   // set scene into stage
        primaryStage.show();                            // show stage
    }
}


