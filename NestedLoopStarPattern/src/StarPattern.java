import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		
		int numStars;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many stars would you like?");
		numStars = scan.nextInt();
		
		for(int i = 1; i <= numStars; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		for(int i = numStars; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
}

