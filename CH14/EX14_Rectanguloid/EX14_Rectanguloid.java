package EX14_Rectanguloid;



/**
 * Write a program that displays a rectanguloid. The cube should grow and shrink as the window grows or shrinks.
 * 
 * Commentary: I will use a pane and define a rectangles size to the pane using binding. 
 * 
 * Author: chill4Eng2Dev
 * Date: 8/3/2020
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 14.14
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Insets;

public class EX14_Rectanguloid extends Application {
    @Override           // override the start method in the Application class
    public void start(Stage primaryStage) {
        // define a final variable
        final double SIDE = 200.0;
        
        // create pane and set properties
        Pane pane = new Pane();
        pane.setPadding(new Insets(20));
        
        // first rectangle closest to X axis
        Rectangle rect1 = new Rectangle(SIDE / 5, 0, SIDE, SIDE);
        rect1.widthProperty().bind(pane.widthProperty().subtract(SIDE / 5));
        rect1.heightProperty().bind(pane.heightProperty().subtract(SIDE / 2));
        rect1.setStroke(Color.BLACK);
        rect1.setFill(Color.TRANSPARENT);
        pane.getChildren().add(rect1);
        
        // second rectangle closest to Y axis
        Rectangle rect2 = new Rectangle(0, SIDE / 3, SIDE, SIDE);
        rect2.widthProperty().bind(pane.widthProperty().subtract(SIDE / 5));
        rect2.heightProperty().bind(pane.heightProperty().subtract(SIDE / 2));
        rect2.setStroke(Color.BLACK);
        rect2.setFill(Color.TRANSPARENT);
        pane.getChildren().add(rect2);
        
        // line 1 to connect top left corners of rectangles
        Line line1 = new Line(rect2.getX(), rect2.getY(), rect1.getX(), rect1.getY());
        line1.setStroke(Color.BLACK);
        pane.getChildren().add(line1);
        
        // line 2 to connect bottom left corners of rectangles
        Line line2 = new Line();
        line2.setStartX(rect2.getX());
        line2.setEndX(rect1.getX());
        line2.startYProperty().bind(rect2.yProperty().add(rect2.heightProperty()));
        line2.endYProperty().bind(rect1.yProperty().add(rect1.heightProperty()));
        line2.setStroke(Color.BLACK);
        pane.getChildren().add(line2);
        
        // line 3 to connect top right corners of rectangles
        Line line3 = new Line();
        line3.setStartY(rect2.getY());
        line3.setEndY(rect1.getY());
        line3.startXProperty().bind(rect2.xProperty().add(rect2.widthProperty()));
        line3.endXProperty().bind(rect1.xProperty().add(rect1.widthProperty()));
        line3.setStroke(Color.BLACK);
        pane.getChildren().add(line3);
        
        // line 4 to connect bottom right corners of rectangles
        Line line4 = new Line();
        line4.startXProperty().bind(rect2.xProperty().add(rect2.widthProperty()));
        line4.startYProperty().bind(rect2.yProperty().add(rect2.heightProperty()));
        line4.endXProperty().bind(rect1.xProperty().add(rect1.widthProperty()));
        line4.endYProperty().bind(rect1.yProperty().add(rect1.heightProperty()));
        line4.setStroke(Color.BLACK);
        pane.getChildren().add(line4);
        
        // need a stackpane to position and margin the rectangle
        StackPane centerPane = new StackPane();
        centerPane.setAlignment(Pos.CENTER);
        centerPane.setPadding(new Insets(30,30,30,30));
        centerPane.getChildren().add(pane);
        
        // create a scene and place it in the stage
        Scene scene = new Scene(centerPane, SIDE * 3, SIDE * 2);
        primaryStage.setTitle("Rectanguloid");      // set the stage title
        primaryStage.setScene(scene);               // place the scene in the stage
        primaryStage.show();                        // displace the stage
        
    }
}

