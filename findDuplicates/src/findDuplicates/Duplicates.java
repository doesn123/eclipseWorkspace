package findDuplicates;

public class Duplicates {

	public static void main(String[] args) {
	String sentence = "How many duplicates are there?";
	String duplicates = "";
	String characters = "";
	
		for(int i = 0; i < sentence.length(); i++) {
			String current = Character.toString(sentence.charAt(i));
			if(characters.contains(current)) {
				if(!duplicates.contains(current)) {
					duplicates += current;
				}
			}
			characters += current;
	
		}
		System.out.println(duplicates);
	}
}