import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class Main {


	
	public static void main(String[] args) {
		MountainBike m = new MountainBike(45,56,12);
		System.out.println("gear is: " + m.gear);
		System.out.println("seat height is: " + m.seatHeight);
		
	}

	public void speedUp(int increment) {
		speed += increment;
	}
	
	public void slowDown(int decrement) {
		speed -= decrement;
	}
	
}
