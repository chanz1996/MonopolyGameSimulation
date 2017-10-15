
public class Node_Tax extends Node
{
    public int tax;
    public Node_Tax(String placename,int tax,Node next)
    {
        super(placename,next);
        this.tax=tax;
    }
    public void visit(Player p)
    {
        p.money-=tax;
    }
}
