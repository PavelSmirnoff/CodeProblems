package dev.smirnoff.ReverseWordsinaString;

public class ReverseWordsinaString {
    public String reverseWords(String s) {
        //String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str :s.split(" ")) {
            if(str.length() > 0){
                sb.insert(0,str).insert(0," ");
            }
        }
        return sb.toString().trim();
    }
}
