import java.lang.Math;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.ArrayList;
import java.lang.Throwable;
import java.util.Random;
import java.util.*;

class NumberArrays {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random generation = new Random();
		int[] varies = new int [100];
		
		for (int i = 0; i < 100; i++) {
			varies[i] = (int)(Math.random() * 100);
		}
		
		System.out.println("Enter a index number: ");
		
		int num = input.nextInt();
			 
		try {	
			System.out.println("The number generated is: " + varies[num]);		
		} catch (Exception e) {
			System.err.println("That number you entered is out of bounds. Please try again");
		}
			
	}
}




















































