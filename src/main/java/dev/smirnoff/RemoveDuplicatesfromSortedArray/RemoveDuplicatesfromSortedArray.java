package dev.smirnoff.RemoveDuplicatesfromSortedArray;

import java.util.Arrays;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 29.04.2021
 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int cur = 0;
        System.out.println(Arrays.toString(nums));
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[cur]){
                nums[++cur] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));

        return ++cur;
    }
}
