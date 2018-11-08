import java.util.Scanner;
import java.util.Arrays;



class TestMyInteger {
	public static void main(String[] args) {
		// Variable for loop
		int d = 1;
		
		// Making a scanner
		Scanner input = new Scanner(System.in);
		
		//Object for the Integer class
		
		MyInteger kindOfInteger = new MyInteger();
		
		System.out.println("This number is " + kindOfInteger.isEven(6) + " an even integer.");
		
		System.out.println("This number is " + kindOfInteger.isOdd(7) + " an odd integer.");
		
		System.out.println("This number is " + kindOfInteger.isPrime(5) + " an prime integer.");
		
		char thoughts[] = {'A', 'B', 'C', 'D'};
		System.out.println("The number of this array are " + kindOfInteger.parseInt(thoughts));
	}
}





































