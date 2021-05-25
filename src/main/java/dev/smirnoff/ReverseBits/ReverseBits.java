package dev.smirnoff.ReverseBits;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 25.05.2021
 */
public class ReverseBits {
    public int reverseBits(int n) {
        int rev=0;
        for(int i=0;i<32;i++)
        {
            rev<<=1;
            if((n&1)==1)
                rev+=1;
            n>>=1;
        }
        return rev;
    }
}
