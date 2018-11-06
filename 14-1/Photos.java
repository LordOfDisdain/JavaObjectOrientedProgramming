/*Zakariyya McCullin Excerise 14-1
*/
import javafx.application.Application;
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
import javax.swing.text.*;
import javafx.geometry.Pos;

public class Photos extends Application{
	@Override
	public void start(Stage stage){
		
		// image pane to hold the first image
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.setHgap(6);
		pane.setVgap(6);
		
		// Image views for program
		ImageView imageView1 = new ImageView("Bitcoin.png");
		ImageView imageView2 = new ImageView("Monero.png");
		ImageView imageView3 = new ImageView("Zcash.png");
		ImageView imageView4 = new ImageView("Litecoin.png");
		
		pane.add(imageView1, 0, 0);
		pane.add(imageView2, 0, 1);
		pane.add(imageView3, 1, 0);
		pane.add(imageView4, 1, 1);
		
		
		// Having the scene appear with all of the images
		Scene pictures = new Scene(pane);
		stage.setTitle("Cryptos");
		stage.setScene(pictures);
		stage.show();
		
	}
}












