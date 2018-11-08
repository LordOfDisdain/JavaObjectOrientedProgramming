/*Zakariyya 13-15 Exercise

*/

import java.lang.Math;
import java.util.*;
import java.lang.Number;
import java.math.*;

class Rational extends Numbers implements Comparable<Rational> {
	// Data fields for numerator and demoniator
	private BigInteger numerator;
	private BigInteger denominator;
	
	// Construct rational with default properties
	public Rational(){
		this(BigInteger.ZERO, BigInteger.ONE);
	}
	
	//Rational with default numerators and demoninators
	public Rational(BigInteger numerator, BigInteger denominator){
		BigInteger gcd = gcd(numerator, denominator);
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	// Finding GCD of two numbers
	private static BigInteger gcd(BigInteger n, BigInteger d){
		BigInteger n1 = n.abs();
		BigInteger n2 = d.abs();
		BigInteger gcd = BigInteger.ONE;
		
		for (BigInteger i = BigInteger.ONE; i.compareTo(n1) <= 0 && i.compareTo(n2) <= 0; i = i.add(BigInteger.ONE)) {
			if (n1.remainder(i).equals(BigInteger.ZERO) && n2.remainder(i).equals(BigInteger.ZERO)) {
				gcd = i;
			}
		}
		return gcd;
	}
	
	// Return numerator
	public BigInteger getNumerator(){
		return numerator;
	}
	
	// Return denominator
	public BigInteger getDenominator(){
		return denominator;
	}
	
	// Adding rational numbers to this rational
	public Rational add(Rational secondRational){
		BigInteger n = numerator.multiply(secondRational.getDenominator()).add(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}
	
	
	// Subtract a rational number from this rational
	public Rational subtract(Rational secondRational){
		BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}
	
	// Multiply a rational number by this rational
	public Rational multiply(Rational secondRational){
		BigInteger n = numerator.multiply(secondRational.getNumerator());
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n,d);
	}
	
	// Divide a rational number by this rational
	public Rational divide(Rational secondRational){
		BigInteger n = numerator.multiply(secondRational.getDenominator());
		BigInteger d = denominator.multiply(secondRational.getNumerator());	
		return new Rational(n,d);
	}
	
	@Override
	public String toString(){
		if (denominator.equals(BigInteger.ONE)) {
			return numerator + "";
		} else {
			return numerator + "/" + denominator;
		}
	}
	
	@Override // Overrides the equals method
	public boolean equals(Object other){
		if ((this.subtract((Rational) (other))).getNumerator().equals(BigInteger.ZERO)) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int intValue(){
		return (int)doubleValue();
	}
	
	@Override
	public float floatValue(){
		return (float)doubleValue();
	}
	
	@Override // Implement the abstract longValue method in Number numerator.multiply(BigInteger.ONE).divide(denominator)
	public double doubleValue(){
		double d = numerator.multiply(BigInteger.ONE).divide(denominator).doubleValue(); 
		return d;
	}
	
	@Override // Implement the abstract longValue method in number
	public long longValue(){
		return (long)doubleValue();
	}
	
	@Override // Implement the compareTo method in Comparable
	public int compareTo(Rational o){
		if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) > 0) {
			return 1;
		} else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}





































