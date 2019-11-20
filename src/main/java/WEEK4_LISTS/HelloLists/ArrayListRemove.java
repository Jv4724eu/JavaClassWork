package WEEK4_LISTS.HelloLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemove { //removes 0's from array list
    public static void main(String[] args) {
        List<Double> speeds = new ArrayList<>();
        speeds.add(7.8);
        speeds.add(0.0);
        speeds.add(4.5);
        speeds.add(6.5);
        speeds.add(0.0);

        while (speeds.contains(0.0)){
            speeds.remove(0.0);
        }

        /** DO SAME WITH FOR LOOP (NOT RECOMMENDED)
         *
         * for (Double s : speeds){
            if (s == 0.0){
                speeds.remove(s);
            }
        } doesnt work must remove every value in turn, so you dont know where your removing data

        for (int s = 0; s < speeds.size(); s++){
            if (speeds.get(s) == 0.0) {
                speeds.remove(s);
                s--; //everytime you remove something the next element shifts down one so you have to decrease loop counter to get actual next element
            } works but is more complicated to type vs a while loop above
        } */
        System.out.println(speeds);

    }
}
