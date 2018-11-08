/* Zakariyya McCullin Program exercise 13-11
*/
import java.util.Scanner;
import java.lang.Math;


class Main {
	public static void main(String[] args) {
		// Scanner object to input values
		Scanner input = new Scanner(System.in);
		
		// Object for the octagon
		
		Octagon shape = new Octagon();
		
		System.out.println("Enter the length of the Octagon sides: ");
		
		double num = input.nextDouble();
		shape.setSides(num);
		
		System.out.println("The area of the Octagon is: " + shape.getArea());
	}
}