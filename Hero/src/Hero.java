
public class Hero extends Person {
	String power;
	
	Hero(int age, int height, String power){
		super(age,height);
		this.power = power;
	}
	public String toString() {
		return super.toString() + this.power + "\n";
		
	}
}
