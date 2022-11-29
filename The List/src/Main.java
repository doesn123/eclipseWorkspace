import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Other o = new Other();
		
		System.out.println("*** The List ***\n"); //Question 1
		System.out.println("Do you have any weak groups or important stones?");
		boolean yesOrNo = scan.nextBoolean();
		if(yesOrNo == true) {
			String weakGroupString = "As I help my weakest group" + o.otherWeakGroups + "is there another of my groups that enjoy help?";
			System.out.println(weakGroupString);
			boolean otherWeakGroupsBoolean = scan.nextBoolean();
			if(otherWeakGroupsBoolean == true) {
				o.setotherWeakGroupString("and my other group/important stone/s,");
				System.out.println(weakGroupString);
			}
		} else {
			System.out.println("no");
		}
			/*
			 * while(numWeakGroups > 0) { System.out.
			 * println("As I help my weakest group; is there another of my groups that would enjoy help?"
			 * ); numWeakGroups--; }
			 */

	}
		/*
		 * String weakGroupDescription = ", and also help my %s";
		 * System.out.println("*** The List ***\n"); //Question 1
		 * System.out.println("How many weak groups or important stones do you have?");
		 * //Question 2 System.out.
		 * println("How many weak groups or important stones does your opponent have?");
		 * System.out.
		 * ); System.out.println("As I help my weakest group"+weakGroupDescription; is
		 * there an opponent group I can bother?"); //Question 3
		 * System.out.println("How many big areas are there?");
		 * 
		 * int myWeakGroups = scan.nextInt(); if(myWeakGroups != 0) { } else
		 * if(myWeakGroups == 0) {
		 * System.out.println("is there an opponent group I could bother?"); int
		 * opponentWeakGroups = scan.nextInt(); }
		 */

}
