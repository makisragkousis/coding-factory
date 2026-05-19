package gr.aueb.cf.review;

/**
 * Παρέχει τη λειτουργικότητα για τη δημιουργία και
 * οπτική αναπαράσταση μιας δεξιά-στοιχισμένης σκάλας (staircase),
 * χρησιμοποιώντας #.
 */

public class StairCase {

    public static void main(String[] args) {
        printStair(20);
    }

    public static void printStair(int n) {
        for (int i = 1; i <= n; i++) {          // Για την αλλαγή γραμμής
            for (int j = 1; j <= n - i; j++) {  // Για τον υπολογισμό και την εκτύπωση των κενών σε κάθε γραμμή
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {      // Για τον υπολογισμό και την εκτύπωση των # σε κάθε γραμμή
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void printStair2(int n) {
        for (int i = 1; i <= n; i++) {
            // Τυπώνει τόσα κενά όσα το (n-i) και τοποθετεί δίπλα τόσες διέσεις όσες το (i)
            String spaces = " ".repeat(n - i);
            String hashes = "#".repeat(i);

            System.out.println(spaces + hashes);
        }
    }
}
