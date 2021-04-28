package dev.smirnoff.ZigZagConversion;

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
class ZigZagConversionTest {
    @Test
    public void test1(){
        Assertions.assertEquals("PAHNAPLSIIGYIR",
                new ZigZagConversion().convert("PAYPALISHIRING", 3));
    }

    @Test
    public void test2(){
        Assertions.assertEquals("PINALSIGYAHRPI",
                new ZigZagConversion().convert("PAYPALISHIRING", 4));
    }

    @Test
    public void test3(){
        Assertions.assertEquals("A",
                new ZigZagConversion().convert("A", 1));
    }
}