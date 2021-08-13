package dev.smirnoff.Medium.LetterCombinationsPhoneNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinationsPhoneNumber {
    public List<String> letterCombinations(String digits) {
        String[][] word = new String[][]{{" "},{""},{"a","b","c"},{"d","e","f"}
                                ,{"g","h","i"},{"j","k","l"},{"m","n","o"}
                                ,{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};
        List<String> returned = new ArrayList<>();
        returned.add("");
        char[] c = digits.toCharArray();
        for (int i = 0; i < digits.length(); i++) {
            returned = addToList(returned, new ArrayList<String>(Arrays.asList(word[c[i]-48])));
        }
        return returned;
    }

    public List<String> addToList(List<String> r, List<String> addList){
        List<String> l = new ArrayList<>();
        for (String sOld :r) {
            for (String sAdd :addList) {
                l.add(sOld+sAdd);
            }
        }
        return l;
    }
}
