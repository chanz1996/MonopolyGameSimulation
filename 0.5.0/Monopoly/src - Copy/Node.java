public class Node
{
    public Node next;
    public String name;
    public Node()
    {
        
    }
    public Node(String name,Node next)
    {
        this.name=name;
        this.next=next;
    }
    public Node(String name)
    {
        this.name=name;
        
    }
   
    public String getName()
    {
        return name;
    }

    public void visit(Player p)
    {

    }
}
