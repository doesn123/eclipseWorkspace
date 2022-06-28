
public class Encrypt {

	public static void main(String[] args) {
		int key = 1;
		String text = "Hello, this is my secret message!";
		char[] chars = text.toCharArray();
		char c = 'u';
		for(c : chars) {
			c += key;
			System.out.println(c);
		}


	}
}
