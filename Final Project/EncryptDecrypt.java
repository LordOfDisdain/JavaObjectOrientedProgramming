import java.lang.Math;
import java.lang.String;

public class EncryptDecrypt {
	// Cipher that creates keyword for the cipher
	public static String vienegreCipher(String texts, final String keys) {
		String ans = "";
		texts = texts.toUpperCase();
		for (int i = 0, z = 0; i < texts.length(); i++) {
			char d = texts.charAt(i);
			if (d < 'A' || d > 'Z') continue;
			ans += (char)((d + keys.charAt(z) - 2 * 'A') % 26 + 'A');
			z = ++z % keys.length();
		}
		return ans;
		
	}
	
	public static String decrypting(String text){
		String ans = "";
		final String keys = "MYNAMEISJANE";	
		text = text.toUpperCase();
		for (int i = 0, z = 0; i < text.length(); i++) {
			char e = text.charAt(i);
			if (e < 'A' || e > 'Z') continue;
			ans += (char)((e - keys.charAt(z) + 26) % 26 + 'A');
			z = ++z % keys.length();
		}
		return ans;
	}
		
}