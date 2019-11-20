package WEEK5_HASHMAPS.HelloHashMaps;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class HelloHashMaps {
    public static void main(String[] args) {
        Map<String, Double> snowfall = new HashMap<>(); //hashmap creation
        snowfall.put("January", 3.1);
        snowfall.put("Febuary", 10.8);
        snowfall.put("March", 5.6);
        //hash maps can be made of anytype of data but the key must be a non modifiable data type such as int or double
        snowfall.put("January", 50.0); // put method adds data and overwrites data
        System.out.println(snowfall);
        System.out.println(snowfall.get("Febuary")); //get with retrieve specific value from hash
        System.out.println(snowfall.get("July")); //prints NULL bc July does not exist in the hash

        for (String s : snowfall.keySet()) //use the key to get each value, repeat for each key
        {
            System.out.println(snowfall.get(s));
        }

        //OR
        double total = 0;
        for (Double snow : snowfall.values()) {
            total += snow;
        }
        System.out.println("Total years snowfall: " + total);

        String newMonth = stringInput("Enter a new month");
        double newSnow = positiveDoubleInput ("Enter snowfall for " + newMonth);
        String normalizedNewMonth = normalizeMonth(newMonth);

        if (snowfall.containsKey(normalizedNewMonth)) {
            System.out.println("Cannot add, data already exists");
            boolean overwrite = yesNoInput("Overwrite data?");
            if (overwrite) {
                snowfall.put(normalizedNewMonth, newSnow);
            } else {
                System.out.println("no data changed");

            }
        }
        else {
            snowfall.put(normalizedNewMonth, newSnow);
        }


        System.out.println("Snowfall amounts: " + snowfall);







    }

    private static String normalizeMonth(String newMonth) {
        if (newMonth == null){ //to avoid a null pointer error
            return "";
        }
        if (newMonth.length()== 0){ //if the user enters 0
            return newMonth;
        }
        String monthInLower = newMonth.toLowerCase();
        String firstLetter = newMonth.substring(0,1).toUpperCase(); //"M" for march
        String restOfMonth = monthInLower.substring(1);
        return firstLetter + restOfMonth;
    }
}
