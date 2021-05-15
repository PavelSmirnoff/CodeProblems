package dev.smirnoff.MoveZeroes;


import java.util.Arrays;

public class MoveZeroes {
    public int[] moveZeroes(int[] nums) {

        //Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
                if(i >= count)
                nums[i] = 0;
            }
        }
        return nums;
    }
}
