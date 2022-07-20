import java.util.Scanner;

public class TennisMatch {
	private TennisPlayer player1;
	private TennisPlayer player2;
	
	static Scanner scan = new Scanner(System.in); 
	
	public void coinToss() {
		System.out.println("The umpire tosses the coin");
		if(Math.random() >= 0.5) {
			System.out.println(player1.getname() + " has won the coin toss");;
		} else {
			System.out.println(player2.getname() + " has won the coin toss");
		}
	}
	
	public TennisMatch(TennisPlayer player1, TennisPlayer player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void choosePlayer() {
		System.out.println("Choose your player\nNovak Djokovic, 35, Male, 71");
		System.out.println("Nick Kygrios, 26, Male, 65)");
		char choice = scan.nextLine().charAt(0);
		switch(choice) {
		case 'a': 
			System.out.println("You have chosen player " + this.name);
			break;
		case 'b': 
			System.out.println("You have chosen " + this.name);
			break;
					
		}
	}

}
