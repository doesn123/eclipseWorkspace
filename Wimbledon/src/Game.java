public class Game {
	private TennisPlayer player1;
	private TennisPlayer player2;
	
	public void coinToss() {
		System.out.println("The umpire tosses the coin");
		if(Math.random() >= 0.5) {
			System.out.println(player1.getname() + " has won the coin toss");;
		} else {
			System.out.println(player2.getname() + " has won the coin toss");
		}
	}
	
	public Game(TennisPlayer player1, TennisPlayer player2) {
		this.player1 = player1;
		this.player2 = player2;
	}


}
