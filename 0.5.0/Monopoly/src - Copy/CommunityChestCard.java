
public class CommunityChestCard
{
	public String message;
	public CommunityChestCard next;
	public Card_Operation operation;
	ChanceCard(String message,CommunityChestCard next,Card_Operation operation)
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
