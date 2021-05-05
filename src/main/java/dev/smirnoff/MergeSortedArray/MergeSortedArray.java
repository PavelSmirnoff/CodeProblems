package dev.smirnoff.MergeSortedArray;

import java.util.Arrays;

public class MergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) return nums1;
        for (int i = 0; i < n; i++) {
            nums1[m++]=nums2[i];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
        return nums1;
    }
}
