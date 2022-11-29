import java.util.Scanner;

public class Player {
	
	private String name;
//	enum gender = MALE, FEMALE;
	private String gender;
	private int age;
	private String nationality;
	private int seeded;
	private int prizeMoney;
	
	int chanceOfFirstServeIn;
	
	public Player(String name, int age, String gender, int chanceOfFirstServeIn) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.chanceOfFirstServeIn = chanceOfFirstServeIn;
		}
	
//players in enum class?
	

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
