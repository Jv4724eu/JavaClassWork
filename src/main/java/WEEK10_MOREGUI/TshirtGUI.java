package WEEK10_MOREGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TshirtGUI extends JFrame {
    private JPanel mainPanel;
    private JComboBox sizeComboBox;
    private JLabel selectedSizeLabel;
    private JComboBox<String> colorComboBox;
    private JLabel selectedColor;


    TshirtGUI(){
        sizeComboBox.addItem("Small");
        sizeComboBox.addItem("Medium");
        sizeComboBox.addItem("Large");

        String[] colors = {"Red", "Purple", "Green"};
        //List<String> moreColors = List.of("Gray","Blue","Orange");
        DefaultComboBoxModel<String> colorModel = new DefaultComboBoxModel<>(colors);
        colorComboBox.setModel(colorModel);
        colorModel.addElement("Pink"); //add to the end




        setContentPane(mainPanel);
        setPreferredSize(new Dimension(300,150));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        sizeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedSizeLabel.setText("You Selected " + sizeComboBox.getSelectedItem());
            }
        });

        colorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedColor.setText("You Selected" + colorComboBox.getSelectedItem());
            }
        });
    }
}
