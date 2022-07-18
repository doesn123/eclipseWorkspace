
public class Main {

	public static void main(String[] args) {
		Menu m = new Menu();
		
		TennisPlayer player1 = new TennisPlayer("Novak Djokovic", 35, "male", 71);
		TennisPlayer player2 = new TennisPlayer("Nick Kygrios", 26, "male", 65);
		Game g = new Game(player1, player2);

		player1.choosePlayer();
//		g.coinToss();
		m.mainMenu();
			
//		System.out.println(t1.chanceOfFirstServeIn);
		

//		Score firstMatch = new Score();
//		firstMatch.	
		
		
//choose player - either t2 or t2?
	}

}
