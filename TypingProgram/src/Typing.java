import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Typing {

	public static void main(String[] args) throws InterruptedException {
		double start = LocalTime.now().toNanoOfDay();
		System.out.println("Welcome to 'Typing'");
		System.out.println("3");
//		TimeUnit.SECONDS.sleep(1);
//		System.out.println("2");
//		TimeUnit.SECONDS.sleep(1);
//		System.out.println("1");
//		TimeUnit.SECONDS.sleep(1);
		
		Random rand = new Random();
		String[] words = {"cherry", "dog", "machine", "garden", "spaceship", "mountain"};
		int numLetters = words.length;
		System.out.println(numLetters);
		for(int i = 0; i < words.length; i++) {
			System.out.print(words[rand.nextInt(words.length)] + " ");
		}

		Scanner scan = new Scanner(System.in);
		
		String typedWords = scan.nextLine();
		double end = LocalTime.now().toNanoOfDay();
		double elapsedTime = end - start;
		double seconds = elapsedTime / 1000000000.0;
		System.out.println(seconds);
	}

}
