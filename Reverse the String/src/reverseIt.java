public class reverseIt {
	

	public static void main(String[] args) {
		String r = reverse("My name is George");
		System.out.println(r);
	}
	
	public static String reverse(String s) {
		char letters[] = new char[s.length()];
		int index = 0;
		for(int i = s.length()-1; i >= 0; i--) {
			letters[index] = s.charAt(i);
			index++;
		}
		
		String reverse = "";
		for(int i = 0; i < s.length(); i++) {
			reverse += letters[i];
		}
		return reverse;

	}}

	


			
	
		
	


	 
