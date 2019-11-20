package WEEK4_LISTS.HelloLists;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class ArrayListCase {
    public static void main(String[] args) {
        List<String> toDoList = new ArrayList<>();

        while (true) {
            String data = stringInput("enter item: ");
            if (data.length() == 0) { //if the user just presses enter, the length of text is 0
                break;
            }
            if (containsIgnoreCase(toDoList, data)) {
                System.out.println("You've already entered that.");
            } else {
                toDoList.add(data);
            }
        }
        System.out.println("Thank you, here are all of the tasks you entered: ");
        for (String task : toDoList) {
            System.out.println(task);
        }
    }

            private static boolean containsIgnoreCase(List<String> toDoList, String data){
                for (String s : toDoList){
                    if (s.equalsIgnoreCase(data)){
                        return true;
                    }
                }
                return false; //if get to end of list w/o returning, its not there
            }
        }
