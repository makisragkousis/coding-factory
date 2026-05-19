package gr.aueb.cf.review;

import java.util.Arrays;

/**
 * Θέλουμε να μετακινήσουμε όλα τα στοιχεία ενός πίνακα
 * προς τα δεξιά ή προς τα αριστερά, με κυκλική μετατόπιση.
 */
public class ArrayCircularRotation {

    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};

        System.out.println("Αρχικός Πίνακας: " + Arrays.toString(original));

        // 1ο Σενάριο: Δεξιά μετατόπιση κατά 2 θέσεις
        int[] shiftedRight = shiftRightBy(original, 2);
        System.out.println("Δεξιά κατά 2:    " + Arrays.toString(shiftedRight));

        // 2ο Σενάριο: Αριστερή μετατόπιση κατά 2 θέσεις
        int[] shiftedLeft = shiftLeftBy(original, 2);
        System.out.println("Αριστερά κατά 2: " + Arrays.toString(shiftedLeft));
    }

    public static int[] shiftRightBy(int[] arr, int offset) {
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }

        return rotated;
    }

    public static int[] shiftLeftBy(int[] arr, int offset) {
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }

        return rotated;
    }
}
