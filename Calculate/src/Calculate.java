import java.util.Scanner;

public class Calculate {
	int num1, num2, num3;
	int smallest, largest;
	Scanner scan = new Scanner(System.in);
	
	void getUserInput() {
		System.out.println("Enter first number");
		num1 = scan.nextInt();
		System.out.println("Enter second number");
		num2 = scan.nextInt();
		System.out.println("Enter third number");
		num3 = scan.nextInt();
		
	}
	
	void sum() {
		System.out.printf("the sum is %d\n", num1 + num2 + num3);
	}
	
	void average() {
		System.out.printf("The average is %d\n", (num1 + num2 + num3)/3);
	}
	
	public void smallest() {
		smallest = num1;
		if(num2 < num1)
			smallest = num2;
		if(num3 < num2) 
			smallest = num3;
		System.out.printf("the smallest number is %d\n", smallest);
	}
	
	public void largest() {
		largest = num1;
		if(num2 > num1)
			largest = num2;
		if(num3 > num2)
			largest = num3;
		System.out.printf("the largest number is %d", largest);
	}
}
