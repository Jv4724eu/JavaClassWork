package WEEK11_MOREDATABASE;

import javax.swing.*;
import java.util.List;

public class PlaceGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField placeNameText;
    private JTextField elevationText;
    private JButton addButton;
    private JButton deleteSelectedButton;
    private JList<Place> placeList;

    private Controller controller;

    private DefaultListModel<Place> allPlacesListModel;

    PlaceGUI(Controller controller){

        //store reference to the controller object
        //use to make request to the controller which will forward requests to DB
        this.controller = controller;

        //configure list model
        allPlacesListModel = new DefaultListModel<>();
        placeList.setModel(allPlacesListModel);

        createUIComponents();



        setDefaultCloseOperation((WindowConstants.EXIT_ON_CLOSE));
        setContentPane(mainPanel);
        pack();
        setVisible(true);
    }

    void setListData(List<Place> data){
        //convience method to update list
        //clear list model, and display all plaec data in Jlist
        allPlacesListModel.clear();

        if(data != null){
            for(Place place : data){
                allPlacesListModel.addElement(place);
            }
        }
    }

    private void createUIComponents() {

    }
}
