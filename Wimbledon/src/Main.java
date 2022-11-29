import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		static Scanner scan = new Scanner(System.in);
		Menu m = new Menu(scan);
		PlayerChooser playerChooser = new PlayerChooser(scan);

		System.out.println("Wimbledon game");
		System.out.println("--------------");
		System.out.println("choose your player...");
		Player userPlayer = playerChooser.selectPlayer();
		System.out.println("choose your opponent...");
		Player opponent = playerChooser.selectPlayer();

		TennisMatch tennisMatch = new TennisMatch(userPlayer, opponent, scan);


		// player1.choosePlayer();
		tennisMatch.coinToss();
		m.mainMenu();

//		System.out.println(t1.chanceOfFirstServeIn);


//		Score firstMatch = new Score();
//		firstMatch.


//choose player - either t2 or t2?
	}

}
