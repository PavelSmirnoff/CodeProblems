package dev.smirnoff.SortColors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 30.04.2021
 */
class SortColorsTest {
    SortColors s = new SortColors();

    @Test
    public void Test1(){
        assertArrayEquals(new int[]{0,0,1,1,2,2}, s.sortColors(new int[]{2,0,2,1,1,0}));
    }
    @Test
    public void Test2(){
        assertArrayEquals(new int[]{0,1,2}, s.sortColors(new int[]{2,0,1}));
    }
    @Test
    public void Test3(){
        assertArrayEquals(new int[]{0}, s.sortColors(new int[]{0}));
    }
    @Test
    public void Test4(){
        assertArrayEquals(new int[]{1}, s.sortColors(new int[]{1}));
    }

    @Test
    public void Test5(){
        assertArrayEquals(new int[]{0,1,2}, s.sortColors(new int[]{1,2,0}));
    }

}