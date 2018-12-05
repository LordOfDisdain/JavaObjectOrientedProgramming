/* Zakariyya McCullin 11/30/2018
*/
import java.util.Scanner;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.lang.Math;
import java.io.*;
import java.io.DataOutputStream;
import java.io.RandomAccessFile;



public class Files {
	public static void main(String[] args) throws IOException {
		try (DataOutputStream writing = new DataOutputStream(new FileOutputStream("Exercise17_03.dat"));) { 
			
			// For loop to create the integers in the output file
			for (int i = 0; i < 100; i++) {
				int num = (int)(Math.random() * (100 + 1));
				writing.writeInt(num);
			} 
			
		}
		try(DataInputStream reading = new DataInputStream(new FileInputStream("Exercise17_03.dat"));) {
			int numerious = 0;
			for (int i = 0; i < 100; i++) {
				numerious += reading.readInt();
			}
			System.out.println(numerious);
		} 
	}
}