package gr.aueb.cf.ch4;

/**
 * Υπολογίζει και εκτυπώνει το άθροισμα
 * και το γινόμενο των ακεραίων από 1 έως 10.
 */

public class SumMulApp {

    public static void main(String[] args) {

        //Δήλωση και Αρχικοποίηση Μεταβλητών
        int sum = 0;
        int mul = 1;

        //Επεξεργασία των Δεδομένω
        for (int i = 1; i <= 10; i++) {
            sum += i;
            mul *= i;
        }

        //Εκτύπωση
        System.out.println("Το άθροισμα των ακραίων από το 1 έως το 10 είναι: " + sum);
        System.out.println("Το γινόμενο των ακραίων από το 1 έως το 10 είναι: " + mul);
    }
}
