package waterWeigher;

import java.util.Scanner;

public class Scales {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double gallonToPound = 8.33;
		
		System.out.println("how many gallons would you like to convert?");
		double answer = scanner.nextInt() * gallonToPound;
		System.out.println(answer);
				

	}

}
