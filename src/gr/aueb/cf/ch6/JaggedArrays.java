package gr.aueb.cf.ch6;

/**
 * Πίνακες με διαφορετική διάσταση σε κάθε γραμμή.
 */
public class JaggedArrays {

    public static void main(String[] args) {
        int[][] arr = new int[3][];

        arr[0] = new int[5];  // Η 1η γραμμή παίρνει έναν πίνακα 5 θέσεων
        arr[1] = new int[3];  // Η 2η γραμμή παίρνει έναν πίνακα 3 θέσεων
        arr[2] = new int[10]; // Η 3η γραμμή παίρνει έναν πίνακα 10 θέσεων

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
