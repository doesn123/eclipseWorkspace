import java.util.ArrayList;

public class Main {


	public static void main(String[] args) {
		permute("abcdi");
	}
	
	public static void permute(String full) {
		if(full.length() == 0 || full == null) {
			System.out.println("error");
			return;
		}
		permute("", full);
	}
		
	public static void permute(String prefix, String remaining) {
//		int index = 0;
		if(remaining.length() == 0) {
			System.out.println(prefix);
			return;
		}
		for(int i = 0; i < remaining.length(); i++) {
			permute(prefix + remaining.charAt(i), remaining.substring(0,i) + remaining.substring(i + 1, remaining.length()));
//			index++;
		}
//		System.out.println(index);
	}
	
	
}

