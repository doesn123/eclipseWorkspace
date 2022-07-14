package stiickingApp3;

import java.util.Random;

public class Sticking {
	
	private char[] stroke = {'R','r','L','l'};
//	private int length = 4;
	private boolean accent;
//	int stickingLength = r.nextInt(length);
	
	public void printSticking(int length) {
		Random r = new Random();
		for(int i = 0; i < length; i++) {
			int randomSticking = r.nextInt(stroke.length);
			System.out.print(stroke[randomSticking]);
		}
	}
	
}
