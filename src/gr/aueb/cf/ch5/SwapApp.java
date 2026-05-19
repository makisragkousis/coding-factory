package gr.aueb.cf.ch5;

/**
 * Ορίζει μία μέθοδο void swap(int a, int b)
 * η οποία έχει στόχο να ανταλλάξει αμοιβαία τις τιμές
 * των a και b. Δηλαδή το a -> b & b -> a.
 * Ο τρόπος αυτός αμοιβαίας ανταλλαγής δε δουλεύει,
 * γιατί τα a, b περνούν ως input (readonly) και όχι
 * ως output.
 */

public class SwapApp {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.printf("Πριν το swap: a = %d, b = %d%n", a, b);

        swap(a, b);

        System.out.printf("Μετά το swap: a = %d, b = %d%n", a, b);
    }

    /**
     * Swaps the values of and b.
     * @param a the first integer to swap.
     * @param b the second integer to swap.
     */
    public static void swap(int a, int b) {

        int tmp = a;
        a = b;
        b = tmp;
    }
}
