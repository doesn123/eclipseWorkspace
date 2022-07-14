player.java:
public class Player 
{
    public static void main(String[] args) {
        Player player = new Player();
    }
    public int getLocation()
    {
         return 2;
    }
}

monster.java:
public class Monster
{
    public void attackPlayer()
    {
        player.getLocation();
    }
}