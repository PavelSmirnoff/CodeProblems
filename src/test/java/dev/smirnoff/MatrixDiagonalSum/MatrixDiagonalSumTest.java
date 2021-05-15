package dev.smirnoff.MatrixDiagonalSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MatrixDiagonalSumTest {
    MatrixDiagonalSum m = new MatrixDiagonalSum();

    @Test
    public void Test1(){
        assertEquals(25,m.diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }

    @Test
    public void Test2(){
        assertEquals(8,m.diagonalSum(new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}}));
    }

    @Test
    public void Test3(){
        assertEquals(5,m.diagonalSum(new int[][]{{5}}));
    }

}