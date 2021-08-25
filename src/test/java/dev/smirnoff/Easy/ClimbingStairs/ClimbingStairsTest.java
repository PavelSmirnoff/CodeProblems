package dev.smirnoff.Easy.ClimbingStairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {
    ClimbingStairs c = new ClimbingStairs();

    @Test
    public void Test1(){
        assertEquals(2,c.climbStairs(2));
    }

    @Test
    public void Test2(){
        assertEquals(3,c.climbStairs(3));
    }
    @Test
    public void Test3(){
        assertEquals(5,c.climbStairs(4));
    }
    @Test
    public void Test4(){
        assertEquals(8,c.climbStairs(5));
    }
    @Test
    public void Test5(){
        assertEquals(701408733,c.climbStairs(43));
    }
}