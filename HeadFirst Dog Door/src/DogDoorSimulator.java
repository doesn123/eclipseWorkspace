
public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		System.out.println("Fido wants to go outside");
		remote.pressButton();
		System.out.println("\nFido has gone outside");
		remote.pressButton();
		System.out.println("Fido wants to come inside");
		remote.pressButton();
		System.out.println("Fido is back inside");
		remote.pressButton();
	}

}
