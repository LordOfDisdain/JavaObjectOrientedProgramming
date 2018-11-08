/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author student
 */
public class TestTime {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		Date date = new Date();
		long time = 10000;
		int i = 1;
		
		while (i < 8) {
			date.setTime(time);
			System.out.println("The current time is: " + date.toString());
			time = time * 10;
			i++;
			
		}
		
	}
	
}