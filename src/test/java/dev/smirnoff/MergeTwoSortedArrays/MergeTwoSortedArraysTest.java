package dev.smirnoff.MergeTwoSortedArrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 28.04.2021
 */
class MergeTwoSortedArraysTest {

    @Test
    public void test1() {
        Assertions.assertEquals(2.0,
                new MergeTwoSortedArrays().findMedianSortedArrays(new int[]{1, 3}, new int[]{2}),
                "merged array = [1,2,3] and median is 2.");
    }

    @Test
    public void test2() {
        Assertions.assertEquals(2.5,
                new MergeTwoSortedArrays().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}),
                "merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.");
    }

    @Test
    public void test3() {
        Assertions.assertEquals(0.0,
                new MergeTwoSortedArrays().findMedianSortedArrays(new int[]{0, 0}, new int[]{0, 0}));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(1.0,
                new MergeTwoSortedArrays().findMedianSortedArrays(new int[]{}, new int[]{1}));
    }

    @Test
    public void test5() {
        Assertions.assertEquals(2.0,
                new MergeTwoSortedArrays().findMedianSortedArrays(new int[]{2}, new int[]{}));

    }
}