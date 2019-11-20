package WEEK6_FILES_EXCEPTIONS.HelloFilesExceptions;

public class ExceptionTest {
    public static void main(String[] args) {
        String numberString = "cat";  //possible user input (cannot be trusted)
        try {  //try the code
            int number = Integer.parseInt(numberString);
            System.out.println(number);
        } catch (NumberFormatException e) {  //catch this specific error, allows you to take steps needed to resolve bad input
            System.out.println("Error, not a number" + numberString);
        }

    }
}
