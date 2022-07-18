import java.util.Scanner;

public class TennisPlayer {
	
	static Scanner scan = new Scanner(System.in); 
	private String name;
//	enum gender = MALE, FEMALE;
	private String gender;
	private int age;
	private String nationality;
	private int seeded;
	private int prizeMoney;
	
	int chanceOfFirstServeIn;
	
	public TennisPlayer(String name, int age, String gender, int chanceOfFirstServeIn) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.chanceOfFirstServeIn = chanceOfFirstServeIn;
		}
	
//players in enum class?
	
	public void choosePlayer() {
		System.out.println("Choose your player\nNovak Djokovic, 35, male, 71");
		System.out.println("Nick Kygrios, 26, male, 65)");
		char choice = scan.nextLine().charAt(0);
		switch(choice) {
		case 'a': 
			System.out.println("You have chosen player " + this.name);
			break;
		case 'b': 
			System.out.println("You have chosen " + this.name);
			break;
					
		}
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
}
