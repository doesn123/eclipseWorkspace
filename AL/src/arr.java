import java.util.ArrayList;
import java.util.Scanner;

public class arr {
	
	static ArrayList<Integer> myAL = new ArrayList<Integer>();
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("enter numbers, 0 to exit");
		int n = reader.nextInt();
		
		while (n != 0) {
			n = reader.nextInt();
			myAL.add(n);
		}
		printArray();
		
		public static void printArray() {
			for (int i : myAL) {
				System.out.println(i);
			}
			System.out.println("Exited program");
		}
	}
		
}


