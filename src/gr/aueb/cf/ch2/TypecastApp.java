package gr.aueb.cf.ch2;

/**
 * Typecast Demo
 */
public class TypecastApp {

    public static void main(String[] args) {
        int num1 = Integer.MAX_VALUE;
        long num2 = 20L;    // type suffix


        num1 = (int) num2;  // Typecast is Error Prone, εδώ το num2 είναι 20 και χωράει σε ένα int. Αν ηταν 5.000.000.000, (που χωράει στο long αλλά ΟΧΙ στο int), τότε το αναγκαστικό typecast (int) θα "έκοβε" τα δεδομένα που περισσεύουν και το num1 θα έπαιρνε μια εντελώς άσχετη, παραμορφωμένη τιμή.
        num1 = num1 + 10;   // Overflow

        System.out.println(num1);
    }
}
