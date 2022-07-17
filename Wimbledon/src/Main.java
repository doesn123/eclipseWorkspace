
public class Main {

	public static void main(String[] args) {
		Menu m = new Menu();
		Game g = new Game("Novak Djokovic", 35, "male", 71);
		TennisPlayer t1 = new TennisPlayer("Novak Djokovic", 35, "male", 71);
		TennisPlayer t2 = new TennisPlayer("Nick Kygrios", 26, "male", 65);
		
		System.out.println("The umpire tosses the coin");
		g.coinToss();
		m.mainMenu();
			
//		System.out.println(t1.chanceOfFirstServeIn);
		

//		Score firstMatch = new Score();
//		firstMatch.	
		
		

	}

}
