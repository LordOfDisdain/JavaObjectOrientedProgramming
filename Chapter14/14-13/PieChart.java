/* Zakariyya McCullin 14-13
*/

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;



public class PieChart extends Application {
	@Override
	public void start(Stage stage) {
		// Creating the circle pie chart
		Pane page = new Pane();
		
		Arc arc1 = new Arc(150, 100, 80, 80, 72, 35); // Createa an arc
		arc1.setFill(Color.BLUE);
		arc1.setType(ArcType.ROUND);
		Text quiz = new Text(160, 20, "Quiz -- 10%");
		
		Arc arc2 = new Arc(150, 100, 80, 80, 0, 72); // Createa an arc
		arc2.setFill(Color.RED);
		arc2.setType(ArcType.ROUND);
		Text project = new Text(160, 90, "Project -- 20%");
		
		Arc arc3 = new Arc(150, 100, 80, 80, 107, 109); // Createa an arc
		arc3.setFill(Color.GREEN);
		arc3.setType(ArcType.ROUND);
		Text midterm = new Text(50, 100, "Midterms -- 30%");
		
		Arc arc4 = new Arc(150, 100, 80, 80, 215, 145); // Createa an arc
		arc4.setFill(Color.ORANGE);
		arc4.setType(ArcType.ROUND);
		Text finale = new Text(170, 170, "Final -- 40%");
		
		page.getChildren().addAll(arc1, quiz, arc2, project, arc3, midterm, arc4, finale);
		
		// Finshing everything else
		Scene scene = new Scene(page, 300, 200);
		stage.setTitle("Exercise14_13");
		stage.setScene(scene);
		stage.show();
		
		
	}
}