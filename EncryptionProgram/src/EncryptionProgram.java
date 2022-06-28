import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EncryptionProgram {
	private Scanner s;
	private Random rand;
	private ArrayList<Character> list;
	private ArrayList<Character> shuffledList;
	private char character;
	private String line;
	private char[] letters;
	private char[] secretLetters;
	
	EncryptionProgram() {
	 s = new Scanner(System.in);
	 rand = new Random();
	 list = new ArrayList();
	 shuffledList = new ArrayList();
	 character = ' ';
	 
	 newKey();
	 askQuestion();
	}
	
	private void askQuestion() {
		while(true) {
			System.out.println("What do you want to do?");
			System.out.println("(N)ew key, (G)et key, (E)ncrypt, (D)ecrypt, (Q)uit");
			char response = Character.toUpperCase(s.nextLine().charAt(0));
			
			switch(response) {
				case 'N':
					newKey();
					break;
				case 'G':
					getKey();
					break;
				case 'E':
					encrypt();
					break;
				case 'D':
					decrypt();
					break;
				case 'Q':
					quit();
					break;
				
			}
		}
	}
	private void newKey() {
		
	}
	private void getKey() {
		
	}	
	private void encrypt() {
		
	}
	private void decrypt() {
		
	}
	private void quit() {
		
	}
}
