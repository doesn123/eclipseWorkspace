
public class Person {
	int age;
	int height;
	
	Person(int age, int height){
		this.age = age;
		this.height = height;
	}
	
	public String toString() {
		return "age = "+this.age + "\n" + "height = "+this.height;
	}
}
