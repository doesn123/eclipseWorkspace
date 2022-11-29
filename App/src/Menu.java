import java.util.Scanner;

public class Menu {
	
	Scanner scan = new Scanner(System.in);
	
	public void menu() {
	  System.out.println("r to reverse strokes");
	  char choice = scan.nextLine().charAt(0);
	
	  if(choice == 'r') {
	 	System.out.println("reversed");
	   } else {
	  	System.out.println("oops");
	  }
	}
}
