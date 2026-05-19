package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Οι βασικές πράξεις σε συλλογές όπως οι πίνακες είναι:
 * filtering
 * mapping
 * reducing
 */

public class ArraysAsCollections {

    public static void main(String[] args) {
    }

    /**
     * Φιλτράρει έναν πίνακα ακεραίων και επιστρέφει έναν νέο
     * πίνακα που περιέχει μόνο τους άρτιους (ζυγούς) αριθμούς.
     * * @param arr ο αρχικός πίνακας ακεραίων
     * @return ένας νέος πίνακας με τους άρτιους αριθμούς, ή ένας
     * άδειος πίνακας αν ο αρχικός είναι null ή άδειος
     */
    public static int[] filterEven(int[]arr) {
        if (arr == null || arr.length == 0) return new int[0];

        int[] arrayToReturn = new int[arr.length];
        int count = 0;

        for (int element : arr) {
            if (element % 2 == 0) {
                arrayToReturn[count++] = element; //Στη θέση count++ μπαίνει το element του αρχικού πίνακα που καλύπτει την if
            }
        }
        return Arrays.copyOf(arrayToReturn, count); //Παίρνει τον νέο πίνακα και στη συνέχεια αφαιρεί τις εναπομείνοντες θέσεις, αν υπάρχουν
    }

    /**
     * Μετασχηματίζει τα στοιχεία ενός πίνακα, διπλασιάζοντας
     * την τιμή του καθενός.
     * * @param arr ο αρχικός πίνακας ακεραίων
     * @return ένας νέος πίνακας με τα διπλασιασμένα στοιχεία,
     * ή άδειος πίνακας αν ο αρχικός είναι null ή άδειος
     */
    public static int[] mapToDouble(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];

        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    /**
     * Υπολογίζει και επιστρέφει το άθροισμα όλων των
     * στοιχείων ενός πίνακα.
     * @param arr ο πίνακας ακεραίων
     * @return το άθροισμα των στοιχείων (0 αν ο πίνακας είναι null ή άδειος)
     */
    public static int sum(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int sum = 0;

        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    /**
     * Υπολογίζει και επιστρέφει τον μέσο όρο των
     * στοιχείων ενός πίνακα.
     * * @param arr ο πίνακας ακεραίων
     * @return ο μέσος όρος ως double (0 αν ο πίνακας είναι null ή άδειος)
     */
    public static double avg(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        return sum(arr) / (double) arr.length; //Ένας από τους δύο χρειάζεται να γίνει double.
    }

    /**
     * Ελέγχει αν υπάρχει τουλάχιστον ένας άρτιος αριθμός
     * μέσα στον πίνακα.
     * * @param arr ο πίνακας ακεραίων
     * @return true αν υπάρχει έστω και ένας άρτιος, διαφορετικά false
     */
    public static boolean isAnyEven(int[] arr) {
        if (arr == null) return false;

        for (int element : arr) {
            if (element % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Ελέγχει αν όλα τα στοιχεία του πίνακα είναι άρτιοι αριθμοί.
     * @param arr ο πίνακας ακεραίων
     * @return true αν όλα τα στοιχεία είναι άρτια, διαφορετικά false
     */
    public static boolean areAllEven(int[] arr) {
        for (int element : arr) {
            if (element % 2 != 0) {
                return false; //Early Exit
            }
        }
        return true;
    }

    /**
     * Ελέγχει αν υπάρχουν περισσότεροι από δύο άρτιοι αριθμοί
     * μέσα στον πίνακα.
     * @param arr ο πίνακας ακεραίων
     * @return true αν βρεθούν τουλάχιστον 3 άρτιοι, διαφορετικά false
     */
    public static boolean isMoreThanTwoEven(int[] arr) {
        if (arr == null || arr.length < 3) return false;

        int count = 0;

//        for (int element : arr) {
//            if (element % 2 == 0) {
//                count++;
//            }
//        }
//        return count > 2;

        for (int element : arr) {
            if (element % 2 == 0) count++;
            if (count > 2) return true; //Early Exit
        }
        return false;
    }
}
