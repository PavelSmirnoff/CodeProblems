package dev.smirnoff.RemoveElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 29.04.2021
 */
class RemoveElementTest {
    RemoveElement re = new RemoveElement();

    @Test
    public void Test1(){
        assertEquals(2, re.removeElement(new int[]{3,2,2,3}, 3));
    }
    @Test
    public void Test2(){
        assertEquals(5, re.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

}