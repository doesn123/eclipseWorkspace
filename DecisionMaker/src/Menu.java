import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	public void Choices() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-------------");
		System.out.println("Welcome");
		System.out.println("-------------");
		System.out.println("");
		System.out.println("(B)egin app - What are your energy levels from 1-10?");
		System.out.println("(A)dd new activity");
		System.out.println("Want to (c)ook?");
//		int energyLevels = scan.nextInt();
//		System.out.println("Your energy levels is a: " + energyLevels);
		
		String choice = scan.nextLine();
		switch (choice) {
			case "b":
				System.out.println("You choose begin");	
				practice();
				break;
			case "a":
				System.out.println("You choose act");
				activities();
				break;
			case "c":
				System.out.println("you chose cooking");
				cooking();
		}
		
		
	}
	
	private void cooking() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Time to (c)ook!");
		String choice = scan.nextLine();
		switch (choice) {
		case "c":
			System.out.println("list of recipes...");
			break;
		case "m":
			System.out.println("cooking mistakes...");
			break;
		}
		
	}

	private void practice() {
		// TODO Auto-generated method stub
		
	}

	public void activities() {
		ArrayList<String> myActivities = new ArrayList<>();
		myActivities.add("Drum Practice");
		
		for(String myactivitie : myActivities) {
			System.out.println(myActivities);
		}
		
	}
	
	public void energyLevels() {
		System.out.println("-----en lvel--------");
	}
}
