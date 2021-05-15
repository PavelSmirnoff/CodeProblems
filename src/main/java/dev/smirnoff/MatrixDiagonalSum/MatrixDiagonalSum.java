package dev.smirnoff.MatrixDiagonalSum;

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int x1 = 0;
        int x2 = mat[0].length-1;
        for (int[] ints : mat) {
            if(x1!=x2)
                sum += (ints[x1++] + ints[x2--]);
            else {
                sum += ints[x1++];
                x2--;
            }
        }
        return sum;
    }
}
