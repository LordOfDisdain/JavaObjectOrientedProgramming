import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import java.util.Random;


public class ClockPane extends Pane {
	private int hour;
	private int minute;
	private int second;
	
	boolean hourHandVisible;
	boolean minuteHandVisible;
	boolean secondHandVisible;
	
	// Clock pane's width and height
	private double w = 250, h = 250;
	
	
	/**Construct a default clock with teh current time */
	public ClockPane(){
		setCurrentTime();
	}
	
	// Construct a clock with specified hour, minute and second
	public ClockPane(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		paintClock();
	}
	
	public boolean gethourHandVisible(){
		return hourHandVisible;
	}
	
	public void sethourHandVisible(boolean hourHandVisible){
		this.hourHandVisible = hourHandVisible;
	}
	
	public boolean getminuteHandVisible(){
		return minuteHandVisible;
	}
	
	public void setminuteHandVisible(boolean minuteHandVisible){
		this.minuteHandVisible = minuteHandVisible;
	}
	
	public boolean getsecondHandVisible(){
		return secondHandVisible;
	}
	
	public void setsecondHandVisible(boolean secondHandVisible){
		this.secondHandVisible = secondHandVisible;
	}
	
	// Return hour
	public int getHour(){
		return hour;
	}
	
	// Set a new hour
	public void setHour(int hour) {
		this.hour = hour;
		paintClock();
	}
	
	// Return minute
	public int getMinute(){
		return minute;
	}
	
	// Set a new minute
	public void setMinute(int minute) {
		this.minute = minute;
		paintClock();
	}
	
	// Return second
	public int getSecond(){
		return second;
	}
	
	public void setSecond(int second){
		this.second = second;
		paintClock();
	}
	
	// Return clock pane's width
	public double getW(){
		return w;
	}
	
	// Set clockpane's width
	public void setW(double w){
		this.w = w;
		paintClock();
	}
	
	// Return clock pane's height
	public double getH(){
		return h;
	}
	
	// Set clock pane's height
	public void setH(double h){
		this.h = h;
		paintClock();
	}
	
	// Set the current time for the clock
	public void setCurrentTime(){
		// Construct a calendar for the current date and time
		Calendar calendar = new GregorianCalendar();
		
		// Construct a random object to make the time randomized
		Random random = new Random();
		
		// Set current hour, mintue and second
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);
		this.minute = calendar.get(Calendar.MINUTE);
		this.second = calendar.get(Calendar.SECOND);
		
		// Making the time appear random in the program
		this.hour = random.nextInt(12) - 1;
		this.minute = random.nextInt(60) - 5;
		this.second = random.nextInt(60) - 10;  
		
		paintClock();
	}
	
	// Paint the clock
	protected void paintClock(){
		// Initialize clock parameters
		double clockRadius = Math.min(w,h) * 0.8 * 0.5;
		double centerX = w / 2;
		double centerY = h /2;
		
		// Draw Circle
		Circle circle = new Circle(centerX, centerY, clockRadius);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
		Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
		Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
		Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");
		
		
		// Draw minute hand
		double mLength = clockRadius * 0.65;
		double xMinute = centerX + mLength * Math.sin(minute * (2 * Math.PI /60));
		double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI / 60));
		Line mLine = new Line(centerX, centerY, xMinute, minuteY);
		mLine.setStroke(Color.BLUE);
		
		// Draw hour hand
		double hLength = clockRadius * 0.5;
		double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		double hourY = centerY - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		Line hLine = new Line(centerX, centerY, hourX, hourY);
		hLine.setStroke(Color.BLUE);
		
		getChildren().clear();
		getChildren().addAll(circle, t1, t2, t3, t4, mLine, hLine);
		
	}
}
























