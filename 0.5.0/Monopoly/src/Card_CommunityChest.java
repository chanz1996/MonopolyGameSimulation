
public class Card_CommunityChest
{
	public String message;
	public Card_CommunityChest next;
	public Card_Operation operation;
	Card_CommunityChest(String message,Card_CommunityChest next,Card_Operation operation)
	{
		this.message=message;
		this.next=next;
		this.operation=operation;
	}
	public void run(Player p)
	{
		//some other GUI stuff, display 
		operation.run(p);
	}
}
