package nestedForLoo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int rows;
		int columns;
		String symbol;
		
		System.out.println("enter symbol");
		symbol = scan.nextLine();
		System.out.println("enter rows");
		rows = scan.nextInt();
		System.out.println("enter colums");
		columns = scan.nextInt();
		
		for(int i = 0; i < rows; i++) {
			System.out.println();
			for(int j=0;j<columns;j++) {
				System.out.print(symbol);
			}
		}
		
	}

}
