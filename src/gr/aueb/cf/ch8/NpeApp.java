package gr.aueb.cf.ch8;

/**
 * NullPointerException, the most popular!
 */

public class NpeApp {

    public static void main(String[] args) {

        String s;

        s = getOneOrNull();

        if (s == null) { // Χωρίς αυτό το if, θα παίρναμε NPE
            System.out.println("Το String είναι null.");
        } else {
            System.out.println(s.length());
        }
    }

    public static String getOneOrNull() {
        return null;
    }
}
