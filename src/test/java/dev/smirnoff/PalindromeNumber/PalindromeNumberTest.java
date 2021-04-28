package dev.smirnoff.PalindromeNumber;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 28.04.2021
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class PalindromeNumberTest {
    PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    public void Test1(){
        assertEquals(true, palindromeNumber.isPalindrome(121));
    }
    @Test
    public void Test2(){
        assertEquals(false, palindromeNumber.isPalindrome(-121));
    }
    @Test
    public void Test3(){
        assertEquals(false, palindromeNumber.isPalindrome(10));
    }
    @Test
    public void Test4(){
        assertEquals(false, palindromeNumber.isPalindrome(-101));
    }
}