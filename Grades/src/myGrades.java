import java.util.Scanner;

public class myGrades {

	public static void main(String[] args)	
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a grade: ");
		
		int grade = scan.nextInt();
		System.out.println(grade);
		
		if(grade >=80 && grade <= 100) {
			System.out.println("grade A");
		} else if (grade >= 70 && grade <= 80) {
		System.out.println("grade B");		
		} else 
		{
			System.out.println("your number is not in the range");
		}
		
	}

}
