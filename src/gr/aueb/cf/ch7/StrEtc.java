package gr.aueb.cf.ch7;

public class StrEtc {

    public static void main(String[] args) {

        // Split
        String s = "Athens Uni of Eco and Bus";
        String[] tokens;

        tokens = s.split(" "); // Χωρίζει το String σε έναν πίνακα από λέξεις (κομμάτια), χρησιμοποιώντας το κενό (" ") ως διαχωριστικό

        for (String token : tokens) {
            System.out.println(token);
        }

        // Concat
        String s1 = "Coding";
        String s2 = "Factory";
        String fullName1 = s1 + s2;
        String fullName2 = s1.concat(s2); // Προσθέτει

        // Replace
        String sDashed = s.replace(" ", "-"); // Αντικαθιστά ένα χαρακτήρα με έναν άλλον

        // Format
        char row = 'A';
        int col = 5;
        String seat = String.format("%c%d", row, col); // Δημιουργεί ένα μορφοποιημένο String βάσει προτύπου (εδώ επιστρέφει "A5")

        // Trim
        String lastname = " Smith   ";
        String trimmedLastname = lastname.trim(); // Αφαιρεί τα περιττά κενά (spaces) μόνο από την ΑΡΧΗ και το ΤΕΛΟΣ του String

        // To upper and to lower
        String lower = "coding factory";
        String upper = "CODING FACTORY";

        boolean isEqualIgnoreCase = lower.toUpperCase().equals(upper.toUpperCase());  // Normalization: Τα κάνουμε όλα κεφαλαία για να τα συγκρίνουμε με ασφάλεια, αγνοώντας αν γράφτηκαν με μικρά ή κεφαλαία



    }
}
