import java.util.Scanner;

public class lib {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("what celeb?");
		String celeb = scan.nextLine();
		System.out.println("which verb?");
		String verb = scan.nextLine();
		System.out.println("which location?");
		String location = scan.nextLine();
		
		System.out.println(celeb + " is " + verb + " in " + location);

	}

}
