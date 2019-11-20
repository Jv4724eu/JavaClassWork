package WEEK8_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class helloGUI extends JFrame {

    private JPanel mainPanel;
    private JButton clickMeButtonButton;
    private JLabel myFirstLabel;

    protected helloGUI(){
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(300,500));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        clickMeButtonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //code here will run when button is clicked
                myFirstLabel.setText("Hello GUI program");
                clickMeButtonButton.setText("You Clicked The Button");

            }
        });

    }
}


