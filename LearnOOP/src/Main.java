
public class Main {

	public static void main(String[] args) {
		Menu m = new Menu();
		
		animalGroup group = animalGroup.FISH;
		
		if(group == animalGroup.FISH) {
			System.out.println("animal group is fish");
		} else {
			System.out.println("animal group is something else");
		}

	}

}
