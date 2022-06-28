import java.util.Random;

public class Main {
	
	static char[] sticking = {'R', 'L','r','l'};
	static Random r = new Random();
	static int stickingLength;
	static char ranSticking = sticking[r.nextInt(4)]; //problem is with strings vs chars here?
	static int oldRanNum = r.nextInt(sticking.length);
	static int newRanNum = r.nextInt(sticking.length);
	static String fullBeat = (numStrokes(7)); 
	static String fullBeatSticking;

	public static void main(String[] args) {
//		reverse();
		numBeats(7);
		limitConsectutiveStrokes();
	}


	public static String numStrokes(int a) {
		for(int i = 0; i < a; i++) {
			ranSticking = sticking[r.nextInt(4)];
			fullBeatSticking += ranSticking;
		}
		return fullBeatSticking;
	}
	
	private static void limitConsectutiveStrokes() {
		String strokeLog = "";
		for(int i = 0; i < sticking.length; i++) {
//			strokeLog = strokeLog + fullBeatSticking.charAt(i);
		}
		System.out.println(strokeLog);
	}


	public static void numBeats(int numBeats) {
		int x = 0;
		while(x < numBeats) {
		System.out.print(fullBeat);
		System.out.print(" ");
		x++;
		}
	}
	

}

//	public static void reverse() {
//		for(int i = sticking.length - 1; i >= 0; i--) {
//			do {
//				
//			}
//		}
//	}




	


