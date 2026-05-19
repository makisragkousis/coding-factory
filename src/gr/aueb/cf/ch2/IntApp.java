package gr.aueb.cf.ch2;

/**
 * Εμφανίζει TYPE, ΜΙΝ, ΜΑΧ και εύρος τιμών των
 * βασικών τύπων ακεραίων.
 */
public class IntApp {

    public static void main(String[] args) {
        System.out.printf("TYPE = %s, MIN = %d, MAX = %d, SIZE = %d\n", Integer.TYPE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.SIZE);
        System.out.printf("TYPE = %s, MIN = %d, MAX = %d, SIZE = %d\n", Short.TYPE, Short.MIN_VALUE, Short.MAX_VALUE, Short.SIZE);
        System.out.printf("TYPE = %s, MIN = %d, MAX = %d, SIZE = %d\n", Byte.TYPE, Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.SIZE);
        System.out.printf("TYPE = %s, MIN = %d, MAX = %d, SIZE = %d\n", Long.TYPE, Long.MIN_VALUE, Long.MAX_VALUE, Long.SIZE);
    }
}
