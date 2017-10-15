public class Player
{
    public int money;
    public Node currentlocation;
	public String name;
	private int jailturnsleft=0;
	public int NoOfHotels = 0;
	public int NoOfHouses = 0;
    private Player next;
	//some DS holding all properties 
	public Player(String name)
	{
		this.name=name;
	}
	public void setNext(Player next)
	{
	    this.next=next;
	}
	public Player getNext()
    {
        return next;
    }
	
	
}