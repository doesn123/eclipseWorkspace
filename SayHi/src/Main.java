
public class Main {

	public static void main(String[] args) {
		countDown(100);

	}

	private static void countDown(int n) {
		if(n == 0) {
			System.out.println("Done");
		} else {
			System.out.println(n);
			n--;
			countDown(n);
			
		}
		
	}

}
