package dev.smirnoff.Pow_xn;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 29.04.2021
 */
public class Pow_xn {
    public double myPow(double x, int n) {
        if (x < 0.1 && x > 0) return 0;
        if (n == 0) return 1;
        if (n == 1) return x;
        return (n < 0) ? 1 / (x * myPow(x, Math.abs(n) - 1)) : (x * myPow(x, Math.abs(n) - 1));
    }
}
