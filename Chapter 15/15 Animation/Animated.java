import javafx.application.Application;
import javafx.animation.FadeTransition;
import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.collections.ObservableList;

public class Animated extends Application{
	@Override
	public void start(Stage stage){
		// Creating the pane
		Pane pein = new Pane();
		
		// Creating the rectangles
		Polygon pentagon = new Polygon();
		pentagon.setFill(Color.BLACK);
		Rectangle movingRectangle = new Rectangle(50, 50);
		movingRectangle.setFill(Color.BLUE);
		movingRectangle.setStroke(Color.GRAY);
		ObservableList<Double> list = pentagon.getPoints();
		
		// Math for the pentagon
		final double WIDTH = 500, HEIGHT = 500;
		double centerX = WIDTH / 2.5, centerY = HEIGHT / 2.5;
		double radius = Math.min(WIDTH, HEIGHT) * 0.25;
		// For statement to create the pentagon
		for (int i = 0; i < 5; i++) {
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 5));
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 5));
		}
		
		// Rotation for the Octagon to appear normal
		pentagon.setRotate(36);
		
		// Adding the rectangles to the pane
		pein.getChildren().addAll(pentagon, movingRectangle);
		
		// Making the moving rectange fade in color
		FadeTransition faded = new FadeTransition(Duration.millis(3000), movingRectangle);
		faded.setFromValue(1.0);
		faded.setToValue(0.1);
		faded.setCycleCount(Timeline.INDEFINITE);
		faded.setAutoReverse(true);
		faded.play(); // Begins the animation
		
		// Using the mouse to move things 
		PathTransition path = new PathTransition();
		path.setDuration(Duration.millis(2000));
		path.setPath(pentagon);
		path.setNode(movingRectangle);
		path.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		path.setCycleCount(Timeline.INDEFINITE);
		path.setAutoReverse(true);
		path.play(); // Begins the animation
		
		// Controls the animation
		movingRectangle.setOnMousePressed(e -> path.pause());
		movingRectangle.setOnMouseReleased(e -> path.play());
		
		// Making the scene and placing everything in the pane
		Scene page = new Scene(pein, 500, 500);
		stage.setTitle("Moving out of the rectangle");
		stage.setScene(page);
		stage.show();
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}