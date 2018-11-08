/* Zakariyya McCullin Exercise 13-7
*/
import java.util.Scanner;
import java.lang.Math;

class Main {
	public static void main(String[] args) {
		// Square objects
		Square fourSides = new Square();
		
		Square adSquare = new Square();
		
		Square nullSquare = new Square();
		
		Square fourthSquare = new Square();
		
		Square fifthSquare = new Square();
		
		Square display = new Square();
		
		double num = 10.0;
		double num1 = 19.0;
		double num2 = 30.0;
		double num3 = 23.0;
		double num4 = 15.0;
		
		fourSides.setSide(num);
		
		adSquare.setSide(num1);
		
		nullSquare.setSide(num2);
		
		fourthSquare.setSide(num3);
		
		fifthSquare.setSide(num4);
		
		display.howToColor();
		
		System.out.println("The area of these squares are ");
		System.out.println(fourSides.getArea());
		System.out.println(adSquare.getArea());
		System.out.println(nullSquare.getArea());
		System.out.println(fourthSquare.getArea());
		System.out.println(fifthSquare.getArea());
		
	}
}













































