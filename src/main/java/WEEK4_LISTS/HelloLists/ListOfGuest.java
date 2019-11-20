package WEEK4_LISTS.HelloLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static input.InputUtils.stringInput;
import static input.InputUtils.yesNoInput;

public class ListOfGuest {
    public static void main(String[] args) {
        List<String> ListOfNames = new ArrayList<>();

        while (true) {
            String name = stringInput("enter name of guest: ");
            if (name.length() == 0) { //if the user just presses enter, the length of text is 0
                break;
            }
            if (containsIgnoreCase(ListOfNames, name)) {
                System.out.println("You've already entered that."); //checks if what was entered is already in array list
            } else {
                ListOfNames.add(name); //if its not in the array list it is added
            }
        }

        System.out.println("Here is your Guest List in Alphabetical Order: ");
        Collections.sort(ListOfNames);

        for (String task : ListOfNames) { //steps through array list to print entire lis
            System.out.println(task);
        }
        System.out.println("Guest Count: " + ListOfNames.size());

        boolean deleteYN = yesNoInput("Would you like to remove anyone from the guest List?");
        if (deleteYN == true){
            String NameToDelete = stringInput("Enter the name of the guest you would like to remove: ");
            while (ListOfNames.contains(NameToDelete)){
                ListOfNames.remove(NameToDelete);
            }
        }
        if (deleteYN == false) {
            System.out.println("Guest list complete!");
        }

        System.out.println("Here is Your Guest List:");
        Collections.sort(ListOfNames);
        for (String task : ListOfNames){
            System.out.println(task);
        }
        System.out.println("Guest Count: " + ListOfNames.size());



    }

    private static boolean containsIgnoreCase(List<String> ListOfNames, String name) {
        for (String s : ListOfNames) {
            if (s.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false; //if get to end of list w/o returning, its not there
    }
}