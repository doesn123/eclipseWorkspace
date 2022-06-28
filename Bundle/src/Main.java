import java.util.ArrayList;
import java.util.Random;

//to do - choose random element that hasn't been chosen before
public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<String> activitySeated = new ArrayList<String>();
		System.out.println("What activity are you starting?");
		System.out.println("A) Audiobook");
		System.out.println("B Film");
		System.out.println("");
		
		//Stretches
		activitySeated.add("Stretch: namaste behind back");
		activitySeated.add("Stretch: with stick behind back");
		activitySeated.add("Stretch: with sticks out in front");
		activitySeated.add("Stretch: wrists");
		activitySeated.add("Stretch: fingers");
		
//		for(String i : activitySeated) {
//			System.out.println(i);
//		}
		System.out.println("");
		
		String activitySeatedChosen[] = {};
	
		
		String activitySeatedRandom = activitySeated.get(rand.nextInt(activitySeated.size()));
		for(String i : activitySeated) {
		if(activitySeatedChosen.contains(activitySeatedRandom)) {
			;
			} else {
			activitySeatedChosen.add(activitySeatedRandom);			
			System.out.println("Random activitySeated = " + activitySeatedRandom);
			}
		}
		
		
		ArrayList<String> activityNotSeated = new ArrayList<String>();
		activityNotSeated.add("Stretch: use yoga strap");
		activityNotSeated.add("Stretch: lotus position");
		
//		for(String i : activityNotSeated) {
//			System.out.println(i);
//		}
		
	}

}
