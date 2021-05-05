package dev.smirnoff.DivideTwoIntegers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class DivideTwoIntegersTest {
    DivideTwoIntegers d = new DivideTwoIntegers();

    @Test
    public void Test1(){
        assertEquals(2147483647, d.divide(-2147483648,-1));
    }
    @Test
    public void Test2(){
        assertEquals(3, d.divide(10,3));
    }
    @Test
    public void Test3(){
        assertEquals(-2147483648, d.divide(-2147483648,1));
    }

    @Test
    public void Test4(){
        assertEquals(1073741823, d.divide(2147483647,2));
    }
}