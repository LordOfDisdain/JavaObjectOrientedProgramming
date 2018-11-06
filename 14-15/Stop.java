/*Zakariyya McCullin Excerise 14-15
*/
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import java.awt.*;
import javafx.scene.control.Button;
import javax.swing.text.html.*;
import javafx.scene.layout.GridPane;
//import javax.swing.text.*;
import javafx.geometry.Pos;
import java.util.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Label;


public class Stop extends Application{
	@Override
	public void start(Stage stage) {
		//Creating a pane and the Octagon
		StackPane page = new StackPane();
		Polygon octagon = new Polygon();
		page.getChildren().add(octagon);
		octagon.setFill(Color.RED);
		octagon.setStroke(Color.WHITE);
		ObservableList<Double> list = octagon.getPoints();
		// Creating the stop sign
		Label label = new Label("STOP");
		label.setFont(Font.font("Times New Roman", 40));
		label.setTextFill(Color.WHITE);
		
		/*TODO find something in there that will place the stop word
		  Inside of the octagon and have the color set to white
		  while also making sure that the font size is larger.
		*/ 
		 
		page.getChildren().add(label);
		// Making the scene for the Octagon
		
		final double WIDTH = 200, HEIGHT = 200;
		double centerX = WIDTH / 4, centerY = HEIGHT / 4;
		double radius = Math.min(WIDTH, HEIGHT) * 0.4;
		
		// Adding the points for the octagon
		for (int i = 0; i < 8; i++) {
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
		}
		
		// Rotation for the Octagon to appear normal
		octagon.setRotate(23);
		
		Scene pictures = new Scene(page, HEIGHT, WIDTH);
		stage.setTitle("Exercise 14_15");
		stage.setScene(pictures);
		// Making everything else
		stage.show();
		
		
	}
}


























