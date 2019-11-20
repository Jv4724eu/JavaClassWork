package WEEK8_GUI.currencyConverter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class CurrencyConverter extends JFrame {
    private JPanel mainPanel;
    private JTextField dollarsTextField;
    private JButton convertButton;
    private JLabel conversionResultLabel;
    //combo boxes can use generics to only display obe type of object
    private JComboBox <String> currencyComboBox;


    private double dollarsToEurosExchangeRate = .84; // 1 dollar = .84 euros
    private double dollarsToPoundsExchangeRate = .74; //1 dollar  = .74 UK pounds

    //HOW COULD YOU KEEP THIS PROGRAM UP TO DATE WITH LATEST EXCHANGE RATES?

    //constants to dislay the jComboBox & kets ub tge exchange rates hash map
    private final String EUROS = "Euros";
    private final String POUNDS = "pounds";

    private HashMap<String, Double> exchangeRates = new HashMap<>();





    CurrencyConverter(){
        setContentPane(mainPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //will click convert button when user presses enter
        getRootPane().setDefaultButton(convertButton);

        //set up exchange rates HashMap - will refer to this when conversion is performed
        exchangeRates.put(EUROS, dollarsToEurosExchangeRate);
        exchangeRates.put(POUNDS, dollarsToPoundsExchangeRate);

        //set up JComboBox - add the options
        currencyComboBox.addItem(EUROS);
        currencyComboBox.addItem(POUNDS);


        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //read input from text field and convert to a double
                String dollarString = dollarsTextField.getText();
            try {
                double dollars = Double.parseDouble(dollarString);
                String toCurrency = (String) currencyComboBox.getSelectedItem(); //convert selected from combo box as key

                //Get exchange rate for ths currency from the hashmap using whatever was selected from combo box key
                double exchangeRate = exchangeRates.get(toCurrency);

                //the MATH
                double converted = dollars * exchangeRate;



                //use format string to show the values with 2 decimal places
                String resultString = String.format("%.2f dollars is equal to %.2f %s", dollars, converted, toCurrency);
                conversionResultLabel.setText(resultString);
            } catch (NumberFormatException nfe){
                //pop up a dialog box with an error message
                JOptionPane.showMessageDialog(CurrencyConverter.this, "ERROR, MUST ENTER NUMBER");

                //sometimes you might want to clear the JtextField of the invalid input like this
                //dollarsTextField.setText("");
                //this program it is not needed so user can see whats typed and correct it
            }
            }
        });


    }
}
