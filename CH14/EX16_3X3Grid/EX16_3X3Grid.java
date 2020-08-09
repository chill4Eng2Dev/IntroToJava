
/**
 * Write a program that displays a 3 x 3 grid. Use red color for vertical lines and blue 
 * for horizontals. The lines are automatically resized when the window is resized.
 * 
 * Commentary: I will use binding and extend sample listing code presented in the chapter.   
 * 
 * Author: chill4Eng2Dev
 * Date: 8/9/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 14.16
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;

public class EX16_3X3Grid extends Application {
    @Override      // override the start method for Application class
    public void start(Stage primaryStage) {
        // create a scene and place it in the stage
        Scene scene = new Scene(new GridLinePane(), 200, 200);
        primaryStage.setTitle("3x3 Grid");      // set the stage name
        primaryStage.setScene(scene);           // set the scene to the stage
        primaryStage.show();                    // show the stage
    }
}
    
class GridLinePane extends Pane {
    public GridLinePane() {
        // vertical red lines
        Line line1 = new Line(0, 0, 0, 0);
        line1.startXProperty().bind(widthProperty().divide(3));
        line1.endXProperty().bind(widthProperty().divide(3));
        line1.endYProperty().bind(heightProperty());
        line1.setStrokeWidth(5);
        line1.setStroke(Color.RED);
        getChildren().add(line1);
        
        // second line is 2/3's of the width of the pane
        Line line2 = new Line(0, 0, 0, 0);
        line2.startXProperty().bind(widthProperty().multiply(2).divide(3));
        line2.endXProperty().bind(widthProperty().multiply(2).divide(3));
        line2.endYProperty().bind(heightProperty());
        line2.setStrokeWidth(5);
        line2.setStroke(Color.RED);
        getChildren().add(line2);
        
        // horizontal blue lines
        Line line3 = new Line(0, 0, 0, 0);
        line3.startYProperty().bind(heightProperty().divide(3));
        line3.endXProperty().bind(widthProperty());
        line3.endYProperty().bind(heightProperty().divide(3));
        line3.setStrokeWidth(5);
        line3.setStroke(Color.BLUE);
        getChildren().add(line3);
        
        // second line is 2/3's of the height of the pane
        Line line4 = new Line(0, 0, 0, 0);
        line4.startYProperty().bind(heightProperty().multiply(2).divide(3));
        line4.endXProperty().bind(widthProperty());
        line4.endYProperty().bind(heightProperty().multiply(2).divide(3));
        line4.setStrokeWidth(5);
        line4.setStroke(Color.BLUE);
        getChildren().add(line4);
    }
        
        

}
