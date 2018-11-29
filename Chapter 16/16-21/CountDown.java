import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.layout.StackPane;
import java.util.Scanner;
import javafx.animation.Animation;

public class CountDown extends Application{
	TextField tfSeconds = new TextField();
	Timeline animation;
	MediaPlayer discJockey;
	
	public void countdown() {
		int seconds = Integer.parseInt(tfSeconds.getText());
		System.out.println(seconds);
		tfSeconds.setText(seconds - 1 + "");
		if (seconds - 1 <= 0) {
			animation.stop();
			discJockey.play();
		}
	}

	private static final String MEDIA_URL = "https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3";
	@Override
	public void start(Stage stage){
		StackPane pein = new StackPane();
		
		pein.getChildren().add(tfSeconds);
		Media songs = new Media(MEDIA_URL);
		discJockey = new MediaPlayer(songs);
		MediaView camera = new MediaView(discJockey);		
		
		// Creating a animation to change time
		animation = new Timeline(
			new KeyFrame(Duration.millis(1000), e -> { countdown();
		}));
		animation.setCycleCount(Timeline.INDEFINITE);
		
		// Pausing and resuming
		tfSeconds.setOnAction(e ->{
			animation.play();
		});
		
		// Making the scene to place in
		Scene scene = new Scene(pein, 500, 500);
		stage.setTitle("Exercise16_21");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		Application.launch();
	}
}

























