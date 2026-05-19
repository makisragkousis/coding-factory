package gr.aueb.cf.ch2;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Διαβάζει δύο ακεραίους από το stdin (keyboard)
 * και υπολογίζει το άθροισμα και το εκτυπώνει.
 */
public class AddScannerApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in); // Το scanner είναι κι αυτό μεταβλητή δημιουργεί ένα αντικείμενο που "κοιτάζει" την είσοδο του συστήματος (δηλαδή το πληκτρολόγιο).
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // Data Input και εγχωρεί σε μεταβλητές (data binding)
        System.out.println("Παρακαλώ εισάγετε δύο ακεραίους");
        num1 = scanner.nextInt(); // Το πρόγραμμα παγώνει μέχρι να δοθεί η πρώτη μεταβλητή. Μόλις δοθεί συνεχίζει. η τιμή "δένεται" (data binding) με τη μεταβλητή num1.
        num2 = scanner.nextInt(); // Ξαναπαγώνει μέχρι να δοθεί η επόμενη μεταβλητή. Μόλις δοθεί συνεχίζει.

        // Λογική Εφαρμογής - Παραστάσεις
        sum = num1 + num2;

        // Εκτύπωση Αποτελεσμάτων
        System.out.printf("Το άθροισμα των %d και %d είναι %d%n", num1, num2, sum);
    }
}
