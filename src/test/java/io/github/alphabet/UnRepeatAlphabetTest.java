package io.github.alphabet;

import org.junit.Assert;
import org.junit.Test;

public class UnRepeatAlphabetTest {

    /**
     * 测试字母表3个连续字母去重
     */
    @Test
    public void testUnRepeatAlphabet() {
        testUnRepeatAlphabet("aabcccbbad");
    }

    /**
     * 测试字母表3个以上连续字母去重
     */
    @Test
    public void testUnRepeatAlphabet2() {
        testUnRepeatAlphabet("aabccccccbbad");
    }

    private void testUnRepeatAlphabet(String input) {
        AlphabetContext context = new AlphabetContext();
        context.setAlphabet(new UnRepeatAlphabet());
        System.out.printf("Input: %s\n", input);
        System.out.println("Output: ");
        String result = context.alphabetFormat(input);
        Assert.assertEquals(result, "d");
    }
}