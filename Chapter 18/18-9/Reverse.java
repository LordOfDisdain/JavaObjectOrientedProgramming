import java.util.Scanner;
import java.lang.String;


public class Reverse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		
		String name = input.nextLine();
		
		
		System.out.println("Your name reversed is: " + reverseDisplay(name));
		
	}
	
	public static String reverseDisplay(String value){
		
		if (value.isEmpty()) {
			return value;
		} else {
			return reverseDisplay(value.substring(1)) + value.charAt(0);
		}
		
	}
}