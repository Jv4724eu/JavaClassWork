package WEEK2_LOOPS_ARRAYS.Loops;

import static input.InputUtils.doubleInput;

public class BusExpense {
        public static void main(String[] args) {
            //program that calcs the total amount of bus fare a user spends in a week
            String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            double[] farePerDay = new double[days.length];
            double total = 0;

            for (int d = 0; days.length <8; d++){
                String dayOfTheWeek = days[d];
                double dayTotal = doubleInput("How much did you spend on " + dayOfTheWeek + ": ");
                farePerDay[d] = dayTotal;
                total += dayTotal;

            }
            System.out.println("Total for the week is: " + total);
        }
    }