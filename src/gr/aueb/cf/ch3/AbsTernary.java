package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ένα ακέραιο. Το πρόγραμμα υπολογίζει
 * το απόλυτο του ακεραίου. Το απόλυτο ενός ακεραίου είναι πάντα
 * θετικός αριθμός. Για παράδειγμα, το απόλυτο του -5 είναι 5,
 * ενώ το απόλυτο του 5 είναι 5.
 */

public class AbsTernary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο:");
        num = scanner.nextInt();

        abs = num > 0 ? num : -num; //Αν το num > 0, τότε(?) το abs είναι το ίδιο το num, αλλιώς(:) το abs είναι -num.

        System.out.printf("Το απόλυτο του %d είναι το %d.%n", num, abs);
    }
}
