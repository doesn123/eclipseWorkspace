
public class Main {

	public static void main(String[] args) {
		Player player1 = new Player("Djoko", 35);
		Player player2 = new Player("Nick", 25);
		System.out.println(player1.age);

		int score = 0;
		TennisMatch tm = new TennisMatch(player1, player2, score);

	}

}
