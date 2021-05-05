package dev.smirnoff.DivideTwoIntegers;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if(divisor == 1) return dividend;
        long l = (long) Math.floor(dividend / divisor );
        System.out.println(l);
        return (int) (l >= Integer.MAX_VALUE ?
                Integer.MAX_VALUE :
                (l <= Integer.MIN_VALUE ? Integer.MAX_VALUE : l) );
    }
}
