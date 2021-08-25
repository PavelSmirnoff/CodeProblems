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
}