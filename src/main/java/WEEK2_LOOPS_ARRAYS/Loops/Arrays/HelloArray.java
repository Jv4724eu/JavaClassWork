package WEEK2_LOOPS_ARRAYS.Loops.Arrays;

public class HelloArray {
    public static void main(String[] args) {
        double[] maxTemps = new double[7]; //creation of array - new = new object - this makes an array of double values
        String[] studentNames = new String[24]; //array of students in a class
        String[] gitUserNames = new String[24]; //array of github usernames
        int[] classAttendance = new int[17]; //array of class attendance every week

        maxTemps[0] = 75.5;
        maxTemps[1] = 81.2;
        maxTemps[2] = 65.3;
        maxTemps[3] = 71.1;
        maxTemps[4] = 50;

        System.out.println(maxTemps[3]);
    }
}
