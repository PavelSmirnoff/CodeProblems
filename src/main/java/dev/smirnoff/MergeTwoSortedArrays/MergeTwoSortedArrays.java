package dev.smirnoff.MergeTwoSortedArrays;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 28.04.2021
 */
public class MergeTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int nums1Itr = 0, nums2Itr = 0;
        double returned;
        for (int i = 0; i < nums.length; i++) {
            if (nums1Itr < nums1.length && nums2Itr < nums2.length) {
                if(nums1[nums1Itr]<nums2[nums2Itr]){
                    nums[i] = nums1[nums1Itr++];
                }else {
                    nums[i] = nums2[nums2Itr++];
                }
            } else if(nums1Itr < nums1.length){
                nums[i] = nums1[nums1Itr++];
            } else {
                nums[i] = nums2[nums2Itr++];
            }
        }
        if(nums.length%2==0){
            returned = (nums[nums.length/2] + nums[nums.length/2 - 1])/2.0;
        }else{
            returned = nums[nums.length/2];
        }

        return returned;
    }
}
