package dev.smirnoff.SearchInsertPosition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 29.04.2021
 */
class SearchInsertPositionTest {
    SearchInsertPosition s = new SearchInsertPosition();

    @Test
    public void Test1(){
        assertEquals(2, s.searchInsert(new int[]{1,3,5,6}, 5));
    }
    @Test
    public void Test2(){
        assertEquals(1, s.searchInsert(new int[]{1,3,5,6}, 2));
    }
    @Test
    public void Test3(){
        assertEquals(4, s.searchInsert(new int[]{1,3,5,6}, 7));
    }
    @Test
    public void Test4(){
        assertEquals(0, s.searchInsert(new int[]{1,3,5,6}, 0));
    }

    @Test
    public void Test5(){
        assertEquals(0, s.searchInsert(new int[]{1}, 0));
    }

}