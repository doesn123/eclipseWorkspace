import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How much change do you have?");
		double amount = scan.nextDouble();
		String amountString = Double.toString(amount);
		int indexOfDot = amountString.indexOf(".");
		
		double remainingPennies = Double.parseDouble(amountString.substring(indexOfDot)) * 100; 
		System.out.println((int) Double.parseDouble(amountString.substring(0, indexOfDot)) + " Pounds");
		if(remainingPennies / 50 >= 1) {
			System.out.println("50 pence coins = 1");
			remainingPennies -= 50;
		}
		int num20p = (int) remainingPennies / 20;
		if(remainingPennies / 20 >= 1) {
			System.out.println("20 pence coins = " + num20p);
			remainingPennies -= num20p * 20;
		}
		int num10p = (int) remainingPennies / 10;
		if(remainingPennies / 10 >= 1) {
			System.out.println("10 pence coins = " + num10p);
			remainingPennies -= num10p * 10;
		}
		
		int num5p = (int) remainingPennies / 5;
		if(remainingPennies / 5 >= 1) {
			System.out.println("5 pence coins = " + num5p);
			remainingPennies -= num5p * 5;
		}
		
		if(remainingPennies > 0) {
		System.out.println("1 pence coins = " + (int) remainingPennies);	
		}
		
	}

} 

