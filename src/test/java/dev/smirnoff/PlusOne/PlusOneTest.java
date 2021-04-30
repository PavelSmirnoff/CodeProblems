package dev.smirnoff.PlusOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 30.04.2021
 */
class PlusOneTest {
    PlusOne p = new PlusOne();

    @Test
    public void Test1() {
        assertArrayEquals(new int[]{1, 2, 4}, p.plusOne(new int[]{1, 2, 3}));
    }

    @Test
    public void Test2() {
        assertArrayEquals(new int[]{4, 3, 2, 2}, p.plusOne(new int[]{4, 3, 2, 1}));
    }

    @Test
    public void Test3() {
        assertArrayEquals(new int[]{1}, p.plusOne(new int[]{0}));
    }

    @Test
    public void Test4() {
        assertArrayEquals(new int[]{1,0}, p.plusOne(new int[]{9}));
    }
}