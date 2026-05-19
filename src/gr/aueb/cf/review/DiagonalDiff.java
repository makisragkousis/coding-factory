package gr.aueb.cf.review;

/**
 * Παρέχει τη λειτουργικότητα για τον υπολογισμό
 * της απόλυτης διαφοράς ανάμεσα στα αθροίσματα των δύο διαγωνίων ενός
 * δισδιάστατου τετραγωνικού πίνακα ακεραίων (NxN).
 */
public class DiagonalDiff {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 14, 15},
                {2, 1, 8},
                {3, 3, 1}
        };

        System.out.println(diagonalDiff(arr));
    }

    /**
     * Υπολογίζει και επιστρέφει την απόλυτη διαφορά ανάμεσα στα αθροίσματα
     * της κύριας και της δευτερεύουσας διαγωνίου ενός τετραγωνικού πίνακα.
     *
     * @param arr Ο δισδιάστατος τετραγωνικός πίνακας ακεραίων (NxN).
     * @return Την απόλυτη διαφορά (θετικός ακέραιος) των δύο διαγωνίων.
     */
    public static int diagonalDiff(int[][] arr) {
        int diagonalA = 0;  // left to right
        int diagonalB = 0;  // right to left

        for (int i = 0; i < arr.length; i++) {
            diagonalA += arr[i][i];                     // left to right: Ίδιος αριθμός γραμμής και στήλης (π.χ. [0][0], [1][1])
            diagonalB += arr[i][arr[i].length - 1 - i]; // right to left: Κατεβαίνουμε γραμμές, πηγαίνουμε αριστερά σε στήλες
        }

        return Math.abs(diagonalA - diagonalB);
    }
}
