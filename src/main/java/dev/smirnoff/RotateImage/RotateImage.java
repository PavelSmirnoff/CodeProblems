package dev.smirnoff.RotateImage;

import java.util.Arrays;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 25.05.2021
 */
public class RotateImage {
    public int[][] rotate(int[][] matrix) {
        int[][] cloneMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < cloneMatrix.length; i++) {
            for (int j = 0; j <cloneMatrix.length ; j++) {
                cloneMatrix[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[j][matrix.length-i-1] = cloneMatrix[i][j];
            }
        }
        return matrix;
    }
}
