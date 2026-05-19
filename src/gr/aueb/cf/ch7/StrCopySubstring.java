package gr.aueb.cf.ch7;

public class StrCopySubstring {

    public static void main(String[] args) {

        String s1 = "Coding";
        String s2 = s1; // copy

        //Substring
        String s3 = s1.substring(1); // oding Ξεκινάει από τη θέση 1.
        String s4 = s1.substring(1, 3);        // od   Δεν συμπεριλαμβάνεται η θέση μετά το κόμμα(exclusive). Σαν το μαθηματικό διάστημα [1, 3). 3-1->2 γράμματα.
    }
}
