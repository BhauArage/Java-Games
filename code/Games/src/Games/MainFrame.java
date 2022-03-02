package Games;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class MainFrame implements ActionListener  {
    JFrame frame=new JFrame();
    JPanel title_pane=new JPanel();
    JLabel textfield = new JLabel();
    JButton buttonlist[]=new JButton[4];
    JPanel button_panel = new JPanel();

    MainFrame(){
        frame.setTitle("Nostalgia Games");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500,50,600, 600);
        frame.setBackground(Color.BLACK);
        //frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(Color.black);
        textfield.setForeground(Color.red);
        textfield.setFont(new Font("Bauhaus 93", Font.PLAIN, 75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Nostalgia Games");
        textfield.setOpaque(true);
        title_pane.add(textfield);
        title_pane.setBackground(Color.black);
        button_panel.setLayout(new GridLayout(4, 1));
        button_panel.setBackground(Color.black);


        for(int i=0;i<4;i++){
            buttonlist[i]=new JButton();
            buttonlist[i].addActionListener(this);
            buttonlist[i].setFont(new Font("Bauhaus 93", Font.PLAIN, 55));
            buttonlist[i].setForeground(Color.white);
            buttonlist[i].setBackground(Color.black);
            if(i==0)
                buttonlist[i].setText("Snakey");
            if(i==1)
                buttonlist[i].setText("TicTacToe");
            if(i==2)
                buttonlist[i].setText("Pong Game");
            if(i==3)
                buttonlist[i].setText("Exit");
            buttonlist[i].setVisible(true);
            buttonlist[i].setBounds(1,1,100,100);
            button_panel.add(buttonlist[i]);}
        button_panel.setBounds(4,1,300,300);

        frame.add(title_pane,BorderLayout.NORTH);
        frame.add(button_panel,BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        if (e.getSource() == buttonlist[0])
            SnakeGame.mainS();
        if (e.getSource() == buttonlist[1])
            TicTacToeGame.mainT();
        if (e.getSource() == buttonlist[2])
            PongGame.mainP();
        if (e.getSource() == buttonlist[3])
            System.exit(0);
            //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        new MainFrame();
    }
}