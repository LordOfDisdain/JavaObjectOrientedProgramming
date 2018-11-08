/* Exercise 13-1 by Zakariyya McCullin
*/

import java.util.Scanner;

class Triangle extends GeometricObject {
	
	// Sides of the triangle
	private double side1;
	private double side2;
	private double side3;
	
	// boolean value for filled in
	private boolean filledIn;
	
	// String value for color
	private String color;
		
	public Triangle() {
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}
			
	public Triangle(double num, double num2, double num3){
		side1 = num;
		side2 = num2;
		side3 = num3; 
	}	
			
	double getSide1(){
		return side1;
	}
		
	double getSide2(){
		return side1;
	}
		
	double getSide3(double side3){
		this.side3 = side3;
		return side3;
	}
			
	public double getArea(){
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
		
	double getPerimeter(){
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
		
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	
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



