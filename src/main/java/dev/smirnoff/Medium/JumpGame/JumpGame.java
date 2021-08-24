package dev.smirnoff.Medium.JumpGame;

public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;

        int max_reach = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max_reach < i) return false;
            if (i + nums[i] > max_reach) max_reach = i + nums[i];
        }
        return true;
        // return helper(0, nums);
    }

    boolean helper(int iDx, int[] nums) {
        int maxStep = iDx + nums[iDx];
        if (maxStep >= nums.length - 1) return true;
        System.out.println(nums[iDx] + " - " + nums.length);
        for (int i = iDx; i < maxStep; ) {
            if (nums[i] + iDx >= nums.length - 1) return true;
            if (helper(++i, nums)) return true;
        }
        return false;
    }
}
