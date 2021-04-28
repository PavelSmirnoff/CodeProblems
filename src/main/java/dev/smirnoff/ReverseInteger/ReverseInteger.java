package dev.smirnoff.ReverseInteger;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 28.04.2021
 */
public class ReverseInteger {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(Math.abs(x)).reverse();
        try {
            return (x<0)?Integer.parseInt(sb.toString())*-1 : Integer.parseInt(sb.toString()) ;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
