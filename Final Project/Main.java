import java.lang.Math;
import java.lang.String;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class Main extends Application {
	@Override
	public void start(Stage stage){
		// Objects for the program
		EncryptDecrypt codex = new EncryptDecrypt();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a phrase in captial letters with no spaces:");
		String words = input.next();
		
		System.out.println("Enter a passcode or passphrase in capital letters with no spaces: ");
		String pasword = input.next();
		
		String results = codex.vienegreCipher(words, pasword);
		
		// Pane to read the objects
		Pane pein = new Pane();
		Text text = new Text(20, 20, results);
		text.setFont(Font.font("Times New Roman"));
		pein.getChildren().add(text);
		
		
		// Creating the scene to display
		Scene scene = new Scene(pein);
		stage.setTitle("Final Project");
		stage.setScene(scene);
		stage.show();
		
	}	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}


























