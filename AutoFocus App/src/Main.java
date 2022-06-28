import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		Main m = new Main();
		m.showMenu();
		m.addItem();
		m.printToDoList();
	}
	
	ArrayList<String>toDoList  = new ArrayList<>();
	
	void addItem() {
		while(scan.nextLine().charAt(0) != 'e') {
		toDoList.add(scan.nextLine());
		
		}
	}
	
	void showMenu() {
		System.out.println("(A)dd new item");
		System.out.println("(L)ist to do list");
		System.out.println("(E)xit");
		
		char choice = scan.nextLine().charAt(0);
		switch(choice) {
		case 'a':
			System.out.println("add item/s");
			break;
		case 'l':
			printToDoList();
		}		
	}
	
	void printToDoList() {
		System.out.println("To do list:");
		for(String item:toDoList) {
			System.out.println(item);
		}
	}
	

}
