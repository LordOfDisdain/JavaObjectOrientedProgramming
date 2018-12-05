import java.io.InputStream;
import java.io.OutputStream;
import java.io.*;
import java.util.Scanner;
import java.lang.*;
import java.io.ObjectOutputStream;
import java.lang.StringBuilder;;

public class Encryption {
	
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int count = 0;
		try (ObjectOutputStream encrypt = new ObjectOutputStream(new FileOutputStream("encrypted.dat"));
		) {
			System.out.println("Enter a file name:");
			String files1 = input.next();
			System.out.println("Enter a file name:");
			String files2 = input.next();
			File file = new File(files1);
			File file1 = new File(files2);
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file1));
			encrypted(in, out);
			decryption(in, out);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void encrypted(BufferedInputStream inside, BufferedOutputStream outside) throws IOException{
		try {
			int countUp;
			while ((countUp = inside.read()) != -1) {
				outside.write(countUp + 5);
			}
		} catch (Exception e) {
			System.out.println("System cannot be found.");
		}
	}
	
	public static void decryption(BufferedInputStream inside, BufferedOutputStream outside) throws IOException{
		try {
			int counting;
			while ((counting = inside.read()) != -1) {
				outside.write(counting - 5);
			}
			System.out.println(inside.read());
		} catch (Exception e) {
			System.out.println("File cannot be opened.");
		}
	}
}










