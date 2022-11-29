import java.util.Timer;
import java.util.TimerTask;

public class Test33 {

	public static void main(String[] args) {
		Integer[] intArray = {54,5,2};
		double[] doubleArray = {3.23,3,55};
		displayArray(intArray);
		
		TimerTask tt = new TimerTask() {

			@Override
			public void run() {
				System.out.println("running");
				
			}
			
		};
		Timer t = new Timer();
		t.schedule(tt, 5005);
		int counter = 9999;
			System.out.println(counter);
			counter++;

	}
	
	static void displayArray(Integer[] array) {
		for(Integer x : array) {
			System.out.print(x);
		}
	}
	

}
