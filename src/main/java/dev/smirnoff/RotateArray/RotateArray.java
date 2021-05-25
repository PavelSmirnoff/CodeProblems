package dev.smirnoff.RotateArray;

import java.util.*;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 25.05.2021
 */
public class RotateArray {
    public int[] rotate(int[] nums, int k) {
        int[] ar1 = nums.clone();
        for(int i=0;i<nums.length;i++)
        {
            nums[(i+k)%nums.length] = ar1[i];
            System.out.println((i+k)%nums.length);
        }

        return nums;
    }
}
