package gr.aueb.cf.ch7;

/**
 * Δημιουργήστε μια μέθοδο, που να παίρνει ως είσοδο
 * ένα string και ένα char και να επιστρέφει το πλήθος των
 * εμφανίσεων του char στο string.
 */

public class LetterCount {

    public static void main(String[] args) {
        String testString = "Test String";
        char testChar = 'T';
        int count = 0;

        count = getLetterCount(testString, testChar);
        System.out.println(count);
    }

    public static int getLetterCount(String s, char letter) {
        if (s == null) return -1;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
