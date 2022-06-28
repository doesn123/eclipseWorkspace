import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		login();

	}
	
	public static void login() {
		int numWrong = 0;
		int allowedAttempts = 2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your username?");
		String userName = scan.nextLine();

		for(int i = 0; i <= allowedAttempts; i++) {
			if(!userName.equalsIgnoreCase("gh") && numWrong < allowedAttempts) {
				System.out.println("Invalid username, please try again");
				System.out.println("You have " + (allowedAttempts - numWrong) + " more attempts");
				userName = scan.nextLine();
				numWrong++;
			} else if(numWrong >= allowedAttempts) {
				System.out.println("oopsie, you've been locked out!");
			
			} else {
				allowedAttempts = 0;
				System.out.println("Correct");
				password();
			}
		}
	}
	
	public static void password() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your password");
		String password = scan.nextLine();
		int allowedAttempts = 3;
		int numAttempts = 0;
		
		for(int i = 0; i <= allowedAttempts; i++) {
			if((numAttempts < allowedAttempts) && (!password.contains("m"))) {
				System.out.println("Incorrect password, please try again");
				password = scan.nextLine();
				numAttempts++;
			} else if (numAttempts >= allowedAttempts) {
				System.out.println("You've been locked out of the system!");
//				numAttempts = 0;
			} else {
				System.out.println("Correct password, you how have access");
				allowedAttempts = 0;
			}
			
			
		}

	}
}
	

