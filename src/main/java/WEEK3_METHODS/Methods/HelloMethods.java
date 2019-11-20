package WEEK3_METHODS.Methods;

import static input.InputUtils.stringInput;

public class HelloMethods {
    public static void main(String[] args) {
        String name = stringInput("Please enter your name:");
        String greeting = makeGreeting(name);
        System.out.println(greeting);
    } //end of main method

    public static String makeGreeting(String n){
        String greeting = "Hello " + n + "!";
        return greeting;
    }

}
