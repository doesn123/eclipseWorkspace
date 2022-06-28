
public class Shirts {
	
	public static String color;
	public static char size;
	public static void putOn() {
		System.out.println("the shirt is on");
	}
	
	public static void setColor() {
		System.out.println("the shirt now has a color");
	}
	
	public static void setSize(char newSize) {
		size = newSize;
		System.out.println("the size is: " + size);
	}
	
	public static void setColor(String newColor) {
		color = newColor;
	}
	
//	Shirts() {}
	
	Shirts(String newColor, char newSize) {
		color = newColor;
		size = newSize;
	}
}

