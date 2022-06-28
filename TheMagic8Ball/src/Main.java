import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

	public static void main(String[] args) {
			run();
		}
			

	public static void run() {
		boolean Play = true;
		while(Play) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int arrayLen = 3;
		int randomNum = rand.nextInt(arrayLen);
		String[] answers = new String[arrayLen];
		answers[0] = "without a doubt";
		answers[1] = "certainly not";
		answers[2] = "perhaps maybe";
		
		System.out.println("Ask any yes/no question");
		String input = scan.nextLine();
		System.out.println(answers[randomNum]);
		
		System.out.println("Would you like to play again? y/n");
		char yesOrNo = scan.next().charAt(0);
		if(yesOrNo == 'n') {
			Play = false;
		}
		}
	}
}
		

