package WEEK3_METHODS.Methods;

import static input.InputUtils.doubleInput;

public class MilesToKm {
    public static void main(String[] args) {
        double miles = doubleInput("Please enter number of miles");
        double km = milesToKM(miles);
        System.out.println(miles + " Miles is equal to " + km + " kilometers");
        double pounds = doubleInput("Please enter number of pounds");
        double kilo = poundsToKilo(pounds);
        System.out.println(pounds + " Pounds is eqaul to " + kilo + " kilograms");
    }// end of main method
    public static double milesToKM(double miles){
        double km = miles * 1.6;
        return km;
    }
    public static double poundsToKilo (double pounds){
        double kilo = pounds * .45;
        return kilo;
    }

}
