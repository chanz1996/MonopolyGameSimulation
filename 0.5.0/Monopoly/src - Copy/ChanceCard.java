
public class ChanceCard 
{
	public String message;
	public ChanceCard next;
	public Card_Operation operation;
	ChanceCard(String message,ChanceCard next,Card_Operation operation)
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
