
public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("Ford", "Mustang", 2006);
		Car car2 = new Car("Chevrolet", "Camaro", 2021);
		
		car1.copy(car2);
//		car1.setMake("gh");
		System.out.println(car1.getMake());
		System.out.println(car1);
		System.out.println(car1.getModel());
	}

}
