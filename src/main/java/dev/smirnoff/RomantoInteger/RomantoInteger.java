package dev.smirnoff.RomantoInteger;

import java.util.HashMap;
import java.util.Map;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 25.05.2021
 */
public class RomantoInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        char[] c = s.toCharArray();
        for(int i=0;i<c.length-1;i++)
        {
            if(map.get(c[i])<map.get(c[i+1]))
            {
                sum-=map.get(c[i]);
            }
            else{
                sum+=map.get(c[i]);
            }
        }
        sum+=map.get(c[c.length-1]);
        return sum;
    }
}
