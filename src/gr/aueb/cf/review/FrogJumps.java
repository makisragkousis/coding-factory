package gr.aueb.cf.review;

import java.util.Scanner;

/**
 * Ο frog από ένα σημείο x, φτάνει ή ξεπερνάει ένα
 * σημείο y, όπου κάθε jump, έχει μήκος jmp.
 */

public class FrogJumps {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int start = 0;
        int end = 0;
        int jmp = 0;
        int numberOfJumps = 0;

        System.out.println("Εισάγετε την αφετηρία:");
        start = scanner.nextInt();

        System.out.println("Εισάγετε τον τερματισμό:");
        end = scanner.nextInt();

        System.out.println("Εισάγετε το μήκος του άλματος:");
        jmp = scanner.nextInt();

        numberOfJumps = frogJumps2(start, end, jmp);

        System.out.println("Το πλήθος των αλμάτων ισούται με: " + numberOfJumps);
    }

    public static int frogJumps(int start, int end, int jump) {
        int jumps = 0;

        while (start < end) {
            start += jump;
            jumps++;
        }
        return jumps;
    }

    /**
     * Υπολογίζει τον ελάχιστο αριθμό αλμάτων που χρειάζεται ο βάτραχος
     * για να φτάσει ή να ξεπεράσει τον τελικό του προορισμό.
     *
     * Σε αντίθεση με την προσομοίωση βήμα-βήμα, αυτή η μέθοδος χρησιμοποιεί
     * έναν άμεσο μαθηματικό τύπο (διαίρεση της συνολικής απόστασης με το μήκος
     * του άλματος, και στρογγυλοποίηση προς τα πάνω). Αυτό προσφέρει βέλτιστη
     * χρονική πολυπλοκότητα, καθιστώντας την ιδανική για τεράστιες αποστάσεις.
     *
     * @param start Η αρχική θέση του βατράχου (πρέπει να είναι <= end).
     * @param end   Η τελική θέση που θέλει να φτάσει ή να προσπεράσει.
     * @param jump  Το σταθερό μήκος του κάθε άλματος (πρέπει να είναι > 0).
     * @return      Τον συνολικό ακέραιο αριθμό αλμάτων που απαιτούνται.
     */
    public static int frogJumps2(int start, int end, int jump) {
        return (int) Math.ceil((double) (end - start) / jump);
    }
}
