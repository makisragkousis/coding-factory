package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Σε ένα χώρο στάθμευσης η 1η ώρα κοστίζει
 * 2 ευρώ (200 λεπτά) και κάθε επιπλέον ώρα
 * κοστίζει 1,5 ευρώ (150 λεπτά).
 * Ο χρήστης εισάγει τον αριμθό ωρών που στάθμευσε
 * και το πρόγραμμα επιστρέφει το συνολικό κόστος.
 */
public class ParkingApp {

    public static void main(String[] args) {

        // Δήλωση και Αρχικοποίση Μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int inputHours = 0;
        int euros = 0;
        int cents = 0;
        int totalCostInCents = 0;
        final int FIRST_HOUR_PRICE = 200;
        final int EACH_ADDITIONAL_HOUR_COST = 150;

        // Λογική - Εντολές
        System.out.println("Παρακαλώ εισάγετε τις ώρες στάθμευσης:");
        inputHours = scanner.nextInt();
        totalCostInCents = FIRST_HOUR_PRICE + (inputHours - 1) * EACH_ADDITIONAL_HOUR_COST;
        euros = totalCostInCents / 100;
        cents = totalCostInCents % 100;

        // Εκτύπωση
        System.out.printf("Το συνολικό κόστος στάθμευσης είναι: %d ευρώ και %d λεπτά%n", euros, cents);

    }
}
