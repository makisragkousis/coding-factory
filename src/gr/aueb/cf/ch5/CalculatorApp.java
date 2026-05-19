package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Απλός υπολογιστής τσέπης που εμφανίζει μενού με
 * πρόσθεση, αφαίρεση, πολ/σμό, διαίρεση και mod, ο
 * χρήστης επιλέγει, στη συνέχεια δίνει τις τιμές εισόδου,
 * και λαμβάνει το αποτέλεσμα. Αυτό επαναλαμβάνεται μέχρι ο
 * χρήστης να επιλέξει 'έξοδο'.
 */
public class CalculatorApp {
    static Scanner scanner = new Scanner(System.in); //Χρειάζεται το static για να δουλέψει εκτός μεθόδου.

    public static void main(String[] args) {
        int choice = 0;
        int result = 0;
        int num1 = 0;
        int num2 = 0;
        final int EXIT = 6;

        while (true) {

            printMenu();
            choice = getOneInt();

            if (choice == EXIT) {
                System.out.println("Έξοδος...");
                break;
            }

            if (!isChoiceValid(choice)) {
                System.out.println("Μη έγκυρη επιλογή. Παρακαλώ προσπαθήστε ξανά.");
                continue;
            }

            System.out.println("Δώστε δύο ακέραιους:");
            num1 = getOneInt();
            num2 = getOneInt();

            result = getResultOnChoice(choice, num1, num2);

            System.out.println("Το αποτέλεσμα είναι: " + result);

        }

    }

    /**
     * Method για εμφάνιση του μενού.
     */
    public static void printMenu() {
        System.out.println("""
                Επιλέξτε μία από τις παρακάτω επιλογές:");
                        1. Πρόσθεση.
                        2. Αφαίρεση.
                        3. Πολλαπλασιασμός.
                        4. Διαίρεση.
                        5. Mod.
                        6. Έξοδος.""");
    }

    /**
     * Επιστρέφει τον ακέραιο που εισάγει ο χρήστης.
     * @return an int
     */
    public static int getOneInt() {
        return scanner.nextInt();
    }

    /**
     * Ελέγχει αν η επιλογή του ακεραίου είναι νόμιμη για το printMenu.
     * @param choice η επιλογή του χρήστη στο printMenu
     * @return true αν ισχύει η συνθήκη, αλλιώς false
     */
    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 5;
    }

    /**
     * Προσθέτει δύο ακεραίους
     * @param num1 ο πρώτος
     * @param num2 ο δεύτερος
     * @return το άθροισμα
     */
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Αφαιρεί δύο ακεραίους
     * @param num1 ο πρώτος
     * @param num2 ο δεύτερος
     * @return η διαφορά
     */
    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Πολλαπλασιάζει δύο ακεραίους
     * @param num1 ο πρώτος
     * @param num2 ο δεύτερος
     * @return Το γινόμενο
     */
    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Διαιρεί δύο ακεραίους
     * @param num1 ο πρώτος
     * @param num2 ο δεύτερος
     * @return Το πηλίκο
     */
    public static int div(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    /**
     * Διαιρεί δύο ακεραίους για το υπόλοιπο
     * @param num1 ο πρώτος
     * @param num2 ο δεύτερος
     * @return Το υπόλοιπο της διαίρεσης
     */
    public static int mod(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 % num2;
    }

    /**
     * Λαμβάνει την επιλογή του χρήστη και δίνει το αντίστοιχο αποτέλεσμα
     * @param choice η επιλογή του χρήστη
     * @param num1 ο πρώτος ακέραιος
     * @param num2 ο δεύτερος ακέραιος
     * @return Το αποτέλεσμα αναλόγως την επιλογή στο printMenu
     */
    public static int getResultOnChoice(int choice, int num1, int num2) {
//        int result = 0;

//        switch (choice) {
//            case 1:
//                result = add(num1, num2);
//                break;
//            case 2:
//                result = sub(num1, num2);
//                break;
//            case 3:
//                result = mul(num1, num2);
//                break;
//            case 4:
//                result = div(num1, num2);
//                break;
//            case 5:
//                result = mod(num1, num2);
//                break;
//            default:
//                System.out.println("Μη έγκυρη επιλογή. Παρακαλώ προσπαθήστε ξανά.");
//                break;
//        }
//        return result;

        return switch (choice) {
            case 1 -> add(num1, num2);
            case 2 -> sub(num1, num2);
            case 3 -> mul(num1, num2);
            case 4 -> div(num1, num2);
            case 5 -> mod(num1, num2);
            default -> 0;
        };
    }
}
