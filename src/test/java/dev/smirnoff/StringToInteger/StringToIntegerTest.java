package dev.smirnoff.StringToInteger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 28.04.2021
 */
@DisplayName("String To Integer Test")
class StringToIntegerTest {
    StringToInteger sti = new StringToInteger();

    @Test
    @DisplayName("Test 1")
    public void Test1() {
        assertEquals(42, sti.myAtoi("42"));
    }

    @Test
    @DisplayName("Test 2")
    public void Test2() {
        assertEquals(-42, sti.myAtoi("   -42"));
    }

    @Test
    @DisplayName("Test 3")
    public void Test3() {
        assertEquals(4193, sti.myAtoi("4193 with words"));
    }

    @Test
    @DisplayName("Test 4")
    public void Test4() {
        assertEquals(0, sti.myAtoi("words and 987"));
    }

    @Test
    @DisplayName("Test 5")
    public void Test5() {
        assertEquals(-2147483648, sti.myAtoi("-91283472332"));
    }

    @Test
    @DisplayName("Test 6")
    public void Test6() {
        assertEquals(0, sti.myAtoi("+-12"));
    }

    @Test
    @DisplayName("Test 7")
    public void Test7() {
        assertEquals(0, sti.myAtoi("+"));
    }

    @Test
    @DisplayName("Test 8")
    public void Test8() {
        assertEquals(2147483647, sti.myAtoi("20000000000000000000"));
    }

    @Test
    @DisplayName("Test 9")
    public void Test9() {
        assertEquals(12345678, sti.myAtoi("  0000000000012345678"));
    }

}