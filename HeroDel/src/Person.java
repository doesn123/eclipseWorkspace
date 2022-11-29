
public class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	

	public static void main(String[] args) {
		Hero h1 = new Hero("Batman", 42, "everything");
		System.out.println(h1.age);
		System.out.println(h1.toString());
	}

}
