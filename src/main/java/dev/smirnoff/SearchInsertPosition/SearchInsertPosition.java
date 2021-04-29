package dev.smirnoff.SearchInsertPosition;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 29.04.2021
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target || nums[i]>target) return i;
        }
        return nums.length;
    }
}
