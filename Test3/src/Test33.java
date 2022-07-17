
public class Test33 {

	public static void main(String[] args) {

		System.out.println(countA("lfdjgldrjgdlghjaaaaa"));
		System.out.println(square(78));

	}
    public static int countA(String word) {
		int aCounter = 0;
    	for(int i = 0; i < word.length(); i++) {
    		if(word.charAt(i) == 'a' || word.charAt(i) == 'A') {
    			aCounter++;
    		}
    	}
    	return aCounter;
    
    }
    
    public static int square(int numToSquare) {
    	return numToSquare * numToSquare;
    }
}
