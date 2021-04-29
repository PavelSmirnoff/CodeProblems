package dev.smirnoff.RemoveDuplicatesfromSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 29.04.2021
 */
class RemoveDuplicatesfromSortedArrayTest {

    RemoveDuplicatesfromSortedArray r = new RemoveDuplicatesfromSortedArray();

    @Test
    public void Test1(){
        assertEquals(2,r.removeDuplicates(new int[]{1,1,2}));
    }

    @Test
    public void Test2(){
        assertEquals(5,r.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    @Test
    public void Test3(){
        assertEquals(2,r.removeDuplicates(new int[]{1,2}));
    }
}