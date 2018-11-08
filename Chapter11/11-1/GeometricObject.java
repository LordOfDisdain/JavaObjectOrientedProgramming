import java.util.Scanner;
import java.lang.Math;
import java.awt.*;

class GeometricObject {
	
	private boolean filledIn;
	private String color;
	double side1, side2, side3;
	
	
	public boolean filledIn(){
		// Write an if statement that states of the triangle has color and
		// it is shaded in
		// If shaded in, return true, it not return false
		if (color == color.toString()) {
			filledIn = true;
			return filledIn;
		} else {
			filledIn = false;
			return filledIn;
		}
	}
		
	public String getColor(){
		return color;
	}
		
	public void setColor(String color){
		this.color = color;
			
	}

}