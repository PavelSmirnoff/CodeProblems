package dev.smirnoff.FindAllAnagramsinaString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsinaString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(s.length() < p.length()) return list;
        char[] c2 = p.toCharArray();
        Arrays.sort(c2);
        p = String.valueOf(c2);
        for (int i = 0; i <= s.length()-p.length(); i++) {
            System.out.println(s.substring(i,i+p.length()));
            if(isAnagram(s.substring(i,i+p.length()),p))list.add(i);
        }
        return list;
    }

    private boolean isAnagram(String s, String p){
        char[] c1 = s.toCharArray();
        Arrays.sort(c1);
        return String.valueOf(c1).equals(p);
    }
}
