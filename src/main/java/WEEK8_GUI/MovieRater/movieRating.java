package WEEK8_GUI.MovieRater;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class movieRating extends JFrame {
    private JPanel mainPanel;
    private JTextField movieTitleTextField;
    private JLabel MovieTitle;
    private JSlider ratingSlider;
    private JLabel sliderValueLabel;
    private JCheckBox wouldSeeAgainCheckBox;
    private JTextField movieOpinionTextField;
    private JButton quitProgram;

    movieRating() {
        setContentPane(mainPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        configureEventHandlers();


    }

    private void configureEventHandlers() {
        //Moving rating slider updates slider value label & opnion string

        ratingSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                String valueLabelText = ratingSlider.getValue() + "Stars";
                sliderValueLabel.setText(valueLabelText);
                updateOpinion();
            }
        });
        //checkbox change listener - updates the opnion string
        wouldSeeAgainCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) { updateOpinion();}
        });
        //typing in the text box - add a listner to the jtextbox doc
        //update the opnion string as the user types or deletes messages

        movieTitleTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                //called when user types or adds text
                updateOpinion();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //called when user deletes text
                updateOpinion();

            }

            @Override
            public void changedUpdate(DocumentEvent e) {} // method is needed  - no code
        });

        quitProgram.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(JOptionPane.showConfirmDialog(movieRating.this, "Are you sure you want to quit?",
                        "Quit", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
                    System.exit(0);
                }
            }
        });
    }

    private void updateOpinion(){
        String title = movieTitleTextField.getText();

        //if movie is blank clear opinion text
        if (title.trim().length() == 0){
            movieOpinionTextField.setText(("Enter a movie title"));
        }
        else {
            int rating = ratingSlider.getValue();
            boolean seeAgain = wouldSeeAgainCheckBox.isSelected();
            String template = "You rated '%s' %d stars. You %s see again";
            String seeAgainStr = seeAgain ? "would" : "would not";
            String opinion = String.format(template,title,rating,seeAgainStr);
            movieOpinionTextField.setText(opinion);
        }

    }
}
