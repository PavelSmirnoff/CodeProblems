package dev.smirnoff.longestsubstring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * This write description created class
 *
 * @author pavelsmirnov
 * @version 0.1
 * Created 28.04.2021
 */
class LongestSubstringTest {

    @Test
    public void testLongestSubstring() {
        LongestSubstring longestSubstring = new LongestSubstring();
        Assertions.assertEquals(3, longestSubstring.lengthOfLongestSubstring("abcabcbb"), "The answer is \"abc\", with the length of 3.");
        Assertions.assertEquals(1, longestSubstring.lengthOfLongestSubstring("bbbbb"), "The answer is \"b\", with the length of 1.");
        Assertions.assertEquals(3, longestSubstring.lengthOfLongestSubstring("pwwkew"), "The answer is \"wke\", with the length of 3. Notice that the answer must be a substring, \"pwke\" is a subsequence and not a substring.");
    }

    @Test
    public void testLongestSubstringSpaceChar() {
        LongestSubstring longestSubstring = new LongestSubstring();
        Assertions.assertEquals(1, longestSubstring.lengthOfLongestSubstring(" "), "The answer, with the length of 1.");
    }

    @Test
    public void testLongestSubstringDVDF() {
        LongestSubstring longestSubstring = new LongestSubstring();
        Assertions.assertEquals(3, longestSubstring.lengthOfLongestSubstring("dvdf"), "The answer \"vdf\", with the length of 3.");
    }
}