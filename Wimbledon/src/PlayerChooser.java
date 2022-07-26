public class PlayerChooser {

    private TennisPlayer[] playerList;
    private Scanner scan;

	public PlayerChooser(Scanner scanner) {
        this.playerList = [
            new Player("nameA", 22, "Male", 50);
            new Player("nameB", 33, "Male", 55);
            new Player("nameC", 32, "Male", 23);
            new Player("nameD", 25, "Female", 74);
        ];

        this.scan = scanner;
    }


    public TennisPlayer selectPlayer {
        System.out.println("Choose a player...");
        for(var i = 0; i < this.playerList.length; i++) {
            System.out.println(i + this.playerList[i]);
        }
        char choice = scan.nextLine().charAt(0);
		switch(choice) {
            case 'a':
		 	    System.out.println("You have chosen player " + this.name);
                // TODO return the player that was selected
		 	    break;
		    case 'b':
		 	    System.out.println("You have chosen " + this.name);
                 // TODO return the player that was selected
		 	    break;
            default:
                System.out.println("You have chosen a name that is not in the list");
		}
    }
}
