package dev.smirnoff.LongestCommonPrefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 29.04.2021
 */
class LongestCommonPrefixTest {

    LongestCommonPrefix l = new LongestCommonPrefix();

    @Test
    public void Test1(){
        assertEquals("fl", l.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
    @Test
    public void Test2(){
        assertEquals("",
                l.longestCommonPrefix(new String[]{"dog","racecar","car"}),
                "There is no common prefix among the input strings.");
    }

}