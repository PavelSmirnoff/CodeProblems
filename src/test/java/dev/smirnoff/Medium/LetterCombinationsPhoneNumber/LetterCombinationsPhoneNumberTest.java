package dev.smirnoff.Medium.LetterCombinationsPhoneNumber;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsPhoneNumberTest {
    LetterCombinationsPhoneNumber l = new LetterCombinationsPhoneNumber();

    @Test
    public void Test1(){
        List<String> list = new ArrayList<>(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
        assertEquals(list, l.letterCombinations("23"));
    }
    @Test
    public void Test2(){
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        assertEquals(list , l.letterCombinations("2"));
    }
    @Test
    public void Test3(){
        List<String> list = new ArrayList<>(Arrays.asList(""));
        assertEquals(list, l.letterCombinations(""));
    }
}