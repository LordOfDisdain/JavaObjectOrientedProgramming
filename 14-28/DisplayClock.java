/* Zakariyya McCullin
	Programming Exercise 14-28
*/

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


public class DisplayClock extends Application {
	@Override
	public void start(Stage stage) {
		// Create a clock and a label
		ClockPane watch = new ClockPane();
		String timeString = watch.getHour() + ":" + watch.getMinute()
		+ ":" + watch.getSecond();
		Label lblCurrentTime = new Label(timeString);
		
		// Placing the clock and the label in the border pane
		BorderPane pane = new BorderPane();
		pane.setCenter(watch);
		pane.setBottom(lblCurrentTime);
		BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
		
		// Create a scene and place it in the stage
		Scene see = new Scene(pane, 250, 250);
		stage.setTitle("Exercise14-28");
		stage.setScene(see);
		stage.show();
	}
	
	public static void main(String[] args){
		Application.launch(args);
	}
	
}














