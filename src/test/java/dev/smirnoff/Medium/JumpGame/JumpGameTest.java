package dev.smirnoff.Medium.JumpGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {
    JumpGame j = new JumpGame();

    @Test
    public void Test1() {
        assertTrue(j.canJump(new int[]{2,3,1,1,4}));
    }

    @Test
    public void Test2() {
        assertFalse(j.canJump(new int[]{3,2,1,0,4}));
    }

    @Test
    public void Test3() {
        assertTrue(j.canJump(new int[]{3,0,8,2,0,0,1}));
    }
}