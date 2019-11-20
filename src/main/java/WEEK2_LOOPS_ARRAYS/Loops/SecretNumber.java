package WEEK2_LOOPS_ARRAYS.Loops;

import java.util.Random;

import static input.InputUtils.intInput;



public class SecretNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(10);
        int guess;
         do {
             guess = intInput("What is the secret number?");
                if (secretNumber < guess) {
                System.out.println("Guess lower!");
                }
                if (secretNumber > guess) {
                System.out.println("Guess higher!");
                }

            }
         while (secretNumber != guess);
        System.out.println("Yay! You guessed the secret number!");
    }
}
