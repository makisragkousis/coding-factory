package gr.aueb.cf.ch5;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Demo of rounding and BigDecimal.
 */

public class RoundingAndBigDecimal {

    public static void main(String[] args) {

        BigDecimal bigNum = new BigDecimal("10.2345"); // Μέσα σε "" για να μην αποθηκευτεί ως double.
        BigDecimal divisor = new BigDecimal("3");
        BigDecimal result = BigDecimal.ZERO;
        BigDecimal result2 = BigDecimal.ZERO;

        result = bigNum.divide(divisor, 2 , RoundingMode.HALF_UP); //2.345 -> 2.35
        result2 = bigNum.divide(divisor, 2 , RoundingMode.HALF_EVEN); //2.345 -> 2.34 δηλαδή στρογγυλοποιεί στον κοντινότερο ζυγό.

        System.out.println("Result: " + result);
        System.out.println("Result: " + result2);
    }
}
