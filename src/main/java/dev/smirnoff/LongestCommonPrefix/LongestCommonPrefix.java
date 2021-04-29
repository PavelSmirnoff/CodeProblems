package dev.smirnoff.LongestCommonPrefix;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 29.04.2021
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int minLen = Integer.MAX_VALUE;
        for (String s :strs) {
            minLen = Math.min(minLen,s.length());
        }
        for (int i = 0; i < minLen; i++) {
            char c = strs[0].charAt(i);
            for (String s :strs) {
                if(c != s.charAt(i)){
                    return sb.toString();
                }
            }
            sb.append(c);
        }

        return sb.toString();
    }
}
