import javax.swing.*;
import java.awt.*;

public class GameFrame {

    JFrame frame;

    GamePanel panel;
    GameFrame()
    {
        frame=new JFrame("PingPong Game");
//        frame.setLayout(null);
        panel=new GamePanel();
        frame.add(panel);
        frame.setBackground(Color.black);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(1010,560);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}