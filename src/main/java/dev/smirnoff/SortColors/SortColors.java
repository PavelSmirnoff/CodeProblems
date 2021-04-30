package dev.smirnoff.SortColors;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 30.04.2021
 */
public class SortColors {
    public int[] sortColors(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                int temp = nums[i - 1];
                nums[i - 1] = nums[i];
                nums[i] = temp;
                i = 0;
            }
        }
        return nums;
    }
}
