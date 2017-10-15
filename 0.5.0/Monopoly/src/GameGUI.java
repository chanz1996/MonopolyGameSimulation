import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class GameGUI
{

    private JFrame frame;
    int screenHeight;
    int screenWidth;
    JPanel lblNewLabel;
    private JLayeredPane lpane = new JLayeredPane();
    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    GameGUI window = new GameGUI();
                    window.frame.setVisible(true);
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public GameGUI()
    {
        initialize();
        test();
        
        
    }
    public void test()
    {
        Board b=getPositions();
        Node n=b.start();
        for(int i=0;i<40;i++)
        {
            for(int j=0;j<4;j++)
            {
        JPanel test = new ImagePanel("img/test.png",(int)(screenHeight*0.020),(int)(screenHeight*0.020));
       
       
        test.setBounds(n.position(j).x, n.position(j).y,(int)(screenHeight*0.020),(int)(screenHeight*0.020));
        test.setVisible(true);
        lpane.add(test,new Integer(j+1), 0);
            }
        System.out.println(n.position(0).x+" "+n.position(0).y);
        n=n.next;
       
        //test.setEnabled(true);
        //System.out.println(test.isShowing());
        
        }
        
        
        frame.pack();
    }
    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screenHeight = screenSize.height;
        screenWidth = screenSize.width;
        frame = new JFrame();

        frame.setBounds(0, 0, screenWidth, screenHeight);
        frame.setUndecorated(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        lpane.setBounds(0, 0, screenHeight, screenHeight);
        frame.add(lpane);
        lblNewLabel = new ImagePanel("img/board.jpg",screenHeight,screenHeight);
        lblNewLabel.setBounds(0, 0, screenHeight, screenHeight);
        //lblNewLabel.setOpaque(false);
        lpane.add(lblNewLabel,new Integer(0), 0);
        
        

    }
    public static Board getPositions()
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
        double  delta=0.086;
        double delval=0.00125;
        node=b.place("Old Kent Road");
        initx=0.83;
        for (i = 0; i < 9; i++)
        {
            node.position(1).x = (int) (height * initx);
            node.position(3).x = (int) (height * initx);
            node.position(0).x = (int) (height * (initx-0.035));
            node.position(2).x = (int) (height * (initx-0.035));
            delta -=delval;
            initx -=delta;
            node = node.next;
        }
        delta=0.086;
        node=b.place("Pall Mall");
        inity=0.83;
        for (i = 0; i < 9; i++)
        {
            node.position(2).y = (int) (height * inity);
            node.position(3).y = (int) (height * inity);
            node.position(0).y = (int) (height * (inity-0.035));
            node.position(1).y = (int) (height * (inity-0.035));
            delta -=delval;
            inity -=delta;
            node = node.next;
        }
        delval=0.001;
        node=b.place("Strand");
        delta=0.086;
        initx=0.14;
        for (i = 0; i < 9; i++)
        {
            node.position(0).x = (int) (height * initx);
            node.position(2).x = (int) (height * initx);
            node.position(1).x = (int) (height * (initx+0.04));
            node.position(3).x = (int) (height * (initx+0.04));
            delta -=delval;
            initx +=delta;
            node = node.next;
        }
        node=b.place("Regent Street");
        delta=0.086;
        inity=0.14;
        for (i = 0; i < 9; i++)
        {
            node.position(0).y = (int) (height * inity);
            node.position(1).y = (int) (height * inity);
            node.position(2).y = (int) (height * (inity+0.04));
            node.position(3).y = (int) (height * (inity+0.04));
            delta -=delval;
            inity +=delta;
            node = node.next;
        }
        return b;
    }

    public class ImagePanel extends JPanel
    {

        private Image image;

        public ImagePanel(String img,int intx,int inty)
        {
            
            try
            {
                image = ImageIO.read(new File(img));
                image = image.getScaledInstance(intx, inty,
                        Image.SCALE_DEFAULT);
            } catch (IOException ex)
            {
                System.out.println("Blah");
            }
        }

        @Override
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, null); // see javadoc for more info on the
                                            // parameters
        }

    }
}


