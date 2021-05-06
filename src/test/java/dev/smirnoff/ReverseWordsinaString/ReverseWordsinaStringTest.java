package dev.smirnoff.ReverseWordsinaString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsinaStringTest {
    ReverseWordsinaString r = new ReverseWordsinaString();

    @Test
    public void Test1(){
        assertEquals("blue is sky the", r.reverseWords("the sky is blue"));
    }
    @Test
    public void Test2(){
        assertEquals("example good a", r.reverseWords("a good   example"));
    }
    @Test
    public void Test3(){
        assertEquals("Alice Loves Bob", r.reverseWords("  Bob    Loves  Alice   "));
    }
    @Test
    public void Test4(){
        assertEquals("bob like even not does Alice", r.reverseWords("Alice does not even like bob"));
    }
    @Test
    public void Test5(){
        assertEquals("world hello", r.reverseWords("  hello world  "));
    }
}