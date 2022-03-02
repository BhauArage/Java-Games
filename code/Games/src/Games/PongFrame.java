package Games;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PongFrame extends JFrame {
    Pongpanel panel;
    JButton back=new JButton();
    JFrame frame=new JFrame();
    PongFrame(){
        panel=new Pongpanel();
        frame.add(panel);
        frame.setTitle("Pong Game");
        frame.setResizable(false);
        frame.setBackground(Color.black);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        back.setText("Back");
        back.setBackground(Color.white);
        back.setFont(new Font("Bauhaus 93",Font.PLAIN,30));

        frame.add(back,BorderLayout.PAGE_END);
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                frame.dispose();
                new MainFrame();
            }
        });
    }
}
