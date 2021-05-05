package dev.smirnoff.SquaresofaSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SquaresofaSortedArrayTest {
    SquaresofaSortedArray s = new SquaresofaSortedArray();

    @Test
    public void Test1(){
        assertArrayEquals(new int[]{0,1,9,16,100}, s.sortedSquares(new int[]{-4,-1,0,3,10}));
    }
    @Test
    public void Test2(){
        assertArrayEquals(new int[]{4,9,9,49,121}, s.sortedSquares(new int[]{-7,-3,2,3,11}));
    }
}