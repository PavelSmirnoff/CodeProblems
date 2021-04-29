package dev.smirnoff.SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 29.04.2021
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0) return list;
        int minR = 0, minC = 0;
        int maxR = matrix.length - 1;
        int maxC = matrix[0].length - 1;
        int maxStep = matrix.length * matrix[0].length;

        while (maxStep > 0) {
            for (int i = minC; i <= maxC; i++) {
                if(maxStep-->0)list.add(matrix[minR][i]);
                System.out.println(matrix[minR][i]);
            }
            minR++;
            for (int i = minR; i <= maxR; i++) {
                if(maxStep-->0)list.add(matrix[i][maxC]);
                System.out.println(matrix[i][maxC]);
            }
            maxC--;
            for (int i = maxC; i >= minC; i--) {
                if(maxStep-->0) list.add(matrix[maxR][i]);
                System.out.println(matrix[maxR][i]);
            }
            maxR--;
            for (int i = maxR; i >= minR; i--) {
                if(maxStep-->0)list.add(matrix[i][minC]);
                System.out.println(matrix[i][minC]);
            }
            minC++;
        }
        return list;
    }

}
