
public class Node_Utility extends Node
{
    Player owner;
    int price;
    int rent;
    public void visit(Player p)
    {
        
    }
    public int rent()
    {
        return rent;
    }
    public Node_Utility(String placename,int price,int rent,Node next)
    {
        super(placename,next);
        this.price=price;
        this.rent=rent;
    }
    
}
/*
Kings Cross Station *4
Electric Company
Water Works

*/