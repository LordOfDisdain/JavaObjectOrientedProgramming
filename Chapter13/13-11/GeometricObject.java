/* Zakariyya McCullin Program exercise 13-11
*/
import java.util.Scanner;
import java.lang.Math;
import javax.print.attribute.standard.*;


public abstract class GeometricObject {
	// Sides of the triangle and Octagon
	private double side;
	private double area;
	private double side1;
	private double side2;
	private double side3;
	
	// boolean value to see if color is inside
	boolean shaded = false;
	
	// Color string to determine if the shape is colored in
	private String color;
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public boolean isShaded(){
		return shaded;
	}
	
	public boolean setShaded(boolean shaded){
		this.shaded = shaded;
		return shaded;
	}
	
	double getSide1(){
		return side1;
	}
	
	double getSide2(){
		return side1;
	}
	
	double getSide3(){
		return side3;
	}
	
	abstract double getArea();
	
}














































