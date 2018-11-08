import java.util.Scanner;
import java.lang.Math;



class Triangle extends GeometricObject {
	
	// Fix the values of the sides so that way it will always default at a value to automatically accept whatever the user wants
	// To use for the value
	
	private double side1;
	private double side2;
	private double side3;
	
	
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
	
	public double getSide1(){
		return side1;
	}
	
	public double getSide2(){
		return side2;
	}
	
	public double getSide3(){
		return side3;
	}
	
	public double getArea(){
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
			
	public double getPerimeter(){
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
		
	
}

















