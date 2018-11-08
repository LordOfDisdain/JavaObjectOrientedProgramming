import java.util.Scanner;
import java.lang.Math;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.ArrayList;

public class Duplicates {
	
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
//			Duplicates mode = new Duplicates();
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			int num = 0;
			
			System.out.println("Enter ten numbers with a space inbetween: "); 
			
			// For loop that determines how much numbers that you place inside of the 
				for (int z = 0; z < 10; z++) {
				numbers.add(input.nextInt());
			}
				removeDuplicate(numbers);
		}
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> temp = new ArrayList<Integer>(list);
		System.out.println("hit");
		int index = 0;
		int duplication = 0;
		// The for loop that is later called with the method in order to remove
		// Any duplicate number from the account
		for (int i = 0; i < temp.size(); i++) {
			temp.get(i);
			temp.remove(i);
			// The if statement that allows the program to help display the numbers 
			if (temp.isEmpty() == false) {
				// Next count for dupcliates in the string
				// from there display all duplicates that are in the string
				temp.listIterator(i);
			} 
		}
		System.out.println("The distint numbers are: " + temp);
	}
}















