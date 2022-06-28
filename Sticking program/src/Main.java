import java.util.Random;
import java.util.Scanner;

public class Main {
	
//	public static int stickingLength;
	public static int maxStrokeLength;

	public static void main(String[] args) {
		Stickings s = new Stickings();
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		

		System.out.println("Welcome to the ultimate practice app!");
		System.out.println("");
		System.out.println("Press ? for options");
		int input = scan.nextInt();
		
		int stickingLength = Integer.parseInt(Integer.toString(input).substring(0, 1));
		maxStrokeLength = Integer.parseInt(Integer.toString(input).substring(1, 2));
//		System.out.println("max s l = " + maxStrokeLength);
//		if(input.contains(Integer.parseInt("?"))) {
//			System.out.println("Options:");
//			System.out.println("42");
//			System.out.println("b: bass drum, h: hi-hat, f: feet");
//			System.out.println("first index = number of strokes");
//			System.out.println("second index = max number of consecutive strokes - space = default of 2");
//		}
		
//		System.out.println("sticking len = " + stickingLength);
		
		String partialSticking = "";
		for(int i = 0; i < stickingLength; i++) {
			if((i > 0) && (partialSticking.charAt(i) == partialSticking.charAt(i - 1))) { //finds duplicate strokes and 'fixes' them
				char currentStroke = partialSticking.charAt(i);
				boolean maxDuplicateStrokesBreached = true;
				while(maxDuplicateStrokesBreached) {
					currentStroke = s.stickings[r.nextInt(2)];
				}
			}
//			if(i > 0) {
//				System.out.println("p s -1 = " + partialSticking.charAt(i-1));
//			} 
			partialSticking += s.stickings[r.nextInt(2)];
			System.out.println(partialSticking);
		}
		System.out.println("full sticking = " + partialSticking);
	}
	
//	public static void stickingLength() {
//		Scanner scan = new Scanner(System.in);
//		Stickings s = new Stickings();
//		int stickingLength = scan.nextInt();
//		Random r = new Random();
//		System.out.println("Enter sticking length");
//
//		for(int i = 0; i < stickingLength; i++) {
//			System.out.print(s.stickings[r.nextInt(2)]);
//		}
//	}

}

//how to not have to use diff scanners/random/stickings s/ for each method?
