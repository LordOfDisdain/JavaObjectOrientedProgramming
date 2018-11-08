/* Zakariyya McCullin Program exercise 13-11
*/
import java.util.Scanner;
import java.lang.Math;

class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>{
	// Variables for Octagon
	private double sides;
	private double area;
	
	
	public Octagon(){
		this.sides = 0;
	}
		
	public Octagon(double sides){
		this.sides = sides;
	}
	
	double getSides(){
		return sides;
	}
	
	void setSides(double sides){
		this.sides = sides;
	}
	
	double getArea(){
		area = ((2 + 4.0/Math.sqrt(2)) * sides * sides);
		return area;
	}
	
	public Object clone(){
		return null;
	}
	
	public int compareTo(Octagon o){
		return 0;
	}
}