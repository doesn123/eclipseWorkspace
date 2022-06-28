package gettersAndSetters;

public class Account {
	
	String name;
	int age;

	public static void main(String[] args) {
		Account a  = new Account();
		a.age = 45;
		a.name = "not George";
		a.setName("George");
		
		a.getDetails();
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void getDetails() {
			System.out.println(age + ", " + name);
		}

	}
}
