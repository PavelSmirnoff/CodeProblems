package dev.smirnoff.TwoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 28.04.2021
 */
class TwoSumTest {
    @Test
    public void testTwoSum() {
        TwoSum twoSum = new TwoSum();
        Assertions.assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{2,7,11,15}, 9));
        Assertions.assertArrayEquals(new int[]{1, 2}, twoSum.twoSum(new int[]{3,2,4}, 6));
        Assertions.assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{3,3}, 6));
    }
}