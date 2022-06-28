import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("type in a string ");
		String s = scan.nextLine();
		
		System.out.println(s);
		
		if(s == "hello") {
			System.out.println(s + " equals what you typed in!");
		
		} else {
		System.out.println(s + " does not equal what you typed in...");	
		} 
		}

}
