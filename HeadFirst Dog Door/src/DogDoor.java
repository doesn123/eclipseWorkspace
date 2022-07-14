
public class DogDoor {
	boolean open;
	
	public DogDoor() {
		this.open = false;
	}
	
	public void open() {
		System.out.println("the door opens");
		open = true;
	}
	
	public void close() {
		System.out.println("the door closes");
		open = false;
	}
	
	public boolean isOpen() {
		return open;
	}
}
