package dev.smirnoff.ReverseInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 28.04.2021
 */
class ReverseIntegerTest {
    @Test
    public void Test1(){
        Assertions.assertEquals(321,new ReverseInteger().reverse(123));
    }
    @Test
    public void Test2(){
        Assertions.assertEquals(-321,new ReverseInteger().reverse(-123));
    }
    @Test
    public void Test3(){
        Assertions.assertEquals(21,new ReverseInteger().reverse(120));
    }
    @Test
    public void Test4(){
        Assertions.assertEquals(0,new ReverseInteger().reverse(0));
    }
}