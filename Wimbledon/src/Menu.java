import java.util.Scanner;

public class Menu {
	static Scanner scan = new Scanner(System.in);
	public void mainMenu() {

		System.out.println("(S)tart game");
		System.out.println("Play again");
		System.out.println("(E)xit app");
		
		char choice = scan.next().charAt(0);
		switch(choice) {
		case 's':
			System.out.println("Starting game");
			break;
		case 'e':
			System.out.println("Exiting game");
			break;			
		}
	}
	
}
