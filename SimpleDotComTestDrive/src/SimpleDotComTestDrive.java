
public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2,3,4};
		dot.setLocations(locations);
		
		String userGuess = 2;
		dot.checkYourself(userGuess);
		
		String testResult = "failed";
		if(testResult == "hit") {
			testResult = "passed";
		}
		System.out.println(testResult);
	}

}
