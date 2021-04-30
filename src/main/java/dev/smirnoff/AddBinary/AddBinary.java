package dev.smirnoff.AddBinary;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 29.04.2021
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        if (lenA < lenB) addBinary(b, a);
        StringBuilder sb = new StringBuilder();
        char carry = '0';
        char cA = '0';
        char cB = '0';

        while (lenA > 0 || lenB > 0) {
            cA = (lenA > 0) ? a.charAt(lenA-- - 1) : '0';
            cB = (lenB > 0) ? b.charAt(lenB-- - 1) : '0';

            if (cA == '1' && carry == '1') {
                cA = '0';
            } else if (cA == '0' && carry == '1') {
                cA = '1';
                carry = '0';
            }
            if (cA == '1' && cB == '1') {
                sb.append('0');
                carry = '1';
            } else if (cA == '0' && cB == '0') {
                sb.append('0');
            } else {
                sb.append('1');
            }
        }
        if (carry == '1') sb.append('1');
        return sb.reverse().toString();
    }

}
