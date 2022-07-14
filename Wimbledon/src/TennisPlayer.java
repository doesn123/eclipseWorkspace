
public class TennisPlayer {
	private String name;
//	enum gender = MALE, FEMALE;
	private String gender;
	private int age;
	private String nationality;
	private int seeded;
	private int prizeMoney;
	
	//gamePlay
	int chanceOfFirstServeIn;
	
	public TennisPlayer(String name, int age, String gender, int chanceOfFirstServeIn) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.chanceOfFirstServeIn = chanceOfFirstServeIn;	}
	//use setters above instead of this.name etc
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
