/* Exercise 13-1 by Zakariyya McCullin
*/

import java.util.Scanner;

public abstract class GeometricObject {
	
	// boolean value to see if color is inside
	protected boolean filledIn = false;
	
	//String value to see if shade is shaded in
	private String shaded;
	
	// Color string to determine if the shape is colored in
	private String color;
	
	public boolean filledIn(){
		return filledIn;
	}
	
	void isFilledIn(boolean filledIn){
		this.filledIn = filledIn;
	}
			
	public String getColor(){
		return color;
	}
			
	public void setColor(String color){
		this.color = color;		
	}
}














































