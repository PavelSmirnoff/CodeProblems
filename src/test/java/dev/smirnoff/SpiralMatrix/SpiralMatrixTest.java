package dev.smirnoff.SpiralMatrix;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 29.04.2021
 */
class SpiralMatrixTest {
    SpiralMatrix s = new SpiralMatrix();

    @Test
    public void Test1(){
        assertEquals(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5),
                s.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));

    }

    @Test
    public void Test2(){
        assertEquals(Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7),
                s.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }


}