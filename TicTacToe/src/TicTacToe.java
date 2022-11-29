import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	
	public static void main(String[] args) {
		char[][] gameBoard = {{' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '},{'-', '+', '-', '+', '-'},{' ', '|', ' ', '|', ' '}};
		printGameboard(gameBoard);
		Scanner scan = new Scanner(System.in);
		System.out.println("1-9");

		int pos = scan.nextInt();
		char symbol = 'X';	
		switch(pos) {
		case 1: 
			gameBoard[0][0] = symbol;
			break;
		case 2: 
			gameBoard[0][2] = symbol;
			break;}
		case 3: 
			gameBoard[0][0] = symbol;
			break;
		case 4: 
			gameBoard[0][2] = symbol;
			break;}
		printGameboard(gameBoard);
	}
	
	public static void printPiece() {

	}
	
	public static void printGameboard(char[][] gameBoard) {
		for(char[] row : gameBoard) {
			for(char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
		

	

	

