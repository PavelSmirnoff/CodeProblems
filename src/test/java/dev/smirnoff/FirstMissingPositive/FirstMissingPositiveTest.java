package dev.smirnoff.FirstMissingPositive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 29.04.2021
 */
class FirstMissingPositiveTest {

    FirstMissingPositive f = new FirstMissingPositive();

    @Test
    public void Test1(){
        assertEquals(3, f.firstMissingPositive(new int[]{1,2,0}));
    }

    @Test
    public void Test2(){
        assertEquals(2, f.firstMissingPositive(new int[]{3,4,-1,1}));
    }

    @Test
    public void Test3(){
        assertEquals(1, f.firstMissingPositive(new int[]{7,8,9,11,12}));
    }

    @Test
    public void Test4(){
        assertEquals(1, f.firstMissingPositive(new int[]{2}));
    }
    @Test
    public void Test5(){
        assertEquals(3, f.firstMissingPositive(new int[]{0,2,2,1,1}));
    }
}