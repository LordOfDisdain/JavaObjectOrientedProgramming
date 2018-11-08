import java.util.Scanner;
import java.util.ArrayList;
import java.lang.ArrayIndexOutOfBoundsException;
import java.net.MalformedURLException;

class Gettysburg {
	public static void main(String[] args) {
		
		String bits = "";
		
		Scanner input = new Scanner(System.in);
		
		Gettysburg lincolnSpeech = new Gettysburg();
		
		System.out.println("Enter the URL link for the Gettysburg address:");
		
		String websiteLink = input.next();
		
		try {
			java.net.URL links = new java.net.URL(websiteLink);
			int counter = 0;
			int words = 0;
			Scanner siteread = new Scanner(links.openStream());
			
			while (siteread.hasNext()) {
				bits = siteread.next();

				counter += 1;
			}
			
			System.out.println("The file word count is " + counter + " words.");
			
		} catch (java.net.MalformedURLException e) {
			System.out.println("Invalid Link");
		} catch (java.io.IOException ex) {
			System.out.println("I/O errors no such file");
		}
	}
}
























