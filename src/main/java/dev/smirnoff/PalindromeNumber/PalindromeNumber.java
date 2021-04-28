package dev.smirnoff.PalindromeNumber;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 28.04.2021
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 ) return false;
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        return sb.toString().equals(sb.reverse().toString());
    }
}
