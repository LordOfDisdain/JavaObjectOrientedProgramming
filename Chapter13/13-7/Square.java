/* Zakariyya McCullin Exercise 13-7
*/
import java.util.*;
import java.lang.Math;

interface Colorable{
	void howToColor();
}

class Square extends GeometricObject implements Colorable{
	// Variables for the square
	private double side;
	
	// String variables for the 
	
	public Square(){
		
	}
	
	public Square(double side){
		this.side = side;
	}
	
	double getSide(){
		return side;
	}
	
	void setSide(double side){
		this.side = side;
	}
	
	@Override
	public void howToColor(){
		System.out.println("Color all for sides");
	}
	
	@Override
	double getArea(){
		double area = Math.pow(side, 2);
		return area;
	}
}






















