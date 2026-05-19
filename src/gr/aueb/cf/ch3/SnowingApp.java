package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει αν βρέχει και την θερμοκρασία
 * και το πρόγραμμα υπολογίζει αν χιονίζει.
 * Χιονίζει σημαίνει ότι βρέχει ΚΑΙ η θερμοκρασία < 0.
 */
public class SnowingApp {

    public static void main(String[] args) {

        //Δήλωση και Αρχικοποίηση Μεταβλητών
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        int temperature = 0;
        boolean isSnowing = false;

        // Λογική - Εντολές
        System.out.println("Βρέχει; (true/false)");
        isRaining = scanner.nextBoolean();

        System.out.println("Παρακαλώ εισάγετε την θερμοκρασία:");
        temperature = scanner.nextInt();

        isSnowing = isRaining && (temperature < 0); // Πρέπει να ισχύουν KAI τα δύο.

        // Εκτύπωση
        System.out.println("Χιονίζει: " + isSnowing);
    }
}
