package WEEK2_LOOPS_ARRAYS.Loops;

import static input.InputUtils.stringInput;

public class Password {
    public static void main(String[] args) {
        String secretPassword = "kittens";
        String userPassword = "";

        while (! secretPassword.equals(userPassword)){
            userPassword = stringInput("Enter Password");
        }
    }
}
