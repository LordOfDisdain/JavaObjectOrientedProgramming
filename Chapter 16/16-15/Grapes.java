import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.scene.layout.Pane;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.ContentDisplay;
import javafx.scene.layout.HBox;


public class Grapes extends Application{
	@Override
	public void start(Stage stage){
		// Creating the pane
		BorderPane pein = new BorderPane();
		ImageView fruit = new ImageView(new Image("Grapes.gif"));
		Label label = new Label("Grapes", fruit);
		Label graphicText = new Label("graphicTextGap");
		Label content = new Label("contentDisplay:");
		
		//Text Field for the inputs
		TextField graphicTextGap = new TextField();
		pein.setCenter(label);
		ComboBox<String> optionTitles = new ComboBox<>();
		optionTitles.getItems().addAll("TOP", "DOWN", "RIGHT", "LEFT");
		optionTitles.setStyle("-fx-color: white");
		optionTitles.setValue("Item 1");
		pein.setLeft(optionTitles);
		
		HBox pane = new HBox();
		pane.getChildren().addAll(content, optionTitles, graphicText, graphicTextGap);
		pein.setTop(pane);
		
		// Inputing moving in the text box
		optionTitles.setOnAction(e -> {
			if (optionTitles.getValue().equals("TOP")) {
				label.setContentDisplay(ContentDisplay.TOP);
			} else if (optionTitles.getValue().equals("DOWN")){
				label.setContentDisplay(ContentDisplay.BOTTOM);
			} else if (optionTitles.getValue().equals("RIGHT")) {
				label.setContentDisplay(ContentDisplay.RIGHT);
			} else if (optionTitles.getValue().equals("LEFT")) {
				label.setContentDisplay(ContentDisplay.LEFT);;
			}
		});
		
		graphicTextGap.setOnAction(e -> label.setGraphicTextGap(Double.parseDouble(graphicTextGap.getText())));
		
		// Showing the scene
		Scene scene = new Scene(pein, 500, 500);
		stage.setTitle("Exercise16_15");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}

























