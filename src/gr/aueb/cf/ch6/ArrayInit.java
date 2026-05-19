package gr.aueb.cf.ch6;

/**
 * Array Init & Populate.
 */

public class ArrayInit {

    public static void main(String[] args) {

        int[] arr1 = new int[5]; //Default values: 0
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //Unsized Initialization
        int[] arr3;
        arr3 = new int[] {1, 2, 13, 7, 9, 33, 88, 99, 2, 100}; //Array Initializer

        //Populate the array (Εντός των [] είναι τα Indexes/Θέσεις)
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        System.out.println("arr1[0] = " + arr1[0]);
        System.out.println("arr1[4] = " + arr1[4]);
        System.out.println("arr1.length = " + arr1.length);
    }
}
