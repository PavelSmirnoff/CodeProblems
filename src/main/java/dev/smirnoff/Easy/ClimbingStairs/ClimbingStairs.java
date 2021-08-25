package dev.smirnoff.Easy.ClimbingStairs;

public class ClimbingStairs {
    public int climbStairs(int n) {
//        if(n<=2) return n;
//        return climbStairs(n-1)+climbStairs(n-2);
        int prev = 1, prev2 = 1, res = 1;
        for (int i = 1; i < n; i++) {
            res = prev + prev2;
            prev2 = prev;
            prev = res;
        }
        return res;
    }
}
