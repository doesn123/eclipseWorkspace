public class PlayerChooser {

    private TennisPlayer[] playerList;

	public PlayerChooser() {
        this.playerList = [
            new Player('nameA', 22, 'Male', 50),
            new Player('nameB', 33, 'Male', 55),
            new Player('nameC', 32, 'Male', 23),
            new Player('nameD', 25, 'Female', 74)
        ]
    }


    public TennisPlayer selectPlayer {
        System.out.println("Choose a player...");
        
        for(var i = 0; i < this.playerList.length; i++) {
            System.out.println(i + this.playerList[i]);
        }
        char choice = scan.nextLine().charAt(0);
		switch(choice) {
            this.playerList[choice;]


		// case 'a': 
		// 	System.out.println("You have chosen player " + this.name);
		// 	break;
		// case 'b': 
		// 	System.out.println("You have chosen " + this.name);
		// 	break;
					
		}
    }
}