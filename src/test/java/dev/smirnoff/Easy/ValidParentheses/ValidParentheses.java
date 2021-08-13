package dev.smirnoff.Easy.ValidParentheses;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    public boolean isValid(String s) {
        char[] c = s.toCharArray();
        Map<Character,Character> m = new HashMap<>();
        Deque<Character> deque = new ArrayDeque<>();
        m.put(')','(');m.put(']','[');m.put('}','{');
        for (char c1 :c) {
            if(m.containsValue(c1)) {
                deque.add(c1);
                continue;
            }
            if(deque.isEmpty()) return false;
            if(m.get(c1) == deque.getLast()) deque.removeLast(); else return false;
        }
        return deque.size()==0;
    }
}
