package gr.aueb.cf.ch3;

/**
 * Special Cases of While.
 * 1) Zero Iterations
 * 2) One Iteration
 * 3) Eternal Loop ( Για αυτό μην τρέξεις το πρόγραμμα! )
 */
public class WhileSpecialCases {

    public static void main(String[] args) {

        int i = 1;

        // 1) Zero Iterations
        while (i <= 0) {
            System.out.println("i = " + i);
            i++;
        }

        // 2) One Iteration
        while (i <= 1) {
            System.out.println("i = " + i);
            i++;
        }

        // 3) Eternal Loop
        while (true) {
            System.out.println("Είμαι σε έναν αιώνιο βρόχο (eternal loop)!");
        }
    }
}
