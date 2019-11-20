package WEEK4_LISTS.HelloLists;


import java.util.ArrayList;
import java.util.List;

public class HelloList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Kelsey");
        arrayList.add("MCTC");

        //for each loop will loop over every item in array list
        for (String s: arrayList) {
            System.out.println(s.toUpperCase());
            System.out.println(s.length());
        }
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(0)); //print specific element in array list
        arrayList.remove(3); //removes item in an array list
        System.out.println(arrayList.size()); //prints size of array list
        arrayList.set(0,"Hello World"); //change a value of an item in an array list
        arrayList.remove(arrayList.size() -1) ;//removes the last item of array list


        /**ARRAY LISTS - list of arrays, adding to end is fast, add to middle slow, add to end fast

         LINK LIST - you use a link list the same way you use an arraylist but all peices of data are stored in a node chained together
         to add to to link list in the middle of the list you break a link which creates link to new item and the item is added

         VECTOR LIST - similar to array list they use an array list, used in GUIS
         */




         }
}
