package dev.smirnoff.PlusOne;

import java.util.ArrayList;
import java.util.List;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 30.04.2021
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();

        int tmp = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9 && tmp == 1) {
                list.add(0, 0);
            } else {
                list.add(0, digits[i] + tmp);
                tmp = 0;
            }
        }
        if (tmp == 1) list.add(0, tmp);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
