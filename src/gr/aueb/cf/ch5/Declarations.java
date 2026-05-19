package gr.aueb.cf.ch5;

/**
 * Demonstrates variable declarations.
 */

public class Declarations {

    public static void main(String[] args) {

        float myFloat = 1.2345f; //Type suffix για μετατροπή του literal από double σε float.
        double myDouble = 1.2345;

        System.out.printf("myFloat = %.2f , myDouble = %.2f%n", myFloat, myDouble); //Το default είναι 6 δεκαδικοί.
    }
}
