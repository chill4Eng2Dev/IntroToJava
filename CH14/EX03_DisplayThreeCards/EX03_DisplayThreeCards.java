package EX03_DisplayThreeCards;


/**
 * Write a program that displays three cards randomly selected from a deck of 52. The card image files are named 1.png, 2.png, ..., 52.png
 * and stored in the image/card directory. All three cards are distinct and selected randomly. Hint: You can select random cards by storing 
 * the number 1-52 to an array list, perform a random shuffle introduced in section 11.12, and use the first three numbers in the array list
 * as the file names for the image.
 * 
 * Commentary: Sample graphic looks like a 1x3 matrix with (3) cards shown. Will use HBox to organize cards.
 * 
 * Author: chill4Eng2Dev
 * Date: 8/3/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 14.3
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.ArrayList;

public class EX03_DisplayThreeCards extends Application {
    @Override       // override the start method in the application class
    public void start(Stage primaryStage) {
        
        ArrayList<Integer> cardList = new ArrayList<>();
        
        for(int i = 0; i < 52; i++) {
            cardList.add(i + 1);
        }
        
        java.util.Collections.shuffle(cardList);
        
        HBox horBox = new HBox(5);
        horBox.setPadding(new Insets(5, 5, 5, 5));
        
        for(int i = 0; i < 3; i++) {
            horBox.getChildren().add(new ImageView(new Image("image/card/" + cardList.get(i) + ".png")));
        }
        
        // create a scene and place it in the stage
        Scene scene = new Scene(horBox);
        primaryStage.setTitle("DisplayThreeCards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
