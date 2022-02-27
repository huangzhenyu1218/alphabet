package io.github.alphabet;

import org.junit.Test;

public class UnRepeatAlphabetFactoryTest {

    /**
     * 测试字母表3个连续字母去重
     */
    @Test
    public void testUnRepeatAlphabetFactory() {
        AlphabetFactory factory = new UnRepeatAlphabetFactory();
        String input = "aabcccbbad";
        System.out.printf("Input: %s\n", input);
        System.out.println("Output: ");
        factory.createAlphabet(input);
    }

    /**
     * 测试字母表3个以上连续字母去重
     */
    @Test
    public void testUnRepeatAlphabetFactory2() {
        AlphabetFactory factory = new UnRepeatAlphabetFactory();
        String input = "aabccccccbbad";
        System.out.printf("Input: %s\n", input);
        System.out.println("Output: ");
        factory.createAlphabet(input);
    }

}