import java.util.Scanner;
import java.lang.Math;


class Main extends Triangle{
	public static void main(String[] args) {
			
			// The object that calls the other methods and inputs color
	//		Triangle polygon = new Triangle();
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter three sides of a triangle on the same line:");
			
			double num = input.nextDouble();
			
			double num2 = input.nextDouble();
			
			double num3 = input.nextDouble();
			
			Triangle polygon = new Triangle(num, num2, num3);
					
			System.out.println("The side lengths of the Triangle are: " + polygon.toString());
			
			System.out.println("The area of the triangle is: " + polygon.getArea());
			
			System.out.println("The perimeter of the triangle is: " + polygon.getPerimeter());
			
			System.out.println("Enter the color of the Triangle: ");
			
			String write = input.next();
			
			polygon.setColor(write);
			
			System.out.println("The Triangle color is " + polygon.getColor());
			
			System.out.println("The Triangle filled status is " + polygon.filledIn());

		}
}