package dev.smirnoff.RemoveElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 29.04.2021
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int cur=0;
        for (int i=0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[cur++] = nums[i];
            }
            if((cur-1)!=i)nums[i] = 0;
        }
        return cur;
    }
}
