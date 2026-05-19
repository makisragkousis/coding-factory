package gr.aueb.cf.review;

/**
 * Έστω ένας πίνακας με n στοιχεία από 1 έως n+1.
 * Βρείτε το στοιχείο που λείπει.
 */
public class MissingElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int missing = 0;

        missing = findMissingElement(arr);
        System.out.println("Missing element: " + missing);
    }

    /**
     * Βρίσκει τον αριθμό που λείπει από έναν πίνακα n στοιχείων, ο οποίος
     * αναμένεται να περιέχει μοναδικούς ακέραιους αριθμούς από το 1 έως το n+1.
     *
     * Αντί να αναζητήσει τον αριθμό με πολύπλοκες λούπες ή ταξινόμηση,
     * η μέθοδος χρησιμοποιεί τον μαθηματικό τύπο του Gauss για το άθροισμα
     * των πρώτων N ακεραίων: (N * (N + 1)) / 2. Αφαιρώντας το πραγματικό
     * άθροισμα του πίνακα από αυτό το θεωρητικό άθροισμα, εντοπίζει τον
     * αριθμό που λείπει με μία μόνο μαθηματική πράξη.
     *
     * @param arr Ο πίνακας ακεραίων (μήκους n) από τον οποίο λείπει ένας αριθμός.
     * @return Τον ακέραιο αριθμό που απουσιάζει από την ακολουθία.
     */
    public static int findMissingElement(int[] arr) {
        int expectedSum = 0;
        int actualSum = 0;
        int n = 0;

        n = arr.length;
        expectedSum = (n + 1) * (n + 2) / 2;

        for (int el : arr) {
            actualSum += el;
        }

        return expectedSum - actualSum;
    }
}
