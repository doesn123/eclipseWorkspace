import java.util.Random;

public class Game {
	
	public boolean coinToss() {
		if(Math.random() >= 0.5) {
			System.out.println(t1.getname() + " has won the coin toss");;
		} else {
			System.out.println(t2.getname() + " has won the coin toss");
		}
	}

}
