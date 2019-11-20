package Methods;

public class Martathon {
    public static void main(String[] args) {
        double currentDistance = 1;
        double marathonTotal = 20;
        double percentIncrease= 10;
        int weeks = weeksCalc(currentDistance,marathonTotal,percentIncrease);
        System.out.println(weeks);

    }

    public static int weeksCalc (double distance, double total, double increase){
        int weeks = 1;
        while (distance < total) {
            distance *= increase;
            weeks++;
        }
        return weeks;
    }
}
