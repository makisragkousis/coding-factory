package gr.aueb.cf.ch4;

/**
 * Demo if infinite loop.
 * Αντίστοιχο του while(true).
 */

public class ForeverApp {

    public static void main(String[] args) {

        int count = 0;
        final int MAX_COUNT = 100;

        for (;;) {
            System.out.println("Forever");
            count++;

            if ((count % 10) == 0) {
                System.out.println();
            } //New line every 10 iterations.

            if (count == MAX_COUNT) {
                break;
            }
        }
    }
}
