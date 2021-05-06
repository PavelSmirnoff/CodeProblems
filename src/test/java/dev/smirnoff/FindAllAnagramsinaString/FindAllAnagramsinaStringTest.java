package dev.smirnoff.FindAllAnagramsinaString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindAllAnagramsinaStringTest {
    FindAllAnagramsinaString f = new FindAllAnagramsinaString();

    @Test
    public void Test1(){
        assertArrayEquals(new int[]{0,6}, f.findAnagrams("cbaebabacd","abc").stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    public void Test2(){
        assertArrayEquals(new int[]{0,1,2}, f.findAnagrams("abab","ab").stream().mapToInt(Integer::intValue).toArray());
    }
}