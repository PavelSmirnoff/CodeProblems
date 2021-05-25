package dev.smirnoff.Numberof1Bits;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 25.05.2021
 */
public class Numberof1Bits {
    public int hammingWeight(int n) {
        int count = 0;
        for(int i=0;i<32;i++)
        {
            if((n&1)==1) count++;
            n>>=1;
        }
        return count;
    }
}
