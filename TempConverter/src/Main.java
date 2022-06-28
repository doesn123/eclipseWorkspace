import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("TempConverter!!");
		System.out.println();
		System.out.println("Press 'f' for Celsius to Fahrenheit");
		System.out.println("Press 'c' for Fahrenheit to Celsius");
		String choice = kb.next();
		System.out.println("Type an amount");
		double tempToConvert = kb.nextInt();
		

		
		double cel = tempToConvert - 32 / (9/5);
		double fah = tempToConvert * 9/5 + 32;
		
		if(choice.equals("f")) {
			System.out.println(fah);
		}  else if (choice.equals("c")) {
			System.out.println(tempToConvert + "f is " + cel + "c");
		} else {
			System.out.println("Invalid choice");
		}
		
		System.out.println("Want to convert again?");
		
				
	}
//		Menu menu = new Menu();
//		runMenu();
//		System.out.println();
//
//
//	}
//	
//	public void runMenu() {
//		printHeader();
//		while(!exit) {
//		printMenu();
//
//		} 
//	}
//	
//	private void printHeader() {
//		System.out.println("Welcome to TempConverter!");
//		System.out.println("_________________________"); 
//	}
//	
//	private void printMenu() {
//		System.out.println("A) Choose ...");
//	}

}
