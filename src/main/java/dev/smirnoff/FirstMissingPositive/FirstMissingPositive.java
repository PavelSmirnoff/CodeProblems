package dev.smirnoff.FirstMissingPositive;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 29.04.2021
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        TreeSet<Integer> list = new TreeSet<>();
        for (int i : nums) {
            if (i > 0) list.add(i);
        }
        System.out.println(list);
        int num = 1;
        Iterator<Integer> i = list.iterator();
        while (i.hasNext()) {
            if (i.next() != num) return num;
            else num++;
        }
        return num;
    }
}
