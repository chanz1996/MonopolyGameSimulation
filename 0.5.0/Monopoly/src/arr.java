
import java.awt.Dimension;
import java.awt.Toolkit;

public class arr
{
    public static void main(String[] args)
    {
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        int i;
        Board b = new Board();
        Node node = b.start();
        // bottom row
        double initx;
        double inity;
        
        for (i = 0; i < 11; i++)
        {
            //System.out.println(node.name);
            node.position(0).y = (int) (height * 0.93);
            node.position(1).y = (int) (height * 0.93);
            node.position(2).y = (int) (height * 0.95);
            node.position(3).y = (int) (height * 0.95);
            node = node.next;
            
        }
        // System.out.println(node.name);
        node=b.place("Jail");
        // left column
        for (i = 0; i < 11; i++)
        {
            //System.out.println(node.name);
            node.position(0).x = (int) (height * 0.03);
            node.position(2).x = (int) (height * 0.03);
            node.position(1).x = (int) (height * 0.05);
            node.position(3).x = (int) (height * 0.05);
            node = node.next;

        }

        node=b.place("Free Parking");
        // top row
        for (i = 0; i < 11; i++)
        {
           // System.out.println(node.name);
            node.position(0).y = (int) (height * 0.03);
            node.position(1).y = (int) (height * 0.03);
            node.position(2).y = (int) (height * 0.05);
            node.position(3).y = (int) (height * 0.05);
            node = node.next;

        }

       
        // right column
        node=b.place("Go to Jail");
        for (i = 0; i < 11; i++)
        {
           // System.out.println(node.name);
            node.position(0).x = (int) (height * 0.93);
            node.position(2).x = (int) (height * 0.93);
            node.position(1).x = (int) (height * 0.95);
            node.position(3).x = (int) (height * 0.95);
            node = node.next;

        }
        node=b.place("Old Kent Road");
        initx=0.83;
        for (i = 0; i < 9; i++)
        {
            node.position(1).x = (int) (height * initx);
            node.position(3).x = (int) (height * initx);
            node.position(0).x = (int) (height * (initx-0.04));
            node.position(2).x = (int) (height * (initx-0.04));
            initx -=0.086;
            node = node.next;
        }
        node=b.place("Pall Mall");
        inity=0.83;
        for (i = 0; i < 9; i++)
        {
            node.position(2).y = (int) (height * inity);
            node.position(3).y = (int) (height * inity);
            node.position(0).y = (int) (height * (inity-0.04));
            node.position(1).y = (int) (height * (inity-0.04));
            inity -=0.086;
            node = node.next;
        }
        node=b.place("Strand");
        initx=0.14;
        for (i = 0; i < 9; i++)
        {
            node.position(0).x = (int) (height * initx);
            node.position(2).x = (int) (height * initx);
            node.position(1).x = (int) (height * (initx+0.04));
            node.position(3).x = (int) (height * (initx+0.04));
            initx +=0.086;
            node = node.next;
        }
        node=b.place("Regent Street");
        inity=0.14;
        for (i = 0; i < 9; i++)
        {
            node.position(0).y = (int) (height * inity);
            node.position(1).y = (int) (height * inity);
            node.position(2).y = (int) (height * (inity+0.04));
            node.position(3).y = (int) (height * (inity+0.04));
            inity +=0.086;
            node = node.next;
        }
        
    }

}
