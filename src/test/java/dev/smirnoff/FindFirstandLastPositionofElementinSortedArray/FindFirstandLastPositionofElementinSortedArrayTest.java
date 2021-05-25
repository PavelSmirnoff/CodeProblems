package dev.smirnoff.FindFirstandLastPositionofElementinSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 25.05.2021
 */
class FindFirstandLastPositionofElementinSortedArrayTest {
    FindFirstandLastPositionofElementinSortedArray f = new FindFirstandLastPositionofElementinSortedArray();

    @Test
    public void Test1(){
        assertArrayEquals(new int[]{3,4}, f.searchRange(new int[]{5,7,7,8,8,10},8));
    }
    @Test
    public void Test2(){
        assertArrayEquals(new int[]{-1,-1}, f.searchRange(new int[]{5,7,7,8,8,10},6));
    }
    @Test
    public void Test3(){
        assertArrayEquals(new int[]{-1,-1}, f.searchRange(new int[]{},0));
    }

    @Test
    public void Test4(){
        assertArrayEquals(new int[]{2,2}, f.searchRange(new int[]{1,2,3,5,6},3));
    }

    @Test
    public void Test5(){
        assertArrayEquals(new int[]{4,4}, f.searchRange(new int[]{1,2,3,5,6},6));
    }

}