/*Zakariyya 13-15 Exercise
*/
import java.util.Scanner;
import java.lang.Math;
import java.util.*;
import java.lang.Number;
import java.math.*;

class Main extends Rational{
	public static void main(String[] args) {
		
		// Objects to get the fractions
		Rational rat1 = new Rational(BigInteger.ONE, BigInteger.TEN);
		Rational rat2 = new Rational(BigInteger.ONE, BigInteger.TEN);
		
		// Showing the user the results
		System.out.println(rat1 + " + " + rat2 + " = " + rat1.add(rat2));
		System.out.println(rat1 + " - " + rat2 + " = " + rat1.subtract(rat2));
		System.out.println(rat1 + " * " + rat2 + " = " + rat1.multiply(rat2));
		System.out.println(rat1 + " / " + rat2 + " = " + rat1.divide(rat2));
		System.out.println(rat2 + " is " + rat2.doubleValue());
	}
}