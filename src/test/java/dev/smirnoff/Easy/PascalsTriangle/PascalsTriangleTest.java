package dev.smirnoff.Easy.PascalsTriangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleTest {
    PascalsTriangle p = new PascalsTriangle();

    @Test
    public void Test1(){
        System.out.println(p.generate(5));
    }

    @Test
    public void Test2(){
        System.out.println(p.generate(1));
    }
}