package gr.aueb.cf.ch7;

/**
 * Traverse ένα string (και reverse) με τη
 * χρήση της charAt(), η οποία επιστρέφει char.
 */

public class StrTraverse {

    public static void main(String[] args) {

        String s = "Coding Factory";

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        System.out.println();

        //Reverse String
        for (int j = (s.length() - 1); j >= 0; j--) {
            System.out.println(s.charAt(j));
        }
    }
}
