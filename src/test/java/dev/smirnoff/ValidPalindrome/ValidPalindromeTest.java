package dev.smirnoff.ValidPalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 27.06.2021
 */
class ValidPalindromeTest {

    ValidPalindrome v = new ValidPalindrome();

    @Test
    public void Test1(){
        assertEquals(true, v.isPalindrome("A man, a plan, a canal: Panama"));
    }
    @Test
    public void Test2(){
        assertEquals(false, v.isPalindrome("race a car"));
    }

    @Test
    public void Test3(){
        assertEquals(true, v.isPalindrome("ab_a"));
    }


}