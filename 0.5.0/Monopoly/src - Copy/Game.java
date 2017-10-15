import java.util.*;
public class Game
{
	Board b=new Board();
	public static void main(String[] args)
	{
		Board b=new Board();
	    int i;
	    Player[] players=createPlayers();
		int no_players=players.length;
		Node n=b.start();
		
		
	}
	public static Player[] createPlayers()
	{
		Board b=new Board();
	    int i;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of players");
        int no_players=sc.nextInt();
        Player[] players=new Player[no_players];
        
        for( i=0;i<no_players;i++)
        {
            System.out.println("Enter the name of player "+(i+1));
            players[i]=new Player(sc.next());
            players[i].currentlocation=b.start();
        }
        for(i=0;i<no_players-1;i++)
        {
            players[i].setNext(players[i+1]);
        }
        players[no_players-1].setNext(players[0]);
        return players;
	}
}