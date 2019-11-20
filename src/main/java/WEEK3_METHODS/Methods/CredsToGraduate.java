package WEEK3_METHODS.Methods;

import static input.InputUtils.intInput;

public class CredsToGraduate {
    public static void main(String[] args) {
        int creditsEarned = intInput("How many credits have you earned");
        int creditsNeeded = intInput("How many credits does your program require?");
        int CreditsToGraduate = howManyCreditsToGrad(creditsEarned,creditsNeeded);
        System.out.println("You need " + CreditsToGraduate + " Credits to Graduate");
    }
    public static int howManyCreditsToGrad (int earned, int needed){
        int CredsToGrad = needed - earned;
        return CredsToGrad;
    }
}
