package WEEK2_LOOPS_ARRAYS.Loops;
import java.util.Date;

public class WhileLoops {
    public static void main(String[] args) throws Exception {
        while (true){
            Date d = new Date(); //creation of date object represents a date in time - default time created
            System.out.println(d); //print date object
            Thread.sleep(1000); // pauses for 1000 milliseconds equal to 1 second
        }
    }
}
