package EX09_FourFans;


/**
 * Write a program that places four fans in a GridPane with two rows and two columns.
 * 
 * Commentary: Sample graphic looks like a 2x2 matrix with a circle and (4) solid arcs. 
 * I will have to use a StackPane with a GridPane, a nested for loop, and possibly a get method
 * or two to get the circle and arcs. I will model the arcs after the sample arc Listing.
 * 
 * Author: chill4Eng2Dev
 * Date: 8/3/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 14.9
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;

public class EX09_FourFans extends Application {
    @Override   // override the start method in the Application class
    public void start(Stage primaryStage) {
    
        // create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setHgap(10);
        pane.setVgap(10);
        
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                StackPane sPane = new StackPane();      // create StackPane
                sPane.getChildren().add(getCircle());   // put circle inside stack pane
                stackArcs(sPane);                       // use stackArcs to put arcs into sPane
                pane.add(sPane, j, i);                  // populate GridPane left to right, top to bottom with stackPane
            }
        }
            
        // create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("FourFans");          // set the stage title
        primaryStage.setScene(scene);               // place the scene in the stage
        primaryStage.show();                        // display the stage
        
    }
    
    private Circle getCircle() {
        Circle cir = new Circle();          // create a circle
        cir.setRadius(100);                 // arbitrary circle radius
        cir.setStroke(Color.BLACK);         // set outline color
        cir.setFill(Color.WHITE);           // set fill color
        return cir;                         // return cir
    }
    
    private void stackArcs(StackPane stackPane) {
        double rotateAngle = 90;
        for(int i = 0; i < 4; i++) {
            Pane pane = new Pane();                                             // create a pane that recognizes coordinates
            Arc arc = new Arc (100, 100, 80, 80, 30 + i * rotateAngle, 35);     // create an arc
            arc.setFill(Color.RED);                                             // set fill color
            arc.setType(ArcType.ROUND);                                         // set arc type
            arc.setStroke(Color.BLACK);                                         // set outline "stoke" color
            pane.getChildren().add(arc);                                        // add arc to the pane that recognizes coordinates
            stackPane.getChildren().add(pane);                                  // add the pane that recognizes coordinates to the stackPane
        }
    }
    
}
