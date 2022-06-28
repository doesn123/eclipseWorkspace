
public class Student {
	String address;
	int age;
	public static void main(String[] args) {
		
		Student s = new Student("washw", 29);
		System.out.println(s.getAddress());
		System.out.println(s.getAge());
	}
	
	Student(String address, int age) {
		this.address = address;
		this.age = age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void rt(int tyty) {
		age = tyty;
	}
}