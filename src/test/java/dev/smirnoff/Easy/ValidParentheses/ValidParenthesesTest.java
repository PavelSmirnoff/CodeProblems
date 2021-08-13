package dev.smirnoff.Easy.ValidParentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    ValidParentheses v = new ValidParentheses();

    @Test
    public void Test1(){
        assertTrue(v.isValid("()"));
    }
    @Test
    public void Test2(){
        assertTrue(v.isValid("()[]{}"));
    }
    @Test
    public void Test3(){
        assertFalse(v.isValid("(]"));
    }
    @Test
    public void Test4(){
        assertFalse(v.isValid("([)]"));
    }

    @Test
    public void Test5(){
        assertTrue(v.isValid("{[]}"));
    }

    @Test
    public void Test6(){
        assertTrue(v.isValid("{(([]))}"));
    }

    @Test
    public void Test7(){
        assertFalse(v.isValid("]"));
    }

    @Test
    public void Test8(){
        assertFalse(v.isValid("(])"));
    }
}