import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		double num = input.nextDouble();
		System.out.println("Enter the second number");
		double num2 = input.nextDouble();
		
		System.out.println("The answer is: " + modulus(num, num2));
	}
	
	public static double modulus(double num, double num2){
		double gcd = num % num2;
		
		if (gcd == 0) {
			return num2;
		} else {
			return modulus(num2, gcd);
		}
		
	}
}