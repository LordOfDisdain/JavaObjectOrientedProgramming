/* Exercise 13-1 by Zakariyya McCullin
*/

import java.util.Scanner;


class Main extends Triangle{
	public static void main(String[] args) {
			//Objects for this class
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter three sides of a triangle on the same line:");
			
			double num = input.nextDouble();
			
			double num2 = input.nextDouble();
			
			double num3 = input.nextDouble();
			
			Triangle polygon = new Triangle(num, num2, num3);
					
			System.out.println("The side lengths of the Triangle are: " + polygon.toString());
			
			System.out.println("The area of the triangle is: " + polygon.getArea());
			
			System.out.println("The perimeter of the triangle is: " + polygon.getPerimeter());
			
			System.out.println("Enter color of the triangle: ");
			
			String write = input.next();
			
			polygon.setColor(write);
			
			System.out.println("The Triangle color is " + polygon.getColor());
			
			System.out.println("Enter true if triangle is shaded or false is it is not: ");
			
			boolean shade = input.nextBoolean();
			
			polygon.isFilledIn(shade);
			
			System.out.println("The Triangle filled status is " + polygon.filledIn());
			
	}
}