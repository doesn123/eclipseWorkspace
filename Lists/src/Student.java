
public class Student {

	private String name;
	private int age;
	private String gender;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	Student(String gender) {
		this.gender = gender;
	}
}
