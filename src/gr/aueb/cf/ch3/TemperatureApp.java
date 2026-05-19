package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο που συμβολίζει
 * θερμοκρασία. Το πρόγραμμα υπολογίζει αν η
 * θερμοκρασία είναι < 0. Μία μεταβλητή, έστω
 * isTempBelowZero γίνεται True, αλλιώς False.
 * Τέλος τυπώνει το αποτέλεσμα.
 */
public class TemperatureApp {

    public static void main(String[] args) {

        //Δήλωση και Αρχικοποίηση Μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero= false;

        // Λογική - Εντολές
        System.out.println("Παρακαλώ εισάγετε θερμοκρασία:");
        temperature = scanner.nextInt();

        isTempBelowZero = temperature <0; // Δεν χρειάζεται κάποιο if, εφόσον ισχύει η παράσταση στο RHS τότε η μετεβλητή είναι true, αλλιώς είναι false.

        System.out.println("Η θερμοκρασία είναι κάτω από το μηδέν: " + isTempBelowZero);
    }
}
