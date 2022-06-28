import java.util.Scanner;

public class Main {
	public static int accountTotal = 0;

	public static void main(String[] args) {
		System.out.println("What is your account number?");
		Scanner s = new Scanner(System.in);
		int attemptsLeft = 2;
		
		for(int i = 0; i < 3; i++) {
			int accountNum = s.nextInt();
			if(accountNum == 1) {
				System.out.println(accountNum + " is correct");
				pin();
				menu();
				break;
				} else {
					System.out.println(accountNum + " is incorrect");
					if(attemptsLeft == 0) {
						System.out.println("You've been locked out");
					} else {
						System.out.println("You have " + attemptsLeft + " attempts left");
						attemptsLeft--;
					}
				}
		}
	}
	private static void menu() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("You now have the following 3 options:");
		System.out.println("a) Deposit");
		System.out.println("b) Withdraw");
		System.out.println("c) Exit the application");
		System.out.println("d) Check balance");
		
		depositOrWithdraw(s);
		
		
		
	}
	public static void depositOrWithdraw(Scanner s) {
		String choice = s.nextLine();
		if(choice.contains("a")) {
			System.out.println("");
			System.out.println("How much would you like to deposit?");
			int depositAmount = s.nextInt();
			System.out.println("You deposited: " + depositAmount);
			accountTotal += depositAmount;
			System.out.println("You have " + accountTotal + " in your account");
			menu();
		}
		if(choice.contains("b")) {
			System.out.println("How much would you like to withdraw?");
			int withdrawAmount = s.nextInt();
			System.out.println("You withdrew: " + withdrawAmount);
			accountTotal -= withdrawAmount;
			System.out.println("You have " + accountTotal + " in your account");
			menu();
		}
		if(choice.contains("c")) {
			System.out.println("Goodbye");
			System.exit(0);
		} 
		if(choice.contains("d")) {
			System.out.println("Your balance is: " + accountTotal);
			menu();
		}
		else {
			System.out.println("Incorrect");
		}
	}
	public static void pin() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your pin?");
		for(int i = 2; i >= 0; i--) {
			int pin = scan.nextInt();
			if(pin == 1234) {
				System.out.println("correct");
				break;
			} else {
				if(i == 0) {
					System.out.println("You've been locked out");
					break;
				}
				if(i == 1) {
					System.out.println("You have " + i + " more attempt");
				} else {
				System.out.println("You have " + i + " more attempts");
				}
			}
		}
	}
}
