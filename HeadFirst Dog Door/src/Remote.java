
public class Remote {
	public DogDoor door;
	
	public Remote(DogDoor door) {
		this.door = door;
	}
	
	public void pressButton() {
		System.out.println("Pressing the remote control button");
		if(door.isOpen()) {
			door.open();
		} else {
			door.close();
		}
	}
}
