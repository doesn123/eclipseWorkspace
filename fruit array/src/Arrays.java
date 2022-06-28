
public class Arrays {

	public static void main(String[] args) {
		String[] fruits = new String[4];
		fruits[0] = "Bananna";
		fruits[1] = "Apple";
		fruits[2] = "Pear";
		fruits[3] = "Mango";
		
		for(int i = 0; i <= 3; i++) {
			System.out.println(fruits[i]);
			System.out.println(); 
			for(int j = 0; j <= i; j++) {
				System.out.print(".");
			}	
		}

	}

}
