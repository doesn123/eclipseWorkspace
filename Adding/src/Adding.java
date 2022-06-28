import java.util.Scanner;

public class Adding {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first number");
		int firstNum = scan.nextInt();
		System.out.println("you entered " + firstNum);
		System.out.println("enter second number");
		int secondNum = scan.nextInt();
		System.out.println("you entered " + secondNum);
		System.out.println(" = " + (firstNum + secondNum));
		
	}

}
