import java.util.Scanner;

public class PlayerChooser {

	Player player1 = new Player("nameA", 22, "Male", 50);
	Player player2 = new Player("nameB", 52, "Female", 50);
	
    private Player[] playerList = {player1, player2};
    private Scanner scan;
    

	public PlayerChooser(Scanner scanner) {
        this.playerList = [
//            new Player("nameA", 22, "Male", 50);
//            new Player("nameB", 33, "Male", 55);
        ];

        this.scan = scanner;
    }


    public Player selectPlayer() {
        System.out.println("Choose a player...");
        for(var i = 0; i < this.playerList.length; i++) {
            System.out.println(this.playerList[i]);
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
