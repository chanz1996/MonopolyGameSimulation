
public class Card_Chance 
{
	public String message;
	public Card_Chance next;
	public Card_Operation operation;
	Card_Chance(String message,Card_Chance next,Card_Operation operation)
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
