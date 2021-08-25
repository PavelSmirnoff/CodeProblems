package dev.smirnoff.Easy.PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> inList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(i>1 && j>0 && j < prev.size()){
                    inList.add(prev.get(j-1)+prev.get(j));
                }else {
                    inList.add(1);
                }
            }
            prev = inList;
            list.add(inList);
        }
        return list;
    }
}
