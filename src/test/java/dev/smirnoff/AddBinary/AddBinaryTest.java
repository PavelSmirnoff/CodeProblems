package dev.smirnoff.AddBinary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 29.04.2021
 */
class AddBinaryTest {
    AddBinary a = new AddBinary();

    @Test
    public void Test1(){
        assertEquals("100", a.addBinary("11","1"));
    }
@Test
    public void Test4(){
        assertEquals("100", a.addBinary("1","11"));
    }

    @Test
    public void Test2(){
        assertEquals("10101", a.addBinary("1010","1011"));
    }
    @Test
    public void Test3(){
        assertEquals("110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000",
                a.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
                ,"110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }




}