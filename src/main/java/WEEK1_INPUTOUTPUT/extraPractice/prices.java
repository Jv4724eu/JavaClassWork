package WEEK1_INPUTOUTPUT.extraPractice;

import static input.InputUtils.*;

public class prices {
    public static void main(String[] args) {
        String productName = stringInput ("What is the name of the product");
        double price = doubleInput("What does " + productName + " cost?");
        int qty = intInput("How many " + productName + " to sell?");

        //calc total price for qty of product
        double totalPrice = price * qty;

        System.out.println(qty + " of " + productName + " a $" + price + " each costs $" + totalPrice);


    }
}
