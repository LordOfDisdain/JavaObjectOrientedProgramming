/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author student
 */
public class MyInteger {
	
	int value;
	
	// Empty Constructor
	public MyInteger(){
		
	}
	
	public MyInteger(int value){
		this.value = value;
	}

	// Methods for finding even value
	boolean isEven(){
		double n = 0;
		
		if(n % 2 == 0){
			
		return true;
			
		} else {
			return false;
		}
	}
	
	// Methods for finding odd value 
	boolean isOdd(){
		
		double b = 1;
		
		if(b % 2 == 1){
			
		return true;
			
		} else {
			return false;
		}                
	}
	
	// Methods for finding prime value
	boolean isPrime(){
		
		double c = 2;
		
		if((c % 1) == 0){
			return true;
		}  else {
			return false;
		}  
		
	}
	
	// Methods for finding even value 
	public static boolean isEven(int n){
		// if statement for determing value
		
		if(n % 2 == 0){
			return true;
			
		} else {
			return false;
		}
	}
	
	// Methods for finding even value 
	public static boolean isOdd(int b){
		
		if(b % 2 == 1){
			return true;
			
		} else {
			return false;
		}
		
	}
	
	// Methods for finding even value 
	public static boolean isPrime(int v){
		boolean prime = true; 
		for (int c = 2; c < v; c++) {
			if (v % c == 0) {
				prime = false;
			} 
		}
		return prime;
    }	
	
	public int parseInt(char integer[]){
		
		value = Integer.parseInt(new String(integer), 16);
		return value;
		
	}
	
	public String parseInt(String numerials){
		value = Integer.parseInt(new String (numerials));
		
		return numerials;
	}
	
	public boolean equals(int num){
		
		if((num + 0) == num){
			return true;
		}  else {
			return false;
		}
	}
	
	public boolean isEquals(int facts){
		
		if((facts + 0) == facts){
			return true;
		}  else {
			return false;
		}
		
	}
		
}























