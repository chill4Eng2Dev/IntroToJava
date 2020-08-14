package EX01_PickFourCards;


/**
 * Write a program that lets the user click the "Refresh" button to display four
 * cards from a deck of 52 cards. (See the hint in Programming Exercise 14.3 on
 * how to obtain four random cards.)
 * 
 * Commentary: Mimic exercise 14.3 to display (4) cards instead of (3). Set the handler
 * to reshuffle and display the cards. Use HBox and VBox to organize the scene layout.
 * 
 * Author: chill4Eng2Dev 
 * Date: 8/13/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 15.1
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.ArrayList;

public class EX01_PickFourCards extends Application {
    @Override   // override the start method in the Application class
    public void start(Stage primaryStage) {
        
        // create HBox layout for cards
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        
        // create VBox layout for cards and button
        VBox vBox = new VBox();
        vBox.setSpacing(5);
        vBox.setAlignment(Pos.CENTER);
        
        // call the generateCards method to generate the first 4 cards when program is ran
        generateCards(hBox);
        
        // create a refresh button
        Button btRefresh = new Button("Refresh");
        
        // create a event handler and handle the generateCards method to refresh cards
        btRefresh.setOnAction(e -> generateCards(hBox));
        
        // add hbox and button to vbox
        vBox.getChildren().addAll(hBox, btRefresh);
        
        
        // crease a scene and place it in the stage
        Scene scene = new Scene(vBox, 400, 200);
        primaryStage.setTitle("PickFourCards"); // set title
        primaryStage.setScene(scene); // place the scene in the stage
        primaryStage.show(); // display the stage
    }
    
    /** method to generate cards */
    public void generateCards(HBox pane) {
        /** had to add a clear method so that the cards 
         * would continue to stack when refreshed */
        pane.getChildren().clear(); 
        
        ArrayList<Integer> cardList = new ArrayList<>(); // create cardList array
        
        // generate numbers within list
        for(int i = 0; i < 52; i++) {
            cardList.add(i + 1);
        }
        
        java.util.Collections.shuffle(cardList); // shuffle numbers
        
        // use loop to print numbers into the directory value to locate the image to use
        for(int i = 0; i < 4; i++) {
            pane.getChildren().add(new ImageView(new Image("image/card/" + cardList.get(i) + ".png")));
        }
    }
}


