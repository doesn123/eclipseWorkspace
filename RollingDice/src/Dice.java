import java.util.ArrayList;
import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		Random rand = new Random();
		int rolledNum = rand.nextInt(6);
		System.out.println("You rolled a " + rolledNum);
		

	}
}
