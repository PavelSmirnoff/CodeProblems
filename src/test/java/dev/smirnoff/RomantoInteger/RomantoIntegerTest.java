package dev.smirnoff.RomantoInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 25.05.2021
 */
class RomantoIntegerTest {

    RomantoInteger r = new RomantoInteger();

    @Test
    public void Test1(){
        assertEquals(3, r.romanToInt("III"));
    }

    @Test
    public void Test2(){
        assertEquals(4, r.romanToInt("IV"));
    }

    @Test
    public void Test3(){
        assertEquals(9, r.romanToInt("IX"));
    }

    @Test
    public void Test4(){
        assertEquals(58, r.romanToInt("LVIII"));
    }

    @Test
    public void Test5(){
        assertEquals(1994, r.romanToInt("MCMXCIV"));
    }

}