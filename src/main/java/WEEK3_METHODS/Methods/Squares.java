package WEEK3_METHODS.Methods;

import static input.InputUtils.doubleInput;

public class Squares {
    public static void main(String[] args) {
        double number = doubleInput("Please enter a number and I'll sqaure it");
        square(number);
        System.out.println(squareTwo(number));
    }// end of main
    //version 1 is doing two things
    public static void square(double n){
        double sq = n*n;
        System.out.println("The Square of " + n + " is " + sq);
    }
    //version 2 has one specific task so is better, can be used many times
    public static double squareTwo (double n){
        double sq = n*n;
        return sq;
    }
}
