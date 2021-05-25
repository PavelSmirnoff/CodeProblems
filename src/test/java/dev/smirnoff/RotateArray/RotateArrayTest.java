package dev.smirnoff.RotateArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 25.05.2021
 */
class RotateArrayTest {
    RotateArray r = new RotateArray();

    @Test
    public void Test1(){
        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, r.rotate(new int[]{1,2,3,4,5,6,7},3));
    }

    @Test
    public void Test2(){
        assertArrayEquals(new int[]{3,99,-1,-100}, r.rotate(new int[]{-1,-100,3,99},2));
    }

}