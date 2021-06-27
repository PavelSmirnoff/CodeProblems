package dev.smirnoff.ValidPalindrome;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 27.06.2021
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder(s.replaceAll("[^A-Za-z]","").toLowerCase());
        System.out.println(str);
        return str.toString().equals(str.reverse().toString());
    }
}
