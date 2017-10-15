import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;

public class GameGUI
{

    private JFrame frame;

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
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frame = new JFrame();
        
        frame.setBounds(100, 100, 999, 814);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(48, 55, 271, 262);
        
        lblNewLabel.setIcon(new ImageIcon(GameGUI.class.getResource("/Monopoly/img/board.jpg")));
        frame.getContentPane().add(lblNewLabel);
        
        
    }
}
