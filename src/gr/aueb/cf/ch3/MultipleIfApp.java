package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υλοποιεί ένα μενού με πολλαπλά if.
 */

public class MultipleIfApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("""
                    Επιλέξτε μία από τις παρακάτω επιλογές:
                    1. Προβολή πορφίλ.
                    2. Επεξεργασία προφίλ.
                    3. Ρυθμίσεις.
                    4. Βοήθεια.
                    5. Έξοδος.""");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Προβολή προφίλ...");
            } else if (choice == 2) {
                System.out.println("Επεξεργασία προφίλ...");
            } else if (choice == 3) {
                System.out.println("Ρυθμίσεις...");
            } else if (choice == 4) {
                System.out.println("Βοήθεια...");
            } else if (choice == 5) {
                System.out.println("Έξοδος από το πρόγραμμα.");
            } else {
                System.out.println("Μη έγκυρη επιλογή. Παρακλαώ προσπαθήστε ξανά.");
            }
        } while (choice != 5); //5 is exit.
    }
}
