package dev.smirnoff.ValidAnagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    ValidAnagram v = new ValidAnagram();

    @Test
    public void Test1(){
        assertTrue(v.isAnagram("anagram", "nagaram"));
    }

    @Test
    public void Test2(){
        assertFalse(v.isAnagram("rat", "car"));
    }
}