package WEEK1_INPUTOUTPUT.extraPractice;

import static input.InputUtils.*;

public class Main {
    public static void main(String[] args) {
        String name = stringInput("Please enter your name");
        System.out.println("Hello, " + name);

        int numOfClasses = positiveIntInput("How many classes are you taking this semester?");

        String classPlural = "classes";

        if (numOfClasses == 1) {
            classPlural = "class";
        }

        System.out.println("you are taking " + numOfClasses + " " + classPlural + " this semester.");

    }
}
