package dev.smirnoff.FindFirstandLastPositionofElementinSortedArray;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 25.05.2021
 */
public class FindFirstandLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] ret = new int[]{-1, -1};
        if (nums.length < 1) return ret;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == target && ret[0] == -1) ret[0] = i;
            if (nums[nums.length - i - 1] == target && ret[1] == -1) ret[1] = nums.length - i - 1;
            if (ret[0] != -1 && ret[1] != -1) return ret;
            if (ret[0] == -1 && ret[1] == -1 && (i == nums.length - i - 1)) break;
                i++;
        }
        return ret;
    }
}
