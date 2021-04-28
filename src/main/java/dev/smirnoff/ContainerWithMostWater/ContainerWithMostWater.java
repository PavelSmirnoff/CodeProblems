package dev.smirnoff.ContainerWithMostWater;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 28.04.2021
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height.length == 0) return 0;
        int start = 0, end = height.length - 1;
        int maxArea = 0;
        while (start < end) {
            maxArea = Math.max(maxArea,Math.min(height[start], height[end]) * (end - start));
            if(height[start] < height[end]){
                start++;
            } else end--;
        }
        return maxArea;
    }
}
