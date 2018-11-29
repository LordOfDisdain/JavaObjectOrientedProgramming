import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;

public class Ball extends Application {
	@Override
	public void start(Stage stage) {
		Circle circle = new Circle(60, 60, 30); // Creates the pane for the ball object
		// Hold four buttons in an HBox
		Pane page = new Pane();
		page.getChildren().add(circle);
		BorderPane pein = new BorderPane();
		HBox vBox = new HBox();
		Button btLeft = new Button("Left");
		Button btRight = new Button("Right");
		Button btUp = new Button("Up");
		Button btDown = new Button("Down");
		vBox.getChildren().addAll(btDown, btLeft, btRight, btUp);
		pein.setCenter(page);
		pein.setBottom(vBox);
		pein.setAlignment(vBox, Pos.CENTER);		
		
		// Create a scene and pplace it in the stage
		Scene scene = new Scene(pein, 500, 500);
		stage.setTitle("Exercise 15_03");
		stage.setScene(scene);
		stage.show();
		
		// Making animation move with the right keys
		btDown.setOnAction(e -> {
			double y = circle.getCenterY();
			circle.setCenterY(circle.getCenterY() < scene.getHeight() ? circle.getCenterY() + 20 : 0);
		});
		
		btUp.setOnAction(e -> {
			double y = circle.getCenterY();
			circle.setCenterY(circle.getCenterY() > 0 ? circle.getCenterY() - 10 : 0);
		});
		
		btRight.setOnAction(e -> {
			double x = circle.getCenterX();
			circle.setCenterX(circle.getCenterX() < scene.getWidth() ? circle.getCenterX() + 10 : 0);
		});
		
		btLeft.setOnAction(e -> {
			double x = circle.getCenterX();
			circle.setCenterX(circle.getCenterX() > 0 ? circle.getCenterX() - 5 : 0);
		});
				
		
		pein.requestFocus();
	}
	
	public static void main(String[] args){
		Application.launch(args);
	}
}



































