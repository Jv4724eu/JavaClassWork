package WEEK10_MOREGUI.ToDoListGUI;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ToDoList extends JFrame {
    private JPanel rootPanel;
    private JTextField newToDoTextField;
    private JButton addToDoButton;
    private JList<String> toDoList;
    private JButton deleteSelectedButton;

    private DefaultListModel<String> listModel; //model to provide Jlist with data

    protected  ToDoList(){
        setContentPane(rootPanel);
        setPreferredSize(new Dimension(500,500));

        listModel = new DefaultListModel<>();
        //create a listModdel. The list starts Empty and model contains no data
        //when you add data to this list, you actually to to add it to the lists *model*

        //Configure JList to use this model as its data source
        toDoList.setModel(listModel);

        //single selection model user can only select one thing at a time
        toDoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


        addListeners(); //method to hold event listeners

        //Configure the submitButon to be the default button that is clicked when the
        // user presses the enter key
        getRootPane().setDefaultButton(addToDoButton);

        pack(); //arrange components in the GUI
        setVisible(true); //default Jframe is not visible

        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    private void addListeners(){
        //need to listen for button clicked
        //read the text in the text box and add this to the list

        addToDoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newToDo = newToDoTextField.getText();
                newToDo = newToDo.trim();

                //was some of text entered but not all?
                if (newToDo.isEmpty()){
                    //show pop up
                    JOptionPane.showMessageDialog(ToDoList.this, "Enter a to do item.");
                } else {
                    listModel.addElement(newToDo); // add new item to the Jlist model
                    newToDoTextField.setText(""); //clear the Jtextfield
                }
            }
        });
        //create a menu and new listener for the menu item
        JPopupMenu rightClickMenu = new JPopupMenu();
        JMenuItem deleteMenuItem= new JMenuItem("Delete");
        rightClickMenu.add(deleteMenuItem);

        deleteMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //delete
                deleteSelected();
            }
        });
        //associate the popup menu with the Jlist
        toDoList.setComponentPopupMenu(rightClickMenu);

        //add a mouse listener to select an item in the list when the user right clicks.
        //the list items are only selected with left clocks. so w/o this, the pop up will
        //be associated with the correct item, but that item wont automatically be selected
        //when the user right clocks on it - whatever was last selected would still be selected
        //which would be confusing

        toDoList.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selection = toDoList.locationToIndex(e.getPoint());
                toDoList.setSelectedIndex(selection);
            }
            //even though we dont need these events to do anything they are still required
            //to provide the methods
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });

        deleteSelectedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //what was selected?
                int selectedIndex = toDoList.getSelectedIndex(); //ask the List what is selected
                if (selectedIndex != -1) {
                    listModel.remove(selectedIndex); //Remove item from the MODEL
                } else {
                    JOptionPane.showMessageDialog(ToDoList.this, "Please select an item to delete ");
                }
            }
        });

       /** //and listen for the list being clicked on which should remove selected item
        toDoList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                //what was selected?
                int selectedIndex = toDoList.getSelectedIndex(); //ask the List what is selected
                if(selectedIndex != -1){
                    listModel.remove(selectedIndex); //Remove item from the MODEL
                }
            }
        }); **/


       }

       private void deleteSelected(){
        int selectedIndex = toDoList.getSelectedIndex(); // ask the LIST what is selected
        if (selectedIndex == -1){
            JOptionPane.showMessageDialog(this, "Select an item to delete");
        } else {
            String deleteItem = toDoList.getSelectedValue();
            if(JOptionPane.showConfirmDialog(this, "Delete" + deleteItem + "?", "Delete", JOptionPane.OK_CANCEL_OPTION)
                == JOptionPane.OK_OPTION){
                listModel.remove(selectedIndex); //remove this item from the MODEL
            }
        }
       }
    }
