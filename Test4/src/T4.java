
public class T4 {

	public static void main(String[] args) {
		GoPlayer[] listOfGoPlayers = new GoPlayer[2];
		GoPlayer george = new GoPlayer(30, "just amazing");
		listOfGoPlayers[0] = george;
		GoPlayer Kim = new GoPlayer(34, "he's ok");
		listOfGoPlayers[1] = Kim;
		System.out.println(listOfGoPlayers[0].age);
		System.out.println(listOfGoPlayers[1].age);
		
		
	}

}
