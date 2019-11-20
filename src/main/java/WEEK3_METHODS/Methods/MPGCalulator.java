package WEEK3_METHODS.Methods;

import static input.InputUtils.intInput;

public class MPGCalulator {
    public static void main(String[] args) {
        int miles = intInput("Enter miles driven: ");
        int gallons = intInput("Enter Gallons used: ");
        System.out.println("Your MPG is: " + MPG(miles,gallons));
    }

    public static int MPG (int m, int g){
        return m / g;
    }
}
