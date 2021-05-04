package dev.smirnoff.StringToInteger;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 28.04.2021
 */
public class StringToInteger {
    public int myAtoi(String s) {
//        if (s.length() == 0) return 0;
//        s = s.trim();
//        int sign = 1;
//        long l = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//
//            if ((c == '-') && i == 0) {
//                sign = -1;
//                continue;
//            }
//            if ((c == '+') && i == 0) {
//                continue;
//            }
//
//            if (c >= '0' && c <= '9') {
//                l = (long) (l + (c - '0') * Math.pow(10, i));
//                if (l > Integer.MAX_VALUE) {
//                    l = Integer.MAX_VALUE;
//                    break;
//                }
//            } else break;
//        }
//        System.out.println(l);
//        return (int) (sign * l);

//        StringBuilder sb = new StringBuilder();
//        if (s.length() == 0) return 0;
//        boolean isNum = false;
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c == ' ') if (sb.length() == 0) continue;
//            else break;
//            if (c == '-' || c == '+') if (sb.length() == 0) {
//                sb.append(c);
//                continue;
//            } else if (sb.length() > 0) return 0;
//            if (c >= '0' && c <= '9') {
//                sb.append(c);
//                isNum = true;
//            } else break;
//        }
//        if (!isNum) return 0;
//        if (sb.length() > 16) sb.setLength(16);
//        long l = Long.parseLong(sb.toString());
//
//        return (l > Integer.MAX_VALUE) ? Integer.MAX_VALUE : (int) Math.max(l, Integer.MIN_VALUE);

        StringBuilder sb = new StringBuilder();
        int sign = 1;
        s = s.trim();

        if (s.length() == 0) return 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c == '-' || c == '+') && i == 0) {
                if (c == '-') sign = -1;
                continue;
            }
            if (c >= '0' && c <= '9') {
                sb.append(c);
            } else break;
        }
        s = sb.reverse().toString();
        long result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = (long) (result + (s.charAt(i) - '0') * Math.pow(10, i));
            if (result > Integer.MAX_VALUE) {
                return (sign == 1 ) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        return (int) (sign * result);
    }
}
