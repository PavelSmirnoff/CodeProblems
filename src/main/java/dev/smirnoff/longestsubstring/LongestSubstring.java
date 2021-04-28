package dev.smirnoff.longestsubstring;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 28.04.2021
 */
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2) return s.length();
        int start = 0;
        int maxString = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(start, i).indexOf(s.charAt(i)) != -1) {
                maxString = Math.max(maxString, i - start);
                i = ++start;
            }
        }
        return Math.max(maxString, s.length() - start);
    }

    public boolean checkChar(String str, char c) {
        return str.indexOf(c) != -1;
    }
}
