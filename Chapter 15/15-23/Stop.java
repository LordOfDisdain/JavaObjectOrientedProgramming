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
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Label;

public class Stop extends Application{
	double pageWidth = 200;
	double pageHeight = 200;
	double centerX = pageWidth / 4, centerY = pageHeight / 4;
	double radius = Math.min(pageWidth, pageHeight) * 0.4;
	Polygon octagon = new Polygon();
	ObservableList<Double> list = octagon.getPoints();
	
	@Override
	public void start(Stage stage) {
		//Creating a pane and the Octagon
		StackPane page = new StackPane();
		setValues();
		page.getChildren().add(octagon);
		octagon.setFill(Color.RED);
		octagon.setStroke(Color.WHITE);
		
		// Creating the stop sign
		Label label = new Label("STOP");
		label.setFont(Font.font("Times New Roman", 40));
		label.setTextFill(Color.WHITE); 
		page.getChildren().add(label);
		
		// Rotation for the Octagon to appear normal
		octagon.setRotate(23);
		
		Scene pictures = new Scene(page, pageHeight, pageWidth);
		stage.setTitle("Exercise 14_15");
		stage.setScene(pictures);
		// Making everything else
		stage.show();
		
		pictures.widthProperty().addListener(ov ->  {
			pageWidth = pictures.getWidth();
			setValues();
			
			});
		
		pictures.heightProperty().addListener((ov, oldVal, newVal) ->{
			pageHeight = pictures.getHeight();
			setValues();
		}); 
		
	}
	
	public void setValues(){
		double centerOfX = pageWidth / 2, centerOfY = pageHeight / 2;
		double radius = Math.min(pageWidth, pageHeight) * .40;
		list.clear();
		for (int i = 0; i < 8; i++) {
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
		}
		
	}
	
	public static void main(String[] args){
		Application.launch(args);
	}
}





