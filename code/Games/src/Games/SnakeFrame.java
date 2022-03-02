package Games;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SnakeFrame  extends JFrame {
    JButton back=new JButton();
    JFrame frame=new JFrame();
    SnakeFrame(){
        frame.add(new SnakePanel());
        frame.setTitle("Snakey");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        back.setText("Back");
        back.setBackground(Color.white);
        back.setFont(new Font("Bauhaus 93",Font.PLAIN,30));
        frame.add(back, BorderLayout.PAGE_END);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

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
