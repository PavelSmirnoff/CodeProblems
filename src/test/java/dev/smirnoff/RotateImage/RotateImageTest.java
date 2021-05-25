package dev.smirnoff.RotateImage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 25.05.2021
 */
class RotateImageTest {
    RotateImage r = new RotateImage();

    @Test
    public void Test1(){
        assertArrayEquals(new int[][]{{7,4,1},{8,5,2},{9,6,3}}, r.rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
}