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
	
	ToDoList toDoList  = new ToDoList();
	
	void addItem() {
		String line = scan.nextLine();
		if(line.length() != 0) {
			
			toDoList.add(line);
			addItem();
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
		case 'e':
			System.exit(0);
		}	
	}
	
	void printToDoList() {
		
		System.out.println("To do list:");
		for(int i = 0; i < toDoList.size(); i++) {
			
			String item = toDoList.get(i);
			System.out.println(item);
		}
	}
	

}
