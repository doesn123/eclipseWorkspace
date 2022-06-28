import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How much change do you have?");
		double amountChange = scan.nextDouble();
		String numChangeString = Double.toString(amountChange);
		
		String numPounds = numChangeString.split("\\.")[0];
		System.out.println("Pounds: " + numPounds);
		
		int indexOfTens = numChangeString.indexOf(".");
		
		char numOfTens = numChangeString.charAt(indexOfTens + 1);
//		System.out.println("Tens: " + numOfTens);
		
		int numOfTensInt = numOfTens - '0'; //convert from char to int
		int numOfTensMod5 = numOfTensInt % 5;
		if(numOfTensInt >= 5) {
			System.out.println("50 pence coins: 1"); 
			int tensRemainder = numOfTensInt - 5;
			System.out.println("tens r == " + tensRemainder);
			if(tensRemainder == 4) {
				System.out.println("20 pence coins: 2");
			} else {
				if(tensRemainder >= 2) {
					System.out.println("20 pence coins: 1");
				} 
				
			
			}
 		System.out.println("no 50s");
		} else if(numOfTensMod5 % 2 == 0 && numOfTens > 0) {
			System.out.println("20 pence coins: 2");
			
		} else {
			System.out.println("st");
		}
	
		
	
		
		
		
		char numOfHuns = numChangeString.charAt(indexOfTens + 2);
		System.out.println("Pennies: " + numOfHuns);
		
	
		
		

	}

}
