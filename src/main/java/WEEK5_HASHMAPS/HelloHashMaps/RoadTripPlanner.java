package WEEK5_HASHMAPS.HelloHashMaps;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.positiveIntInput;

public class RoadTripPlanner {
    public static void main(String[] args) {
        Map<String, Integer> MilestoCities = new HashMap<>();
        MilestoCities.put("Duluth", 154);
        MilestoCities.put("Brainerd", 127);
        MilestoCities.put("Stillwater", 26);
        MilestoCities.put("Ely", 245);
        MilestoCities.put("Red Wing", 54);

        int MaxDistance = positiveIntInput("What is the Max distance you would like to drive? ");

        //map.of is static and cannot be changed







    }
}
