package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ορίζει δύο μεθόδους, τις isEven & isOdd,
 * για τον έλεγχο ενός ακεραίου αν είναι άρτιος ή
 * περιττός αντίστοιχα.
 */

public class EvenOddApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Εισάγετε έναν θετικό ακέραιο:");
        inputNum = scanner.nextInt();

        if (isEven(inputNum)) {
            System.out.printf("Ο αριθμός %d είναι άρτιος.", inputNum);
        } else {
            System.out.printf("Ο αριθμός %d είναι περιττός.", inputNum);
        }

    }

    public static boolean isEven (int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd (int num) {
        //return num % 2 != 0;
        return !isEven(num);
    }
}
