package io.github.alphabet;

import org.junit.Test;

public class AggregationAlphabetFactoryTest {

    /**
     * 测试字母表3个连续字母聚合
     */
    @Test
    public void testAggrAlphabetFactory() {
        AlphabetFactory factory = new AggregationAlphabetFactory();
        String input = "abcccbad";
        System.out.printf("Input: %s\n", input);
        System.out.println("Output: ");
        factory.createAlphabet(input);
    }

    /**
     * 测试字母表3个以上连续字母聚合
     */
    @Test
    public void testAggrAlphabetFactory2() {
        AlphabetFactory factory = new AggregationAlphabetFactory();
        String input = "abccccccccbaeeeeeeeed";
        System.out.printf("Input: %s\n", input);
        System.out.println("Output: ");
        factory.createAlphabet(input);
    }

}