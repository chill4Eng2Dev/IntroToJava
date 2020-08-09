
/**
 * Write a program that prompts the user to enter the coordinates of five points from the command line. 
 * The first four points form a polygon, and the program displays the polygon and a text that indicates
 * whether the fifth point is inside the polygon. 
 * Hint: Use the Node's contains method to test whether a point is inside a node.
 * 
 * Commentary: I will use a for loop to capture 8 double entries and the last two entries will be the
 * node that is tested.   
 * 
 * Author: chill4Eng2Dev
 * Date: 8/9/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 14.24
 */

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import java.util.Scanner;

public class EX24_InsidePolygon extends Application {
    @Override           // override start method of Application class
    public void start(Stage primaryStage) {
        // create polygon and pane
        Pane pane = new Pane();
        Scanner input = new Scanner(System.in);
        
        Polygon polygon = new Polygon();
        polygon.setStroke(Color.BLACK);
        polygon.setFill(Color.WHITE);
        pane.getChildren().add(polygon);
        ObservableList<Double> list = polygon.getPoints();
        
        // draw the polygon with the user inputs
        System.out.println("Please enter 8 points for the polygon as double: ");
        for(int i = 0; i < 8; i++) {
            list.add(input.nextDouble());
        }
        
        System.out.println("Please enter 2 points to check if point is inside polygon: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        
        // draw the last point as a circle so it's easy to see and add to polygon pane
        Circle circ = new Circle(x, y, 5);
        circ.setFill(Color.BLACK);
        pane.getChildren().add(circ);
        
        Text text = new Text();
        if (polygon.contains(x, y))
            text.setText("      The point is inside the polygon!     ");
        else
            text.setText("      The point is outside the polygon!      ");
        
        
        VBox vbox = new VBox(2);
        vbox.getChildren().addAll(pane, text);
        
        /**
         * Need to come back to this one... I can't use the scanner with my IDE. I think it has
         * to do with utilizing JavaFX. I'm not sure. I might have to come back to this after
         * after Chapter 15 and see if I can utilize something there.
         */
        
        Scene scene = new Scene(pane);                      // set up scene and pane
        primaryStage.setTitle("Point inside Polygon?");     // set title to the stage
        primaryStage.setScene(scene);                       // set scene to the stage
        primaryStage.show();                                // show stage
        
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }

}
