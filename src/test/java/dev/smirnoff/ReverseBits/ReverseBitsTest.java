package dev.smirnoff.ReverseBits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 25.05.2021
 */
class ReverseBitsTest {
    ReverseBits r = new ReverseBits();

    @Test
    public void Test1(){
        assertEquals(0b00111001011110000010100101000000 , r.reverseBits(0b00000010100101000001111010011100));
    }

    @Test
    public void Test2(){
        assertEquals(0b10111111111111111111111111111111 , r.reverseBits(0b11111111111111111111111111111101));
    }

}
