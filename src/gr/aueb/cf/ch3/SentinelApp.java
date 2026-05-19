package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει μία ειδκή τιμή από τον χρήστη μέχρι να δοθεί ο
 * ακέραιος -1 (sentinel).
 */
public class SentinelApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο (-1 για έξοδο):");

        while ((num = scanner.nextInt()) != -1) {
            iterations++;
            System.out.println("Παρακαλώ εισάγετε έναν ακέραιο (-1 για έξοδο):");
        }

        System.out.println("Ο χρήστης εισήγαγε " + iterations + " ακεραίους πριν δώσει το sentinel (-1).");
    }
}
