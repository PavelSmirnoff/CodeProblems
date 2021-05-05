package dev.smirnoff.MergeSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MergeSortedArrayTest {

    MergeSortedArray m = new MergeSortedArray();

    @Test
    public void Test1(){
        assertArrayEquals(new int[]{1,2,2,3,5,6},
                m.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3));
    }

    @Test
    public void Test2(){
        assertArrayEquals(new int[]{1},
                m.merge(new int[]{1},1,new int[]{},0));
    }
}