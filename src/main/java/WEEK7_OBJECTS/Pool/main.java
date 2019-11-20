package WEEK7_OBJECTS.Pool;

public class main {
    public static void main(String[] args) {
        Pool ymca = new Pool("YMCA DOWTOWN", 50, true);
        System.out.println(ymca.distanceForLaps(10));

        //create new pool object called edina
        Pool edina = new Pool ("Edina", 50, true);

        //calls pool method "distance for laps" and prints results
        System.out.println(edina.distanceForLaps(12));
        System.out.println(edina);
    }
}
