package summator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by clouway on 12.02.17.
 */
public class Summator {
    public Summator() {
    }

    /**
     * Summing two Integer numbers
     *
     * @param a first number
     * @param b second number
     * @return result
     */
    protected int sum(int a, int b) {
        return a + b;
    }

    /**
     * Summing two Double numbers
     *
     * @param a first number
     * @param b second number
     * @return result
     */
    protected double sum(double a, double b) {

        return a + b;
    }

    /**
     * Summing two numbers from String in int
     *
     * @param args
     * @return result
     */
    protected int sum(String args[]) {
        String a = null;
        String b = null;
        return Integer.parseInt(String.valueOf(Integer.parseInt(String.valueOf(a)) + Integer.parseInt(String.valueOf(b))));
    }

    /**
     * Summing two numbers
     *
     * @param a first number
     * @param b second number
     * @return result
     */

    protected BigInteger sum(BigInteger a, BigInteger b) {
        return a = a.add(b);
    }

    /**
     * Summing two numbers
     *
     * @param a first number
     * @param b second number
     * @return result
     */
    protected BigDecimal sum(BigDecimal a, BigDecimal b) {
        return a = a.add(b);
    }
}

