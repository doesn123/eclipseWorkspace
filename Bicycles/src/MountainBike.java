
public class MountainBike extends Bicycle {
	int seatHeight;
	
	public MountainBike(int startSpeed, int startHeight, int startGear) {
		super(startSpeed, startGear);
		speed = startSpeed;
		gear = startGear;
		seatHeight = startHeight;
	}
}
