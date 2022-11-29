public class ReverseIt {	

	public static void main(String[] args) {
		ReverseIt rI = new ReverseIt();
		String r = "Hello there my friend";
		System.out.println(rI.reverse(r));
		
	}

	private String reverse(String string) {
		char[] letters = new char[string.length()];
			int index = 0;
		for(int i = string.length()-1; i >= 0; i--) {
			letters[index] = string.charAt(i);
			index++;
		}
		
		String reversedString = "";
		for(int i = 0; i < string.length(); i++) {
			reversedString += letters[i];
		}
		
		return reversedString;
	}
}



	


			
	
		
	


	 
