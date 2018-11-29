import javafx.animation.Timeline;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import javafx.scene.shape.Circle;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class KeyMovement extends Application {
		@Override
		public void start(Stage stage) {
			Circle circle = new Circle(60, 60, 30); // Creates the pane for the ball object
			// Hold four buttons in an HBox
			Pane page = new Pane();
			page.getChildren().add(circle);
			BorderPane pein = new BorderPane();
			pein.setCenter(page);		
			
			// Create a scene and pplace it in the stage
			Scene scene = new Scene(pein, 500, 500);
			stage.setTitle("Exercise 15_03");
			stage.setScene(scene);
			stage.show();
			
			// Making animation move with the right keys
			pein.setOnKeyPressed(e -> {
				if (e.getCode() == KeyCode.DOWN) {
					double y = circle.getCenterY();
					circle.setCenterY(circle.getCenterY() < scene.getHeight() ? circle.getCenterY() + 20 : 0);
				} 
				
				else if (e.getCode() == KeyCode.UP) {
					double y = circle.getCenterY();
					circle.setCenterY(circle.getCenterY() > 0 ? circle.getCenterY() - 10 : 0);
				} 
				
				else if (e.getCode() == KeyCode.RIGHT) {
					double x = circle.getCenterX();
					circle.setCenterX(circle.getCenterX() < scene.getWidth() ? circle.getCenterX() + 10 : 0);
				}
				else if (e.getCode() == KeyCode.LEFT) {
					double x = circle.getCenterX();
					circle.setCenterX(circle.getCenterX() > 0 ? circle.getCenterX() - 5 : 0);
				}
			});
			
			pein.requestFocus();
		}
		
		public static void main(String[] args){
			Application.launch(args);
		}
}






















































