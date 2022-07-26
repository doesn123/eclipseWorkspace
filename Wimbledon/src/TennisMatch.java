import java.util.Scanner;

public class TennisMatch {
	private TennisPlayer player1;
	private TennisPlayer player2;
	private Scanner scan;


	public TennisMatch(TennisPlayer player1, TennisPlayer player2, Scanner scan) {
		this.player1 = player1;
		this.player2 = player2;
		this.scan = scan;
	}

	public void coinToss() {
		System.out.println("The umpire tosses the coin");
		if(Math.random() >= 0.5) {
			System.out.println(player1.getname() + " has won the coin toss");
		} else {
			System.out.println(player2.getname() + " has won the coin toss");
		}
	}
}
