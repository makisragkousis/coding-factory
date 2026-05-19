package gr.aueb.cf.ch6;

/**
 * Traverse an array. Επίσκεψη σε κάθε
 * στοιχείο του πίνακα και εκτύπωση της τιμής.
 */

public class ArrayTraverse {

    public static void main(String[] args) {

        int[] scores = { 10, 20 , 30, 40, 50, 60, 70, 80, 90, 100 };

        //Traverse the array using a for loop
        for (int i = 0; i < scores.length; i++) { //i <= scores.length -1
            System.out.println(scores[i]);
        }

        //Enhanced for
        for (int score : scores) { //Για κάθε score στο (in) scores, τύπωσε το καθένα ξεχωριστά
            System.out.println(score);
        }
    }
}
