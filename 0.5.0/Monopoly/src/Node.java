
public class Node
{
    public Node next;
    public String name;
    
    public class Position
    {
        public int x;
        public int y;
        public boolean occupied = false;
    }

    public Position[] pos = new Position[4];
    
    
    {
        pos[0]=new Position();
        pos[1]=new Position();
        pos[2]=new Position();
        pos[3]=new Position();
        
    }
    
    public Node()
    {

    }

    public Node(String name, Node next)
    {
        this.name = name;
        this.next = next;
    }

    public Node(String name)
    {
        this.name = name;

    }

    public Position position(int index)
    {
        return pos[index];
    }

    public String getName()
    {
        return name;
    }

    public void visit(Player p)
    {

    }

}
