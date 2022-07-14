import java.util.Scanner;

public class Menu {
	public void mainMenu() {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("(S)tart game");
		System.out.println("Play again");
		System.out.println("Choose players");
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
