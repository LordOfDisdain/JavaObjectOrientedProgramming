import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.ButtonBase;
import javafx.scene.paint.Color;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;
import javafx.scene.control.ToggleGroup;
import javafx.geometry.Pos;


public class Statement extends Application{
	@Override
	public void start(Stage stage){
		// Creating the objects for the scene
		BorderPane pein = new BorderPane();
		HBox radioButtons = new HBox();
		HBox directionButtons = new HBox();
		RadioButton rbRed = new RadioButton("Red");
		RadioButton rbYellow = new RadioButton("Yellow");
		RadioButton rbBlack = new RadioButton("Black");
		RadioButton rbOrange = new RadioButton("Orange");
		RadioButton rbGreen = new RadioButton("Green");
		Text statement = new Text(50, 50, "Programming is fun");
		Button btLeft = new Button("<=");
		Button btRight = new Button("=>");
		pein.getChildren().addAll(statement);
		radioButtons.getChildren().addAll(rbBlack, rbGreen, rbOrange, rbRed, rbYellow);
		pein.setTop(radioButtons);
		directionButtons.getChildren().addAll(btLeft, btRight);
		directionButtons.setAlignment(Pos.CENTER);
		pein.setBottom(directionButtons);
		
		ToggleGroup team = new ToggleGroup();
		rbBlack.setToggleGroup(team);
		rbRed.setToggleGroup(team);
		rbYellow.setToggleGroup(team);
		rbGreen.setToggleGroup(team);
		rbOrange.setToggleGroup(team);
		
		// Code to turn the word a different color by selecting the right keys
		btLeft.setOnAction(e -> statement.setX(statement.getX() - 10));
		btRight.setOnAction(e -> statement.setX(statement.getX() + 10));
		
		rbBlack.setOnMouseClicked(e -> {
			if (rbBlack.isSelected()) {
				statement.setFill(Color.BLACK);
			}
		});
		
		rbGreen.setOnMouseClicked(e -> {
			if (rbGreen.isSelected()) {
				statement.setFill(Color.GREEN);
			}
		});
		
		rbRed.setOnMouseClicked(e -> {
			if (rbRed.isSelected()) {
				statement.setFill(Color.RED);
			}
		});
		
		rbYellow.setOnMouseClicked(e -> {
			if (rbYellow.isSelected()) {
				statement.setFill(Color.YELLOW);
			}
		});
		
		rbOrange.setOnMouseClicked(e -> {
			if (rbOrange.isSelected()) {
				statement.setFill(Color.ORANGE);
			}
		});
		
		Scene scene = new Scene(pein, 500, 500);
		stage.setTitle("Exercise16_01");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		Application.launch();
	}
}

















