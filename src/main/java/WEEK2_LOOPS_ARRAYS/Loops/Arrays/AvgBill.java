package WEEK2_LOOPS_ARRAYS.Loops.Arrays;


import static input.InputUtils.doubleInput;

public class AvgBill {
    public static void main(String[] args) {
        String[] months = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November","December"};
        double [] monthlyBill = new double[months.length];
        double total = 0;

        for (int m = 0; m < months.length; m++) {
            String month = months[m];
            double monthTotal = doubleInput("What was your bill total in " + month + ": ");
            monthlyBill[m] = monthTotal;
            total += monthTotal;

        }


        System.out.println("Total for all months is: " + total);
        double yearAvg = total/months.length;
        System.out.println("Average Payment is: " + yearAvg );
    }
}
