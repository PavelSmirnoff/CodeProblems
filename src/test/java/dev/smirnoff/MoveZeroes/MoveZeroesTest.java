package dev.smirnoff.MoveZeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {
    MoveZeroes m = new MoveZeroes();

    @Test
    public void Test1(){
        assertArrayEquals(new int[]{1,3,12,0,0}, m.moveZeroes(new int[]{0,1,0,3,12}));
    }

    @Test
    public void Test2(){
        assertArrayEquals(new int[]{0}, m.moveZeroes(new int[]{0}));
    }

    @Test
    public void Test3(){
        assertArrayEquals(new int[]{2,1}, m.moveZeroes(new int[]{2,1}));
    }
    @Test
    public void Test4(){
        assertArrayEquals(new int[]{1,0}, m.moveZeroes(new int[]{0,1}));
    }
}