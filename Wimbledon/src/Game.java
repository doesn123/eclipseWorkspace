public class Game {
	private TennisPlayer t1;
	private TennisPlayer t2;
	
	private String name;
	private int age;
	private String gender;
	private int chanceOfFirstServeIn;
	
	
	public void coinToss() {
		if(Math.random() >= 0.5) {
			System.out.println(t1.getname() + " has won the coin toss");;
		} else {
			System.out.println(t2.getname() + " has won the coin toss");
		}
	}
	
	public Game(TennisPlayer t1, TennisPlayer t2) {
		this.t1 = t1;
		this.t2 = t2;
	}


}
