
public class Main {

	public static void main(String[] args) {
		Garage garage = new Garage();
		Car car1 = new Car("Honda", 23);
		
		System.out.println(car1.age);
		
		garage.park(car1);
	}

}
