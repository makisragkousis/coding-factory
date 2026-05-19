package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη ένα ακέραιο που
 * αντιστοιχεί σε ώρες (hours). Μετατρέπει
 * σε λεπτά και δευτερόλπετα και τα εκτυπώνει.
 */
public class HoursToMinSec {

    public static void main(String[] args) {

        // Δήλωση και Αρχικοποίηση Μεταβλητών
        Scanner scanner = new Scanner(System.in);
        final int HOURS_TO_MINUTES = 60;
        final int HOURS_TO_SECONDS = 3600;
        int inputHours = 0 ;
        int minutes = 0;
        int seconds = 0;

        // Λογική - Εντολές
        System.out.println("Παρακαλώ εισάγετε τις ώρες:");
        inputHours = scanner.nextInt();
        minutes = inputHours * HOURS_TO_MINUTES;
        seconds = inputHours * HOURS_TO_SECONDS;

        // Εκτύπωση
        System.out.printf("Ώρες: %d, Λεπτά: %d, Δευτερόλεπτα: %d%n", inputHours, minutes, seconds);
    }
}
