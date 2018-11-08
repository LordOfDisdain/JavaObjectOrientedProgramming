import java.util.Scanner;
import java.util.StringJoiner;


class StringSplit {
	
	String S;
	String Regex;
	
	public String getString(String S, String Regex){
		this.S = S;
		this.Regex = Regex;
		return S;
	}
	
	public String setString(){
		return S;
	}
	
	public static String[] split(String S, String Regex){
		return new String[10];
	}
	
}