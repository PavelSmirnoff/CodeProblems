package dev.smirnoff.Pow_xn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 29.04.2021
 */
class Pow_xnTest {
    Pow_xn p = new Pow_xn();

    @Test
    public void Test1(){
        assertEquals(1024.00000, p.myPow(2.00000, 10) );
    }

    @Test
    public void Test2(){
        assertEquals(9.26100, p.myPow(2.10000, 3) );
    }

    @Test
    public void Test3(){
        assertEquals(0.25000, p.myPow(2.00000, -2) );
    }

    @Test
    public void Test4(){
        assertEquals(1, p.myPow(0.44528, 0) );
    }

    @Test
    public void Test5(){
        assertEquals(0, p.myPow(0.00001, 2147483647) );
    }

    @Test
    public void Test6(){
        assertEquals(4, p.myPow(-2, 2) );
    }
}