import java.util.Scanner;
import java.util.Random;
import java.io.PrintWriter;
import java.io.*;
import java.io.BufferedReader;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

class InputOutput {
	public static void main(String[] args) throws IOException{
		// The file object
		java.io.File export = new java.io.File("Exercise12_15.txt");
		
		// The random object
		Random randy = new Random();
		
		// The scanner object for reading files
		Scanner input = new Scanner(export);
		
		// variables for spacing
		int spaces = 0;
		int counter = 0;
		
		// Array for randomly generated integers
		int[] varies = new int [100];
		
		try {
			java.io.PrintWriter output = new java.io.PrintWriter(export);
			for (int i = 0; i < 100; i++) {
				varies[i] = randy.nextInt(100);
				output.print(varies[i] + "\n");
			}
			
			output.close();
		} catch (Exception e) {
			
		}
		
		try {
			Integer[] read = new Integer[100];
			for (int i = 0; i < 100; i++) {
				// Think of ways to have all of the numbers in 
				// numeerical order
				read[i] = input.nextInt();
			}
			ArrayList<Integer> variable = new ArrayList<Integer>(Arrays.asList(read));
			Collections.sort(variable);
			
			// Before the system printout, this is where I would make the implementation of
			
			System.out.println(variable);
			
		} catch (Exception e) {
			
		}
		
	}
}