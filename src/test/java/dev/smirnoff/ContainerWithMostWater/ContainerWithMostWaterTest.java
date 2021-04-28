package dev.smirnoff.ContainerWithMostWater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 28.04.2021
 */
class ContainerWithMostWaterTest {

    ContainerWithMostWater c = new ContainerWithMostWater();

    @Test
    public void Test1(){
        assertEquals(49,c.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    @Test
    public void Test2(){
        assertEquals(1,c.maxArea(new int[]{1,1}));
    }
    @Test
    public void Test3(){
        assertEquals(16,c.maxArea(new int[]{4,3,2,1,4}));
    }
    @Test
    public void Test4(){
        assertEquals(2,c.maxArea(new int[]{1,2,1}));
    }
}